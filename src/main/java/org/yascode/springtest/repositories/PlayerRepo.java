package org.yascode.springtest.repositories;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class PlayerRepo {

    private final List<String> players;

    public PlayerRepo(){
        players = new LinkedList<>();
        players.add("Hakimi");
        players.add("Messi");
        players.add("CR7");
        players.add("Zyach");
    }

    public String getName(String name){
        Optional<String> player = players.stream().filter(p -> p.equals(name)).findFirst();
        return player.orElse(null);
    }

}
