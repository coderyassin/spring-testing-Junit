package org.yascode.springtest.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class WindowsTest {

    @Test
    @EnabledOnOs(OS.MAC)
    void mac(){
        System.out.println("MAC..............");
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void windows(){
        System.out.println("WINDOWS..............");
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void linux(){
        System.out.println("LINUX..............");
    }

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    void version8(){
        System.out.println("Java 8....................");
    }

    @Test
    @EnabledOnJre(JRE.JAVA_11)
    void version11(){
        System.out.println("Java 11....................");
    }

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void version17(){
        System.out.println("Java 17....................");
    }

    @Test
    @EnabledOnJre(JRE.JAVA_19)
    void version19(){
        System.out.println("Java 19....................");
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "USERNAME",matches = "Yasin")
    void userName1(){
        System.out.println("Yasin.........");
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "USERNAME",matches = "Ahmed Mohamed")
    void userName2(){
        System.out.println("Ahmed.........");
    }

}
