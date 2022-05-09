package com.game.tetris.gamerules;

import com.game.tetris.tetrominos.Tetromino;

public class TetrominoMovement {

    private static final String NOT_FOUND_ERROR = "Given tetromino cannot be null";

    // Rotates given tetromino shape clockwise
    public static int[][] rotate(Tetromino tetromino) {
        if (tetromino == null) {
            throw new RuntimeException(NOT_FOUND_ERROR);
        }

        int[][] shape = tetromino.getShape();
        int[][] rotatedShape = new int[shape.length][shape[0].length];
        for (int i = 0; i < shape.length; i++) {
            for (int j = 0; j < shape[i].length; j++) {
                int swapRow = shape.length - 1 - j;
                rotatedShape[i][j] = shape[swapRow][i];
            }
        }
        tetromino.setShape(rotatedShape);
        return rotatedShape;
    }
}
