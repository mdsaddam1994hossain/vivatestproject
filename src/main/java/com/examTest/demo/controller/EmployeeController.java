/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examTest.demo.controller;

import com.examTest.demo.entity.Employee;
import com.examTest.demo.service.EmployeeService;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author User
 */
@Controller
public class EmployeeController {
    
    @Autowired
    EmployeeService emp;
    
    
    @PostMapping()
    public void insertEmployee(){
       
       Employee e = new Employee();
       
       e.setName("Mamun");
       e.setPhone("019658745");
        System.out.println("=================");
       emp.save(e);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public void getEmployeeById(Model m){
           Optional<Employee> e = emp.findById(1);
           e.get().getName();
           
           System.out.println(e.get().getName());
    }
    
     @RequestMapping(method = RequestMethod.GET, value = "/homePage")
    public String loginView() {

        
       
        return "home";
    }
    // @RequestMapping(method = RequestMethod.GET, value = "/createEpm")
    @PostMapping(path = "/createEpm")
    public String createEmployee(@RequestParam Map<String ,String> params) {

         Employee e = new Employee();
       
       e.setName(params.get("empName"));
       e.setPhone(params.get("empPhone"));
       emp.save(e);
       
        return "home";
    }

}
