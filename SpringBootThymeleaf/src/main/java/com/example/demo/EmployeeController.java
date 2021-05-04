package com.example.demo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @GetMapping("/iteration")
    public String iteration(Model model) {
        List < Employee > employees = new ArrayList < > ();
        employees.add(new Employee("Ramesh", "reddy", "ram@gmail.com"));
        employees.add(new Employee("lahari", "bujji", "hari@gmail.com"));
        employees.add(new Employee("srujan", "fies", "hom@gmail.com"));
        employees.add(new Employee("rani", "Suni", "rani@gmail.com"));
        model.addAttribute("employees", employees);
        return "iteration";
    }
}