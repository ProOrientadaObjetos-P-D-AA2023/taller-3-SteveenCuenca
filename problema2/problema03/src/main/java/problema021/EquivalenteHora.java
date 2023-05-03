/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema021;

public class EquivalenteHora {

    private int horas;
    private int minutos;
    private int segundos;
    private double dias;

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void calcularMinuto() {
        minutos = horas * 60;
    }

    public int obtenerMinuto() {
        return minutos;
    }

    public void calcularSegundo() {
        segundos = horas * 3600;
    }

    public int obtenerSegundo() {
        return segundos;
    }

    public void calcularDia() {
        dias = horas * 0.0417;
    }

    public double obtenerDia() {
        return dias;
    }
}
