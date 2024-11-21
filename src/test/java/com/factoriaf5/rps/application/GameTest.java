package com.factoriaf5.rps.application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.factoriaf5.rps.models.Form;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;
import com.factoriaf5.rps.models.Paper;

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


}
