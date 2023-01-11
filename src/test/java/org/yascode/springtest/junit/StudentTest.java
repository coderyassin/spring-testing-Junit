package org.yascode.springtest.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void getName() {
        Student student = new Student();
        student.setName("Yassin");
        Assertions.assertEquals(student.getName(), "Yassin");
    }

    @Test
    public void getAge() {
        Student student = new Student();
        student.setAge(26);
        Assertions.assertEquals(student.getAge(), 26);
    }

}