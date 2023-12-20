/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica_4_justin_cuji.modelo;


import java.util.ArrayList;
//Clase que representa a un usuario en la biblioteca, heredando de la clase abstracta Persona.

public class Usuario extends Persona {
    private String correo;
    private ArrayList<Prestamo> listaPrestamos;
// Constructor que inicializa los atributos de la clase base y los propios de Usuario

    public Usuario(String nombre, String identificacion, String correo) {
        super(nombre, identificacion);
        this.correo = correo;
        this.listaPrestamos = new ArrayList<>();
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
    public void devolverLibro(Libro libro) {
        for (Prestamo prestamo : listaPrestamos) {
            if (prestamo.getLibro().equals(libro) && prestamo.esPrestamoVigente()) {
                libro.devolver();
                listaPrestamos.remove(prestamo);
                System.out.println("Devolución exitosa. Libro marcado como disponible.");
                return;
            }
        }
        System.out.println("Error: El usuario no tiene el libro prestado o el préstamo ha expirado.");
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
    

}
