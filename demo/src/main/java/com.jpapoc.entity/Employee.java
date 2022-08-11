package com.example.demo;


import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int empId;
    private String empName;
    private String empLocation;

    public Employee(){

    }
    public Employee(String empName, String empLocation){
        this.empName=empName;
        this.empLocation=empLocation;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpLocation() {
        return empLocation;
    }

    public void setEmpLocation(String empLocation) {
        this.empLocation = empLocation;
    }

    @Override
    public String toString() {
        return this.empId + " + " + this.empName + "i"+this.empLocation;
    }
}
