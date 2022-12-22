/*
 * Author Name: Philip Meshach
 * Date: 22-12-2022
 * Praise The Lord
 */
package org.niit.Domin;

public class Employee {

    private String empName;
    private String empId;
    private String empAddress;

    public Employee() {
    }

    public Employee(String empName, String empId, String empAddress) {
        this.empName = empName;
        this.empId = empId;
        this.empAddress = empAddress;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empId='" + empId + '\'' +
                ", empAddress='" + empAddress + '\'' +
                '}';
    }
}
