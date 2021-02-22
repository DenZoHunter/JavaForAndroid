package ru.geekbrains.lesson5;

public class Employee {

    private String employeeFullName;
    protected String employeePosition;
    protected String employeeEmail;
    protected int employeePhoneNumber;
    protected int employeeSalary;
    protected int employeeAge;

    public Employee(String employeeFullName, String employeePosition, String employeeEmail, int employeePhoneNumber, int employeeSalary, int employeeAge) {
        this.employeeFullName = employeeFullName;
        this.employeePosition = employeePosition;
        this.employeeEmail = employeeEmail;
        this.employeePhoneNumber = employeePhoneNumber;
        this.employeeSalary = employeeSalary;
        this.employeeAge = employeeAge;
    }

    public String getEmployeeFullName() {
        return employeeFullName;
    }

    public void setEmployeeFullName(String employeeFullName) {
        this.employeeFullName = employeeFullName;
    }

    public void printEmployeeInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Имя сотрудника: " + employeeFullName +
                "\nДолжность сотрудника: " + employeePosition +
                "\nE-mail сторудника: " + employeeEmail +
                "\nТелефон сотрудника: " + employeePhoneNumber +
                "\nЗарплата сотрудника: " + employeeSalary +
                "\nВозраст сотрудника: " + employeeAge;
    }

}
