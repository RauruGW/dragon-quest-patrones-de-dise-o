package com.taller.patrones.domain;

import java.util.List;

import com.taller.patrones.infrastructure.combat.damageStrategy.DamageStrategy;

public class ComboAttack implements Attack {

    private String name;
    private List<Attack> attacks;

    public ComboAttack(String name, List<Attack> attacks) {
        this.name = name;
        this.attacks = attacks;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getBasePower() {
        return attacks.stream().mapToInt(Attack::getBasePower).sum();
    }

    @Override
    public Attack.AttackType getType() {
        return attacks.get(0).getType();
    }

    @Override
    public DamageStrategy getDamageStrategy() {
        return attacks.get(0).getDamageStrategy();
    }

    public List<Attack> getAttacks() {
        return attacks;
    }
    
}
