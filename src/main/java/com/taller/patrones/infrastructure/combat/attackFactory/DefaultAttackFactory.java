package com.taller.patrones.infrastructure.combat.attackFactory;

import com.taller.patrones.domain.Attack;
import com.taller.patrones.infrastructure.combat.damageStrategy.NormalDamageStrategy;

public class DefaultAttackFactory implements AttackFactory {
    @Override
    public Attack create() {
        return new Attack("Golpe", 30, Attack.AttackType.NORMAL, new NormalDamageStrategy());
    }
    
}
