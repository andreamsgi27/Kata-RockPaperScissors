package com.factoriaf5.rps.application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.factoriaf5.rps.models.Form;
import com.factoriaf5.rps.models.Rock;

public class GameTest {

    /*@Mock
    private Form mockPlayerForm;

    private Game game;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        game = new Game(mockPlayerForm);
    }*/

    @Test
    public void playReturnsTieWhenBothFormsAreEqual() {
        // Configurar el mock para devolver el mismo "action" que la computadora
        //when(mockPlayerForm.action()).thenReturn(1); // Rock
        //when(mockPlayerForm.compete(any(Form.class))).thenReturn(false);

        Form formPlayer = new Rock();
        Game game = new Game(formPlayer);
        game.guessChoice(1);
        String result = game.play();
        assertEquals("Empate", result);
    }

    /*@Test
    public void playReturnsWinWhenPlayerBeatsComputer() {
        // Configurar el mock para ganar
        when(mockPlayerForm.action()).thenReturn(1); // Rock
        when(mockPlayerForm.compete(any(Form.class))).thenReturn(true); // Gana contra Scissors

        Game game = new Game(mockPlayerForm);
        String result = game.play();

        assertEquals("Gana jugador", result);
    }

    @Test
    public void playReturnsLossWhenComputerBeatsPlayer() {
        // Configurar el mock para perder
        when(mockPlayerForm.action()).thenReturn(3); // Paper
        when(mockPlayerForm.compete(any(Form.class))).thenReturn(false); // Pierde contra Scissors

        Game game = new Game(mockPlayerForm);
        String result = game.play();

        assertEquals("Gana computadora", result);
    }*/
}
