package com.taller.patrones.infrastructure.combat.attackFactory;

import com.taller.patrones.domain.Attack;
import com.taller.patrones.infrastructure.combat.damageStrategy.SpecialDamageStrategy;

public class ThunderFactory implements AttackFactory {
    @Override
    public Attack create() {
        return new Attack("Thunder", 90, Attack.AttackType.SPECIAL, new SpecialDamageStrategy());
    }
    
}
