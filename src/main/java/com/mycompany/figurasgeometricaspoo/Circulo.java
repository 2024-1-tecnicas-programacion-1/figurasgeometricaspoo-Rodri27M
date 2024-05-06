package com.mycompany.figurasgeometricaspoo;

public class Circulo extends FiguraGeometrica {
private double radio;
public Circulo (String nombre, String color, double radio){
 super(nombre, color);
  this.radio = radio;
 }

 public double obtenerArea(){
      // Complejodad constante O(1).
      return Math.PI*radio*radio;

 }
 public double obtenerPerimetro(){
     // Complejodad constante O(1).
   return 2*Math.PI*radio;
 }
}


