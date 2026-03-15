package com.taller.patrones.infrastructure.combat.attackFactory;

import com.taller.patrones.domain.Attack;
import com.taller.patrones.infrastructure.combat.damageStrategy.StatusDamageStrategy;
import com.taller.patrones.domain.SimpleAttack;

public class PoisonStingFactory implements AttackFactory {
    @Override
    public Attack create() {
        return new SimpleAttack("Poison Sting", 20, Attack.AttackType.STATUS, new StatusDamageStrategy());
    }
    
}
