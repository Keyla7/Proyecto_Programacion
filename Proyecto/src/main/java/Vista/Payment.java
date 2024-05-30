/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.Factura;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author kylea
 */
public class Payment extends javax.swing.JFrame {

    TableRowSorter<TableModel>sorter;
    
    /**
     * Creates new form Payment
     */
    public Payment() {
        initComponents();
        chargeCombo();
    }
    public void escuchar(ActionListener manejador){
        this.btSearch.addActionListener(manejador);
        this.btSalir3.addActionListener(manejador);
    }
    public Factura getFactura(){
     int idCliente = Integer.parseInt(this.txtID.getText());
     int idFactura=Integer.parseInt(this.txtInvoice.getText());
     String fecha = this.txtDate.getText();
     String nombre=this.txtNombre.getText();
     String metodoPago=getComboSelectedItem();
     double pagoTotal =Double.parseDouble(this.txtAmount.getText());
     return new Factura(idCliente,idFactura,fecha,nombre,metodoPago,pagoTotal);
    }
    public void setDataTable(String[][] data ){
        String[] encabezado = {"ID","Date","Nombre","Telefono","Payment Method","Amount to pay","Invoice ID"};
        DefaultTableModel model = new DefaultTableModel(data, encabezado);
        this.tblPayment.setModel(model);
        
        this.tblPayment.setAutoCreateRowSorter(true); //indica a latabla que en cada una de las filas se van a crear un filtro
        this.sorter= new TableRowSorter<>(model);//se crea la instancia y se pasa el modelo que seria basicamente la tabla
        this.tblPayment.setRowSorter(sorter);//aqui la tabla ya tendría los filtros
        
        this.jScrollPane1.setViewportView(this.tblPayment);
    }
    public void Limpiar(){
        txtDate.setText("");
        txtID.setText("");
        txtInvoice.setText("");
        txtNombre.setText("");
        txtTelefono.setText("");
        txtAmount.setText("");
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
        jSeparator8 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        btSalir3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPayment = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        cBoxPay = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        txtInvoice = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator8.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator8.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 210, 10));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("Payment");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 140, 50));

        btSalir3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btSalir3.setText("X");
        btSalir3.setBorder(null);
        btSalir3.setFocusPainted(false);
        btSalir3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btSalir3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btSalir3MouseExited(evt);
            }
        });
        jPanel1.add(btSalir3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 30, 30));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

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
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 210, 20));

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 210, 10));

        btSearch.setBackground(new java.awt.Color(255, 51, 51));
        btSearch.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btSearch.setForeground(new java.awt.Color(51, 51, 51));
        btSearch.setText("Add");
        btSearch.setBorder(null);
        btSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btSearchMouseExited(evt);
            }
        });
        jPanel1.add(btSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 50, 30));

        tblPayment.setBackground(new java.awt.Color(51, 51, 51));
        tblPayment.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tblPayment.setForeground(new java.awt.Color(204, 255, 255));
        tblPayment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Month", "Amount", "Payment Method"
            }
        ));
        tblPayment.setGridColor(new java.awt.Color(51, 51, 51));
        tblPayment.setSelectionBackground(new java.awt.Color(51, 51, 51));
        tblPayment.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(tblPayment);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 320, 300));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg3.jpeg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg3.jpeg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 230, 70));

        jSeparator2.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 10, 330));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Date");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        txtDate.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        txtDate.setForeground(new java.awt.Color(204, 204, 204));
        txtDate.setText("DD/MM/YY");
        txtDate.setBorder(null);
        txtDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDateMouseClicked(evt);
            }
        });
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });
        jPanel1.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 210, 20));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 210, 10));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        txtNombre.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtNombre.setText("..........");
        txtNombre.setBorder(null);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 210, 20));

        jSeparator4.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator4.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 210, 10));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Phone Number");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        txtTelefono.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(204, 204, 204));
        txtTelefono.setText("0000-0000");
        txtTelefono.setBorder(null);
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 210, 20));

        jSeparator5.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 210, 10));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Payment Method");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jSeparator6.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator6.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 210, 10));

        cBoxPay.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        cBoxPay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "SinpeMovil", "Card" }));
        cBoxPay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cBoxPayMouseClicked(evt);
            }
        });
        jPanel1.add(cBoxPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 210, 20));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Amount to Pay");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        txtAmount.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        txtAmount.setForeground(new java.awt.Color(204, 204, 204));
        txtAmount.setText("-----");
        txtAmount.setBorder(null);
        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });
        jPanel1.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 210, 20));

        jSeparator7.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator7.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 210, 10));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Invoice ID");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jSeparator9.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator9.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 210, 10));

        txtInvoice.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        txtInvoice.setForeground(new java.awt.Color(204, 204, 204));
        txtInvoice.setText("-----");
        txtInvoice.setBorder(null);
        txtInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInvoiceActionPerformed(evt);
            }
        });
        jPanel1.add(txtInvoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 210, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void chargeCombo(){
        String[] metodos = {"Cash","SinpeMovil","Card"};
        cBoxPay.setModel(new DefaultComboBoxModel<String>(metodos));
    }
    public String getComboSelectedItem(){
        return cBoxPay.getSelectedItem().toString();
    }
    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void btSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSearchMouseEntered
        btSearch.setBackground(Color.DARK_GRAY);
        btSearch.setForeground(new java.awt.Color(222, 222, 222));
    }//GEN-LAST:event_btSearchMouseEntered

    private void btSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSearchMouseExited
        btSearch.setBackground(new java.awt.Color(255, 51, 51));
        btSearch.setForeground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_btSearchMouseExited

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountActionPerformed

    private void cBoxPayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cBoxPayMouseClicked
        this.cBoxPay.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_cBoxPayMouseClicked

    private void txtIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDMouseClicked
        if (txtID.getText().equals("Ingrese el ID")) {
            txtID.setText(""); 
            txtID.setForeground(Color.DARK_GRAY);
        }
        if (txtDate.getText().isEmpty()) {
            txtDate.setText("DD/MM/YY");
            txtDate.setForeground(Color.LIGHT_GRAY);
        }
        
    }//GEN-LAST:event_txtIDMouseClicked

    private void txtDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDateMouseClicked
        if (txtDate.getText().equals("DD/MM/YY")) {
            txtDate.setText(""); 
            txtDate.setForeground(Color.DARK_GRAY);
        }
        if (txtID.getText().isEmpty()) {
            txtID.setText("Ingrese el ID");
            txtID.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_txtDateMouseClicked

    private void btSalir3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalir3MouseEntered
        btSalir3.setBackground(new java.awt.Color(255, 51, 51));
        btSalir3.setForeground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_btSalir3MouseEntered

    private void btSalir3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalir3MouseExited
        btSalir3.setBackground(Color.DARK_GRAY);
        btSalir3.setForeground(new java.awt.Color(222, 222, 222));
    }//GEN-LAST:event_btSalir3MouseExited

    private void txtInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInvoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInvoiceActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalir3;
    private javax.swing.JButton btSearch;
    private javax.swing.JComboBox<String> cBoxPay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable tblPayment;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtInvoice;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
