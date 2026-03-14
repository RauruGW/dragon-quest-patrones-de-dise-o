package com.taller.patrones.infrastructure.observer;

import com.taller.patrones.domain.Battle;
import com.taller.patrones.domain.Character;
import com.taller.patrones.domain.Attack;

public class AnalyticsObserver implements DamageObserver {
    @Override
    public void onDamageDealt(Battle battle, Character attacker, Character defender, int damage, Attack attack) {
        System.out.println("[Analytics] " + attacker.getName() + " hizo " + damage + " de daño a " + defender.getName() + " con " + attack.getName());
    }
    
}
