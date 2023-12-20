/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica_4_justin_cuji.controlador;

import ec.edu.ups.practica_4_justin_cuji.modelo.Libro;
import ec.edu.ups.practica_4_justin_cuji.modelo.Usuario;
import ec.edu.ups.practica_4_justin_cuji.modelo.Biblioteca;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author davidvargas
 */
public class Usuario_Controlador {
    private List<Usuario> listaUsuarios;
    private Biblioteca biblioteca;

    public Usuario_Controlador(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }
    public Usuario_Controlador() {
        this.listaUsuarios = new ArrayList<>();
    }
    public void guardarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
        System.out.println("Usuario guardado en la base de datos.");
    }
    public void registrarUsuario(Usuario usuario) {
        biblioteca.registrarUsuario(usuario);
    }

    public void solicitarPrestamo(Usuario usuario, Libro libro) {
        usuario.solicitarPrestamo(libro);
    }

    public void devolverLibro(Usuario usuario, Libro libro) {
        usuario.devolverLibro(libro);
    }
}
