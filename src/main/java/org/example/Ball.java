package org.example;

public class Ball {
    Ball(float positionX, float positionY, float diameter) {
        this.diameter = diameter;
        this.positionX = positionX;
        this.positionY = positionY;
    }
    private float diameter;
    private float positionX;
    private float positionY;

    public float getDiameter() {
        return diameter;
    }
    public float getPositionX() {
        return positionX;
    }
    public float getPositionY() {
        return positionY;
    }
    public void setPositionX(float positionX) {
        this.positionX = positionX;
    }
    public void setPositionY(float positionY) {
        this.positionY = positionY;
    }
}
