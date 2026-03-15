package com.taller.patrones.infrastructure.combat.attackFactory;

import com.taller.patrones.domain.SimpleAttack;
import com.taller.patrones.infrastructure.combat.damageStrategy.SpecialDamageStrategy;
import com.taller.patrones.domain.Attack;

public class FireBallFactory implements AttackFactory {
    @Override
    public Attack create() {
        return new SimpleAttack("FIREBALL", 80, Attack.AttackType.SPECIAL, new SpecialDamageStrategy());
    }
}
