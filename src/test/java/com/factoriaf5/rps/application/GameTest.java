package com.factoriaf5.rps.application;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.jupiter.api.BeforeEach;
import com.factoriaf5.rps.models.Form;

public class GameTest {

    @Mock
    private Form mockPlayerForm;

    private Game game;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this); // Inicializa los mocks
        game = new Game(mockPlayerForm);
    }

    @Test
    public void play() {
        
        

    }
}
