package org.yascode.springtest.before.repositories;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class PlayerRepo {

    private String name;
    private final List<String> players = new LinkedList<>();

    public PlayerRepo(){

        players.add("Hakimi");
        players.add("Messi");
        players.add("CR7");
        players.add("Zyach");
    }

    public PlayerRepo(String name) {
        this.name = name;
    }


    public String getName(String name){
        Optional<String> player = players.stream().filter(p -> p.equals(name)).findFirst();
        return player.orElse(null);
    }

    /*@Override
    public boolean equals(Object obj) {
        PlayerRepo playerRepo = (PlayerRepo) obj;
        if(!this.players.equals(((PlayerRepo) obj).players)) return false;
        return this.name.equals(playerRepo.name);
    }*/

    public String getName() {
        return name;
    }
}
