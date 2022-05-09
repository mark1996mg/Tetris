package com.game.tetris.gamerules;

import com.game.tetris.tetrominos.Tetromino;
import com.game.tetris.tetrominos.Tetromino_I;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TetrominoMovementTest {

    @Test
    void throwsErrorWhenTetrominoIsNull() {
        assertThrows(RuntimeException.class, () -> TetrominoMovement.rotate(null));
    }

    @Test
    void rotatesTetromino_I() {
        Tetromino tetromino = new Tetromino_I();
        int[][] expectedRotatedOnce = {{0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 1, 0}};
        int[][] expectedRotatedTwice = {{0, 0, 0, 0}, {0, 0, 0, 0}, {1, 1, 1, 1}, {0, 0, 0, 0}};
        int[][] expectedRotatedTrice = {{0, 1, 0, 0}, {0, 1, 0, 0}, {0, 1, 0, 0}, {0, 1, 0, 0}};
        int[][] expectedRotatedInitial = tetromino.getShape();

        // First rotation
        int[][] actualRotatedShape = TetrominoMovement.rotate(tetromino);
        assertTrue(Arrays.deepEquals(expectedRotatedOnce, actualRotatedShape));

        // Second rotation
        actualRotatedShape = TetrominoMovement.rotate(tetromino);
        assertTrue(Arrays.deepEquals(expectedRotatedTwice, actualRotatedShape));

        // Third rotation
        actualRotatedShape = TetrominoMovement.rotate(tetromino);
        assertTrue(Arrays.deepEquals(expectedRotatedTrice, actualRotatedShape));

        // Rotated back to initial position
        actualRotatedShape = TetrominoMovement.rotate(tetromino);
        assertTrue(Arrays.deepEquals(expectedRotatedInitial, actualRotatedShape));
    }

}