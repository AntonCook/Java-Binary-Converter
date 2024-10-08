/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trustworthy;

/**
 *
 * @author dave
 */
public class Application extends javax.swing.JFrame {

    /**
     * Creates new form Application
     */
    public Application() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextArea.setColumns(20);
        TextArea.setLineWrap(true);
        TextArea.setRows(5);
        jScrollPane1.setViewportView(TextArea);

        Button.setText("Convert");
        Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(Button, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(Button, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActionPerformed
        String text = TextArea.getText().toString();
        TextArea.setText("");
        String output = "";
        if(text.charAt(0)!= '1' && text.charAt(0) != '0')
        {
            for(int i = 0;i < text.length(); i++)
            {
                switch(text.charAt(i)) {
                    case 'a':
                        output = output + "01100001 ";
                    break;
                    case 'b':
                        output = output + ("01100010 ");
                    break;
                    case 'c':
                        output = output + ("01100011 ");
                    break;
                    case 'd':
                        output = output + ("01100100 ");
                    break;
                    case 'e':
                        output = output + ("01100101 ");
                    break;
                    case 'f':
                        output = output + ("01100110 ");
                    break;
                    case 'g':
                        output = output + ("01100111 ");
                    break;
                    case 'h':
                        output = output + ("01101000 ");
                    break;
                    case 'i':
                        output = output + ("01101001 ");
                    break;
                    case 'j':
                        output = output + ("01101010 ");
                    break;
                    case 'k':
                        output = output + ("01101011 ");
                    break;
                    case 'l':
                        output = output + ("01101100 ");
                    break;
                    case 'm':
                        output = output + ("01101101 ");
                    break;
                    case 'n':
                        output = output + ("01101110 ");
                    break;
                    case 'o':
                        output = output + ("01101111 ");
                    break;
                    case 'p':
                        output = output + ("01110000 ");
                    break;
                    case 'q':
                        output = output + ("01110001 ");
                    break;
                    case 'r':
                        output = output + ("01110010 ");
                    break;
                    case 's':
                        output = output + ("01110011 ");
                    break;
                    case 't':
                        output = output + ("01110100 ");
                    break;
                    case 'u':
                        output = output + ("01110101 ");
                    break;
                    case 'v':
                        output = output + ("01110110 ");
                    break;
                    case 'w':
                        output = output + ("01110111 ");
                    break;
                    case 'x':
                        output = output + ("01111000 ");
                    break;
                    case 'y':
                        output = output + ("01111001 ");
                    break;
                    case 'z':
                        output = output + ("01111010 ");
                    break;
                    case ' ':
                        output = output + ("00100000 ");
                    break;
                         
                           
                }
            }
        }
        else {
            String[] toCon = text.split("\s");
            for(int i = 0; i < toCon.length; i++) {
                switch(toCon[i]) {
                    case "01100001":
                        output = output + ("a");
                        break;
                    case "01100010":
                        output = output + ("b");
                    break;
                    case "01100011":
                        output = output + ('c');
                    break;
                    case "01100100":
                        output = output + ('d');
                    break;
                    case "01100101":
                        output = output + ('e');
                    break;
                    case "01100110":
                        output = output + ('f');
                    break;
                    case "01100111":
                        output = output + ('g');
                    break;
                    case "01101000":
                        output = output + ('h');
                    break;
                    case "01101001":
                        output = output + ('i');
                    break;
                    case "01101010":
                        output = output + ('j');
                    break;
                    case "01101011":
                        output = output + ('k');
                    break;
                    case "01101100":
                        output = output + ('l');
                    break;
                    case "01101101":
                        output = output + ('m');
                    break;
                    case "01101110":
                        output = output + ('n');
                    break;
                    case "01101111":
                        output = output + ('o');
                    break;
                    case "01110000":
                        output = output + ('p');
                    break;
                    case "01110001":
                        output = output + ('q');
                    break;
                    case "01110010":
                        output = output + ('r');
                    break;
                    case "01110011":
                        output = output + ('s');
                    break;
                    case "01110100":
                        output = output + ('t');
                    break;
                    case "01110101":
                        output = output + ('u');
                    break;
                    case "01110110":
                        output = output + ('v');
                    break;
                    case "01110111":
                        output = output + ('w');
                    break;
                    case "01111000":
                        output = output + ('x');
                    break;
                    case "01111001":
                        output = output + ('y');
                    break;
                    case "01111010":
                        output = output + ('z');
                    break;
                    case "00100000":
                        output = output + (' ');
                    break;
                }
            }
            
        }
        TextArea.setText(output);
    }//GEN-LAST:event_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Application().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
