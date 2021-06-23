package com.zero9102.practice.baiduidgenerator.config;

import com.xfvape.uid.UidGenerator;
import com.xfvape.uid.impl.CachedUidGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WorkerNodeConfig {

    @Bean("disposableWorkerIdAssigner")
    public DisposableWorkerIdAssigner disposableWorkerIdAssigner() {
        DisposableWorkerIdAssigner disposableWorkerIdAssigner = new DisposableWorkerIdAssigner();
        return disposableWorkerIdAssigner;
    }

    @Bean("cachedUidGenerator")
    public UidGenerator uidGenerator(DisposableWorkerIdAssigner disposableWorkerIdAssigner) {
        CachedUidGenerator cachedUidGenerator = new CachedUidGenerator();
        cachedUidGenerator.setWorkerIdAssigner(disposableWorkerIdAssigner);
        return cachedUidGenerator;
    }
}