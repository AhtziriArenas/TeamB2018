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
public class Perimetro {
    private int nlados;
    private double tam;
    private double radio;
   
    private double anchoRec;
    private double largoRec;
    
    private double lado;
    private float alto;
    private double h;

    public double getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }
   
    

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
   
    

    /* ----- Constructores ----- */
    
    //Constructor sin parametros
    public Perimetro() {
    }
    
    //Constructor con un parametro entero
    public Perimetro(int nlados) {
        this.nlados = nlados;
    }

    //Constructor con un parametro double
    public Perimetro(double radio) {
        this.radio = radio;
    }
    
    //Constructor con dos parametros, uno entero y uno double
    public Perimetro(int nlados, double tam) {
        this.nlados = nlados;
        this.tam = tam;
    }
    
    
    //////////////////////////////////////////////////////
    public Perimetro(double anchoRec, double largoRec){
        this.anchoRec = anchoRec;
        this.largoRec = largoRec;
    }
    public Perimetro(float alto, double lado){
      this.lado = lado;
      this.alto = alto;
    }
   
  
    
    /* ----- Metodos get ----- */
    
    public int getNlados() {
        return nlados;
    }

    public double getTam() {
        return tam;
    }
    
    public double getRadio() {
        return radio;
    }
  
    
    ///////
    public double getAnchoRec() {
        return anchoRec;
    }

    public double getLargoRec() {
        return largoRec;
    }

    public double getLado() {
        return lado;
    }


              
    
    /* ----- Metodos set ----- */
    
    public void setNlados(int nlados) {
        this.nlados = nlados;
    }

    public void setTam(double tam) {
        this.tam = tam;
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    ///////////////

    public void setAnchoRec(double ancho) {
        this.anchoRec = anchoRec;
    }

    public void setLargoRec(double largo) {
        this.largoRec = largoRec;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    
  

    /* ----- Métodos que hacen los calculos del perimetro ----- */
    /*  Circulo  */
    double circulo() {
        return Math.PI*radio*2;
    } //circulo 
    
    double circulo(double radio){
        return Math.PI*radio*2;
    }//circulo
    
    /*  Cuadrado  */
    double cuadrado(){
        return nlados*tam;
    }//cuadrado
    
    double cuadrado(int nlados, double tam){
        return nlados*tam;
    }// 
 /*----- perimero del rectangulo----*/
    double Rectangulo(){
        return 2*anchoRec+2*largoRec;
    }
     double Rectangulo(double anchoRec, double largoRec){
        return 2*anchoRec+2*largoRec;
     }//triangulo
     
 /*perimetro del triangulo*/
     double triangulo(){
         return lado*3;
     
     }
    double triangulo(double lado){
         return lado*3;
     
     }
}//Perimetro
