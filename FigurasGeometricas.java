/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 *
 * @author ahtzi
 */
public class FigurasGeometricas {
private static final int l = 4;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perimetro p1 = new Perimetro();  //crea un objeto con el constructor sin parametros    
        Perimetro p2 = new Perimetro(10.0); //crea un objeto con el constructor con un parametro
        Perimetro p3 = new Perimetro(l,10.0);//crea un objeto con el constructor con dos parametros
        
        Area a1 = new Area ();
        
        Volumen v1 = new Volumen ();
         
        

        
        /*Usa el objeto del constructor sin parametros,
          modifica el tamaño del radio a traves del metodo set,
          accede al tamaño del radio a traves del metodo get,
          usa el metodo circulo sin parametros de la clase Perimetro*/
        p1.setRadio(1.0);
        System.out.println("El perimetro del circulo es: "+p1.circulo()+" con radio "+p1.getRadio());
        
        /*Usa el objeto del constructor con un parametro,
          el parametro modifica el atributo en la clase Perimetro,
          muestra el contenido del atributo modificado a traves del metodo get,
          usa el metodo circulo sin parametros de la clase Perimetro*/
        System.out.println("El perimetro del circulo es: "+p2.circulo()+" con radio "+p2.getRadio());
        
        /*Usa el objeto con el constructor sin parametros,
          usa el metodo circulo con un parametro de la clase Perimetro,
          es decir, no usa los metodos get y set de la clase Perimetro*/
        System.out.println("El perimetro del circulo es: "+p1.circulo(100.0)+" con radio 100.0\n\n");
        
        p1.setNlados(l);
        p1.setTam(1.0);
        System.out.println("Numero de lados: "+p1.getNlados());
        System.out.println("Tamaño de los lados: "+p1.getTam());
        System.out.println("El perimetro del cuadrado es: "+p1.cuadrado()+"\n");
        
        System.out.println("Numero de lados: "+p3.getNlados());
        System.out.println("Tamaño de los lados: "+p3.getTam());
        System.out.println("El perimetro del cuadrado es: "+p3.cuadrado());
        
        System.out.println("El perimetro del cuadrado es: "+p1.cuadrado(l, 100.0)+"\n\n");
        
        a1.setRadio(1.0);
        System.out.println("El area del circulo es: "+a1.aCirculo());
        System.out.println("El area del circulo es: "+a1.aCirculo(10.0));
        System.out.println("El area del circulo es: "+a1.aCirculo2(100));
        
        a1.setTam(4.0);       
        System.out.println("El area del cuadrado es: "+a1.aCuadrado());
        System.out.println("El area del cuadrado es: "+a1.aCuadrado(5)+"\n\n");
        
        v1.setRadio(1.0);
        System.out.println("El volumen de la esfera es: "+v1.vEsfera());
        System.out.println("El volumen de la esfera es: "+v1.vEsfera(10.0));
        
        v1.setTam(6.0);       
        System.out.println("El volumen del cubo es: "+v1.vCubo());
        System.out.println("El volumen del cubo es: "+v1.vCubo(7)+"\n\n");
          
        /*RECTANGULO*/
        
             System.out.println("                          RECTANGULO                     ");
             Perimetro RP1 = new Perimetro();
        Perimetro RP2 = new Perimetro(2,4.0);
        
        
        RP1.setLargoRec(4.0);
        RP1.setAnchoRec(2.0);
         System.out.println("Perimetro del Rectangulo es: "+RP1.Rectangulo());
         System.out.println("Perimetro del Rectangulo es: "+RP2.Rectangulo());
         System.out.println("Perimetro del Rectangulo es: "+RP1.Rectangulo(2.0,4.0)+"\n\n");
        a1.setAnchoRec(2.0);
        a1.setLargoRec(4.0);
        System.out.println("El area del rectangulo es: "+a1.aRectangulo());
        System.out.print("El area del rectangulo es: "+a1.aRectangulo(2.0, 4.0)+"\n\n");///
        
        
              

        /*TRIANGULO*/
        System.out.println("                          TRIANGULO                     ");
        Perimetro TP1 = new Perimetro();
        Perimetro TP2 = new Perimetro(6.0,l);
         TP1.setLado(6.0);
        
        System.out.println("Perimetro del Triangulo es: "+TP1.triangulo());  
        System.out.println("Perimetro del Triangulo es: "+TP2.triangulo()+"\n\n");
        System.out.println("Perimetro del Triangulo es: "+TP1.triangulo(6));  
         a1.setLado(6.0);
         a1.setAlto(4);
        System.out.println("Area del Triangulo es: "+a1.aTriangulo());
       System.out.println("Area del Triangulo es: "+a1.aTriangulo(4,6)+"\n\n");
        /* PARALELOPIPEDO*/
                     System.out.println("                          PARALELEPIDO                     ");

        System.out.println("Volumen del Paralelepípedo es: "+v1.vRectangulo());
        System.out.println("Volumen del Paralelepípedo es: "+v1.vRectangulo(l)+"\n\n");
         /*CILINDRO*/       
                      System.out.println("                          CILINDRO                     ");

        System.out.println("Volumen del Cilindro es: "+ v1.vCilindro());
        System.out.println("Volumen del Cilindro es: "+ v1.vCilindro());
        
       
    }//main
    
}//class

    
