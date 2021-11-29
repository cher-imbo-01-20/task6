package com.company;

public class MovableRectangle extends Rectangle implements Movable{
    private int x_left;
    private int y_left;
    private int x_right;
    private int y_right;

    public int getX_left() {
        return x_left;
    }

    public void setX_left(int x_left) {
        if (x_right>x_left) {
            this.x_left = x_left;
        }
        else System.out.println("\n"+"error: wrong value of coordinate");
    }

    public int getY_left() {
        return y_left;
    }

    public void setY_left(int y_left) {
        if (y_right>y_left) {
            this.y_left = y_left;
        }
        else System.out.println("\n"+"error: wrong value of coordinate");
    }

    public int getX_right() {
        return x_right;
    }

    public void setX_right(int x_right) {
        if (x_right>x_left) {
            this.x_right = x_right;
        }
        else System.out.println("\n"+"error: wrong value of coordinate");
    }

    public int getY_right() {
        return y_right;
    }

    public void setY_right(int y_right) {
        if (y_right>y_left) {
            this.y_right = y_right;
        }
        else System.out.println("\n"+"error: wrong value of coordinate");
    }

    public MovableRectangle(int x_left, int y_left, int x_right, int y_right) {
        if ((y_right>y_left)&&(x_right>x_left)) {
            this.x_left = x_left;
            this.y_left = y_left;
            this.x_right = x_right;
            this.y_right = y_right;
        }
        else System.out.println("\n"+"error: wrong value of coordinates");
    }

    public MovableRectangle(double width, double length, int x_left, int y_left, int x_right, int y_right) {
        super(width, length);
        if (((x_right-x_left) == length)&&((y_right+y_left)==width)&&(y_right>y_left)&&(x_right>x_left)) {
            this.x_left = x_left;
            this.y_left = y_left;
            this.x_right = x_right;
            this.y_right = y_right;
        }
        else System.out.println("\n"+"error: wrong value of coordinates");
    }

    public MovableRectangle(String color, boolean filled, double width, double length, int x_left, int y_left, int x_right, int y_right) {
        super(color, filled, width, length);
        if (((x_right-x_left) == length)&&((y_right+y_left)==width)&&(y_right>y_left)&&(x_right>x_left)) {
            this.x_left = x_left;
            this.y_left = y_left;
            this.x_right = x_right;
            this.y_right = y_right;
        }
        else System.out.println("\n"+"error: wrong value of coordinates");
    }

    public boolean speed(int x, int y) {
        if ((x!=0)||(y!=0)) return true;
        else return false;
    }

    public void move(int x, int y) {
        if (speed(x, y)) {
            this.setX_left(getX_left()+x);
            this.setX_right(getX_right()+x);
            this.setY_left(getY_left()+y);
            this.setY_right(getY_right()+y);
        }
        else System.out.println("\n" + "error: object doesn't move");
    }
}
