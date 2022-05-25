/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcugit;

/**
 *
 * @author Mane
 */
public class Calcu {
    private double numero1;
    private double numero2;
// clase con constructor pasando dos numeros reales, setters , getters y métodos para devolver el resultado de sumar, restar , multiplicar y dividir

    public Calcu(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Calcu() {
    }



  
    
      // sets and gets

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    //métodos

    public double suma() {
        double suma=numero1+numero2;
        return suma;
    }
 

    public double resta() {
        double resta=numero1-numero2;
        return resta;
    }

    public double multiplicacion(){
        double multiplicacion=numero1*numero2;
        return multiplicacion;
    }
    public double division() {
        double division=numero1/numero2;
        return division;
    }
 
}
