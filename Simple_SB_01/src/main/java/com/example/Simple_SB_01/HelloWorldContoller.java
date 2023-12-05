package com.example.Simple_SB_01;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class HelloWorldContoller{
    private String ans;

    private static String dateFormatter(LocalDate after){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return after.format(formatter);
    }
   
    @GetMapping("/")
    public String getString(){

        LocalDate curr = LocalDate.now();
        LocalDate after=curr.plusDays(100);
        ans = dateFormatter(after);
        return ans;
    }
}