package com.taller.patrones.infrastructure.combat.attackFactory;

import com.taller.patrones.domain.Attack;

public class PoisonStingFactory implements AttackFactory {
    @Override
    public Attack create() {
        return new Attack("Poison Sting", 20, Attack.AttackType.STATUS);
    }
    
}
