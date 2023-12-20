/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica_4_justin_cuji.modelo;

import java.util.Date;

public class Prestamo {

    private Libro libro;
    private Usuario usuario;
    private Date fechaPrestamo;
    private Date fechaDevolucion;

    // Constructor que inicializa los atributos del préstamo//

    public Prestamo(Libro libro, Usuario usuario) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestamo = new Date();
    }
    // Método para calcular la duración del préstamo en días//

    public int calcularDiasPrestamo() {
        long tiempoPrestamo = new Date().getTime() - fechaPrestamo.getTime();

        return (int) (tiempoPrestamo / (1000 * 60 * 60 * 24));
    }
    // Método para verificar si el préstamo está vigente//
    public boolean esPrestamoVigente() {

        int maxDiasPrestamo = 14;

        return calcularDiasPrestamo() <= maxDiasPrestamo;
    }
    //SETTERS AND GETTERS
    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}
