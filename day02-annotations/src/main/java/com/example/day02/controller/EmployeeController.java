package com.example.day02.controller;

import com.example.day02.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(path="/employees")

public class EmployeeController {

    @GetMapping(path="/getSecretMessage")
    public String getMySuperSecretMessage() {
        return "Secret Message : sakshamjain2005";
    }

    @GetMapping(path="/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable (name="employeeId") Long id) {
        return new EmployeeDTO(
                id,
                "Saksham Jain",
                "jainsaksham434@gmail.com",
                20,
                LocalDate.of(2025, 12, 15),
                true
        );
    }

    @GetMapping
    public String getAllEmployees(@RequestParam(required=false,name="inputAge") Integer age,@RequestParam(required=false) String sortBy) {
           return "Hi age " +age+" "+sortBy;
    }

    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO inputEmployee){
        inputEmployee.setId(100L);
        return inputEmployee;
    }

    @PutMapping
    public String updateEmployeeById(){
        return "Hello from put";
    }

}







