
package window;

import code.Nomina;

public class Window extends javax.swing.JFrame {
    
    private Nomina calculadoraNomina;
    
    public Window() {
        initComponents();
        
        initWindow();
    }

    public void initWindow() {
        //Window properties
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelResultados = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelPagoTotal = new javax.swing.JLabel();
        inputValorHora = new javax.swing.JTextField();
        labelValorHora = new javax.swing.JLabel();
        txtfieldPagoTotal = new javax.swing.JTextField();
        dataLabel1 = new javax.swing.JLabel();
        labelHoras1 = new javax.swing.JLabel();
        inputHoras = new javax.swing.JTextField();
        labelHoras2 = new javax.swing.JLabel();
        resultadoRetencion = new javax.swing.JTextField();
        labelSubsidio = new javax.swing.JLabel();
        resultadoSubsidio = new javax.swing.JTextField();
        labelHoras4 = new javax.swing.JLabel();
        resultadoSalarioBasico = new javax.swing.JTextField();
        botonCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de Nomina");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelResultados.setFont(new java.awt.Font("Trebuchet MS", 0, 17)); // NOI18N
        labelResultados.setForeground(new java.awt.Color(9, 132, 227));
        labelResultados.setText("Resultados");
        jPanel1.add(labelResultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        jPanel2.setBackground(new java.awt.Color(9, 132, 227));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ilustracion.png"))); // NOI18N

        titulo.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Calculadora de Nomina");

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Coded and designed by: MP");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(titulo)
                        .addGap(0, 16, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(titulo)
                .addGap(66, 66, 66)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 440));

        labelPagoTotal.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        labelPagoTotal.setForeground(new java.awt.Color(9, 132, 227));
        labelPagoTotal.setText("Total a pagar");
        jPanel1.add(labelPagoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, -1, -1));

        inputValorHora.setBackground(new java.awt.Color(255, 255, 255));
        inputValorHora.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        inputValorHora.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(9, 132, 227), 1, true));
        jPanel1.add(inputValorHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 120, -1));

        labelValorHora.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        labelValorHora.setForeground(new java.awt.Color(9, 132, 227));
        labelValorHora.setText("Valor de la hora");
        jPanel1.add(labelValorHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));

        txtfieldPagoTotal.setEditable(false);
        txtfieldPagoTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtfieldPagoTotal.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        txtfieldPagoTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(txtfieldPagoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 110, -1));

        dataLabel1.setBackground(new java.awt.Color(9, 132, 227));
        dataLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        dataLabel1.setForeground(new java.awt.Color(9, 132, 227));
        dataLabel1.setText("Por favor dijite los siguientes datos");
        jPanel1.add(dataLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        labelHoras1.setBackground(new java.awt.Color(9, 132, 227));
        labelHoras1.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        labelHoras1.setForeground(new java.awt.Color(9, 132, 227));
        labelHoras1.setText("Horas");
        jPanel1.add(labelHoras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        inputHoras.setBackground(new java.awt.Color(255, 255, 255));
        inputHoras.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        inputHoras.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(9, 132, 227), 1, true));
        jPanel1.add(inputHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 90, -1));

        labelHoras2.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        labelHoras2.setForeground(new java.awt.Color(9, 132, 227));
        labelHoras2.setText("Retencion");
        jPanel1.add(labelHoras2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));

        resultadoRetencion.setEditable(false);
        resultadoRetencion.setBackground(new java.awt.Color(255, 255, 255));
        resultadoRetencion.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        resultadoRetencion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(resultadoRetencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 90, -1));

        labelSubsidio.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        labelSubsidio.setForeground(new java.awt.Color(9, 132, 227));
        labelSubsidio.setText("Subsidio");
        jPanel1.add(labelSubsidio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, -1));

        resultadoSubsidio.setEditable(false);
        resultadoSubsidio.setBackground(new java.awt.Color(255, 255, 255));
        resultadoSubsidio.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        resultadoSubsidio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(resultadoSubsidio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 90, -1));

        labelHoras4.setBackground(new java.awt.Color(60, 35, 240));
        labelHoras4.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        labelHoras4.setForeground(new java.awt.Color(9, 132, 227));
        labelHoras4.setText("Salario básico");
        jPanel1.add(labelHoras4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, -1, -1));

        resultadoSalarioBasico.setEditable(false);
        resultadoSalarioBasico.setBackground(new java.awt.Color(255, 255, 255));
        resultadoSalarioBasico.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        resultadoSalarioBasico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(resultadoSalarioBasico, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, 110, -1));

        botonCalcular.setBackground(new java.awt.Color(9, 132, 227));
        botonCalcular.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        botonCalcular.setForeground(new java.awt.Color(255, 255, 255));
        botonCalcular.setText("Calcular");
        botonCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(botonCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularActionPerformed
        int numHoras = Integer.parseInt(inputHoras.getText());
        float valorHora = Integer.parseInt(inputValorHora.getText());
        
        calculadoraNomina = new Nomina(numHoras, valorHora);
        
        float subsidio = calculadoraNomina.obtenerSubsidio();
        float salarioBasico = calculadoraNomina.calcSalarioBasico();
        float retencion = calculadoraNomina.obtenerRetencion();
        float pagoTotal = calculadoraNomina.TotalAPagar();
        
        resultadoSubsidio.setText(convertirAString(subsidio));
        resultadoSalarioBasico.setText(convertirAString(salarioBasico));
        resultadoRetencion.setText(convertirAString(retencion));
        txtfieldPagoTotal.setText(convertirAString(pagoTotal));    
    }//GEN-LAST:event_botonCalcularActionPerformed
 
    public String convertirAString(float numero) {
        return String.valueOf(numero);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCalcular;
    private javax.swing.JLabel dataLabel1;
    private javax.swing.JTextField inputHoras;
    private javax.swing.JTextField inputValorHora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelHoras1;
    private javax.swing.JLabel labelHoras2;
    private javax.swing.JLabel labelHoras4;
    private javax.swing.JLabel labelPagoTotal;
    private javax.swing.JLabel labelResultados;
    private javax.swing.JLabel labelSubsidio;
    private javax.swing.JLabel labelValorHora;
    private javax.swing.JTextField resultadoRetencion;
    private javax.swing.JTextField resultadoSalarioBasico;
    private javax.swing.JTextField resultadoSubsidio;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtfieldPagoTotal;
    // End of variables declaration//GEN-END:variables
}
