package com.taller.patrones.infrastructure.combat.attackFactory;

import com.taller.patrones.domain.Attack;
import com.taller.patrones.infrastructure.combat.damageStrategy.SpecialDamageStrategy;

public class IceBeamFactory implements AttackFactory {
    @Override
    public Attack create() {
        return new Attack("Ice Beam", 70, Attack.AttackType.SPECIAL, new SpecialDamageStrategy());
    }
    
}
