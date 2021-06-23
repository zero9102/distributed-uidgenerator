package com.zero9102.practice.baiduidgenerator.config;

import com.xfvape.uid.utils.DockerUtils;
import com.xfvape.uid.utils.NetUtils;
import com.xfvape.uid.worker.WorkerIdAssigner;
import com.xfvape.uid.worker.WorkerNodeType;
import com.zero9102.practice.baiduidgenerator.entity.WorkerNode;
import com.zero9102.practice.baiduidgenerator.mapper.WorkerNodeMapper;
import java.util.Date;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class DisposableWorkerIdAssigner implements WorkerIdAssigner {

    @Autowired
    private WorkerNodeMapper workerNodeMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public long assignWorkerId() {
        WorkerNode workerNode = buildWorkerNode();

        workerNodeMapper.addWorkerNode(workerNode);

        return workerNode.getId();
    }

    private WorkerNode buildWorkerNode() {
        WorkerNode workNode = new WorkerNode();
        if (DockerUtils.isDocker()) {
            workNode.setType(WorkerNodeType.CONTAINER.value());
            workNode.setHostName(DockerUtils.getDockerHost());
            workNode.setPort(DockerUtils.getDockerPort());
            workNode.setLaunchDate(new Date());
        } else {
            workNode.setType(WorkerNodeType.ACTUAL.value());
            workNode.setHostName(NetUtils.getLocalAddress());
            workNode.setPort(System.currentTimeMillis() + "-" + RandomUtils.nextInt(100000));
            workNode.setLaunchDate(new Date());
        }

        return workNode;
    }
}
