package org.yascode.springtest.before.repositories;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerRepoTest {

    @Test
    void testGetName1() {
        PlayerRepo playerRepo1 = new PlayerRepo();
        PlayerRepo playerRepo2 = new PlayerRepo();
        Assertions.assertEquals(playerRepo1.getName("Messi"),playerRepo2.getName("Messi"));
    }

    @Test
    void namePlayerTesting2() {
        PlayerRepo playerRepo1 = new PlayerRepo();
        PlayerRepo playerRepo2 = new PlayerRepo();
        Assertions.assertEquals(playerRepo1.getName("Messi"),playerRepo2.getName("Messi"));
    }

    @Test
    void namePlayerTesting3() {
        PlayerRepo playerRepo1 = new PlayerRepo();
        PlayerRepo playerRepo2 = new PlayerRepo();
        Assertions.assertEquals(playerRepo1.getName("CR7"),"CR7");
    }

    @Test
    void namePlayerTesting4() {
        PlayerRepo playerRepo1 = new PlayerRepo();
        PlayerRepo playerRepo2 = new PlayerRepo();
        Assertions.assertEquals(playerRepo1.getName("Zyach"),playerRepo2.getName("Zyach"));
    }

    /*@Test
    void testEquals() {
        PlayerRepo playerRepo1 = new PlayerRepo();
        PlayerRepo playerRepo2 = new PlayerRepo();
        Assertions.assertEquals(playerRepo1.getName("Hakimi"),playerRepo2.getName("Hakimi"));
    }*/
}