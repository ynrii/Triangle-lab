package TriangleLab;

import TriangleLab.Point;
import java.util.ArrayList;
public class Triangle {
    private Point a, b, c;
    private double perimeter, square;
    private double sideAB, sideBC, sideAC; //Triangle
    private String typeOfTriangle;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.typeOfTriangle = typeOfTriangles();
    }

    public double getDist(Point first, Point second) {
        double firstSide = Math.abs(first.getX() - second.getX());
        double secondSide = Math.abs(first.getY() - second.getY());
        double hypo = Math.sqrt(firstSide * firstSide + secondSide * secondSide);
        return hypo;
    }

    public void GetSide() {
        sideAB = getDist(a, b);
        sideBC = getDist(b, c);
        sideAC = getDist(a, c);
    }

    public double CalculatePerimeter() {
        perimeter = sideAB + sideBC + sideAC;
        return perimeter;
    }

    public double CalculateSquare() {
        double per = CalculatePerimeter() / 2;
        square = Math.sqrt(per * (per - sideAB) * (per - sideBC) * (per - sideAC));
        return square;
    }

    public double GetPerimeter() {
        return perimeter;
    }

    public double GetSquare() {
        return square;
    }

    public String gettypeOfTriangle() {
        return typeOfTriangle;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a" + a +
                ", b" + b +
                ", c" + c +
                '}';
    }

    private String typeOfTriangles() {
        sideAB = Math.round(getDist(this.a, this.b));
        sideAC = Math.round(getDist(this.a, this.c));
        sideBC = Math.round(getDist(this.b, this.c));
        StringBuilder typeOfTriangle = new StringBuilder(" ");
        if (sideAB == sideBC && sideBC == sideAC && sideAC == sideAB) {
            typeOfTriangle.append("equilateral");
        }
        if ((sideAB == sideAC && sideAB != sideBC) || (sideAB == sideBC && sideAB != sideAC)) {
            typeOfTriangle.append("isosceles");
        }
        if (sideAB == Math.sqrt(Math.pow(sideBC, 2) + Math.pow(sideAC, 2)) || sideBC == Math.sqrt(Math.pow(sideAB, 2) + Math.pow(sideAC, 2)) || sideAC == Math.sqrt(Math.pow(sideAB, 2) + Math.pow(sideBC, 2))) {
            typeOfTriangle.append("rectangular");
        } else {
            typeOfTriangle.append("versatile");
        }
        return typeOfTriangle.toString();
    }
}

