/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main.java.com.taller;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Edward Esteban Dávila Salzar 104623010331
 */
public @Data class Vehiculo {

    public Vehiculo(String marca, String modelo, String placa, String horaIngreso) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.horaIngreso = horaIngreso;
    }

    public int calcularGanancia() {

        if (this.horaSalida == null) {
            return 3500;
        }

        String HoraIngreso = this.horaIngreso;
        String HoraSalida = this.horaSalida;
        //extrae del string las horas
        String[] partesHoraI = HoraIngreso.split(":");
        int horasIn = Integer.parseInt(partesHoraI[0]);
        //extrae del string las horas
        String[] partesHoraS = HoraSalida.split(":");
        int horasS = Integer.parseInt(partesHoraS[0]);

        return 3500 + ((horasS - horasIn) * 350);

    }

    private @Getter @Setter String marca, modelo, placa, horaIngreso, horaSalida;

}
