package com.drool.droolApp.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ListOutput {
    private List<OutputData> out = new ArrayList<>();
}
