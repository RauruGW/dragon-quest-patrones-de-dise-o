package com.taller.patrones.infrastructure.combat.attackFactory;

import com.taller.patrones.domain.Attack;
import com.taller.patrones.infrastructure.combat.damageStrategy.NormalDamageStrategy;

public class SlashFactory implements AttackFactory {
    @Override
    public Attack create() {
        return new Attack("SLASH", 55, Attack.AttackType.NORMAL, new NormalDamageStrategy());
    }
    
}
