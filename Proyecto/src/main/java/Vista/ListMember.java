/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.Cliente;
import Modelo.RegistroCliente;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kylea
 */
public class ListMember extends javax.swing.JFrame {
    
    private RegistroCliente registroC;

    /**
     * Creates new form ListMember
     */
    
    
    public ListMember() {
        initComponents();
        registroC = new RegistroCliente();
        ArrayList<Cliente> listaClientes = registroC.readFromJson();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for (Cliente c : listaClientes) {
            Object[] rowData = {
                c.getNombre(),
                c.getApellido(),
                c.getId(),
                c.getEdad(),
                c.getTelefono(),
                c.getCategoria(),
                c.getPaymentPlan(),
                c.getAltura(),
                c.getPeso()
            };
            model.addRow(rowData);
        }
        //setVisible(true);
    }
    
    public void escuchar(ActionListener manejador) {
        this.btSalir4.addActionListener(manejador);
    }
    
    public void clearTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btSalir4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("List of Members");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 230, 40));

        btSalir4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btSalir4.setText("X");
        btSalir4.setBorder(null);
        btSalir4.setFocusPainted(false);
        btSalir4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btSalir4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btSalir4MouseExited(evt);
            }
        });
        jPanel1.add(btSalir4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg3.jpeg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg3.jpeg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 440, 80));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last name", "ID", "Age", "Phone number", "Membership Category", "Payment Plan", "Height", "Weight"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 850, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSalir4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalir4MouseEntered
        btSalir4.setBackground(new java.awt.Color(255, 51, 51));
        btSalir4.setForeground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_btSalir4MouseEntered

    private void btSalir4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalir4MouseExited
        btSalir4.setBackground(Color.DARK_GRAY);
        btSalir4.setForeground(new java.awt.Color(222, 222, 222));
    }//GEN-LAST:event_btSalir4MouseExited

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalir4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
