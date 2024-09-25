/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Application;

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(Button, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActionPerformed
        String text = TextArea.getText().toString();
        if(text.charAt(0) != '1' || text.charAt(0) != '0')
        {
            for(int i = 0;i < text.length(); i++)
            {
                switch(text.charAt(i)) {
                    case 'a':
                        System.out.print("01100001 ");
                    break;
                    case 'b':
                        System.out.print("01100010 ");
                    break;
                    case 'c':
                        System.out.print("01100011 ");
                    break;
                    case 'd':
                        System.out.print("01100100 ");
                    break;
                    case 'e':
                        System.out.print("01100101 ");
                    break;
                    case 'f':
                        System.out.print("01100110");
                    break;
                    case 'g':
                        System.out.print("01100111 ");
                    break;
                    case 'h':
                        System.out.print("01101000 ");
                    break;
                    case 'i':
                        System.out.print("01101001 ");
                    break;
                    case 'j':
                        System.out.print("01101010");
                    break;
                    case 'k':
                        System.out.print("01101011 ");
                    break;
                    case 'l':
                        System.out.print("01101100");
                    break;
                    case 'm':
                        System.out.print("01101101 ");
                    break;
                    case 'n':
                        System.out.print("01101110 ");
                    break;
                    case 'o':
                        System.out.print("01101111 ");
                    break;
                    case 'p':
                        System.out.print("01110000 ");
                    break;
                    case 'q':
                        System.out.print("01110001 ");
                    break;
                    case 'r':
                        System.out.print("01110010 ");
                    break;
                    case 's':
                        System.out.print("01110011 ");
                    break;
                    case 't':
                        System.out.print("01110100 ");
                    break;
                    case 'u':
                        System.out.print("01110101 ");
                    break;
                    case 'v':
                        System.out.print("01110110 ");
                    break;
                    case 'w':
                        System.out.print("01110111 ");
                    break;
                    case 'x':
                        System.out.print("01111000 ");
                    break;
                    case 'y':
                        System.out.pring("01111001 ");
                    break;
                    case 'z':
                        System.out.print("01111010 ");
                    break;
                    case ' ':
                        System.out.print("00100000 ");
                    break;
                         
                           
                }
            }
        }
        else {
            String[] toCon = text.split(" ");
            for(String a: toCon) {
                switch(a) {
                    case "01100001":
                        TextArea.setText("a");
                        break;
                    case "01100010":
                        TextArea.setText("b");
                    break;
                    case "01100011":
                        System.out.print('c');
                    break;
                    case "01100100":
                        System.out.print('d');
                    break;
                    case "01100101":
                        System.out.print('e');
                    break;
                    case "01100110":
                        System.out.print('f');
                    break;
                    case "01100111":
                        System.out.print('g');
                    break;
                    case "01101000":
                        System.out.print('h');
                    break;
                    case "01101001":
                        System.out.print('i');
                    break;
                    case "01101010":
                        System.out.print('j');
                    break;
                    case "01101011":
                        System.out.print('k');
                    break;
                    case "01101100":
                        System.out.print('l');
                    break;
                    case "01101101":
                        System.out.print('m');
                    break;
                    case "01101110":
                        System.out.print('n');
                    break;
                    case "01101111":
                        System.out.print('o');
                    break;
                    case "01110000":
                        System.out.print('p');
                    break;
                    case "01110001":
                        System.out.print('q');
                    break;
                    case "01110010":
                        System.out.print('r');
                    break;
                    case "01110011":
                        System.out.print('s');
                    break;
                    case "01110100":
                        System.out.print('t');
                    break;
                    case "01110101":
                        System.out.print('u');
                    break;
                    case "01110110":
                        System.out.print('v');
                    break;
                    case "01110111":
                        System.out.print('w');
                    break;
                    case "01111000":
                        System.out.print('x');
                    break;
                    case "01111001":
                        System.out.print('y');
                    break;
                    case "01111010":
                        System.out.print('z');
                    break;
                    case "00100000":
                        System.out.print(' ');
                    break;
                }
            }
            
        }
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
