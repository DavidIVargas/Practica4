/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica_4_justin_cuji.controlador;

import ec.edu.ups.practica_4_justin_cuji.modelo.Libro;
import ec.edu.ups.practica_4_justin_cuji.modelo.Biblioteca;
import ec.edu.ups.practica_4_justin_cuji.modelo.Usuario;
import ec.edu.ups.practica_4_justin_cuji.modelo.Persona;

/**
 *
 * @author davidvargas
 */
public class Biblioteca_Controlador {
    private Biblioteca biblioteca;

    public Biblioteca_Controlador(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public void agregarLibro(Libro libro) {
        biblioteca.agregarLibro(libro);
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        return biblioteca.buscarLibro(titulo);
    }

    public void prestarLibro(Libro libro, Usuario usuario) {
        biblioteca.prestarLibro(libro, usuario);
    }
}
