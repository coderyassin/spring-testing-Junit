package org.yascode.springtest.repositories;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerRepoTest {

    @Test
    void testGetName() {
        PlayerRepo playerRepo = new PlayerRepo();
        Assertions.assertEquals(playerRepo.getName("Messi").getName(), "Messi");
    }

    @Test
    void testEquals() {
        PlayerRepo playerRepo1 = new PlayerRepo();
        PlayerRepo playerRepo2 = new PlayerRepo();
        Assertions.assertEquals(playerRepo1.getName("Hakimi"),playerRepo2.getName("Hakimi"));
    }
}