/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main.java.com.taller;

/**
 *
 * @author Edward Esteban Dávila Salzar 104623010331
 */
public class Automovil extends Vehiculo {

    private int numeroPuertas;

    // Constructores, getters y setters
    // Otros métodos específicos para automóviles
    public Automovil(int numeroPuertas, String marca, String modelo, String placa, String horaIngreso) {
        super(marca, modelo, placa, horaIngreso);
        this.numeroPuertas = numeroPuertas;
    }

    public int calcularCostoParqueo() {
        int costobase = 34;
        return costobase + (numeroPuertas * 6);
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

}
