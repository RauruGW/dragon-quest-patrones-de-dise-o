package com.taller.patrones.infrastructure.observer;

import java.util.ArrayList;
import java.util.List;

import com.taller.patrones.domain.Attack;
import com.taller.patrones.domain.Battle;
import com.taller.patrones.domain.Character;

public class DamageEventPublisher {
    private final static List<DamageObserver> observers = new ArrayList<>();

    public static void subscribe(DamageObserver observer) {
        observers.add(observer);
    }

    public static void publish(Battle battle, Character attacker, Character defender, int damage, Attack attack) {
        for (DamageObserver observer : observers) {
            observer.onDamageDealt(battle, attacker, defender, damage, attack);
        }
    }
}
