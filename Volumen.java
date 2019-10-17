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
public class Volumen extends Area{
   
    double frac = (double)4/3;
        
    /*  Metodos que calculan el volumen de la esfera*/    
    
    double vEsfera(){                      
        
        return frac*(this.aCirculo()*this.getRadio());
    }
    
    double vEsfera(double radio){
        
        return frac*(this.aCirculo(radio)*this.getRadio());
    }
    
    /*  Metodos que calculan el volumen del cubo*/
    
    double vCubo(){
        return this.aCuadrado()*this.getTam();
    }//vCubo
    
    double vCubo(double tam){
        return this.aCuadrado(tam)*this.getTam();
    }//vCubo con parametro
    
    
     /*Metodo de volumen del paralelopideo*/
    double vRectangulo(){
   return this.aRectangulo()*this.getAnchoRec();
    }
    double vRectangulo(double anchoRec){
        return this.aRectangulo()*this.getAnchoRec();
    }
     /*metodo del volumen del cilindro*/
   
    double vCilindro(){
        return this.aCirculo()*this.getH();
    }
       double vCilindro(double h){
        return this.aCirculo(h)*this.getH();
    }        
}//class

