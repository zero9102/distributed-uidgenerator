package com.zero9102.practice.baiduidgenerator.controller;

import com.zero9102.practice.baiduidgenerator.service.IWorkerNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("baidu")
@RestController
public class WorkerNodeServiceController {

    @Autowired
    private IWorkerNodeService workerNodeService;

    /**
     * 生成id
     */
    @GetMapping("/uid")
    public long baiduUid() {
        return workerNodeService.genUid();
    }
}