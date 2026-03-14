package com.taller.patrones.infrastructure.combat.attackFactory;

import com.taller.patrones.domain.Attack;
import com.taller.patrones.infrastructure.combat.damageStrategy.SpecialDamageStrategy;

public class FireBallFactory implements AttackFactory {
    @Override
    public Attack create() {
        return new Attack("FIREBALL", 80, Attack.AttackType.SPECIAL, new SpecialDamageStrategy());
    }
}
