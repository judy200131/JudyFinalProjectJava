
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 2ndyrGroupB
 */
public class Student extends javax.swing.JFrame {

    String gender;

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    /**
     * Creates new form Student
     */
    public Student() {
        initComponents();
        con = databaseConnection.connection();
     
        delete.setEnabled(false);
        update.setEnabled(false);
        
        showData();
        FillCombobox();
    }

    public ArrayList<Students> studentsList() {
        ArrayList<Students> studentsList = new ArrayList<>();
        try {

            String query = "SELECT * FROM student";
            stmt = con.createStatement();
//                PreparedStatement preparedStmt = con.prepareStatement(query);
            rs = stmt.executeQuery(query);

            Students student;
            while (rs.next()) {
                student = new Students(rs.getInt("id"), rs.getString("name"), rs.getInt("age"), rs.getString("gender"), rs.getString("address"), rs.getString("course"));
                studentsList.add(student);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return studentsList;
    }

    public void showData() {
        ArrayList<Students> list = studentsList();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        Object[] row = new Object[6];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getName();
            row[2] = list.get(i).getAge();
            row[3] = list.get(i).getGender();
            row[4] = list.get(i).getAddress();
            row[5] = list.get(i).getCourse();
            model.addRow(row);
        }
    }
     private void FillCombobox() {
        try {
            String sql = "SELECT *FROM course";
            PreparedStatement preparedStmt = con.prepareStatement(sql);
            rs = preparedStmt.executeQuery();

            while (rs.next()) {
                String courseName = rs.getString("courseGroup");
                searchCourse.addItem(courseName);
               
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboBox2 = new javax.swing.JComboBox<>();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jMenu1 = new javax.swing.JMenu();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        mainMenu = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        inputage = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        inputadd = new javax.swing.JTextField();
        address = new javax.swing.JLabel();
        searchCourse = new javax.swing.JComboBox<>();
        course = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        inputname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        table.setBackground(new java.awt.Color(204, 204, 204));
        table.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        table.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Age", "Gender", "Address", "Course"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setGridColor(new java.awt.Color(0, 0, 0));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 580, 390));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("STUDENTS LISTS");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });
        jPanel3.add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, 150, 31));

        mainMenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mainMenu.setText("> Main Menu");
        mainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuActionPerformed(evt);
            }
        });
        jPanel3.add(mainMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, -1, -1));

        name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        name.setText("Name:");
        jPanel3.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 3, 24)); // NOI18N
        jLabel2.setText("Manage Students");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        age.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        age.setText("Age:");
        jPanel3.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));
        jPanel3.add(inputage, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 180, 30));

        buttonGroup1.add(male);
        male.setText("Male");
        jPanel3.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 70, -1));

        buttonGroup1.add(female);
        female.setText("Female");
        jPanel3.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 70, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Gender:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));
        jPanel3.add(inputadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 170, 30));

        address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        address.setText("Address:");
        jPanel3.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        searchCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCourseActionPerformed(evt);
            }
        });
        jPanel3.add(searchCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 180, 30));

        course.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        course.setText("Course:");
        jPanel3.add(course, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        submit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submit.setText("Add");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel3.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 70, -1));

        reset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel3.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 80, -1));

        update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel3.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 90, -1));

        delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel3.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 90, -1));
        jPanel3.add(inputname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 180, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\2ndyrGroupB\\Desktop\\judyFilesOTHERPC\\SchoolManagementSystem\\school5.png")); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 510));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        try {
            stmt = con.createStatement();
            String query = "INSERT INTO student(name,age,gender,address,course)VALUES(?,?,?,?,?)";
            PreparedStatement preparedStmt = con.prepareStatement(query);

            preparedStmt.setString(1, inputname.getText());
            int sAge = Integer.parseInt(inputage.getText());
            preparedStmt.setInt(2, sAge);

            if (male.isSelected()) {
                gender = "Male";
            }
            if (female.isSelected()) {
                gender = "Female";
            }
            preparedStmt.setString(3, gender);
            preparedStmt.setString(4, inputadd.getText());
            String course = searchCourse.getSelectedItem().toString();

            preparedStmt.setString(5, course);

            preparedStmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Added SUCESSFULLY!");
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            showData();
            submit.setEnabled(false);
//            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_submitActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        inputname.setText("");
        inputage.setText("");
        buttonGroup1.clearSelection();
        inputadd.setText("");
        searchCourse.setSelectedIndex(0);
         submit.setEnabled(true);
          delete.setEnabled(false);
        update.setEnabled(false);
    }//GEN-LAST:event_resetActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int opt = JOptionPane.showConfirmDialog(null, "Are you sure to Delete", "Delete", JOptionPane.YES_NO_OPTION);
        if (opt == 0) {
            try {
                stmt = con.createStatement();
                int row = table.getSelectedRow();
                String value = (table.getModel().getValueAt(row, 0).toString());

                String query = "DELETE FROM student WHERE id =" + value;
                PreparedStatement preparedStmt = con.prepareStatement(query);

                preparedStmt.executeUpdate();
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.setRowCount(0);
                showData();
                      delete.setEnabled(false);
      
//            Reset();
//            
//            
                JOptionPane.showMessageDialog(null, "Deleted SUCESSFULLY!");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        try {
            stmt = con.createStatement();

            int row = table.getSelectedRow();
            String value = (table.getModel().getValueAt(row, 0).toString());
            String query = "UPDATE student SET name = ?,age = ?,gender = ?,address = ?,course = ? WHERE id = " + value;

            PreparedStatement preparedStmt = con.prepareStatement(query);

            preparedStmt.setString(1, inputname.getText());
            int sAge = Integer.parseInt(inputage.getText());
            preparedStmt.setInt(2, sAge);

            if (male.isSelected()) {
                gender = "Male";
            }
            if (female.isSelected()) {
                gender = "Female";
            }
            preparedStmt.setString(3, gender);
            preparedStmt.setString(4, inputadd.getText());
            String course = searchCourse.getSelectedItem().toString();

            preparedStmt.setString(5, course);

            preparedStmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated SUCESSFULLY!");
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            showData();
              update.setEnabled(false);
//            //con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
//        showData();

    }//GEN-LAST:event_updateActionPerformed

    private void mainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Menu menu = new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_mainMenuActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int i = table.getSelectedRow();
        TableModel model = table.getModel();

        inputname.setText(model.getValueAt(i, 1).toString());
        inputage.setText(model.getValueAt(i, 2).toString());
        String sex = model.getValueAt(i, 3).toString();
      
        if (sex.equals("Male")) {
            male.setSelected(true);
        } else {
            female.setSelected(true);
        }
        inputadd.setText(model.getValueAt(i, 4).toString());
        searchCourse.setSelectedItem(model.getValueAt(i, 5).toString());
        delete.setEnabled(true);
        update.setEnabled(true);
         submit.setEnabled(false);
//        String course = model.getValueAt(i, 5).toString();
    }//GEN-LAST:event_tableMouseClicked

    private void searchCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchCourseActionPerformed

    private void searchFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyPressed
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel) table.getModel();
       javax.swing.table.TableRowSorter<DefaultTableModel> tr = new javax.swing.table.TableRowSorter<>(model);
       table.setRowSorter(tr);
       tr.setRowFilter(RowFilter.regexFilter(searchField.getText().trim()));
    }//GEN-LAST:event_searchFieldKeyPressed

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        // TODO add your handling code here:
           DefaultTableModel model = (DefaultTableModel) table.getModel();
       javax.swing.table.TableRowSorter<DefaultTableModel> tr = new javax.swing.table.TableRowSorter<>(model);
       table.setRowSorter(tr);
       tr.setRowFilter(RowFilter.regexFilter(searchField.getText().trim()));
    }//GEN-LAST:event_searchFieldKeyReleased

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
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JLabel age;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel course;
    private javax.swing.JButton delete;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField inputadd;
    private javax.swing.JTextField inputage;
    private javax.swing.JTextField inputname;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton mainMenu;
    private javax.swing.JRadioButton male;
    private javax.swing.JLabel name;
    private javax.swing.JButton reset;
    private javax.swing.JComboBox<String> searchCourse;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton submit;
    private javax.swing.JTable table;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

}
