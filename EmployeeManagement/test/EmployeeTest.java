/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import employeemanagement.Employee;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author ACER
 */
public class EmployeeTest {
    
    @Test
      public void testGetEmployeeId() {
          Employee employee = new Employee("E001", "John Doe", 5000.0);
          assertEquals("E001", employee.getEmployeeId());
      }


      @Test
      public void testSetSalary() {
          Employee employee = new Employee("E001", "John Doe", 5000.0);
          employee.setSalary(1500.0);
          assertEquals(1500.0, employee.getSalary(), 0.001);
      }

    
}
