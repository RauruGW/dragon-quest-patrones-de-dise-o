package com.taller.patrones.infrastructure.combat.attackFactory;

import com.taller.patrones.domain.Attack;

public class MeteorFactory implements AttackFactory {
    @Override
    public Attack create() {
        return new Attack("Meteor", 120, Attack.AttackType.SPECIAL);
    }
    
}
