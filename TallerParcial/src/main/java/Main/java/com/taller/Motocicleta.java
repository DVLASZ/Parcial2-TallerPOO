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
public @Data class Motocicleta extends Vehiculo {

    // Constructores, getters y setters
    // Otros métodos específicos para motocicletas
    public Motocicleta(int cilindrada, String marca, String modelo, String placa, String horaIngreso) {
        super(marca, modelo, placa, horaIngreso);
        this.cilindrada = cilindrada;
    }

    private @Getter @Setter int cilindrada;

}
