package com.drool.droolApp.model;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OutputData {

    private Boolean hold;
    private Boolean block;
    private Boolean review;
    private Boolean cancel;
    private Boolean addToRiskList;
    private List<String> executedRules;
    private Boolean triggerOnTransaction;
}