package com.taller.patrones.infrastructure.combat.attackFactory;

import com.taller.patrones.domain.Attack;

public class TackleFactory implements AttackFactory {
    @Override
    public Attack create() {
        return new Attack("TACKLE", 40, Attack.AttackType.NORMAL);
    }
    
}
