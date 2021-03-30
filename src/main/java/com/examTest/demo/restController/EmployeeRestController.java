
package com.examTest.demo.restController;

import com.examTest.demo.entity.Employee;
import com.examTest.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class EmployeeRestController {
    
    @Autowired
    EmployeeService emp;
    
  //  find all employees 
    
  @RequestMapping(method = RequestMethod.GET,value = "/api/employees")
  public ResponseEntity<Iterable<Employee>> getEemployees(){
      
      return new ResponseEntity<>(emp.findAll(),HttpStatus.OK);
  }
  
 // find employee by Id
  
   @RequestMapping(method = RequestMethod.GET,value = "/api/employee")
   public ResponseEntity<Employee> getEmployee(@RequestParam(name = "empId")Integer id){
      
      return new ResponseEntity<>(emp.findByEmpId(id),HttpStatus.OK);
  
  }
   
   // Insert a employee
   
    @PostMapping(path = "/api/employee")
    public ResponseEntity<Employee> insertCustomer(@RequestBody Employee e){
        
        emp.save(e);
        
        return new ResponseEntity<>(e,HttpStatus.OK);
    
    }
    
}
