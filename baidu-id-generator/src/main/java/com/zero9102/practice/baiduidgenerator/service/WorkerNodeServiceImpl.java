package com.zero9102.practice.baiduidgenerator.service;

import com.xfvape.uid.UidGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkerNodeServiceImpl implements IWorkerNodeService {

    @Autowired
    private UidGenerator uidGenerator;

    @Override
    public long genUid() {
        return uidGenerator.getUID();
    }
}