package com.bl;

public class EmployeeWage {
    public static void main(String[] args) {
        EmpWageBuilder empWageBuilder = new EmpWageBuilder();
        empWageBuilder.addCompanyEmpWage("BEL", 10, 20, 100);
        empWageBuilder.addCompanyEmpWage("situsAMC", 20, 22, 90);
        empWageBuilder.calculateWage();
    }
}