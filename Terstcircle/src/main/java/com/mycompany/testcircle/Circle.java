/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testcircle;

/**
 *
 * @author lab_services_student
 */
public class Circle {
    double radius = 0;
    double diameter = 0;
    double area = 0;
    
    public Circle()
    {
        radius = 1;
        diameter = radius*2;
        area = (radius*radius) * Math.PI;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double r)
    {
        radius = r;
        diameter = radius*2;
        area = (radius*radius) * Math.PI;
    }
    public String toString()
    {
        return "\nRadius: " + radius + "\nDiameter: " + diameter + "\nArea: " + area;
    }
}
