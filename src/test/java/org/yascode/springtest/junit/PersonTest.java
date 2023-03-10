package org.yascode.springtest.junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

//@Disabled
class PersonTest implements PersonInterface {

    private static Person person;

    @BeforeAll
    static void beforeEachTest() {
        person = new Person();
        person.setFName("Yassin");
        person.setLName("MELLOUKI");
        person.setPhone1("01113903660");
        person.setPhone2("01255582855");
    }

    @Test
    void personTest() {
        Assertions.assertAll("Person Data",
                () -> Assertions.assertAll
                        ("Person Names",
                                () -> Assertions.assertEquals(person.getFName(),"Yassin","First Name not Matches"),
                                () -> Assertions.assertEquals(person.getLName(),"MELLOUKI","Last Name  not Matches")
                        ),
                () -> Assertions.assertAll
                        ("Person Phones",
                                () -> Assertions.assertEquals(person.getPhone1(),"01113903660","Phone not Matches"),
                                () -> Assertions.assertEquals(person.getPhone2(),"01255582855","Phone  not Matches")
                        )
        );
    }

    @Test
    void simpleTest(){
        System.out.println("simpleTest............");
    }

}