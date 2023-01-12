package org.yascode.springtest.junit;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Tag("person")
public interface PersonInterface {

    @BeforeEach
    default void setUp() {
        System.out.println("BeforeEach...........");
    }

    @BeforeAll
    default void beforeAll() {
        System.out.println("beforeAll...........");
    }

    @Test
    default void myTest() {
        System.out.println("myTest...........");
    }

}
