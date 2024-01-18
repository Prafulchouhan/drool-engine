package com.drool.droolApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.drool.droolApp.model.OutputData;
import com.drool.droolApp.model.Transaction;
import com.drool.droolApp.service.TransactionService;

@RestController
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping("/transaction")
    public ResponseEntity<OutputData> settingOutputData(@RequestBody Transaction transaction) {
        OutputData outputData =transactionService.getTransactionData(transaction);
        return new ResponseEntity<>(outputData, HttpStatus.OK);
    }
}
