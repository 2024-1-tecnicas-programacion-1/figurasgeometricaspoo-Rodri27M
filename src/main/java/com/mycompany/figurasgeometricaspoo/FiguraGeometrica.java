package com.mycompany.figurasgeometricaspoo;

public class FiguraGeometrica {
  private String nombre;
  private String color;
  
  public FiguraGeometrica(String nombre, String color){
      this.nombre=nombre;
      this.color=color;
  }
  public double obtenerArea(){
      // Complejodad constante O(1).
      return 0;
      
  }
  public double obtenerPerimetro(){
      // Complejodad constante O(1).
      return 0;
  }
  
  public String getNombre(){
      // Complejodad constante O(1).
      return nombre;
  }
  public String getColor(){
      
      return color;
  }  
}
