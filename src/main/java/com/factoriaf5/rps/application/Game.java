package com.factoriaf5.rps.application;

import com.factoriaf5.rps.models.Form;
import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;

public class Game {
    public int randomChoice = (int) (Math.random() * 3 + 1);
    private Form formPlayer;

    public Game(Form formPlayer) {
        this.formPlayer = formPlayer;
    }

    public String play() {
        Form formComputer = buildComputerForm(randomChoice);

        Boolean winner = this.winner(formComputer); // Usamos `this` para referirnos a la instancia actual
    
        if (winner == null) {
            return "Empate";
        }
    
        return winner ? "Gana jugador" : "Gana computadora";
    }

    public static Form buildComputerForm(int choice) {
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
    //Método útil para los tests
    public void guessChoice(int choice){
        this.randomChoice = choice;
    }
}