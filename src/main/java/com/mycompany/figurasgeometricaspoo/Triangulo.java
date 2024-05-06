package com.mycompany.figurasgeometricaspoo;

public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;
    
public Triangulo (String nombre, String color, double base, double altura){
 super(nombre, color);
   this.base = base;
   this.altura = altura;  
  
}
 public double obtenerArea(){
     // Complejodad constante O(1).
     return (base*altura)/2;
 }
 public double obtenerPerimetro(){
     // Complejodad constante O(1).
     double hipotenusa = Math.sqrt(base*base+altura*altura);
     return base+2*hipotenusa;
     
 }
}
