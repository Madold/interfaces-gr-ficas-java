/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Persona;

/**
 *
 * @author sistemas03
 */
public class Formulario extends javax.swing.JFrame {

    /**
     * Creates new form Formulario
     */
    public Formulario() {
        initComponents();

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        textfieldNombre = new javax.swing.JTextField();
        labelEdad = new javax.swing.JLabel();
        textfieldEdad = new javax.swing.JTextField();
        labelSexo = new javax.swing.JLabel();
        comboboxSexo = new javax.swing.JComboBox<>();
        labelEstaura = new javax.swing.JLabel();
        textfieldEstatura = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textareaResultados = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        labelPeso = new javax.swing.JLabel();
        textfieldPeso = new javax.swing.JTextField();
        botonVerificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulario de admisión de deportes");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(16, 172, 132));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Formulario de admisión de deportes");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 12, -1, -1));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 12, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unicordoba_logo.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, -1));

        labelNombre.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(255, 255, 255));
        labelNombre.setText("Nombre:");
        jPanel1.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));
        jPanel1.add(textfieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 80, -1));

        labelEdad.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        labelEdad.setForeground(new java.awt.Color(255, 255, 255));
        labelEdad.setText("Edad:");
        jPanel1.add(labelEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));
        jPanel1.add(textfieldEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 90, -1));

        labelSexo.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        labelSexo.setForeground(new java.awt.Color(255, 255, 255));
        labelSexo.setText("Sexo:");
        jPanel1.add(labelSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        comboboxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        jPanel1.add(comboboxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        labelEstaura.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        labelEstaura.setForeground(new java.awt.Color(255, 255, 255));
        labelEstaura.setText("Estatura: ");
        jPanel1.add(labelEstaura, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));
        jPanel1.add(textfieldEstatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 90, -1));

        textareaResultados.setEditable(false);
        textareaResultados.setColumns(20);
        textareaResultados.setRows(5);
        jScrollPane1.setViewportView(textareaResultados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 370, 180));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Resultados: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        labelPeso.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        labelPeso.setForeground(new java.awt.Color(255, 255, 255));
        labelPeso.setText("Peso: ");
        jPanel1.add(labelPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));
        jPanel1.add(textfieldPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 80, -1));

        botonVerificar.setBackground(new java.awt.Color(255, 255, 255));
        botonVerificar.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        botonVerificar.setForeground(new java.awt.Color(16, 172, 132));
        botonVerificar.setText("Verificar");
        botonVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerificarActionPerformed(evt);
            }
        });
        jPanel1.add(botonVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerificarActionPerformed
        String nombre;
        int edad;
        String sexo;
        float estatura;
        float peso;

        nombre = textfieldNombre.getText();
        edad = Integer.parseInt(textfieldEdad.getText());
        sexo = comboboxSexo.getSelectedItem().toString();
        estatura = Float.parseFloat(textfieldEstatura.getText());
        peso = Float.parseFloat(textfieldPeso.getText());
        
        Persona participante = new Persona(nombre, sexo, edad, estatura, peso);
        
        String resultadoAdmisionEnFutbol = participante.admitidoEnFutbol();
        String resultadoAdmisionEnBasket = participante.admitidoEnBasket();
        String resultadoAdmisionEnVoleibol = participante.admitidoEnVoleibol();
        
        String resultados = "Participante " + nombre + "\n"
                + resultadoAdmisionEnFutbol + "\n"
                + resultadoAdmisionEnBasket + "\n"
                + resultadoAdmisionEnVoleibol;
        
        mostrarResultados(resultados);
        
    }//GEN-LAST:event_botonVerificarActionPerformed

    private void mostrarResultados(String resultados) {
        textareaResultados.setText(resultados);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonVerificar;
    private javax.swing.JComboBox<String> comboboxSexo;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelEdad;
    private javax.swing.JLabel labelEstaura;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPeso;
    private javax.swing.JLabel labelSexo;
    private javax.swing.JTextArea textareaResultados;
    private javax.swing.JTextField textfieldEdad;
    private javax.swing.JTextField textfieldEstatura;
    private javax.swing.JTextField textfieldNombre;
    private javax.swing.JTextField textfieldPeso;
    // End of variables declaration//GEN-END:variables
  
}
