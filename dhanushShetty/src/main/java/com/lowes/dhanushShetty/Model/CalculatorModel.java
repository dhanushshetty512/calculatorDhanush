package com.lowes.dhanushShetty.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CalculatorModel {

    @Id
    @GeneratedValue
    private int id;
    private String functiom;
    private Float result;

    public CalculatorModel( String functiom, Float result) {
        this.functiom = functiom;
        this.result = result;
    }

    public String getFunctiom() {
        return functiom;
    }

    public void setFunctiom(String functiom) {
        this.functiom = functiom;
    }

    public Float getResult() {
        return result;
    }

    public void setResult(Float result) {
        this.result = result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
