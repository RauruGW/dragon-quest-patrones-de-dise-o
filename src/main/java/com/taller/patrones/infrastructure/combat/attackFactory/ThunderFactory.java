package com.taller.patrones.infrastructure.combat.attackFactory;

import com.taller.patrones.domain.Attack;

public class ThunderFactory implements AttackFactory {
    @Override
    public Attack create() {
        return new Attack("Thunder", 90, Attack.AttackType.SPECIAL);
    }
    
}
