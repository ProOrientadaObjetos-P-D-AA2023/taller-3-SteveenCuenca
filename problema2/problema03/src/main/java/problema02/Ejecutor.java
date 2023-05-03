/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package problema02;

import java.util.Scanner;
import problema021.EquivalenteHora;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horas;
        EquivalenteHora e = new EquivalenteHora();
        System.out.println("Ingrese el numero de horas");
        horas = entrada.nextInt();
        e.setHoras(horas);
        e.calcularMinuto();
        e.calcularSegundo();
        e.calcularDia();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        System.out.println("Las horas son: " + e.getHoras());
        System.out.println("Lo equivalente en Minutos es: " + e.obtenerMinuto());
        System.out.println("Lo equivatente en Segundos es: " + e.obtenerSegundo());
        System.out.println("Lo equivalente en Dias es: " + e.obtenerDia());
    }
}
