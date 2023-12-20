/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica_4_justin_cuji.modelo;


import java.util.ArrayList;
//Clase que representa a un usuario en la biblioteca, heredando de la clase abstracta Persona.

public class Usuario extends Persona {
    private static int contadorID = 1;
    private String correo;
    private ArrayList<Prestamo> listaPrestamos;
// Constructor que inicializa los atributos de la clase base y los propios de Usuario
    public Usuario(String nombre, String identificacion, String correo) {
        super(nombre, identificacion);
        this.correo = correo;
        this.listaPrestamos = new ArrayList<>();
        this.identificacion = "ID_" + contadorID++;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Identificación: " + identificacion);
        System.out.println("Correo: " + correo);
    }
//Metodo para solicitar el préstamo del libro//
   public void solicitarPrestamo(Libro libro) {
    if (libro.isDisponible()) {
        Prestamo prestamo = new Prestamo(libro, this);
        libro.prestar();
        agregarPrestamo(prestamo);
        System.out.println("Préstamo solicitado con éxito.");
    } else {
        System.out.println("El libro no está disponible para préstamo.");
    }
}
//método para devolver el libro//
    public boolean devolverLibro(Libro libro) {
        // Lógica para devolver el libro por parte del usuario
        for (Prestamo prestamo : listaPrestamos) {
            if (prestamo.getLibro().equals(libro) && prestamo.esPrestamoVigente()) {
                listaPrestamos.remove(prestamo); // Remover préstamo
                return true; // Devolución exitosa
            }
        }
        return false; // Si el libro no se pudo devolver
    }
    // Método para agregar un préstamo a la lista de préstamos del usuario//
    public void agregarPrestamo(Prestamo prestamo) {
        listaPrestamos.add(prestamo);
    }
    // Método para obtener la lista de préstamos del usuario que usamos en la biblioteca //
    public Iterable<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }
    // Método para obtener la identificación del usuario//
    public String getIdentificacion() {
        return identificacion;
    }
    
    public Libro obtenerLibroPrestado(String tituloLibro) {
        for (Prestamo prestamo : listaPrestamos) {
            if (prestamo.getLibro().getTitulo().equalsIgnoreCase(tituloLibro) && prestamo.esPrestamoVigente()) {
                return prestamo.getLibro();
            }
        }
        return null; // Si no se encuentra el libro prestado por el usuario
    }
    public boolean eliminarPrestamo(Libro libro) {
        for (Prestamo prestamo : listaPrestamos) {
            if (prestamo.getLibro().equals(libro)) {
                listaPrestamos.remove(prestamo);
                return true; // Indica que se eliminó el préstamo
            }
        }
        return false; // Indica que no se encontró el préstamo para eliminar
    }

}
