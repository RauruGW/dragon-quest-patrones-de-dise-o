package com.taller.patrones.infrastructure.combat.attackFactory;

import com.taller.patrones.domain.Attack;
import com.taller.patrones.domain.SimpleAttack;
import com.taller.patrones.infrastructure.combat.damageStrategy.NormalDamageStrategy;

public class TackleFactory implements AttackFactory {
    @Override
    public Attack create() {
        return new SimpleAttack("TACKLE", 40, Attack.AttackType.NORMAL, new NormalDamageStrategy());
    }
    
}
