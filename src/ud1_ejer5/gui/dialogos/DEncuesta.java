/*
LICENCIA JOSE JAVIER BO
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
Lista de paquetes:
 */

package ud1_ejer5.gui.dialogos;

import java.awt.Frame;
import java.util.ArrayList;
import javax.swing.ButtonModel;
import ud1_ejer5.dto.Encuesta;
import ud1_ejer5.logica.Logica;

/**
 * Dialogo de rellenar encuesta
 * 
 * @author Jose Javier Bailon Ortiz
 */
public class DEncuesta extends javax.swing.JDialog {

    /** Creates new form DEncuesta */
    public DEncuesta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupSexo = new javax.swing.ButtonGroup();
        panelGeneral = new javax.swing.JPanel();
        lbProfesion = new javax.swing.JLabel();
        inputProfesion = new javax.swing.JTextField();
        lbHermanos = new javax.swing.JLabel();
        inputHermanos = new javax.swing.JSpinner();
        lbEdad = new javax.swing.JLabel();
        inputEdad = new javax.swing.JComboBox<>();
        panelSexo = new javax.swing.JPanel();
        inputHombre = new javax.swing.JRadioButton();
        inputMujer = new javax.swing.JRadioButton();
        inputPracticaDeporte = new javax.swing.JCheckBox();
        panelDeportes = new javax.swing.JPanel();
        scrollDeportes = new javax.swing.JScrollPane();
        inputDeportes = new javax.swing.JList<>();
        separador = new javax.swing.JSeparator();
        lbInfoAficiones = new javax.swing.JLabel();
        lbCompras = new javax.swing.JLabel();
        inputCompras = new javax.swing.JSlider();
        lbTv = new javax.swing.JLabel();
        inputTv = new javax.swing.JSlider();
        lbCine = new javax.swing.JLabel();
        inputCine = new javax.swing.JSlider();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Realizar encuesta");

        lbProfesion.setText("Profesi�n:");

        lbHermanos.setText("N� Hermanos:");

        inputHermanos.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        lbEdad.setText("Edad:");

        inputEdad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entre 18 y 30", "Entre 31 y 50", "Entre 51 y 65", "Mayor de 65" }));

        panelSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo"));

