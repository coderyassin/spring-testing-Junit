package org.yascode.springtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.yascode.springtest.repositories.PlayerRepo;

@SpringBootTest
class SpringTestApplicationTests {

	@Test
	void getName() {
		PlayerRepo player = new PlayerRepo();
		Assertions.assertNull(player.getName("Yassin"));

	}

}
