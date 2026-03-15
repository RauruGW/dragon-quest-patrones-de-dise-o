package com.taller.patrones.infrastructure.combat.attackFactory;

import java.util.List;

import com.taller.patrones.domain.Attack;
import com.taller.patrones.domain.ComboAttack;

public class ComboFactory implements AttackFactory {
    @Override
    public Attack create() {
        AttackFactory fireballFactory = new FireBallFactory();
        AttackFactory slashFactory = new SlashFactory();
        
        return new ComboAttack("FIRE SLASH COMBO", List.of(fireballFactory.create(), slashFactory.create()));
    }
    
}
