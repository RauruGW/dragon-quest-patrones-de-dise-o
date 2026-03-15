package com.taller.patrones.infrastructure.combat.attackFactory;

import com.taller.patrones.domain.Attack;
import com.taller.patrones.infrastructure.combat.damageStrategy.SpecialDamageStrategy;
import com.taller.patrones.domain.SimpleAttack;

public class MeteorFactory implements AttackFactory {
    @Override
    public Attack create() {
        return new SimpleAttack("Meteor", 120, Attack.AttackType.SPECIAL, new SpecialDamageStrategy());
    }
    
}
