package Matriz;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Funciones extends javax.swing.JFrame {

    public Funciones(String filas, String columnas) {
        initComponents();
        
        int num_filas = Integer.parseInt(filas) + 1;
        int num_columnas = Integer.parseInt(columnas) + 1;
        
        int matriz1[][] = new int[num_filas][num_columnas];
        int matriz2[][] = new int[num_filas][num_columnas];
        
        
        for (int x = 0; x < matriz1.length; x++) {
            for (int y = 0; y < matriz1[x].length; y++) {
                matriz1[x][y] = 0;
                
                DefaultTableModel modelo = new DefaultTableModel(x, y);
                jTable1.setModel(modelo);
            }
        }
        
        for (int x = 0; x < matriz2.length; x++) {
            for (int y = 0; y < matriz2[x].length; y++) {
                matriz2[x][y] = 0;
                
                DefaultTableModel modelo = new DefaultTableModel(x, y);
                jTable2.setModel(modelo);
            }
        }
        }
    
    // Método para leer los datos de la primera matriz
    public float [][] leerTablaA() {
        int nFilas = jTable1.getRowCount();
        int nColumnas = jTable1.getColumnCount();
        float[][] matriz = new float[nFilas][nColumnas];
        
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                try {
                    if (String.valueOf(jTable1.getValueAt(i, j)).equals("")) {
                        jTable1.setValueAt(0, i, j);
                        matriz[i][j] = Float.parseFloat(String.valueOf(jTable1.getValueAt(i, j)));
                    } else {
                        matriz[i][j] = Float.parseFloat(String.valueOf(jTable1.getValueAt(i, j)));
                    }
                } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "La Columnas deben ser numericos al igual que las filas", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        return matriz;
    }
    
    // Método para leer los datos de la segunda matriz
    public float[][] leerTablaB() {
        int nFilas = jTable2.getRowCount();
        int nColumnas = jTable2.getColumnCount();
        float[][] matriz = new float[nFilas][nColumnas];
        
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                try {
                    if (String.valueOf(jTable2.getValueAt(i, j)).equals("")) {
                        jTable2.setValueAt(0, i, j);
                        matriz[i][j] = Float.parseFloat(String.valueOf(jTable2.getValueAt(i, j)));
                    } else {
                        matriz[i][j] = Float.parseFloat(String.valueOf(jTable2.getValueAt(i, j)));
                    }
                } catch (Exception e) { 
                JOptionPane.showMessageDialog(null, "La Columnas deben ser numericos al igual que las filas", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        return matriz;
    }
    
        // Método para sumar matrices
    public float[][] sumarMatrices(float matrizA[][], float matrizB[][], int nFilas, int nColumnas) {
        float[][] matrizC = new float[nFilas][nColumnas];

        for (int iFilas = 0; iFilas < nFilas; iFilas++) {
            for (int iColumnas = 0; iColumnas < nColumnas; iColumnas++) {
                matrizC[iFilas][iColumnas] =
                        matrizA[iFilas][iColumnas] + matrizB[iFilas][iColumnas];
            }
        }
        
        DefaultTableModel tablaC = (DefaultTableModel) jTable3.getModel();
        tablaC.setRowCount(matrizC.length);
        tablaC.setColumnCount(matrizC[0].length);
        
        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC[0].length; j++) {
                jTable3.setValueAt(matrizC[i][j], i, j);
            }
        }
        return matrizC;
    }
    
    // Método para restar matrices
    public float[][] restarMatrices(float matrizA[][], float matrizB[][], int nFilas, int nColumnas) {
        float[][] matrizC = new float[nFilas][nColumnas];

        for (int iFilas = 0; iFilas < nFilas; iFilas++) {
            for (int iColumnas = 0; iColumnas < nColumnas; iColumnas++) {
                matrizC[iFilas][iColumnas] =
                        matrizA[iFilas][iColumnas] - matrizB[iFilas][iColumnas];
            }
        }
        
        DefaultTableModel tablaC = (DefaultTableModel) jTable3.getModel();
        tablaC.setRowCount(matrizC.length);
        tablaC.setColumnCount(matrizC[0].length);
        
        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC[0].length; j++) {
                jTable3.setValueAt(matrizC[i][j], i, j);
            }
        }
        return matrizC;
    }
    
    // Método para multiplicar matrices
    public float[][] multiplicarMatrices(float matrizA[][], float matrizB[][], int nFilas, int nColumnas) {
        float[][] matrizC = new float[nFilas][nColumnas];

        for (int iFilas = 0; iFilas < nFilas; iFilas++) {
            for (int iColumnas = 0; iColumnas < nColumnas; iColumnas++) {
                matrizC[iFilas][iColumnas] =
                        matrizA[iFilas][iColumnas] * matrizB[iFilas][iColumnas];
            }
        }
        
        DefaultTableModel tablaC = (DefaultTableModel) jTable3.getModel();
        tablaC.setRowCount(matrizC.length);
        tablaC.setColumnCount(matrizC[0].length);
        
        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC[0].length; j++) {
                jTable3.setValueAt(matrizC[i][j], i, j);
            }
        }
        return matrizC;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ventana1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Ventana2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Resultado = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        BtSuma = new javax.swing.JButton();
        BTResta = new javax.swing.JButton();
        BTMultiplicacion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Funciones");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Ventana1.setViewportView(jTable1);

        Ventana2.setToolTipText("");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Ventana2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Resultado.setViewportView(jTable3);

        BtSuma.setText("Suma");
        BtSuma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtSumaMouseClicked(evt);
            }
        });
        BtSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSumaActionPerformed(evt);
            }
        });

        BTResta.setText("Resta");
        BTResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTRestaActionPerformed(evt);
            }
        });

        BTMultiplicacion.setText("Multiplicacion");
        BTMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTMultiplicacionActionPerformed(evt);
            }
        });

        jLabel1.setText("Resultado");

        jLabel2.setText("Matriz A");

        jLabel3.setText("Matriz B");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Ventana1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Ventana2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(BtSuma)
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(BTResta))
                        .addGap(41, 41, 41)
                        .addComponent(BTMultiplicacion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ventana1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ventana2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTMultiplicacion)
                    .addComponent(BTResta)
                    .addComponent(BtSuma))
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSumaActionPerformed
        float[][] matrizA = leerTablaA();
        float[][] matrizB = leerTablaB();
        
        try {
            sumarMatrices(matrizA, matrizB, matrizA.length, matrizA[0].length);            
        } catch (NullPointerException e) {         
        }
    }//GEN-LAST:event_BtSumaActionPerformed

    private void BTRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTRestaActionPerformed
        float[][] matrizA = leerTablaA();
        float[][] matrizB = leerTablaB();
        
        try {
            restarMatrices(matrizA, matrizB, matrizA.length, matrizA[0].length);            
        } catch (NullPointerException e) { 
        }
    }//GEN-LAST:event_BTRestaActionPerformed

    private void BTMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTMultiplicacionActionPerformed
        float[][] matrizA = leerTablaA();
        float[][] matrizB = leerTablaB();
        
        try {
            multiplicarMatrices(matrizA, matrizB, matrizA.length, matrizA[0].length);            
        } catch (NullPointerException e) { 
        }
    }//GEN-LAST:event_BTMultiplicacionActionPerformed

    private void BtSumaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtSumaMouseClicked
        // TODO add your handling code here:jTable3.setModel(new DefaultTableModel(null, new String[]{"R"}));
 
    }//GEN-LAST:event_BtSumaMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTMultiplicacion;
    private javax.swing.JButton BTResta;
    private javax.swing.JButton BtSuma;
    private javax.swing.JScrollPane Resultado;
    private javax.swing.JScrollPane Ventana1;
    private javax.swing.JScrollPane Ventana2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
