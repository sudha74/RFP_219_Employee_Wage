package com.bl;

public class EmpWageBuilder {
    public final int IS_FULL_TIME = 1;
    public final int IS_PART_TIME = 2;

    int noOfCompany = 0;
    CompanyEmpWage[] companyEmpWages = new CompanyEmpWage[5];

    void addCompanyEmpWage(String company, int wagePerHr, int daysPerMonth, int workPerMonth) {
        companyEmpWages[noOfCompany] = new CompanyEmpWage(company, wagePerHr, daysPerMonth, workPerMonth);
        noOfCompany++;
    }

    void calculateWage() {
        for (int i = 0; i < noOfCompany; i++) {
            calculateWage(companyEmpWages[i]);
        }
    }


    void calculateWage(CompanyEmpWage companyEmpWage) {
        int empHrs;
        int totalHours = 0;
        int dailyWage;
        int day = 0;

        while ((totalHours < companyEmpWage.workHrPerMonth) && (day < companyEmpWage.daysPerMonth)) {

            int attendance = (int) (Math.floor(Math.random() * 10)) % 3;
            switch (attendance) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
                    break;
            }
            totalHours += empHrs;
            dailyWage = companyEmpWage.wagePerHr * empHrs;
            companyEmpWage.totalWage += dailyWage;
            day++;
        }
        System.out.println("Total work hours is : " + totalHours);
        System.out.println("Total work days are: " + day);
        System.out.println("Total employee wage for company " + companyEmpWage.company + "is" + companyEmpWage.totalWage);
    }
}

