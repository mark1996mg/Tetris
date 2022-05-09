package com.game.tetris.tetrominos;

public class Tetromino_O implements Tetromino {

    private int[][] shape = {
        {1, 1},
        {1, 1}
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
        return ShapeType.O;
    }

    @Override
    public Color getColor() {
        return Color.YELLOW;
    }
}
