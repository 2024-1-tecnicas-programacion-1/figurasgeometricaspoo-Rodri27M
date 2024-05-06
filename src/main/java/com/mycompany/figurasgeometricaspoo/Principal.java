
package com.mycompany.figurasgeometricaspoo;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.println("Ingrese el nombre de la figura");
            String nombre = sc.next();
          System.out.println("Ingrese el color de la figura");
            String color = sc.next();
          System.out.println("Ingrese el tipo de figura");
            System.out.println("1: Circulo");
            System.out.println("2: Rectangulo");
            System.out.println("3: Triangulo");
          int tipoFigura = sc.nextInt();
           
          switch (tipoFigura) {
            case 1:
               System.out.println("Ingrese el radio del circulo");
                 double radio = sc.nextDouble();
               Circulo circulo = new Circulo(nombre, color, radio);
                System.out.println("Area del circulo: " + circulo.obtenerArea()); 
                System.out.println("Perimetro del circulo: " + circulo.obtenerPerimetro());
                  break;
            case 2:
                System.out.println("Ingrese el valor del lado 1");
                double lado1 = sc.nextInt();
                System.out.println("Ingrese el valor del lado 2");
                double lado2 = sc.nextInt();
                Rectangulo rectangulo = new Rectangulo(nombre, color, lado1, lado2);
                System.out.println("Area del rectangulo: " + rectangulo.obtenerArea());
                System.out.println("Perimetro del rectagulo: " + rectangulo.obtenerPerimetro());
                break;
            case 3:
                System.out.println("Ingrese el valor de la base del triangulo");
                    double base = sc.nextDouble();
                System.out.println("Ingrese el valor de la altura del triangulo");
                    double altura = sc.nextDouble();
                Triangulo triangulo = new Triangulo(nombre, color, base, altura);
                System.out.println("Area del triangulo: " + triangulo.obtenerArea());
                System.out.println("Perimetro del triangulo: " + triangulo.obtenerPerimetro());
                break;
            default:
                throw new AssertionError();
        }
    }
}
