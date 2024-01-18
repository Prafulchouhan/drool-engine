package com.drool.droolApp.service;

import com.drool.droolApp.model.ListOutput;
import org.kie.api.KieServices;
import org.kie.api.logger.KieRuntimeLogger;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.drool.droolApp.model.OutputData;
import com.drool.droolApp.model.Transaction;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private KieContainer kieContainer;

//    @Autowired
//    private KieContainer updatedKieContainer;

    public OutputData getTransactionData (Transaction transaction) {
        OutputData outputData = new OutputData();
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.setGlobal("outputData", outputData);
        kieSession.insert(transaction);
        kieSession.fireAllRules();
        kieSession.dispose();
        return outputData;
    }

//    public ListOutput getTransactionDataList (Transaction transaction) {
//        ListOutput listOutput = new ListOutput();
//        listOutput.setOut(new ArrayList<>());
//        KieSession kieSession = updatedKieContainer.newKieSession();
//        kieSession.setGlobal("list", listOutput);
//        kieSession.insert(transaction);
//        kieSession.fireAllRules();
//        kieSession.dispose();
//        return listOutput;
//    }
}