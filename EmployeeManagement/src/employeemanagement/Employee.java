/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemanagement;

/**
 *
 * @author ACER
 */
public class Employee {
      private String employeeId;
      private String employeeName;
      private double salary;


      // Constructor
      public Employee(String employeeId, String employeeName, double salary) {
          this.employeeId = employeeId;
          this.employeeName = employeeName;
          this.salary = salary;
      }


      // Getter và Setter methods
      public String getEmployeeId() { return employeeId; }
      public String getEmployeeName() { return employeeName; }
      public double getSalary() { return salary; }
      public void setSalary(double salary) { this.salary = salary; }
  }

