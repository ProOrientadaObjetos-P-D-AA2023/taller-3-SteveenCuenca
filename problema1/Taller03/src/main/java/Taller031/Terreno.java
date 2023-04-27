/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller031;

public class Terreno {

    private double costoTerreno;
    private int ancho;
    private int largo;
    private int area;
    private int valorMetroCuadrado;

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getValorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    public void setValorMetroCuadrado(int valorMetroCuadrado) {
        this.valorMetroCuadrado = valorMetroCuadrado;
    }
    public void calcularArea(){
        area = largo * ancho;
    }
    public double obtenerVAlorArea(){
        return area;
    }
     public void calcularValor(){
        costoTerreno = area * valorMetroCuadrado;
    }
    public double obtenerVAlorTerreno(){
        return costoTerreno;
    }
    
}
