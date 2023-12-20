/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica_4_justin_cuji.controlador;

import java.util.List;
import ec.edu.ups.practica_4_justin_cuji.modelo.Libro;
import java.util.ArrayList;
import ec.edu.ups.practica_4_justin_cuji.modelo.Usuario;

/**
 *
 * @author davidvargas
 */
public class Libro_Controlador {
    private List<Libro> listaLibros;
    private Usuario_Controlador usuarioControlador;

    public Libro_Controlador(Usuario_Controlador usuarioControlador) {
        this.listaLibros = new ArrayList<>();
        this.usuarioControlador = usuarioControlador;
    }

    public void guardarLibro(Libro libro) {
        listaLibros.add(libro);
        System.out.println("Libro guardado en la base de datos.");
    }

    public Libro buscarLibroPorTitulo(String titulo) {
    for (Libro libro : listaLibros) {
        System.out.println("Título del libro: " + libro.getTitulo()); // Agregar esta línea para ver los títulos de los libros
        if (libro.getTitulo().equalsIgnoreCase(titulo)) {
            return libro;
        }
    }
    return null;
}

    public Usuario obtenerUsuarioQuePrestoLibro(Libro libro) {
        return usuarioControlador.obtenerUsuarioQuePrestoLibro(libro);
    }
    public void marcarLibroComoDisponible(Libro libro) {
        // Encontrar el libro en la lista y marcarlo como disponible
        for (Libro l : listaLibros) {
            if (l.equals(libro)) {
                l.setDisponible(true);
                System.out.println("Libro marcado como disponible: " + l.getTitulo());
                break;
            }
        }
    }
    
}
