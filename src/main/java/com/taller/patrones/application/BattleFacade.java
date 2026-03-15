package com.taller.patrones.application;

import com.taller.patrones.application.BattleService.BattleStartResult;
import com.taller.patrones.domain.Battle;

public class BattleFacade {
    private final BattleService battleService = new BattleService();

    public BattleStartResult startBattle(String playerName, String enemyName) {
        return battleService.startBattle(playerName, enemyName);
    }

    public Battle getBattle(String battleId) {
        return battleService.getBattle(battleId);
    }

    public void executeAttack(String battleId, String attackName) {
        Battle battle = getBattle(battleId);
        if (battle == null || battle.isFinished()) return;
        if (battle.isPlayerTurn()) {
            battleService.executePlayerAttack(battleId, attackName);
        } else {
            battleService.executeEnemyAttack(battleId, attackName);
        }
    }

}
