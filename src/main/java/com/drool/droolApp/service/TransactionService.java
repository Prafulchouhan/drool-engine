package com.drool.droolApp.service;

import org.kie.api.KieServices;
import org.kie.api.logger.KieRuntimeLogger;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drool.droolApp.model.OutputData;
import com.drool.droolApp.model.Transaction;

import java.util.ArrayList;

@Service
public class TransactionService {

    @Autowired
    private KieContainer kieContainer;


    public OutputData getTransactionData (Transaction transaction) {
        OutputData outputData = new OutputData();
        outputData.setExecutedRules(new ArrayList<>());
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.setGlobal("outputData", outputData);
        kieSession.insert(transaction);
        kieSession.fireAllRules();
        kieSession.dispose();
        return outputData;
    }



}