package com.factoriaf5.rps.application;

import com.factoriaf5.rps.models.Form;
import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;

public class Game {
    private Form formPlayer;

    public Game(Form formPlayer) {
        this.formPlayer = formPlayer;
    }

    public String play() {
        int choice = (int) (Math.random() * 3 + 1);
        Form formComputer = buildComputerForm(choice);

        Boolean winner = winner(formComputer);

        if (winner == null) {
            return "Empate";
        }

        return winner ? "Gana jugador" : "Gana computadora";
    }

    public Form buildComputerForm(int choice) {
        switch (choice) {
            case 1:
                return new Rock();
            case 2:
                return new Scissors();
            case 3:
                return new Paper();
            default:
                throw new IllegalArgumentException("Elección inválida: " + choice);
        }
    }

    public Boolean winner(Form formComputer) {
        if (formPlayer.action() == formComputer.action()) {
            return null; //Empate
        }
        return formPlayer.compete(formComputer);
    }
}