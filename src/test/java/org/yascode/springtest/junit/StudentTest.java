package org.yascode.springtest.junit;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.*;

import java.util.MissingFormatArgumentException;

import static org.junit.jupiter.api.Assertions.*;

@Tag("student")
class StudentTest {

    private static Student student;

    @BeforeAll
    public static void instantiateStudent() {
        student = new Student();
        student.setName("Yassin");
        student.setAge("26");
        System.out.println("This method will be executed before the execution of all the tests of this test class");
    }

    @BeforeEach
    public void beforeEachTest() {
        System.out.println("This method will be executed before each test");
    }

    @Test
    public void getName() {
        Assertions.assertTrue(student.getName().equals("Yassin"), "Name not Matches");
    }

    @Test
    public void getAge() {
        Assertions.assertTrue(student.getAge().equals("26"), "Age not Matches");
    }

    @Test
    public void testing(){
        Assertions.assertAll("Student Data",
                () -> Assertions.assertEquals(student.getName(),"Yassin","Name not Matches"),
                () -> Assertions.assertEquals(student.getAge(),"26","Age  not Matches"));
    }

    @Test
    @DisplayName("Test Student By Id")
    public void findById() {
        Assertions.assertThrows(RuntimeException.class,
                () -> student.getException());
    }

    @Test
    void newTest(){
        //Assertions.assertTrue("Yassin".equalsIgnoreCase("YASSIN"));
        //org.assertj.core.api.Assertions.assertThat(student.getName()).isEqualTo("Yassin");
        MatcherAssert.assertThat(student.getName(), Matchers.is("Yassin"));
    }

    @Nested
    class nestedStudent {

        @BeforeEach
        void setUp() {
            System.out.println("In");
        }

        @Test
        void nestedTest(){
            Student student = new Student();
            student.setName("Yassin");
            org.assertj.core.api.Assertions.assertThat(student.getName()).isEqualTo("Yassin");
        }
    }

    @Test
    @DisplayName("Hi Function")
    @RepeatedTest(value = 5, name = "{displayName} : {currentRepetition} | {totalRepetitions}")
    void myTest(){
        System.out.println("HI");
    }

    @AfterEach
    void afterEachTest() {
        System.out.println("This method will be executed after each test");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("This method will be executed after the execution of all the tests of this test class");
    }

}