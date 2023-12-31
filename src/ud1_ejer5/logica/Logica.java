/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud1_ejer5.logica;

import java.util.ArrayList;
import ud1_ejer5.dto.Encuesta;
import ud1_ejer5.gui.ventanas.VPrincipal;

/**
 * Punto de entrada del programa. Contiene la logica de negocio y el almacenamiento de los datos
 * @author Jose Javier BO
 */
public class Logica {
    // ATRIBUTOS
    
    //lista de encuestas introducidas
    private static ArrayList<Encuesta> encuestas = new ArrayList<Encuesta>();

    /**
     * Devuelve el listado de encuestas. Es usado por VPrincipal para actualizar
     * la tabla.
     * @return La lista de encuestas
     */
    public static ArrayList<Encuesta> getEncuestas() {
        return encuestas;
    }
    
    /**
     * Agrega una encuesta a la lista
     * @param encuesta Encuestra a agregar
     */
    public static void addEncuesta(Encuesta encuesta){
        encuestas.add(encuesta);
    }
    
    
    /**
     * MAIN inicio del programa, define el lookandfell y abre una nueva ventana principal
     * @param args 
     */
    public static void main(String[] args) {
                /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                System.out.println(info.getName());
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               VPrincipal vPrincipal= new VPrincipal();
               vPrincipal.setLocationRelativeTo(null);
               vPrincipal.setVisible(true);
            }
        });
    }
}
