package bai2;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public Ball(float x, float y, int radius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    public void move() {
        if (x > 96) {
            reflectHorizontal();
        }
        if (y > 50) {
            reflectVertical();
        } else if (y < 0) {
            reflectVertical();
        }
        x += xDelta;
        y += yDelta;
    }

    public void reflectHorizontal () {
        xDelta = -xDelta;
    }

    public void reflectVertical() {
        yDelta = -yDelta;
    }

    public String toString() {
        return "Ball[(" + x + "," + y +", speed=(" + xDelta + "," + yDelta + ")]";
    }
}
