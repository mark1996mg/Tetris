package com.game.tetris.tetrominos;

public interface Tetromino {

    int[][] getShape();
    void setShape(int[][] shape);
    ShapeType getShapeType();
    Color getColor();

}
