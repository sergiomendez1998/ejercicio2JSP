/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */


public class Ecuacion {

    private double valorA;
    private double ValorB;
    private double valorC;
    private double potencia;
    private double raiz=0;
    
    private double valorX1;
    private double valorX2;

    public double getValorA() {
        return valorA;
    }

    public void setValorA(double valorA) {
        this.valorA = valorA;
    }

    public double getValorB() {
        return ValorB;
    }

    public void setValorB(double ValorB) {
        this.ValorB = ValorB;
    }

    public double getValorC() {
        return valorC;
    }

    public void setValorC(double valorC) {
        this.valorC = valorC;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getRaiz() {
        return raiz;
    }

    public void setRaiz(double raiz) {
        this.raiz = raiz;
    }

    public double getValorX1() {
        return valorX1;
    }

    public void setValorX1(double valorX1) {
        this.valorX1 = valorX1;
    }

    public double getValorX2() {
        return valorX2;
    }

    public void setValorX2(double valorX2) {
        this.valorX2 = valorX2;
    }
}