        btnGroupSexo.add(inputHombre);
        inputHombre.setText("Hombre");
        inputHombre.setActionCommand("Hombre");
        inputHombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputHombreActionPerformed(evt);
            }
        });

        btnGroupSexo.add(inputMujer);
        inputMujer.setText("Mujer");
        inputMujer.setActionCommand("Mujer");

        javax.swing.GroupLayout panelSexoLayout = new javax.swing.GroupLayout(panelSexo);
        panelSexo.setLayout(panelSexoLayout);
        panelSexoLayout.setHorizontalGroup(
            panelSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSexoLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(inputHombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(inputMujer)
                .addGap(46, 46, 46))
        );
        panelSexoLayout.setVerticalGroup(
            panelSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSexoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputHombre)
                    .addComponent(inputMujer))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        inputPracticaDeporte.setText("�Practica alg�n deporte?");
        inputPracticaDeporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPracticaDeporteActionPerformed(evt);
            }
        });

        panelDeportes.setBorder(javax.swing.BorderFactory.createTitledBorder("�Cual?"));

        inputDeportes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Tenis", "F�tbol", "Baloncesto", "Treking", "Acuaticos", "Otros" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        inputDeportes.setEnabled(false);
        scrollDeportes.setViewportView(inputDeportes);

        javax.swing.GroupLayout panelDeportesLayout = new javax.swing.GroupLayout(panelDeportes);
        panelDeportes.setLayout(panelDeportesLayout);
        panelDeportesLayout.setHorizontalGroup(
            panelDeportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollDeportes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
        );
        panelDeportesLayout.setVerticalGroup(
            panelDeportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollDeportes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
        );

        lbInfoAficiones.setText("Marque del 1 al 10 su grado de afici�n a:");

        lbCompras.setText("Compras:");

        inputCompras.setMajorTickSpacing(1);
        inputCompras.setMaximum(10);
        inputCompras.setMinimum(1);
        inputCompras.setPaintLabels(true);
        inputCompras.setSnapToTicks(true);
        inputCompras.setValue(5);

        lbTv.setText("Ver Televisi�n:");

        inputTv.setMajorTickSpacing(1);
        inputTv.setMaximum(10);
        inputTv.setMinimum(1);
        inputTv.setPaintLabels(true);
        inputTv.setSnapToTicks(true);
        inputTv.setValue(5);

        lbCine.setText("Ir al cine:");

        inputCine.setMajorTickSpacing(1);
        inputCine.setMaximum(10);
        inputCine.setMinimum(1);
        inputCine.setPaintLabels(true);
        inputCine.setSnapToTicks(true);
        inputCine.setValue(5);

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGeneralLayout = new javax.swing.GroupLayout(panelGeneral);
        panelGeneral.setLayout(panelGeneralLayout);
        panelGeneralLayout.setHorizontalGroup(
            panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separador)
                    .addComponent(panelSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelGeneralLayout.createSequentialGroup()
                        .addComponent(lbProfesion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputProfesion))
                    .addGroup(panelGeneralLayout.createSequentialGroup()
                        .addComponent(lbHermanos, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputHermanos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(lbEdad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelGeneralLayout.createSequentialGroup()
                        .addComponent(inputPracticaDeporte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelDeportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbInfoAficiones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelGeneralLayout.createSequentialGroup()
                        .addGroup(panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbCompras)
                            .addComponent(lbTv)
                            .addComponent(lbCine))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputTv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputCine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelGeneralLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addGap(52, 52, 52)))
                .addContainerGap())
        );
        panelGeneralLayout.setVerticalGroup(
            panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProfesion)
                    .addComponent(inputProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHermanos)
                    .addComponent(inputHermanos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEdad)
                    .addComponent(inputEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputPracticaDeporte)
                    .addComponent(panelDeportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbInfoAficiones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCompras))
                .addGap(18, 18, 18)
                .addGroup(panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputTv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTv))
                .addGap(18, 18, 18)
                .addGroup(panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputCine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCine))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputHombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputHombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputHombreActionPerformed

    /**
     * Accion realizada cuando el checkbox inputPracticaDeporte es cambiado
     * @param evt 
     */
    private void inputPracticaDeporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPracticaDeporteActionPerformed
        if (this.inputPracticaDeporte.isSelected())
            this.inputDeportes.setEnabled(true);
        else{
            this.inputDeportes.setEnabled(false);
            this.inputDeportes.clearSelection();
        }
    }//GEN-LAST:event_inputPracticaDeporteActionPerformed

    /**
     * Accion del boton cancelar
     * @param evt 
     */
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * Accion del boton aceptar. Comprueba que este la profesion rellena y si lo
     * esta entonces recopila todos los datos y envia a Logica la orden de agregar
     * una nueva Encuesta
     * @param evt 
     */
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        //1-Comprobar si profesion esta rellenado, de lo contrario avisar
        String profesion = this.inputProfesion.getText();
        if (profesion==null||profesion.length()==0){
            mostrarError("Debe introducir una profesion");
            return;
        }
        //recoger el resto de datos
        int nHermanos = (int)this.inputHermanos.getValue();
        String edad = this.inputEdad.getSelectedItem().toString();
        //gestion del radiobutton group para la seleccion de sexo
        ButtonModel seleccionado = this.btnGroupSexo.getSelection();
        String sexo = (seleccionado==null)?"":seleccionado.getActionCommand();
        
        boolean practicaDeportes = this.inputPracticaDeporte.isSelected();
        ArrayList<String> deportes = new ArrayList(inputDeportes.getSelectedValuesList());
        int compras = this.inputCompras.getValue();
        int tv = this.inputTv.getValue();
        int cine = this.inputCine.getValue();
        //crear DTO encuesta
        Encuesta encuesta = new Encuesta(profesion, nHermanos, edad, sexo, deportes, compras, tv, cine);
        //agregar la encuesta
        Logica.addEncuesta(encuesta);
        this.dispose();
        
    }//GEN-LAST:event_btnAceptarActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.ButtonGroup btnGroupSexo;
    private javax.swing.JSlider inputCine;
    private javax.swing.JSlider inputCompras;
    private javax.swing.JList<String> inputDeportes;
    private javax.swing.JComboBox<String> inputEdad;
    private javax.swing.JSpinner inputHermanos;
    private javax.swing.JRadioButton inputHombre;
    private javax.swing.JRadioButton inputMujer;
    private javax.swing.JCheckBox inputPracticaDeporte;
    private javax.swing.JTextField inputProfesion;
    private javax.swing.JSlider inputTv;
    private javax.swing.JLabel lbCine;
    private javax.swing.JLabel lbCompras;
    private javax.swing.JLabel lbEdad;
    private javax.swing.JLabel lbHermanos;
    private javax.swing.JLabel lbInfoAficiones;
    private javax.swing.JLabel lbProfesion;
    private javax.swing.JLabel lbTv;
    private javax.swing.JPanel panelDeportes;
    private javax.swing.JPanel panelGeneral;
    private javax.swing.JPanel panelSexo;
    private javax.swing.JScrollPane scrollDeportes;
    private javax.swing.JSeparator separador;
    // End of variables declaration//GEN-END:variables

    private void mostrarError(String msg) {
          DError dError = new DError((Frame) this.getParent(), true, msg);
          dError.setLocationRelativeTo(this);
          dError.setVisible(true);
          
    }

}//fin DEncuesta
