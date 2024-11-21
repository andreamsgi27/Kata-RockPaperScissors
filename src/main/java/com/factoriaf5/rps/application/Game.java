package com.factoriaf5.rps.application;

import java.util.Random;

import com.factoriaf5.rps.models.Form;
import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;

public class Game {
    private Form formPlayer;

    
    public Game(Form formPlayer) {
        this.formPlayer = formPlayer;
    }


    public void play(){
        int choice = (int) (Math.random()*3+1);
        Form formComputer = buildComputerForm(choice);
    }

    public Form buildComputerForm(int choice){
        switch(choice){
            case 1:
            return new Rock();
            case 2:
            return new Scissors();
            case 3:
            return new Paper();
            default:
            return null;
        }
    }

    public String winner(Form formComputer){
        if(formComputer.action()== formPlayer.action()){
            return "Empate";
        }

        if(formComputer.action() == 1 && formPlayer.action() == 2){
            return "Ganó Roca";
        }

        if(formComputer.action() == 2 && formPlayer.action() == 3){
            return "Ganó tijeras";
        }

        if (formComputer.action() == 3 && formPlayer.action() == 1){
            return "Ganó papel";
        }

        if(formComputer.action() == 1 && formPlayer.action() == 3){
            return "Ganó papel";
        }

        if (formComputer.action() == 2 && formPlayer.action() == 1){
            return "Ganó Roca";
        }

        if (formComputer.action() == 3 && formPlayer.action() == 2){
            return "Ganó tijeras";
        }

        return null;


    }
    
}
