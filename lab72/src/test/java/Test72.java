/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import com.mycompany.lab72.Student;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 *
 * @author ACER
 */
public class Test72 { 
    private Student student;
    public void setUp() {
        student = new Student("S001", "Nguyen Van A", 20);
    }
    public void testGetStudentId() {
        setUp();
        assertEquals("S001", student.getStudentId());
    }
    public void testGetAge() {
        assertEquals(20, student.getAge());
    }
    public void testGetName() {
        assertEquals("Nguyen Van A", student.getName());
    }
}
