package com.taller.patrones.infrastructure.combat.attackFactory;

import com.taller.patrones.domain.Attack;

public class SlashFactory implements AttackFactory {
    @Override
    public Attack create() {
        return new Attack("SLASH", 55, Attack.AttackType.NORMAL);
    }
    
}
