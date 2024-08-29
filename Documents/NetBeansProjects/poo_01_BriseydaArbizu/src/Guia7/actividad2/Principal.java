package Guia7.actividad2;

public class Principal extends javax.swing.JFrame {

    Calculadora_01 operar = new Calculadora_01();
    double num1;
    double num2;

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void entrada() {
        num1 = Double.parseDouble(campoUno.getText());
        num2 = Double.parseDouble(campoDos.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoDos = new javax.swing.JTextField();
        campoUno = new javax.swing.JTextField();
        botonResta = new javax.swing.JButton();
        botonSuma = new javax.swing.JButton();
        botonMult = new javax.swing.JButton();
        botonDiv = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        resultado = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Corbel", 0, 10)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("OPERACIONES BÁSICAS");

        jLabel2.setText("Segundo Número:");

        jLabel3.setText("Primer Número:");

        campoDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDosActionPerformed(evt);
            }
        });

        campoUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoUnoActionPerformed(evt);
            }
        });

        botonResta.setBackground(new java.awt.Color(255, 153, 153));
        botonResta.setText("-");
        botonResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRestaActionPerformed(evt);
            }
        });

        botonSuma.setBackground(new java.awt.Color(255, 153, 153));
        botonSuma.setText("+");
        botonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSumaActionPerformed(evt);
            }
        });

        botonMult.setBackground(new java.awt.Color(255, 153, 153));
        botonMult.setText("*");
        botonMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMultActionPerformed(evt);
            }
        });

        botonDiv.setBackground(new java.awt.Color(255, 153, 153));
        botonDiv.setText("/");
        botonDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDivActionPerformed(evt);
            }
        });

        jLabel4.setText("Resultado:");

        resultado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        resultado.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoUno, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoDos, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(botonSuma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonResta)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonMult)
                                .addGap(18, 18, 18)
                                .addComponent(botonDiv)))))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(96, 96, 96))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(jLabel3)
                    .addContainerGap(233, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(campoUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonResta)
                    .addComponent(botonMult)
                    .addComponent(botonDiv)
                    .addComponent(botonSuma))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(74, 74, 74)
                    .addComponent(jLabel3)
                    .addContainerGap(206, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDosActionPerformed

    }//GEN-LAST:event_campoDosActionPerformed

    private void campoUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoUnoActionPerformed

    }//GEN-LAST:event_campoUnoActionPerformed

    private void botonRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRestaActionPerformed
        entrada();
        operar.calcularResta(num1, num2);
        resultado.setText(String.valueOf(operar.result));
        campoUno.requestFocus();
        campoUno.selectAll();
    }//GEN-LAST:event_botonRestaActionPerformed

    private void botonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSumaActionPerformed
        entrada();
        operar.calcularSuma(num1, num2);
        resultado.setText(String.valueOf(operar.result));
        campoUno.requestFocus();
        campoUno.selectAll();
    }//GEN-LAST:event_botonSumaActionPerformed

    private void botonMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMultActionPerformed
        entrada();
        operar.calcularMult(num1, num2);
        resultado.setText(String.valueOf(operar.result));
        campoUno.requestFocus();
        campoUno.selectAll();
    }//GEN-LAST:event_botonMultActionPerformed

    private void botonDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDivActionPerformed
        entrada();
        operar.calcularDiv(num1, num2);
        resultado.setText(String.valueOf(operar.result));
        campoUno.requestFocus();
        campoUno.selectAll();
    }//GEN-LAST:event_botonDivActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonDiv;
    private javax.swing.JButton botonMult;
    private javax.swing.JButton botonResta;
    private javax.swing.JButton botonSuma;
    private javax.swing.JTextField campoDos;
    private javax.swing.JTextField campoUno;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel resultado;
    // End of variables declaration//GEN-END:variables
}
