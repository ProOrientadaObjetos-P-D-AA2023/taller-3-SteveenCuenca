/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Taller03;
import Taller031.Terreno;
public class Ejecutor {

    public static void main(String[] args) {
        Terreno v = new Terreno();
        double costoTerreno;
        int ancho = 15;
        int largo = 20;
        int area;
        int valorMetroCuadrado = 16;
        v.setAncho(ancho);
        v.setLargo(largo);
        v.setValorMetroCuadrado(valorMetroCuadrado);
        v.calcularArea();
        v.calcularValor();
        
        System.out.println("EL ancho del terreno es de:"+v.getAncho());
        System.out.println("El largo del terreno es de: "+v.getLargo());
        System.out.println("El costo por metro cuadrado es de: "+v.getValorMetroCuadrado());
        System.out.println("El area del terreno es de:"+v.obtenerVAlorArea());
        System.out.println("El valor total del terreno es de: "+v.obtenerVAlorTerreno());
    }
}
