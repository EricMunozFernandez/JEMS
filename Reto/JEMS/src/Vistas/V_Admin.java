/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author Miguel Barros
 */
public class V_Admin extends javax.swing.JFrame {

    /**
     * Creates new form V_Inicio
     */
    public V_Admin() {
        initComponents();
    }
    private static String operacion;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        bCrearLiga = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        miModificarJugador = new javax.swing.JMenuItem();
        miAltaJugador = new javax.swing.JMenuItem();
        miBajaJugador = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu4 = new javax.swing.JMenu();
        miModificarEquipo = new javax.swing.JMenuItem();
        miAltaEquipo = new javax.swing.JMenuItem();
        miBajaEquipo = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenu5 = new javax.swing.JMenu();
        miModificarDueño = new javax.swing.JMenuItem();
        miAltaDueño = new javax.swing.JMenuItem();
        miBajaDueño = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenu6 = new javax.swing.JMenu();
        miModificarUsuario = new javax.swing.JMenuItem();
        miAltaUsuario = new javax.swing.JMenuItem();
        miBajaUsuario = new javax.swing.JMenuItem();
        mIntroducirResultado = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenu7 = new javax.swing.JMenu();
        miVisualizarLiga = new javax.swing.JMenuItem();
        miVisualizarClasificacion = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        mLogOut = new javax.swing.JMenu();

        jMenuItem15.setText("jMenuItem15");

        jMenuItem16.setText("jMenuItem16");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToggleButton1.setText("jToggleButton1");

        jButton1.setText("jButton1");

