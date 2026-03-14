package com.taller.patrones.infrastructure.combat.attackFactory;

import com.taller.patrones.domain.Attack;

public class DefaultAttackFactory implements AttackFactory {
    @Override
    public Attack create() {
        return new Attack("Golpe", 30, Attack.AttackType.NORMAL);
    }
    
}
