package com.taller.patrones.interfaces.rest;

import java.util.HashMap;
import java.util.Map;

public class ExternalFormatAdapter {

    ExternalData adapt(Map<String, Object> body) {
        Map<String, Object> player = (Map<String, Object>) body.getOrDefault("player", new HashMap<>());
        Map<String, Object> enemy = (Map<String, Object>) body.getOrDefault("enemy", new HashMap<>());

        String fighter1Name = (String) player.getOrDefault("name", "Héroe");
        int fighter1Hp = ((Number) player.getOrDefault("hp", 150)).intValue();
        int fighter1Atk = ((Number) player.getOrDefault("atk", 25)).intValue();
        String fighter2Name = (String) enemy.getOrDefault("name", "Dragón");
        int fighter2Hp = ((Number) enemy.getOrDefault("hp", 120)).intValue();
        int fighter2Atk = ((Number) enemy.getOrDefault("atk", 30)).intValue();
        return new ExternalData(fighter1Name, fighter1Hp, fighter1Atk, fighter2Name, fighter2Hp, fighter2Atk);
    }

    record ExternalData(
        String fighter1Name, 
        int fighter1Hp, 
        int fighter1Atk, 
        String fighter2Name, 
        int fighter2Hp, 
        int fighter2Atk
    ) {}
}
