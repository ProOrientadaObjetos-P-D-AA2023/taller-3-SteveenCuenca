/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Problema03;

import problema031.Entidad;

public class Ejecutor {

    public static void main(String[] args) {
        Entidad e = new Entidad();
        String nombreInstitucion = "Beatriz cueva de ayora";
        String tipoInstitucion = "Publica";
        int numeroAlumnos = 2625;
        int numeroDocentes = 95;
        int sedes = 1;
        int gastoProyectadoEstudiante = 25;
        
        e.setNombreInstitucion(nombreInstitucion);
        e.setTipoInstitucion(tipoInstitucion);
        e.setNumeroAlumnos(numeroAlumnos);
        e.setNumerodocentes(numeroDocentes);
        e.setSedes(sedes);
        e.setGastoProyectadoEstudiante(gastoProyectadoEstudiante);
        e.calcularPresupuesto();
        
        System.out.println("El nombre de la institucion es: " + e.getNombreInstitucion());
        System.out.println("El tipo de la institucion es: " + e.getTipoInstitucion());
        System.out.println("El numero de alumnos es: " + e.getNumeroAlumnos());
        System.out.println("El numero de docentes es: " + e.getNumerodocentes());
        System.out.println("El numero de sedes que posee es: " + e.getSedes());
        System.out.println("Los gastos proyevtados por estudiante son: " + e.getGastoProyectadoEstudiante());
        System.out.println("El presupuesto es de: " + e.obtenerPresupuesto());
    }
}

