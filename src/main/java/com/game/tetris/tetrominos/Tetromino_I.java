package com.game.tetris.tetrominos;

public class Tetromino_I implements Tetromino {

    private int[][] shape = {
        {0, 0, 0, 0},
        {1, 1, 1, 1},
        {0, 0, 0, 0},
        {0, 0, 0, 0}
    };

    @Override
    public int[][] getShape() {
        return shape;
    }

    public void setShape(int[][] shape) {
        this.shape = shape;
    }

    @Override
    public ShapeType getShapeType() {
        return ShapeType.I;
    }

    @Override
    public Color getColor() {
        return Color.CYAN;
    }
}
