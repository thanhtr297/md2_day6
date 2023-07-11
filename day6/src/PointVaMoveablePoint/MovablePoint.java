package PointVaMoveablePoint;

public class MovablePoint extends Point{
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;
    public MovablePoint(){

    }
    public MovablePoint(float x, float y,float xSpeed,float ySpeed) {
        setX(x);
        setY(y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        return new float[]{this.xSpeed,this.ySpeed};
    }
    public String toString() {
        return "x: " + getX() + ", y: " + getY() + ", speed = " + getxSpeed() + "," + getySpeed();
    }
    public void  move() {

    }
}
