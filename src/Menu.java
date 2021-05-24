/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2ndyrGroupB
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        studManagement = new javax.swing.JLabel();
        teacherManagement = new javax.swing.JLabel();
        courseManagement = new javax.swing.JLabel();
        students = new javax.swing.JButton();
        teacher = new javax.swing.JButton();
        courses = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(212, 255, 127));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 3, 36)); // NOI18N
        jLabel4.setText("School Management System");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        logout.setBackground(new java.awt.Color(0, 102, 0,80));
        logout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logout.setText("LogOut");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, -1));

        studManagement.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        studManagement.setForeground(new java.awt.Color(51, 153, 0));
        studManagement.setText("Student Management");
        jPanel1.add(studManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        teacherManagement.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        teacherManagement.setForeground(new java.awt.Color(0, 153, 0));
        teacherManagement.setText("Teacher Management");
        jPanel1.add(teacherManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        courseManagement.setBackground(new java.awt.Color(255, 255, 255));
        courseManagement.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        courseManagement.setForeground(new java.awt.Color(0, 153, 0));
        courseManagement.setText("Course Management");
        jPanel1.add(courseManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, -1, -1));

        students.setIcon(new javax.swing.ImageIcon("C:\\Users\\2ndyrGroupB\\Desktop\\judyFilesOTHERPC\\SchoolManagementSystem\\student.png")); // NOI18N
        students.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentsActionPerformed(evt);
            }
        });
        jPanel1.add(students, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 220, 210));

        teacher.setIcon(new javax.swing.ImageIcon("C:\\Users\\2ndyrGroupB\\Desktop\\judyFilesOTHERPC\\SchoolManagementSystem\\teacher.png")); // NOI18N
        teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherActionPerformed(evt);
            }
        });
        jPanel1.add(teacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 200, 210));

        courses.setIcon(new javax.swing.ImageIcon("C:\\Users\\2ndyrGroupB\\Desktop\\judyFilesOTHERPC\\SchoolManagementSystem\\courses.png")); // NOI18N
        courses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursesActionPerformed(evt);
            }
        });
        jPanel1.add(courses, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 220, 210));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\2ndyrGroupB\\Desktop\\judyFilesOTHERPC\\SchoolManagementSystem\\menu.png")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 710, 440));

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        LogIn log = new LogIn();
        log.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void studentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsActionPerformed
        // TODO add your handling code here:
        Student student = new Student();
        student.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_studentsActionPerformed

    private void teacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherActionPerformed
        // TODO add your handling code here:
        Teachers teacher = new Teachers();
        teacher.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_teacherActionPerformed

    private void coursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursesActionPerformed
        // TODO add your handling code here:
         Course course= new Course();
        course.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_coursesActionPerformed

   
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel courseManagement;
    private javax.swing.JButton courses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logout;
    private javax.swing.JLabel studManagement;
    private javax.swing.JButton students;
    private javax.swing.JButton teacher;
    private javax.swing.JLabel teacherManagement;
    // End of variables declaration//GEN-END:variables
}
