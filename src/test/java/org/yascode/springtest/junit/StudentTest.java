package org.yascode.springtest.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private static Student student;
    private static int i = 0;

    @BeforeAll
    public static void instantiateStudent() {
        student = new Student();
        student.setName("Yassin");
        student.setAge(26);
        System.out.println("The student has successfully instantiated");
    }

    @BeforeEach
    public void runEveryCall() {
        System.out.println("Execution number: " + ++i);
    }

    @Test
    public void getName() {
        Assertions.assertEquals(student.getName(), "Yassin");
    }

    @Test
    public void getAge() {
        Assertions.assertEquals(student.getAge(), 26);
    }

}