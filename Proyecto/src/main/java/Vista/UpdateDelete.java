/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.Cliente;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author kylea
 */
public class UpdateDelete extends javax.swing.JFrame {

    /**
     * Creates new form UpdateDelete
     */
    public UpdateDelete() {
        initComponents();
    }

    public void escuchar(ActionListener manejador) {
        this.btUpdate.addActionListener(manejador);
        this.btDelete.addActionListener(manejador);
        this.btSearch.addActionListener(manejador);
        this.btSalir2.addActionListener(manejador);
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
        jSeparator7 = new javax.swing.JSeparator();
        btSalir2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btSearch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtMember = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txtPayment = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        btUpdate = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator7.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator7.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 10, 260));

        btSalir2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btSalir2.setText("X");
        btSalir2.setBorder(null);
        btSalir2.setFocusPainted(false);
        btSalir2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btSalir2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btSalir2MouseExited(evt);
            }
        });
        jPanel1.add(btSalir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 30, 30));

        jLabel11.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        jLabel11.setText("Updete & Delete");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 210, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg3.jpeg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 70));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        txtID.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        txtID.setForeground(new java.awt.Color(204, 204, 204));
        txtID.setText("Ingrese el ID");
        txtID.setBorder(null);
        txtID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIDMouseClicked(evt);
            }
        });
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 210, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 210, 10));

        btSearch.setBackground(new java.awt.Color(255, 51, 51));
        btSearch.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        btSearch.setForeground(new java.awt.Color(51, 51, 51));
        btSearch.setText("Search");
        btSearch.setBorder(null);
        btSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btSearchMouseExited(evt);
            }
        });
        jPanel1.add(btSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 50, 30));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("First Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        txtNombre.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtNombre.setText("..........");
        txtNombre.setBorder(null);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 270, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 270, 0));

        jSeparator3.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator3.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 270, 10));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Last Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        txtApellido.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(204, 204, 204));
        txtApellido.setText("..........");
        txtApellido.setBorder(null);
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 270, 20));

        jSeparator4.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator4.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 270, 10));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Edad");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        txtEdad.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(204, 204, 204));
        txtEdad.setText("..........");
        txtEdad.setBorder(null);
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 270, 20));

        jSeparator5.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator5.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 270, 10));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Telefono");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        txtTelefono.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(204, 204, 204));
        txtTelefono.setText("0000-0000");
        txtTelefono.setBorder(null);
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 270, 20));

        jSeparator6.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator6.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 270, 10));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Membership Category");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        txtMember.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        txtMember.setForeground(new java.awt.Color(204, 204, 204));
        txtMember.setText("..........");
        txtMember.setBorder(null);
        jPanel1.add(txtMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 190, 20));

        jSeparator8.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator8.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 190, 10));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Payment Plan");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));

        txtPayment.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        txtPayment.setForeground(new java.awt.Color(204, 204, 204));
        txtPayment.setText("..........");
        txtPayment.setBorder(null);
        jPanel1.add(txtPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 200, 20));

        jSeparator9.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator9.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 200, 10));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Height");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, -1));

        txtHeight.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        txtHeight.setForeground(new java.awt.Color(204, 204, 204));
        txtHeight.setText("cm");
        txtHeight.setBorder(null);
        jPanel1.add(txtHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 200, 20));

        jSeparator10.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator10.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 200, 10));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Weight");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, -1));

        txtWeight.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        txtWeight.setForeground(new java.awt.Color(204, 204, 204));
        txtWeight.setText("Kg");
        txtWeight.setBorder(null);
        jPanel1.add(txtWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 200, 20));

        jSeparator11.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator11.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 200, 10));

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btUpdate.setBackground(new java.awt.Color(255, 51, 51));
        btUpdate.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btUpdate.setForeground(new java.awt.Color(51, 51, 51));
        btUpdate.setText("Update");
        btUpdate.setBorder(null);
        btUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btUpdateMouseExited(evt);
            }
        });
        jPanel2.add(btUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 30));

        btDelete.setBackground(new java.awt.Color(255, 51, 51));
        btDelete.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btDelete.setForeground(new java.awt.Color(51, 51, 51));
        btDelete.setText("Delete");
        btDelete.setBorder(null);
        btDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btDeleteMouseExited(evt);
            }
        });
        jPanel2.add(btDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 120, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 550, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void btUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btUpdateMouseEntered
        btUpdate.setBackground(Color.DARK_GRAY);
        btUpdate.setForeground(new java.awt.Color(222, 222, 222));
    }//GEN-LAST:event_btUpdateMouseEntered

    private void btUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btUpdateMouseExited
        btUpdate.setBackground(new java.awt.Color(255, 51, 51));
        btUpdate.setForeground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_btUpdateMouseExited

    private void btDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDeleteMouseEntered
        btDelete.setBackground(Color.DARK_GRAY);
        btDelete.setForeground(new java.awt.Color(222, 222, 222));
    }//GEN-LAST:event_btDeleteMouseEntered

    private void btDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDeleteMouseExited
        btDelete.setBackground(new java.awt.Color(255, 51, 51));
        btDelete.setForeground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_btDeleteMouseExited

    private void btSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSearchMouseEntered
        btSearch.setBackground(Color.DARK_GRAY);
        btSearch.setForeground(new java.awt.Color(222, 222, 222));
    }//GEN-LAST:event_btSearchMouseEntered

    private void btSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSearchMouseExited
        btSearch.setBackground(new java.awt.Color(255, 51, 51));
        btSearch.setForeground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_btSearchMouseExited

    private void btSalir2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalir2MouseEntered
        btSalir2.setBackground(new java.awt.Color(255, 51, 51));
        btSalir2.setForeground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_btSalir2MouseEntered

    private void btSalir2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalir2MouseExited
        btSalir2.setBackground(Color.DARK_GRAY);
        btSalir2.setForeground(new java.awt.Color(222, 222, 222));
    }//GEN-LAST:event_btSalir2MouseExited

    private void txtIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDMouseClicked
        if (txtID.getText().equals("Ingrese el ID")) {
            txtID.setText("");
            txtID.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_txtIDMouseClicked
    public void chargeClient(Cliente cliente) {
        txtEdad.setText(cliente.getEdad() + "");
        txtHeight.setText(cliente.getAltura() + "");
        txtApellido.setText(cliente.getApellido());
        txtMember.setText(cliente.getCategoria());
        txtNombre.setText(cliente.getNombre());
        txtPayment.setText(cliente.getPaymentPlan());
        txtTelefono.setText(cliente.getTelefono() + "");
        txtWeight.setText(cliente.getPeso() + "");
    }
    public Cliente getCliente() {
     int id=Integer.parseInt(txtID.getText());
     String nombre = txtNombre.getText();
     String apellido =txtApellido.getText();
     int edad=Integer.parseInt(txtEdad.getText());
     int telefono =Integer.parseInt(txtTelefono.getText());
     String categoria=txtMember.getText();
     String paymentPlan=txtPayment.getText();
     double altura =Double.parseDouble(txtHeight.getText());
     double peso=Double.parseDouble(txtWeight.getText());
       return new Cliente(id, nombre, apellido, edad, telefono, categoria, paymentPlan, altura, peso);
    }
    /**
     * @param args the command line arguments
     */

    public String getTxtID() {
        return txtID.getText();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btSalir2;
    private javax.swing.JButton btSearch;
    private javax.swing.JButton btUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMember;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPayment;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
