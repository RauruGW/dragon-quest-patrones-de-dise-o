package com.taller.patrones.infrastructure.command;

import java.util.ArrayList;
import java.util.List;

public class CommandHistory {
    private final List<AttackCommand> history = new ArrayList<>();

    public void execute(AttackCommand command) {
        history.add(command);
        command.execute();
    }

    public void undo() {
        if (!history.isEmpty()) {
            AttackCommand lastCommand = history.remove(history.size() - 1);
            lastCommand.undo();
        }
    }
}
