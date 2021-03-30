/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examTest.demo.service;

import com.examTest.demo.entity.Employee;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author User
 */
@Repository
public interface EmployeeService extends JpaRepository<Employee, Integer>{

   
   public Employee findByEmpId(int id);
   
    
}
