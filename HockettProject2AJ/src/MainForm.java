
import java.awt.Color;
import java.lang.reflect.Field;

/**
     * Class Name: MainForm
     * Class Author: Tyler Hockett
     * **************************
     * Purpose of the Class
     * this is the Gui that interacts
     * with the Car class
     * **************************
     * Date: 9/14/2017 USA
     * **************************
     * Date Changed:9/192017
     * **************************
     * Look At This!
     * i have a section of code I found
     * and modified to allow the Color class
     * to accept string values as input
     * its on Line 
     * **************************
     */
public class MainForm extends javax.swing.JFrame {

    private Car myCar;
    private int speed=0;
    String myMake, myModel,theColor;
    Color myColor;
    
    public MainForm() {
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

        txtMake = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnSpdUP = new javax.swing.JButton();
        btnBrake = new javax.swing.JButton();
        lblSpeed = new javax.swing.JLabel();
        lblMake = new javax.swing.JLabel();
        lblModel = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCreate.setText("Get New Car");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnSpdUP.setText("Speed Up");
        btnSpdUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpdUPActionPerformed(evt);
            }
        });

        btnBrake.setText("Brake");
        btnBrake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrakeActionPerformed(evt);
            }
        });

        jLabel1.setText("Make:");

        jLabel2.setText("Model:");

        jLabel3.setText("Color:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSpeed)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSpdUP)
                        .addGap(49, 49, 49)
                        .addComponent(btnBrake)))
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtColor, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(txtModel)
                    .addComponent(txtMake))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblColor)
                    .addComponent(btnCreate)
                    .addComponent(lblMake)
                    .addComponent(lblModel))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(btnCreate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMake)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(lblModel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(lblColor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addComponent(lblSpeed)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSpdUP)
                    .addComponent(btnBrake))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Method Name: btnCreateActionPerformed
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * collect data entered by user and 
     * store it into car
     * **************************
     * Date: 9/14/2017 USA
     * **************************
     */
    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        if(myMake==null)
        {
          myMake=txtMake.getText();
        myModel=txtModel.getText();
        theColor=txtColor.getText();
        theColor=theColor.toLowerCase();
        //try{
        try {
             Field field = Class.forName("java.awt.Color").getField(theColor);
              myColor= (Color)field.get(null);
              jLabel3.setForeground(myColor);
            } catch (Exception e) {
                myColor=Color.BLACK;
            }
        

        
        myCar= new Car(myMake, myModel, myColor);

        }else
        {
        myMake=txtMake.getText();
        myModel=txtModel.getText();
        theColor=txtColor.getText();
        myColor=Color.getColor(theColor);
        myCar.setColor(myColor);
        myCar.setMake(myMake);
        myCar.setModel(myModel);
        }
        
        lblColor.setText(theColor);
        lblColor.setForeground(myColor);
        lblMake.setText(myMake);
        lblModel.setText(myModel);
        txtColor.setText("");
        txtModel.setText("");
        txtMake.setText("");
        
    }//GEN-LAST:event_btnCreateActionPerformed
/**
     * Method Name: btnSpdUPActionPerformed
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * to increase the speed attribute by 5
     * **************************
     * Date: 9/14/2017 USA
     * **************************
     */
    private void btnSpdUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpdUPActionPerformed
        myCar.accelerate();
        speed=myCar.getSpeed();
        String mySpeed=Integer.toString(speed);
        lblSpeed.setText("The "+myCar.getMake()+" "+myCar.getModel()+" is going "+mySpeed);
        
    }//GEN-LAST:event_btnSpdUPActionPerformed
/**
     * Method Name: btnBrakeActionPerformed
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * to decrease the speed attribute by 5
     * **************************
     * Date: 9/14/2017 USA
     * **************************
     */
    private void btnBrakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrakeActionPerformed
       myCar.brake();
       speed=myCar.getSpeed();
       if(speed==0)
       {
           lblSpeed.setText("The "+myCar.getMake()+" "+myCar.getModel()+ " is now stopped.");
       }else
       {
        String mySpeed=Integer.toString(speed);
        lblSpeed.setText("The "+myCar.getMake()+" "+myCar.getModel()+" is going "+mySpeed);
       }
    }//GEN-LAST:event_btnBrakeActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrake;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnSpdUP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblMake;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblSpeed;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtMake;
    private javax.swing.JTextField txtModel;
    // End of variables declaration//GEN-END:variables
}