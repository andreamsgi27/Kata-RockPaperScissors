package com.factoriaf5.rps.application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.factoriaf5.rps.models.Form;
import com.factoriaf5.rps.models.Lizard;
import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;
import com.factoriaf5.rps.models.Spock;

public class GameTest {

    @Test
    public void playReturnsTieRock() {
        Form formPlayer = new Rock();
        Game game = new Game(formPlayer);
        game.guessChoice(1);
        String result = game.play();
        assertEquals("Empate", result);
    }
    @Test
    public void playReturnsTieScissors() {
        Form formPlayer = new Scissors();
        Game game = new Game(formPlayer);
        game.guessChoice(2);
        String result = game.play();
        assertEquals("Empate", result);
    }
    @Test
    public void playReturnsTiePaper() {
        Form formPlayer = new Paper();
        Game game = new Game(formPlayer);
        game.guessChoice(3);
        String result = game.play();
        assertEquals("Empate", result);
    }
    @Test
    public void playReturnsTieLizard() {
        Form formPlayer = new Lizard();
        Game game = new Game(formPlayer);
        game.guessChoice(4);
        String result = game.play();
        assertEquals("Empate", result);
    }
    @Test
    public void playReturnsTieSpock() {
        Form formPlayer = new Spock();
        Game game = new Game(formPlayer);
        game.guessChoice(5);
        String result = game.play();
        assertEquals("Empate", result);
    }
    @Test
    public void playReturnsPlayerWinRockVsScissors() {
        Form formPlayer = new Rock();
        Game game = new Game(formPlayer);
        game.guessChoice(2);
        String result = game.play();
        assertEquals("Gana jugador", result);
    }
    @Test
    public void playReturnsPCWinsRockVsPaper() {
        Form formPlayer = new Rock();
        Game game = new Game(formPlayer);
        game.guessChoice(3);
        String result = game.play();
        assertEquals("Gana computadora", result);
    }
    @Test
    public void playReturnsPCWinsScissorsVsRock() {
        Form formPlayer = new Scissors();
        Game game = new Game(formPlayer);
        game.guessChoice(1);
        String result = game.play();
        assertEquals("Gana computadora", result);
    }
    @Test
    public void playReturnsPCWinsScissorsVsPaper() {
        Form formPlayer = new Scissors();
        Game game = new Game(formPlayer);
        game.guessChoice(3);
        String result = game.play();
        assertEquals("Gana jugador", result);
    }

    @Test
    public void playReturnsPlayerWinsPaperVsRock() {
        Form formPlayer = new Paper();
        Game game = new Game(formPlayer);
        game.guessChoice(1);
        String result = game.play();
        assertEquals("Gana jugador", result);
    }

    @Test
    public void playReturnsPCWinsPaperVsScissors() {
        Form formPlayer = new Paper();
        Game game = new Game(formPlayer);
        game.guessChoice(2);
        String result = game.play();
        assertEquals("Gana computadora", result);
    }
    @Test
    public void playReturnsPCWinsLizardVsScissors() {
        Form formPlayer = new Lizard();
        Game game = new Game(formPlayer);
        game.guessChoice(2);
        String result = game.play();
        assertEquals("Gana computadora", result);
    }
    @Test
    public void playReturnsPCWinsLizardVsRock() {
        Form formPlayer = new Lizard();
        Game game = new Game(formPlayer);
        game.guessChoice(1);
        String result = game.play();
        assertEquals("Gana computadora", result);
    }
    @Test
    public void playReturnsPCWinsSpockVsLizard() {
        Form formPlayer = new Spock();
        Game game = new Game(formPlayer);
        game.guessChoice(4);
        String result = game.play();
        assertEquals("Gana computadora", result);
    }
    @Test
    public void playReturnsPCWinsSpockVsPaper() {
        Form formPlayer = new Spock();
        Game game = new Game(formPlayer);
        game.guessChoice(3);
        String result = game.play();
        assertEquals("Gana computadora", result);
    }
    @Test
    public void playReturnsPlayerWinLizardVsPaper() {
        Form formPlayer = new Lizard();
        Game game = new Game(formPlayer);
        game.guessChoice(3);
        String result = game.play();
        assertEquals("Gana jugador", result);
    }
    @Test
    public void playReturnsPlayerWinLizardVsSpock() {
        Form formPlayer = new Lizard();
        Game game = new Game(formPlayer);
        game.guessChoice(5);
        String result = game.play();
        assertEquals("Gana jugador", result);
    }
    @Test
    public void playReturnsPlayerWinSpockVsScissors() {
        Form formPlayer = new Spock();
        Game game = new Game(formPlayer);
        game.guessChoice(2);
        String result = game.play();
        assertEquals("Gana jugador", result);
    }
    @Test
    public void playReturnsPlayerWinSpockVsRock() {
        Form formPlayer = new Spock();
        Game game = new Game(formPlayer);
        game.guessChoice(1);
        String result = game.play();
        assertEquals("Gana jugador", result);
    }


}
