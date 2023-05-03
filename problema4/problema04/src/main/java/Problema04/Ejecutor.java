/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Problema04;

import problema041.EquiposCelulares;

public class Ejecutor {

    public static void main(String[] args) {
        EquiposCelulares cel = new EquiposCelulares();
        
        String sistemaOperativo = "MIUI 14";
        String tamañoPantalla = "6.67'' pulgadas";
        double costoInicial = 369.65;
        double iva = .12;
        String direccionMac = "00:b6:10:c4:28";
        int direccionIMEI = 1592367218;
        
        cel.setSistemaOperativo(sistemaOperativo);
        cel.setTamañoPantalla(tamañoPantalla);
        cel.setCostoInicial(costoInicial);
        cel.setDireccionMac(direccionMac);
        cel.setDireccionIMEI(direccionIMEI);
        cel.setIva(iva);
        cel.calcularCostoFinal();
        
        System.out.println("Sistema operativo de: " + cel.getSistemaOperativo());
        System.out.println("Tamaño de la pantalla: " + cel.getTamañoPantalla());
        System.out.println("El costo inicial del equipo es de: $" + cel.getCostoInicial());
        System.out.println("Direccion Mac: " + cel.getDireccionMac());
        System.out.println("IMEI: " + cel.getDireccionIMEI());
        System.out.println("IVA: %" + cel.getIva());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Costo final del equipo: " + cel.obtenerCostoFinal());
    }
}
