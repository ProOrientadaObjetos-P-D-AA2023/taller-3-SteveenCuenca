/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema031;

public class Entidad {

    private String nombreInstitucion;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int sedes;
    private int gastoProyectadoEstudiante;
    private int presupuesto;

    public String getNombreInstitucion() {
        return nombreInstitucion;
    }

    public void setNombreInstitucion(String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }

    public String getTipoInstitucion() {
        return tipoInstitucion;
    }

    public void setTipoInstitucion(String tipoInstitucion) {
        this.tipoInstitucion = tipoInstitucion;
    }

    public int getNumeroAlumnos() {
        return numeroAlumnos;
    }

    public void setNumeroAlumnos(int numeroAlumnos) {
        this.numeroAlumnos = numeroAlumnos;
    }

    public int getNumerodocentes() {
        return numeroDocentes;
    }

    public void setNumerodocentes(int numerodocentes) {
        this.numeroDocentes = numerodocentes;
    }

    public int getSedes() {
        return sedes;
    }

    public void setSedes(int sedes) {
        this.sedes = sedes;
    }

    public int getGastoProyectadoEstudiante() {
        return gastoProyectadoEstudiante;
    }

    public void setGastoProyectadoEstudiante(int gastoProyectadoEstudiante) {
        this.gastoProyectadoEstudiante = gastoProyectadoEstudiante;
    }

    public void calcularPresupuesto() {
        presupuesto = numeroAlumnos * gastoProyectadoEstudiante;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }
}
