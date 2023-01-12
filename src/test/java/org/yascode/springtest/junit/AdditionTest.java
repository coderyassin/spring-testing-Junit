package org.yascode.springtest.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class AdditionTest {

    private int sum = 1;

    @Test
    void addingTwoReturnsThree() {
        System.out.println("------------ addingTwoReturnsThree ------------");
        System.out.println("The value of sum attribute is " + sum);
        sum += 2;
        System.out.println("The value of sum attribute is " + sum);
        System.out.println("------------ addingTwoReturnsThree ------------");
        assertEquals(3, sum);
    }

    @Test
    void addingThreeReturnsFour() {
        System.out.println("------------ addingThreeReturnsFour ------------");
        System.out.println("The value of sum attribute is " + sum);
        sum += 3;
        System.out.println("The value of sum attribute is " + sum);
        System.out.println("------------ addingThreeReturnsFour ------------");
        assertEquals(4, sum);
    }

}
