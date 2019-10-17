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
public class Area extends Perimetro{
    /*  Metodos que calculan el area de un circulo*/
    
    double aCirculo(){
        
        return Math.PI*Math.pow(this.getRadio(), 2);
    }//aCirculo()
    
    double aCirculo(double radio){
 
        this.setRadio(radio);
        
        return Math.PI*this.getRadio()*this.getRadio();
    }//aCirculo(radio)
    
    double aCirculo2(double radio){        
        
        return Math.PI*radio*radio;
    }//aCirculo2(radio)
    
    /*  Metodos que calculan el area de un cuadrado*/
    
    double aCuadrado(){
                
        return Math.pow(this.getTam(), 2);        
    }//aCuadrado()
    
    double aCuadrado(double tam){
        this.setTam(tam);
        
        return this.getTam()*this.getTam();
    }//aCuadrado(tam)
    
    
    /* metodo de area del rectangulo */
    
    double aRectangulo(){
        return this.getAnchoRec()*this.getLargoRec();
    }
    
    double aRectangulo(double largoRec, double anchoRec){
        this.setAnchoRec(anchoRec);
        this.setLargoRec(largoRec);
        
        return this.getAnchoRec()*this.getLargoRec();                
    }// rectangulo
    
    /*metodo de area del triangulo escaleno*/
    
    double aTriangulo(){
        return this.getLado()*this.getAlto()/2;
    }
    
     double aTriangulo(double lado, float alto){
         this.setLado(lado);
        return this.getLado()*this.getAlto()/2;
     }
}//class
