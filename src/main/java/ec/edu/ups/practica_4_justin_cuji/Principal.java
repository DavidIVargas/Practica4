/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.ups.practica_4_justin_cuji;

import ec.edu.ups.practica_4_justin_cuji.controlador.Biblioteca_Controlador;
import ec.edu.ups.practica_4_justin_cuji.controlador.Prestamo_Controlador;
import ec.edu.ups.practica_4_justin_cuji.controlador.Usuario_Controlador;
import ec.edu.ups.practica_4_justin_cuji.vista.Agregar_Libro;
import ec.edu.ups.practica_4_justin_cuji.vista.Buscar_libro;
import ec.edu.ups.practica_4_justin_cuji.vista.Crear_Usuario;
import ec.edu.ups.practica_4_justin_cuji.vista.Devolver_Libro;
import ec.edu.ups.practica_4_justin_cuji.vista.Prestar_Libro;
import ec.edu.ups.practica_4_justin_cuji.modelo.Biblioteca;

/**
 *
 * @author davidvargas
 */
public class Principal extends javax.swing.JFrame {

    // Controladores
    private Usuario_Controlador usuarioControlador;
    private Biblioteca_Controlador biblioteca_Controlador;
    private Prestamo_Controlador prestamo_Controlador;

    // Ventanas
    private Crear_Usuario ventanaCrearUsuario;
    private Agregar_Libro agregar_Libro;
    private Buscar_libro buscar_libro;
    private Devolver_Libro devolver_libro;
    private Prestar_Libro prestar_Libro;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        String nombreBiblioteca = "Nombre de la biblioteca";
        String direccionBiblioteca = "Dirección de la biblioteca";
        Biblioteca biblioteca = new Biblioteca(nombreBiblioteca, direccionBiblioteca);

        // Inicialización de los controladores y ventanas
        usuarioControlador = new Usuario_Controlador(biblioteca);
        biblioteca_Controlador = new Biblioteca_Controlador(biblioteca);
        prestamo_Controlador = new Prestamo_Controlador();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        btnCrear_Usuario = new javax.swing.JButton();
        btnAgregar_Libro = new javax.swing.JButton();
        btnBuscar_Libro = new javax.swing.JButton();
        btnPrestar_Libros = new javax.swing.JButton();
        btnDevolver_Libro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frame2"); // NOI18N
        setPreferredSize(new java.awt.Dimension(878, 654));

        btnCrear_Usuario.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnCrear_Usuario.setText("Crear Usuario");
        btnCrear_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrear_UsuarioActionPerformed(evt);
            }
        });
        desktopPane.add(btnCrear_Usuario);
        btnCrear_Usuario.setBounds(10, 40, 145, 56);

        btnAgregar_Libro.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnAgregar_Libro.setText("Agregar Libros");
        btnAgregar_Libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar_LibroActionPerformed(evt);
            }
        });
        desktopPane.add(btnAgregar_Libro);
        btnAgregar_Libro.setBounds(170, 40, 135, 56);

        btnBuscar_Libro.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnBuscar_Libro.setText("Buscar Libros");
        btnBuscar_Libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar_LibroActionPerformed(evt);
            }
        });
        desktopPane.add(btnBuscar_Libro);
        btnBuscar_Libro.setBounds(330, 40, 136, 56);

        btnPrestar_Libros.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnPrestar_Libros.setText("Prestar Libros");
        btnPrestar_Libros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestar_LibrosActionPerformed(evt);
            }
        });
        desktopPane.add(btnPrestar_Libros);
        btnPrestar_Libros.setBounds(480, 40, 130, 56);

        btnDevolver_Libro.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnDevolver_Libro.setText("Devolver Libro");
        btnDevolver_Libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolver_LibroActionPerformed(evt);
            }
        });
        desktopPane.add(btnDevolver_Libro);
        btnDevolver_Libro.setBounds(640, 40, 151, 56);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrear_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrear_UsuarioActionPerformed
        mostrarBotones(false); // Oculta los botones
        if (ventanaCrearUsuario == null) {
            ventanaCrearUsuario = new Crear_Usuario(usuarioControlador);
            desktopPane.add(ventanaCrearUsuario);
        }
        ventanaCrearUsuario.setVisible(true);
    }//GEN-LAST:event_btnCrear_UsuarioActionPerformed

    private void btnAgregar_LibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar_LibroActionPerformed
        mostrarBotones(false);
        if (agregar_Libro == null) {
            agregar_Libro = new Agregar_Libro(usuarioControlador);
            desktopPane.add(agregar_Libro);
        }
        agregar_Libro.setVisible(true);
    }//GEN-LAST:event_btnAgregar_LibroActionPerformed

    private void btnBuscar_LibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar_LibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar_LibroActionPerformed

    private void btnPrestar_LibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestar_LibrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrestar_LibrosActionPerformed

    private void btnDevolver_LibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolver_LibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDevolver_LibroActionPerformed
    public void mostrarBotones(boolean mostrar) {
        btnCrear_Usuario.setVisible(mostrar);
        btnAgregar_Libro.setVisible(mostrar);
        btnBuscar_Libro.setVisible(mostrar);
        btnPrestar_Libros.setVisible(mostrar);
        btnDevolver_Libro.setVisible(mostrar);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar_Libro;
    private javax.swing.JButton btnBuscar_Libro;
    private javax.swing.JButton btnCrear_Usuario;
    private javax.swing.JButton btnDevolver_Libro;
    private javax.swing.JButton btnPrestar_Libros;
    private javax.swing.JDesktopPane desktopPane;
    // End of variables declaration//GEN-END:variables
}
