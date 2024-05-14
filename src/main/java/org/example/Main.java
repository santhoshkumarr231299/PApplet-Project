package org.example;

import processing.core.PApplet;

public class Main extends PApplet {
    Ball ball1 = new Ball(50, 50, 10);
    Ball ball2 = new Ball(50, 200, 10);
    Ball ball3 = new Ball(50, 350, 10);

    public static void main(String[] args) {
        PApplet.main(Main.class, args);
    }

    @Override
    public void settings() {
        super.settings();
        size(640, 480);
    }

    @Override
    public void draw() {

        ellipse(ball1.getPositionX(), ball1.getPositionY(), ball1.getDiameter(), ball1.getDiameter());
        ellipse(ball2.getPositionX(), ball2.getPositionY(), ball2.getDiameter(), ball2.getDiameter());
        ellipse(ball3.getPositionX(), ball3.getPositionY(), ball3.getDiameter(), ball3.getDiameter());

        ball1.setPositionX(ball1.getPositionX() + 0.1F);
        ball2.setPositionX(ball2.getPositionX() + 0.4F);
        ball3.setPositionX(ball3.getPositionX() + 0.8F);
    }
}