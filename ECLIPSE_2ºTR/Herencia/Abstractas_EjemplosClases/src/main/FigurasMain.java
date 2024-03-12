<<<<<<< HEAD
package main;

import figuras.Poligono;
import figuras.Rectangulo;
import figuras.Triangulo;

public class FigurasMain {
 public static void main(String args[]){
	 
	 Triangulo t = new Triangulo(3.25, 4.55, 2.71);
     System.out.printf("Area del triangulo: %.2f %n", t.area());
     
     Rectangulo r = new Rectangulo(5.70,2.29);
     System.out.printf("Area del rectangulo: %.2f %n", r.area()); 
     
     //upcasting
     Poligono p;   
     p = t;
     p.area(); // Imprime el area de un triangulo porque esta sobrescrito
     
     Poligono po = new Triangulo(3.25, 4.55, 2.71);  
     
     //downcasting
     Triangulo tri;
     tri = (Triangulo) po; 
     
     System.out.printf("Area del poligono: %.2f %n", tri.area()); 
     System.out.printf("Area del poligono: %.2f %n", p.area()); 
 }
}
=======
package main;

import figuras.Poligono;
import figuras.Rectangulo;
import figuras.Triangulo;

public class FigurasMain {
 public static void main(String args[]){
	 
	 Triangulo t = new Triangulo(3.25, 4.55, 2.71);
     System.out.printf("Area del triangulo: %.2f %n", t.area());
     
     Rectangulo r = new Rectangulo(5.70,2.29);
     System.out.printf("Area del rectangulo: %.2f %n", r.area()); 
     
     //upcasting
     Poligono p;   
     p = t;
     p.area(); // Imprime el area de un triangulo porque esta sobrescrito
     
     Poligono po = new Triangulo(3.25, 4.55, 2.71);  
     
     //downcasting
     Triangulo tri;
     tri = (Triangulo) po; 
     
     System.out.printf("Area del poligono: %.2f %n", tri.area()); 
     System.out.printf("Area del poligono: %.2f %n", p.area()); 
 }
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
