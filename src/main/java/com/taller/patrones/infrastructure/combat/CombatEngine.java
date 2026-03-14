package com.taller.patrones.infrastructure.combat;

import com.taller.patrones.domain.Attack;
import com.taller.patrones.domain.Character;
import com.taller.patrones.infrastructure.combat.attackFactory.AttackRegistry;


public class CombatEngine {


    public Attack createAttack(String name) {
        return AttackRegistry.getFactory(name).create();
    }

    /**
     * Calcula el daño según el tipo de ataque.
     * Cada fórmula nueva (ej. crítico, veneno con tiempo) requiere modificar este switch.
     */
    public int calculateDamage(Character attacker, Character defender, Attack attack) {
        return switch (attack.getType()) {
            case NORMAL -> {
                int raw = attacker.getAttack() * attack.getBasePower() / 100;
                yield Math.max(1, raw - defender.getDefense());
            }
            case SPECIAL -> {
                int raw = attacker.getAttack() * attack.getBasePower() / 100;
                int effectiveDef = defender.getDefense() / 2;
                yield Math.max(1, raw - effectiveDef);
            }
            case STATUS -> attacker.getAttack(); // Los de estado no hacen daño directo... ¿o sí?
            default -> 0;
        };
    }
}
