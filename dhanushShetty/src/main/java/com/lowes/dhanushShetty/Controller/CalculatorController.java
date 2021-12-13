package com.lowes.dhanushShetty.Controller;

import com.lowes.dhanushShetty.Service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CalculatorController {

    @Autowired
    CalculatorService calculatorService;

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public Float add (@RequestParam List numbers){
        return calculatorService.add(numbers);

    }

    @RequestMapping(value="/subtract")
    public Float subtract (@RequestParam Float a, @RequestParam Float b){
        return  calculatorService.subtract(a,b);
    }

    @RequestMapping(value="/product")
    public Float multiply (@RequestParam Float a, @RequestParam Float b){
        return  calculatorService.multiply(a,b);
    }

    @RequestMapping(value="/divide")
    public Float divide (@RequestParam Float a, @RequestParam Float b){
        return  calculatorService.divide(a,b);
    }

    @RequestMapping(value="/history")
    public List history (){
        return  calculatorService.getHistory();
    }


}
