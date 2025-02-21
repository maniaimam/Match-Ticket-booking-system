
import Classes.MatchListingData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author areeb
 */
public class MatchListings extends javax.swing.JFrame {
    
    LoginForm login = new LoginForm();
    /**
     * Creates new form MatchListings
     */
    public MatchListings(){
        initComponents();
        showData();
    }
    
    public void showData(){
        MatchListingData match = new MatchListingData();
        match.loadMatchList(tblMatchListings);
    }
    
    public void comboBoxEdit(){
        
        
        
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
        lblLogo = new javax.swing.JLabel();
        lblMTB = new javax.swing.JLabel();
        cbxDropDownMenu = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        lblMatchListing = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblCricketLogo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMatchListings = new javax.swing.JTable();
        btnBook = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(112, 128, 144));

        lblMTB.setFont(new java.awt.Font("Consolas", 3, 24)); // NOI18N
        lblMTB.setForeground(new java.awt.Color(255, 255, 255));
        lblMTB.setText("Match Ticket Booking");

        cbxDropDownMenu.setBackground(new java.awt.Color(112, 128, 144));
        cbxDropDownMenu.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        cbxDropDownMenu.setForeground(new java.awt.Color(255, 255, 255));
        cbxDropDownMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hi, ", " ", "Logout" }));
        cbxDropDownMenu.setBorder(null);
        cbxDropDownMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDropDownMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMTB, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 356, Short.MAX_VALUE)
                .addComponent(cbxDropDownMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMTB, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(cbxDropDownMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 90));

        jPanel2.setBackground(new java.awt.Color(230, 230, 250));

        lblMatchListing.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblMatchListing.setForeground(new java.awt.Color(124, 124, 124));
        lblMatchListing.setText("Match Listings");

        tblMatchListings.setBackground(new java.awt.Color(230, 230, 250));
        tblMatchListings.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(230, 230, 250)));
        tblMatchListings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Match", "City", "Date", "Time", "Stadium", "Seats", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMatchListings.setGridColor(new java.awt.Color(230, 230, 250));
        tblMatchListings.setOpaque(false);
        tblMatchListings.setShowGrid(false);
        tblMatchListings.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblMatchListings);
        if (tblMatchListings.getColumnModel().getColumnCount() > 0) {
            tblMatchListings.getColumnModel().getColumn(0).setResizable(false);
            tblMatchListings.getColumnModel().getColumn(1).setResizable(false);
            tblMatchListings.getColumnModel().getColumn(2).setResizable(false);
            tblMatchListings.getColumnModel().getColumn(3).setResizable(false);
            tblMatchListings.getColumnModel().getColumn(4).setResizable(false);
            tblMatchListings.getColumnModel().getColumn(5).setResizable(false);
            tblMatchListings.getColumnModel().getColumn(6).setResizable(false);
        }

        btnBook.setBackground(new java.awt.Color(124, 124, 124));
        btnBook.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBook.setForeground(new java.awt.Color(255, 255, 255));
        btnBook.setText("Book");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblCricketLogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMatchListing)
                        .addGap(335, 335, 335))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(358, 358, 358))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCricketLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMatchListing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 83, 821, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxDropDownMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDropDownMenuActionPerformed
        // TODO add your handling code here:
        int boxNumber = cbxDropDownMenu.getSelectedIndex();
        if(boxNumber == 1){
            
        }
    }//GEN-LAST:event_cbxDropDownMenuActionPerformed

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        // TODO add your handling code here:
        if(tblMatchListings.getSelectedRowCount() != 1){
            JOptionPane.showMessageDialog(this, "One Match must be selected");
        }
        else{
            
            int row = tblMatchListings.getSelectedRow();
            String[] selectedRowData = new String[tblMatchListings.getColumnCount()];
            
            DefaultTableModel model = (DefaultTableModel)tblMatchListings.getModel();
            
            for(int i = 0; i < tblMatchListings.getColumnCount(); i++){
                
                selectedRowData[i] = model.getValueAt(row, i).toString();
                
            }

        }
    }//GEN-LAST:event_btnBookActionPerformed

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
            java.util.logging.Logger.getLogger(MatchListings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatchListings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatchListings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatchListings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatchListings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBook;
    private javax.swing.JComboBox<String> cbxDropDownMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCricketLogo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMTB;
    private javax.swing.JLabel lblMatchListing;
    private javax.swing.JTable tblMatchListings;
    // End of variables declaration//GEN-END:variables
}
