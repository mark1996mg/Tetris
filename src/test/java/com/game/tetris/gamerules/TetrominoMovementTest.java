package com.game.tetris.gamerules;

import com.game.tetris.tetrominos.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    void rotatesTetromino_J() {
        Tetromino tetromino = new Tetromino_J();
        int[][] expectedRotatedOnce = {{0, 1, 1}, {0, 1, 0}, {0, 1, 0}};
        int[][] expectedRotatedTwice = {{0, 0, 0}, {1, 1, 1}, {0, 0, 1}};
        int[][] expectedRotatedTrice = {{0, 1, 0}, {0, 1, 0}, {1, 1, 0}};
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

    @Test
    void rotatesTetromino_L() {
        Tetromino tetromino = new Tetromino_L();
        int[][] expectedRotatedOnce = {{0, 1, 0}, {0, 1, 0}, {0, 1, 1}};
        int[][] expectedRotatedTwice = {{0, 0, 0}, {1, 1, 1}, {1, 0, 0}};
        int[][] expectedRotatedTrice = {{1, 1, 0}, {0, 1, 0}, {0, 1, 0}};
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

    @Test
    void rotatesTetromino_OJ() {
        Tetromino tetromino = new Tetromino_O();
        int[][] expectedRotation = tetromino.getShape();

        int[][] actualRotatedShape = TetrominoMovement.rotate(tetromino);
        assertTrue(Arrays.deepEquals(expectedRotation, actualRotatedShape));

        actualRotatedShape = TetrominoMovement.rotate(tetromino);
        assertTrue(Arrays.deepEquals(expectedRotation, actualRotatedShape));

        actualRotatedShape = TetrominoMovement.rotate(tetromino);
        assertTrue(Arrays.deepEquals(expectedRotation, actualRotatedShape));

        actualRotatedShape = TetrominoMovement.rotate(tetromino);
        assertTrue(Arrays.deepEquals(expectedRotation, actualRotatedShape));
    }

    @Test
    void rotatesTetromino_S() {
        Tetromino tetromino = new Tetromino_S();
        int[][] expectedRotatedOnce = {{0, 1, 0}, {0, 1, 1}, {0, 0, 1}};
        int[][] expectedRotatedTwice = {{0, 0, 0}, {0, 1, 1}, {1, 1, 0}};
        int[][] expectedRotatedTrice = {{1, 0, 0}, {1, 1, 0}, {0, 1, 0}};
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

    @Test
    void rotatesTetromino_T() {
        Tetromino tetromino = new Tetromino_T();
        int[][] expectedRotatedOnce = {{0, 1, 0}, {0, 1, 1}, {0, 1, 0}};
        int[][] expectedRotatedTwice = {{0, 0, 0}, {1, 1, 1}, {0, 1, 0}};
        int[][] expectedRotatedTrice = {{0, 1, 0}, {1, 1, 0}, {0, 1, 0}};
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

    @Test
    void rotatesTetromino_Z() {
        Tetromino tetromino = new Tetromino_Z();
        int[][] expectedRotatedOnce = {{0, 0, 1}, {0, 1, 1}, {0, 1, 0}};
        int[][] expectedRotatedTwice = {{0, 0, 0}, {1, 1, 0}, {0, 1, 1}};
        int[][] expectedRotatedTrice = {{0, 1, 0}, {1, 1, 0}, {1, 0, 0}};
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