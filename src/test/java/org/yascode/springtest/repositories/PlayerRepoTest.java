package org.yascode.springtest.repositories;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerRepoTest {

    @Test
    void getName() {
        PlayerRepo playerRepo = new PlayerRepo();
        Assertions.assertEquals(playerRepo.getName("Messi"), "Messi");
    }
}