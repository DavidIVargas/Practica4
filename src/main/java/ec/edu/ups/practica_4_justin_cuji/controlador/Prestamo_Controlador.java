/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica_4_justin_cuji.controlador;

import java.util.Date;

/**
 *
 * @author davidvargas
 */
public class Prestamo_Controlador {
    public int calcularDiasPrestamo(Date fechaPrestamo) {
        Date fechaActual = new Date();
        long tiempoPrestamo = fechaActual.getTime() - fechaPrestamo.getTime();
        return (int) (tiempoPrestamo / (1000 * 60 * 60 * 24));
    }

    // Método para verificar si el préstamo está vigente//
    public boolean esPrestamoVigente(Date fechaPrestamo) {
        int maxDiasPrestamo = 14;
        return calcularDiasPrestamo(fechaPrestamo) <= maxDiasPrestamo;
    }
}
