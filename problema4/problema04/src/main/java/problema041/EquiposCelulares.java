/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema041;

/**
 *
 * @author Usuario
 */
public class EquiposCelulares {

    private String sistemaOperativo;
    private String tamañoPantalla;
    private double costoInicial;
    private double iva;
    private String direccionMac;
    private int direccionIMEI;
    private double valorIVA;
    private double valorFinal;

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(String tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    public double getCostoInicial() {
        return costoInicial;
    }

    public void setCostoInicial(double costoInicial) {
        this.costoInicial = costoInicial;
    }

    public String getDireccionMac() {
        return direccionMac;
    }

    public void setDireccionMac(String direccionMac) {
        this.direccionMac = direccionMac;
    }

    public int getDireccionIMEI() {
        return direccionIMEI;
    }

    public void setDireccionIMEI(int direccionIMEI) {
        this.direccionIMEI = direccionIMEI;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }
    
    public void calcularIVAinicial() {
        valorIVA = iva * costoInicial;
    }
    
    public double obtenerIVAinicial(){
        return valorIVA;
    }
    
    public void calcularCostoFinal() {
        valorFinal = 0;
        valorFinal = valorFinal + valorIVA + costoInicial;
    }
    
    public double obtenerCostoFinal() {
        return valorFinal;
    }
}
