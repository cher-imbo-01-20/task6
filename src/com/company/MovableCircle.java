package com.company;

public class MovableCircle extends Circle implements Movable {
    private int x;
    private int y;

    public MovableCircle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public MovableCircle(String color, boolean filled, double radius, int x, int y) {
        super(color, filled, radius);
        this.x = x;
        this.y = y;
    }

    public MovableCircle(double radius, int x, int y) {
        super(radius);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        this.setX(getX()+x);
        this.setY(getY()+y);
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
