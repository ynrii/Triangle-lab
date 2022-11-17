package TriangleLab;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Triangle> triangles = new ArrayList<>();
        int equilateral=0;
        int isosceles=0;
        int rectangular=0;
        int versatile=0;

        Point a = new Point(4, 2);
        Point b = new Point(15, 12);
        Point c = new Point(8, 3);
        Triangle Triangle1 = new Triangle(a, b, c);

        Point a1 = new Point(15, 16);
        Point b1 = new Point(11, 9);
        Point c1 = new Point(2, 8);
        Triangle Triangle2 = new Triangle(a1, b1, c1);

        Point a2 = new Point(10, 4);
        Point b2 = new Point(12, 6);
        Point c2 = new Point(1, 8);
        Triangle Triangle3 = new Triangle(a2, b2, c2);

        triangles.add(0,Triangle1);
        triangles.add(1,Triangle2);
        triangles.add(2,Triangle3);

        //findmax
        double Square = 0;
        Triangle sTriangle = null;
          for (Triangle triangle : triangles) {
            if(triangle.CalculateSquare() > Square) {
               Square = triangle.CalculateSquare();
               sTriangle = triangle;
            }
        }

        //findmin
        double Square1 = 10000000;
        Triangle sTriangle1 = null;
          for (Triangle triangle : triangles) {
            if(triangle.CalculateSquare() < Square1) {
              Square1 = triangle.CalculateSquare();
              sTriangle1 = triangle;
            }
        }

        for(Triangle thisTriangle : triangles)
        {
            String typeOfTriangle = thisTriangle.gettypeOfTriangle();
            if(typeOfTriangle.contains("equilateral")) equilateral++;
            if(typeOfTriangle.contains("isosceles")) isosceles++;
            if(typeOfTriangle.contains("rectangular")) rectangular++;
            if(typeOfTriangle.contains("versatile")) versatile++;
        }

        System.out.println("equilaterals: " + equilateral);
        System.out.println("isosceles: " + isosceles);
        System.out.println("rectangular: " + rectangular);
        System.out.println("versatile: " + versatile);
        System.out.println("The largest in square -" + sTriangle);
        System.out.println("The smallest in square - " + sTriangle1);
    }
}
