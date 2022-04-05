package vista;

import controlador.Minutos;
import javax.swing.JOptionPane;

public class Formulario extends javax.swing.JFrame {

    public Formulario() {
        initComponents();

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        dollarIcon = new javax.swing.JLabel();
        cellphoneLabel = new javax.swing.JLabel();
        inputCellphone = new javax.swing.JTextField();
        minutesLabel = new javax.swing.JLabel();
        inputMinutes = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de minutos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(46, 204, 113));

        title.setFont(new java.awt.Font("Cascadia Code", 1, 22)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Calculadora de minutos");

        dollarIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dollar_icon.png"))); // NOI18N

        cellphoneLabel.setFont(new java.awt.Font("Cascadia Code", 0, 16)); // NOI18N
        cellphoneLabel.setForeground(new java.awt.Color(255, 255, 255));
        cellphoneLabel.setText("Numero de celular:");

        inputCellphone.setToolTipText("");

        minutesLabel.setFont(new java.awt.Font("Cascadia Code", 0, 16)); // NOI18N
        minutesLabel.setForeground(new java.awt.Color(255, 255, 255));
        minutesLabel.setText("Minutos:");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Cascadia Code", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(46, 204, 113));
        jButton1.setText("Calcular");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(46, 204, 113), 1, true));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(255, 255, 255));
        clearButton.setFont(new java.awt.Font("Cascadia Code", 0, 16)); // NOI18N
        clearButton.setForeground(new java.awt.Color(46, 204, 113));
        clearButton.setText("Limpiar");
        clearButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(46, 204, 113), 1, true));
        clearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dollarIcon))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cellphoneLabel)
                                .addGap(18, 18, 18)
                                .addComponent(inputCellphone, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(minutesLabel)
                                .addGap(18, 18, 18)
                                .addComponent(inputMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(dollarIcon))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(title)))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cellphoneLabel)
                    .addComponent(inputCellphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minutesLabel)
                    .addComponent(inputMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String minutos = inputMinutes.getText().replace("'", "");

        String numeroTelefonico = inputCellphone.getText();

        Minutos min = new Minutos(numeroTelefonico, minutos);

        if (min.esValidoElTelefono() && min.esValidoLosMinutos()) {
            String operador = min.obtenerOperador();
            int pagoTotal = min.obtenerPagoTotal();

            String msg = "Su operadora es: " + operador + "\n"
                    + "Su valor total a pagar es de: " + pagoTotal + " COP";

            showMessageDialog(msg);
        } else {
            String error = "";
            
            if(inputMinutes.getText().equals("")) {
                error = "Los minutos no pueden estar vacíos o contener letras o caracterés especiales";
            } else {
                error = "El numero de telefono no puede estar vacío ó tener menos de 3 digitos";
            }
            

            showMessageDialog(error);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        inputCellphone.setText("");
        inputMinutes.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void showMessageDialog(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cellphoneLabel;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel dollarIcon;
    private javax.swing.JTextField inputCellphone;
    private javax.swing.JTextField inputMinutes;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel minutesLabel;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
