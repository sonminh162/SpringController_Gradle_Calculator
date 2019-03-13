package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {

    @GetMapping("/")
    public String getHome(){
        return "index";
    }

    @GetMapping("/calculate")
    public ModelAndView calculate(@RequestParam(name="math") String value,@RequestParam(name="firstNumber",defaultValue="0") String firstNumber,@RequestParam(name="secondNumber",defaultValue="0") String secondNumber){
        ModelAndView modelAndView = new ModelAndView("index");
        double a = Double.valueOf(firstNumber);
        double b = Double.valueOf(secondNumber);
        String result;
        switch (value){
            case "Addition(+)":{
                result = String.valueOf(a+b);
                break;
            }
            case "Minus(-)":{
                result = String.valueOf(a-b);
                break;
            }
            case "Multiply(*)":{
                result = String.valueOf(a*b);
                break;
            }
            case "Divide(/)":{
                if(b == 0){
                    result = "Divide by zero";
                }else{
                    result = String.valueOf(a/b);
                }
                break;
            }
            default:{
                result = "0";
                break;
            }
        }
        modelAndView.addObject("first",firstNumber);
        modelAndView.addObject("second", secondNumber);
        modelAndView.addObject("result",result);
        return modelAndView;
    }
}
