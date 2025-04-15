/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import com.mycompany.test.Student;


/**
 *
 * @author ACER
 */
import junit.framework.TestCase;
public class StudentTest extends TestCase{
    public void testGetName() {
        Student student = new Student("S001", "John", 20);
        assertEquals(student.getName(), "John");
    }
    public void testSetAge() {
        Student student = new Student("S002", "Alice", 22);
        student.setAge(25);
        assertEquals(student.getAge(), 25);
    }
    public void testUpdateName() {
        Student student = new Student("S003", "Bob", 19);
        student.updateName("Bobby");
        assertEquals(student.getName(), "Bobby");
    }
}
