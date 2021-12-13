package com.lowes.dhanushShetty.Service;

import com.lowes.dhanushShetty.Model.CalculatorModel;
import com.lowes.dhanushShetty.Repository.CalculatorRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CalculatorService {

    @Autowired
    CalculatorRepo calculatorRepo;


    public Float add(List<Float> numbers){

        Float sum = null;
        for (Float x : numbers) {
            sum += x;
        }
        CalculatorModel calculatorModel= new CalculatorModel("Sum",sum);
        calculatorRepo.save(calculatorModel);
        return sum;
    }

    public Float subtract(Float a, Float b){

        Float difference = a-b;
        CalculatorModel calculatorModel= new CalculatorModel("Difference",difference);
        calculatorRepo.save(calculatorModel);
        return difference;
    }

    public Float multiply(Float a, Float b){

        Float product = a*b;
        CalculatorModel calculatorModel= new CalculatorModel("product",product);
        calculatorRepo.save(calculatorModel);
        return product;
    }

    public Float divide(Float a, Float b) {
        Float quotient = null;
        try {
            quotient = a / b;
            CalculatorModel calculatorModel= new CalculatorModel("division",quotient);
            calculatorRepo.save(calculatorModel);
        } catch (Exception ArithmeticException) {
            System.out.println("Division Not valid");
        }

        return quotient;
    }

    public List getHistory() {
        List movies = new ArrayList();
        calculatorRepo.findAll().forEach(res -> System.out.println(res));
        return movies;
    }


}
