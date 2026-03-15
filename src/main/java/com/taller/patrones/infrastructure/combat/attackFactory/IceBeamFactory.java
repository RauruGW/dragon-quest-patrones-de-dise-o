package com.taller.patrones.infrastructure.combat.attackFactory;

import com.taller.patrones.domain.Attack;
import com.taller.patrones.infrastructure.combat.damageStrategy.SpecialDamageStrategy;
import com.taller.patrones.domain.SimpleAttack;

public class IceBeamFactory implements AttackFactory {
    @Override
    public Attack create() {
        return new SimpleAttack("Ice Beam", 70, Attack.AttackType.SPECIAL, new SpecialDamageStrategy());
    }
    
}
