package com.company;

public class TestMovable {
    public static void test(){
        MovableRectangle movableRectangle = new MovableRectangle(0, 2, 2, 0, 1, 5);
        MovableCircle movableCircle = new MovableCircle(0, 0,1, 5, 1);
        System.out.println(movableRectangle);
        System.out.println(movableCircle);
        System.out.println();
        movableCircle.moveUp();
        movableRectangle.moveRight();
        System.out.println(movableRectangle);
        System.out.println(movableCircle);
    }
}
