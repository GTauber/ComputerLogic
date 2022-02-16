package com.week3and4.tauber.model;

public class Employee {
    private String name;
    private String company;
    private Double salary;
    private Double deduction;
    private Boolean hasDeduction;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getDeduction() {
        return deduction;
    }

    public Boolean getHasDeduction() {
        return hasDeduction;
    }

    public void setHasDeduction(Boolean hasDeduction) {
        this.hasDeduction = hasDeduction;
    }

    public Double calcDeduction(Double salary) {
        if (salary <= 1903.98) this.deduction = (Double.valueOf(0));
        else if (salary > 1903.98 && salary <= 2826.65) this.deduction = (7.5);
        else if (salary > 2826.65 && salary <= 3751.05) this.deduction = (Double.valueOf(15));
        else if (salary > 3751.05 && salary <= 4664.68) this.deduction = (Double.valueOf(22.5));
        else if (salary > 4664.68) this.deduction = (Double.valueOf(27.5));
        return deduction;
    }
}
