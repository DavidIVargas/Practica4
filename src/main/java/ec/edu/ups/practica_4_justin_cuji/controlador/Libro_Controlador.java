/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica_4_justin_cuji.controlador;

import java.util.List;
import ec.edu.ups.practica_4_justin_cuji.modelo.Libro;
import java.util.ArrayList;

/**
 *
 * @author davidvargas
 */
public class Libro_Controlador {
    private List<Libro> listaLibros;

    public Libro_Controlador() {
        this.listaLibros = new ArrayList<>();
    }

    public void guardarLibro(Libro libro) {
        listaLibros.add(libro);
        System.out.println("Libro guardado en la base de datos.");
    }
    
    public Libro buscarLibroPorTitulo(String titulo) {
        for (Libro libro : listaLibros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }
}
