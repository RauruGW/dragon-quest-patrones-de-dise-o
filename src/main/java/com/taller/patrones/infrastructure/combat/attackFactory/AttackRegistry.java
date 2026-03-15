package com.taller.patrones.infrastructure.combat.attackFactory;

import java.util.HashMap;
import java.util.Map;

public class AttackRegistry {
    private static final Map<String, AttackFactory> registry = new HashMap<>();

    static {
        registry.put("TACKLE", new TackleFactory());
        registry.put("SLASH", new SlashFactory());
        registry.put("FIREBALL", new FireBallFactory());
        registry.put("ICE_BEAM", new IceBeamFactory());
        registry.put("POISON_STING", new PoisonStingFactory());
        registry.put("THUNDER", new ThunderFactory());
        registry.put("METEOR", new MeteorFactory());
        registry.put("FIRE SLASH COMBO", new ComboFactory());
    }

    public static AttackFactory getFactory(String name) {
        String n = name != null ? name.toUpperCase() : "";
        return registry.getOrDefault(n, new DefaultAttackFactory());
    }
}
