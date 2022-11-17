package TriangleLab;

public class Point {

    private double x;
    private double y;

    @Override
    public String toString() {
        String s = "(" + this.x + ", " + this.y + ")";
        return s;
    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getX(){
        return x;
    }

    public void setY(double y){
        this.y = y;
    }

    public double getY(){
        return y;
    }
}
