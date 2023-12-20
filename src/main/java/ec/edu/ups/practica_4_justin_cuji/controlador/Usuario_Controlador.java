/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica_4_justin_cuji.controlador;

import ec.edu.ups.practica_4_justin_cuji.modelo.Libro;
import ec.edu.ups.practica_4_justin_cuji.modelo.Usuario;
import ec.edu.ups.practica_4_justin_cuji.modelo.Biblioteca;
import ec.edu.ups.practica_4_justin_cuji.modelo.Prestamo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author davidvargas
 */
public class Usuario_Controlador {

    private List<Usuario> listaUsuarios;
    private Map<String, Usuario> usuariosPorId;
    private Biblioteca biblioteca;

    public Usuario_Controlador(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
        this.listaUsuarios = new ArrayList<>();
        this.usuariosPorId = new HashMap<>();
    }

    public void registrarUsuario(Usuario usuario) {
        biblioteca.registrarUsuario(usuario);
    }

    public void solicitarPrestamo(Usuario usuario, Libro libro) {
        usuario.solicitarPrestamo(libro);
    }

    public boolean devolverLibro(Usuario usuario, Libro libro) {
    // Lógica para devolver el libro por parte del usuario
    for (Prestamo prestamo : usuario.getListaPrestamos()) {
        if (prestamo.getLibro().equals(libro) && prestamo.esPrestamoVigente()) {
            usuario.eliminarPrestamo(libro);
            libro.setDisponible(true);
            return true; // Devolución exitosa
        }
    }
    return false; // Si el libro no se pudo devolver
}

    public void guardarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
        usuariosPorId.put(usuario.getIdentificacion(), usuario); // Almacena el usuario en el HashMap usando su ID
        System.out.println("Usuario guardado en la base de datos.");
    }

    public Usuario buscarUsuarioPorId(String id) {
        return usuariosPorId.get(id); // Busca al usuario por su ID en el HashMap
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        for (Usuario usuario : listaUsuarios) {
            for (Prestamo prestamo : usuario.getListaPrestamos()) {
                if (prestamo.getLibro().getTitulo().equalsIgnoreCase(titulo)) {
                    return prestamo.getLibro();
                }
            }
        }
        return null; // Si no se encuentra el libro
    }

    public Usuario obtenerUsuarioQuePrestoLibro(Libro libro) {
        for (Usuario usuario : listaUsuarios) {
            for (Prestamo prestamo : usuario.getListaPrestamos()) {
                if (prestamo.getLibro().equals(libro) && prestamo.esPrestamoVigente()) {
                    return usuario;
                }
            }
        }
        return null;
    }

    public Prestamo obtenerPrestamo(Usuario usuario, Libro libro) {
        for (Prestamo prestamo : usuario.getListaPrestamos()) {
            if (prestamo.getLibro().equals(libro)) {
                return prestamo;
            }
        }
        return null; // Si no se encuentra el préstamo específico
    }

}