        bCrearLiga.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        bCrearLiga.setText("CREAR LIGA");
        bCrearLiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCrearLigaActionPerformed(evt);
            }
        });

        jMenu1.setBorder(null);
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/sql developer_opt.png"))); // NOI18N
        jMenu1.setText("BBDD");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N

        jMenu3.setText("Jugador");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N

        miModificarJugador.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        miModificarJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/modificar_opt.png"))); // NOI18N
        miModificarJugador.setText("Modificar");
        miModificarJugador.setIconTextGap(1);
        miModificarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miModificarJugadorActionPerformed(evt);
            }
        });
        jMenu3.add(miModificarJugador);

        miAltaJugador.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        miAltaJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/alta_opt.jpg"))); // NOI18N
        miAltaJugador.setText("Alta");
        miAltaJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAltaJugadorActionPerformed(evt);
            }
        });
        jMenu3.add(miAltaJugador);

        miBajaJugador.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        miBajaJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/borrar_opt.png"))); // NOI18N
        miBajaJugador.setText("Baja");
        miBajaJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBajaJugadorActionPerformed(evt);
            }
        });
        jMenu3.add(miBajaJugador);

        jMenu1.add(jMenu3);
        jMenu1.add(jSeparator2);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/equipo_opt.jpg"))); // NOI18N
        jMenu4.setText("Equipo");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N

        miModificarEquipo.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        miModificarEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/modificar_opt.png"))); // NOI18N
        miModificarEquipo.setText("Modificar");
        miModificarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miModificarEquipoActionPerformed(evt);
            }
        });
        jMenu4.add(miModificarEquipo);

        miAltaEquipo.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        miAltaEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/alta_opt.jpg"))); // NOI18N
        miAltaEquipo.setText("Alta");
        miAltaEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAltaEquipoActionPerformed(evt);
            }
        });
        jMenu4.add(miAltaEquipo);

        miBajaEquipo.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        miBajaEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/borrar_opt.png"))); // NOI18N
        miBajaEquipo.setText("Baja");
        miBajaEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBajaEquipoActionPerformed(evt);
            }
        });
        jMenu4.add(miBajaEquipo);

        jMenu1.add(jMenu4);
        jMenu1.add(jSeparator3);

        jMenu5.setText("Dueño");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N

        miModificarDueño.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        miModificarDueño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/modificar_opt.png"))); // NOI18N
        miModificarDueño.setText("Modificar");
        miModificarDueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miModificarDueñoActionPerformed(evt);
            }
        });
        jMenu5.add(miModificarDueño);

        miAltaDueño.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        miAltaDueño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/alta_opt.jpg"))); // NOI18N
        miAltaDueño.setText("Alta");
        miAltaDueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAltaDueñoActionPerformed(evt);
            }
        });
        jMenu5.add(miAltaDueño);

        miBajaDueño.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        miBajaDueño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/borrar_opt.png"))); // NOI18N
        miBajaDueño.setText("Baja");
        miBajaDueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBajaDueñoActionPerformed(evt);
            }
        });
        jMenu5.add(miBajaDueño);

        jMenu1.add(jMenu5);
        jMenu1.add(jSeparator4);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Usuario_opt.png"))); // NOI18N
        jMenu6.setText("Usuario");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N

        miModificarUsuario.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        miModificarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/modificar_opt.png"))); // NOI18N
        miModificarUsuario.setText("Modificar");
        miModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miModificarUsuarioActionPerformed(evt);
            }
        });
        jMenu6.add(miModificarUsuario);

        miAltaUsuario.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        miAltaUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/alta_opt.jpg"))); // NOI18N
        miAltaUsuario.setText("Alta");
        miAltaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAltaUsuarioActionPerformed(evt);
            }
        });
        jMenu6.add(miAltaUsuario);

        miBajaUsuario.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        miBajaUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/borrar_opt.png"))); // NOI18N
        miBajaUsuario.setText("Baja");
        miBajaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBajaUsuarioActionPerformed(evt);
            }
        });
        jMenu6.add(miBajaUsuario);

        jMenu1.add(jMenu6);

        jMenuBar1.add(jMenu1);

        mIntroducirResultado.setText("Introducir Resultado");
        mIntroducirResultado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mIntroducirResultado.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        mIntroducirResultado.setIconTextGap(10);
        mIntroducirResultado.add(jSeparator1);
        mIntroducirResultado.add(jSeparator5);

        jMenuBar1.add(mIntroducirResultado);

        jMenu7.setBorder(null);
        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ojos_opt.png"))); // NOI18N
        jMenu7.setText("Visualizar");
        jMenu7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jMenu7.setIconTextGap(7);

        miVisualizarLiga.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        miVisualizarLiga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/SLO_opt.png"))); // NOI18N
        miVisualizarLiga.setText("Liga");
        jMenu7.add(miVisualizarLiga);

        miVisualizarClasificacion.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        miVisualizarClasificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/clasificacion_opt.jpg"))); // NOI18N
        miVisualizarClasificacion.setText("Clasificacion");
        jMenu7.add(miVisualizarClasificacion);
        jMenu7.add(jSeparator6);

        jMenuBar1.add(jMenu7);

        mLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logout_opt.png"))); // NOI18N
        mLogOut.setText("LogOut");
        mLogOut.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        mLogOut.setIconTextGap(7);
        jMenuBar1.add(mLogOut);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(335, Short.MAX_VALUE)
                .addComponent(bCrearLiga, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(299, 299, 299))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(241, Short.MAX_VALUE)
                .addComponent(bCrearLiga, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miModificarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miModificarJugadorActionPerformed
        operacion = "modificar";
        ControladorVistas.mostrarVentanaJugador(operacion);
    }//GEN-LAST:event_miModificarJugadorActionPerformed

    private void miBajaJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBajaJugadorActionPerformed
        operacion = "baja";
        ControladorVistas.mostrarVentanaJugador(operacion);
    }//GEN-LAST:event_miBajaJugadorActionPerformed

    private void miBajaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBajaUsuarioActionPerformed
        operacion = "baja";
        ControladorVistas.mostrarVentanaUsuario(operacion);
    }//GEN-LAST:event_miBajaUsuarioActionPerformed

    private void miAltaJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAltaJugadorActionPerformed
        operacion = "alta";
        ControladorVistas.mostrarVentanaJugador(operacion);
    }//GEN-LAST:event_miAltaJugadorActionPerformed

    private void miModificarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miModificarEquipoActionPerformed
         operacion = "modificar";
        ControladorVistas.mostrarVentanaEquipo(operacion);
    }//GEN-LAST:event_miModificarEquipoActionPerformed

    private void miAltaEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAltaEquipoActionPerformed
        operacion = "alta";
        ControladorVistas.mostrarVentanaEquipo(operacion);
    }//GEN-LAST:event_miAltaEquipoActionPerformed

    private void miBajaEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBajaEquipoActionPerformed
         operacion = "baja";
        ControladorVistas.mostrarVentanaEquipo(operacion);
    }//GEN-LAST:event_miBajaEquipoActionPerformed

    private void miModificarDueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miModificarDueñoActionPerformed
        operacion = "modificar";
        ControladorVistas.mostrarVentanaDueño(operacion);
    }//GEN-LAST:event_miModificarDueñoActionPerformed

    private void miAltaDueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAltaDueñoActionPerformed
        
        ControladorVistas.mostrarVentanaDueño(operacion);
    }//GEN-LAST:event_miAltaDueñoActionPerformed

    private void miBajaDueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBajaDueñoActionPerformed
        operacion = "baja";
        ControladorVistas.mostrarVentanaDueño(operacion);
    }//GEN-LAST:event_miBajaDueñoActionPerformed

    private void miModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miModificarUsuarioActionPerformed
        operacion = "modificar";
        ControladorVistas.mostrarVentanaUsuario(operacion);
    }//GEN-LAST:event_miModificarUsuarioActionPerformed

    private void miAltaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAltaUsuarioActionPerformed
       
        ControladorVistas.mostrarVentanaUsuario(operacion);
    }//GEN-LAST:event_miAltaUsuarioActionPerformed

    private void bCrearLigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCrearLigaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bCrearLigaActionPerformed

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
            java.util.logging.Logger.getLogger(V_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCrearLiga;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JMenu mIntroducirResultado;
    private javax.swing.JMenu mLogOut;
    private javax.swing.JMenuItem miAltaDueño;
    private javax.swing.JMenuItem miAltaEquipo;
    private javax.swing.JMenuItem miAltaJugador;
    private javax.swing.JMenuItem miAltaUsuario;
    private javax.swing.JMenuItem miBajaDueño;
    private javax.swing.JMenuItem miBajaEquipo;
    private javax.swing.JMenuItem miBajaJugador;
    private javax.swing.JMenuItem miBajaUsuario;
    private javax.swing.JMenuItem miModificarDueño;
    private javax.swing.JMenuItem miModificarEquipo;
    private javax.swing.JMenuItem miModificarJugador;
    private javax.swing.JMenuItem miModificarUsuario;
    private javax.swing.JMenuItem miVisualizarClasificacion;
    private javax.swing.JMenuItem miVisualizarLiga;
    // End of variables declaration//GEN-END:variables
}