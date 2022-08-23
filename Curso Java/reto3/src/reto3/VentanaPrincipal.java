
package reto3;


public class VentanaPrincipal extends javax.swing.JFrame {

    
    public VentanaPrincipal() {
        initComponents();
    }
    CuerpoDeAgua[] Vector = new CuerpoDeAgua[50];
    int j = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        municipio = new javax.swing.JTextField();
        irca = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        tipoAgua = new javax.swing.JTextField();
        tipoDeCuerpoAgua = new javax.swing.JTextField();
        btnprocesar = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Municipio");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));
        getContentPane().add(municipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 140, 30));
        getContentPane().add(irca, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 140, 30));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 140, 30));

        jLabel2.setText("IRCA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        jLabel3.setText("ID Cuerpo de Agua");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jLabel4.setText("Salidas");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));

        jLabel5.setText("Tipo de Agua");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel6.setText("Tipo de Cuerpo de Agua");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));
        getContentPane().add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 140, 30));
        getContentPane().add(tipoAgua, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 140, 30));
        getContentPane().add(tipoDeCuerpoAgua, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 140, 30));

        btnprocesar.setText("Procesar");
        btnprocesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprocesarActionPerformed(evt);
            }
        });
        getContentPane().add(btnprocesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 110, -1));

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 110, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 310, 180));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 300, 180));

        jLabel7.setText("Nombre");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel8.setText("Entradas");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        
         // TODO add your handling code here:
        String nombre = campoNombre.getText();
        campoNombre.setText("");
        String idc = id.getText();
        id.setText("");
        String muni = municipio.getText();
        municipio.setText("");
        String tipodeAgua = tipoAgua.getText();
        tipoAgua.setText("");
        String tipodeCuerpo = tipoDeCuerpoAgua.getText();
        tipoDeCuerpoAgua.setText("");
        String irc = irca.getText();
        irca.setText("");
        jTextArea1.append(
                nombre + " " +
                idc + " " +
                muni + " " +
                irc + " " +
                tipodeAgua +" " + 
                tipodeCuerpo + 
                "\n"
        );
        Vector[j] = new CuerpoDeAgua(nombre,
                Integer.parseInt(idc),
                muni,
                Float.parseFloat(irc),
                tipodeAgua,
                tipodeCuerpo
        );
        j++;
        
        
        
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnprocesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprocesarActionPerformed
         jTextArea2.setText("");
        int cont = 0;
        int contM = 0;
        String riesgo;
        
        for (int i = 0; i < j; i++) {
            //ejectuamos el metodo nivel
            riesgo = Vector[i].nivel();
            jTextArea2.append(riesgo + "\n");
            //encontramos los que son inferiores o iguales a medio
            if(Vector[i].getIrca()>=0 && Vector[i].getIrca() <= 35){
                cont++;
            }
            //encontramos la cantidad de medios
            if("MEDIO".equals(riesgo)){
                contM++;
            }
        }
        //imprimimos el cont
        jTextArea2.append(cont + "\n");
        //Encontramos los que son medio y los imprimimos
        if(contM > 0){
            for (int i = 0; i < j; i++) {
                riesgo = Vector[i].nivel();
                if("MEDIO".equals(riesgo)){
                    jTextArea2.append(Vector[i].getNombre()+" ");
                }
            }
        }else{
            //imprimimos NA
            jTextArea2.append("NA");
        }
        
        //Encontrar el menor
        float menor = Vector[0].getIrca();
        String nomb = Vector[0].getNombre();
        int cod = Vector[0].getCodigo();
        for (int i = 0; i < j; i++) {
             if (Vector[i].getIrca() < menor){
                 menor = Vector[i].getIrca();
                 nomb = Vector[i].getNombre();
                 cod = Vector[i].getCodigo();
             }
        }        
        
        jTextArea2.append("\n" + nomb + " " + cod);
          
        
        
    }//GEN-LAST:event_btnprocesarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnprocesar;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField id;
    private javax.swing.JTextField irca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField municipio;
    private javax.swing.JTextField tipoAgua;
    private javax.swing.JTextField tipoDeCuerpoAgua;
    // End of variables declaration//GEN-END:variables
}
