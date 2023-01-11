package org.yascode.springtest.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class TimeOutTest {

    @Test
    void timeOutTest1(){
        Assertions.assertTimeout(Duration.ofMillis(2500),
                () -> {
                    Thread.sleep(1500);
                    System.out.println("Time Out Testing 1");
                }
        );
    }

    @Test
    void timeOutTest2(){
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(2000),
                () -> {
                    Thread.sleep(1900);
                    System.out.println("Time Out Testing 2");
                }
        );
    }

}
