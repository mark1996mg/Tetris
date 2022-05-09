package com.game.tetris.tetrominos;

public class Tetromino_S implements Tetromino {

    private int[][] shape = {
        {0, 1, 1},
        {1, 1, 0},
        {0, 0, 0},
    };

    @Override
    public int[][] getShape() {
        return shape;
    }

    @Override
    public void setShape(int[][] shape) {
        this.shape = shape;
    }

    @Override
    public ShapeType getShapeType() {
        return ShapeType.S;
    }

    @Override
    public Color getColor() {
        return Color.GREEN;
    }
}
