/*
 * Author Name: Philip Meshach
 * Date: 22-12-2022
 * Praise The Lord
 */
package org.niit.config;

import org.niit.Domin.Department;
import org.niit.Domin.Employee;
import org.springframework.context.annotation.Bean;

public class EmployeeConfig {

    @Bean
    public Employee getDetails(){
        Employee employee = new Employee("Meshach","NewYork","12",new Department("Mechanical","12","process"));
//        employee.setEmpId("12");
//        employee.setEmpName("meshach");
//        employee.setEmpAddress("NewYork");

        return employee;
    }

//    @Bean
//    public Department getDetails1(){
//        return new Department("Mechanical","12","Process");
//    }
}
