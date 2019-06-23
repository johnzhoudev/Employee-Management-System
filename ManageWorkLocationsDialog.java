/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import javax.swing.DefaultListModel;
/**
 *
 * @author 565174
 */
public class ManageWorkLocationsDialog extends javax.swing.JDialog {

    /**
     * Creates new form addWorkLocationDialog
     */
    public ManageWorkLocationsDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        updateWorkLocationsListValues();
        
        workLocationExistsErrorLabel.setVisible(false);
        noWorkLocationSelectedErrorLabel.setVisible(false);
        workLocationEmptyStringErrorLabel.setVisible(false);
        
        
        
        
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        workLocationTextField = new javax.swing.JTextField();
        workLocationExistsErrorLabel = new javax.swing.JLabel();
        doneButton = new javax.swing.JButton();
        addLocationButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workLocationsList = new javax.swing.JList<>();
        removeLocationButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        noWorkLocationSelectedErrorLabel = new javax.swing.JLabel();
        workLocationEmptyStringErrorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manage Work Locations Wizard", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 102, 102))); // NOI18N
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel1.setText("To add a work location, input the name of the work location and click the \"Add Location\" button.");

        jLabel2.setText("Add a Work Location:");

        workLocationExistsErrorLabel.setForeground(new java.awt.Color(255, 51, 51));
        workLocationExistsErrorLabel.setText("Error, work location already exists!");

        doneButton.setText("Done");
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        addLocationButton.setText("Add Location");
        addLocationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLocationButtonActionPerformed(evt);
            }
        });

        workLocationsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(workLocationsList);

        removeLocationButton.setText("Remove Location");
        removeLocationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeLocationButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Work Locations in System:");

        jLabel4.setText("To remove a work location, select the work location from the list and click the \"Remove Location\" button.");

        noWorkLocationSelectedErrorLabel.setForeground(new java.awt.Color(255, 51, 51));
        noWorkLocationSelectedErrorLabel.setText("Error, no work location selected!");

        workLocationEmptyStringErrorLabel.setForeground(new java.awt.Color(255, 51, 51));
        workLocationEmptyStringErrorLabel.setText("Error, work location must not be an empty string!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(noWorkLocationSelectedErrorLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(workLocationTextField)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(doneButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(workLocationExistsErrorLabel)
                                        .addGap(66, 66, 66))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(addLocationButton)
                                        .addGap(103, 103, 103))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(workLocationEmptyStringErrorLabel)
                                        .addGap(37, 37, 37))))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(removeLocationButton)))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(113, 113, 113)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(workLocationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(workLocationExistsErrorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(workLocationEmptyStringErrorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addLocationButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(noWorkLocationSelectedErrorLabel)
                .addGap(18, 18, 18)
                .addComponent(removeLocationButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(doneButton))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        workLocationsList.clearSelection();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        
        //update main jtable values in case work location has been deleted
        MainJFrame.updateTableValuesFromHashTable();
    }//GEN-LAST:event_doneButtonActionPerformed

    private void removeLocationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeLocationButtonActionPerformed
        // TODO add your handling code here:
        
        //Get selected location
        List<String> listOfWorkLocations = workLocationsList.getSelectedValuesList();
        
        if(listOfWorkLocations.isEmpty() == true){//If list is emplty
            noWorkLocationSelectedErrorLabel.setVisible(true);
            return; //Set error text visible and do not execute any more code.
        }
        
        else{//No errors, begin removal
                        
            for(int location = 0; location < listOfWorkLocations.size(); location++){//For each location
                
                String locationToBeRemoved = listOfWorkLocations.get(location); 
                
                //Make new array without location
                
                String[] newWorkLocationArray = new String[MainJFrame.workLocationArray.length - 1];
                
                int newArrayLocationCounter = 0;
                
                for(int arrayLocation = 0; arrayLocation < MainJFrame.workLocationArray.length; arrayLocation++){
                    
                    if(MainJFrame.workLocationArray[arrayLocation].equals(locationToBeRemoved) == false){//If not location to be removed, add to new array
                        newWorkLocationArray[newArrayLocationCounter] = MainJFrame.workLocationArray[arrayLocation];
                        newArrayLocationCounter++;
                    }
                    
                    //else, do nothing. This way, the location to be removed never gets added.
                }
                
                //If newWorkLocationArray has no work locations, add work location "Earth"
                
                if(newWorkLocationArray.length == 0){
                    newWorkLocationArray = new String[1];
                    newWorkLocationArray[0] = "Earth";
                }
                
                //Change workLocationArray to newWorkLocationArray
                MainJFrame.workLocationArray = newWorkLocationArray;
                
                //Change all employee worklocation attributes that have been deleted to null
                setDeletedLocationEmployeeLocationsToNull(locationToBeRemoved);
            }
            
            //Once the array of work locations is updated, update the workLocationComboBoxModel and worklocationlistvalues in this dialog
            
            MainJFrame.updateWorkLocationComboBoxModel();
            updateWorkLocationsListValues();
            
            //Set error label visibility false 
            noWorkLocationSelectedErrorLabel.setVisible(false);
            
        }

        
    }//GEN-LAST:event_removeLocationButtonActionPerformed

    private void addLocationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLocationButtonActionPerformed
        // TODO add your handling code here:
        
        //Get locationName
        
        String locationName = workLocationTextField.getText();
                
        if (locationName.equals("") == true){
            workLocationEmptyStringErrorLabel.setVisible(true);
            
            //If this error occurs, it also means that the workLocationExistsError is not in effect, so set that invisible
            workLocationExistsErrorLabel.setVisible(false);
            
            return;
        }
        
        //If locationName is not an empty string, error is resolved and error text is set invisible
        workLocationEmptyStringErrorLabel.setVisible(false);
        
        //Check if locationName is in original location array
        
        if(checkIfWorkLocationIsInWorkLocationArray(locationName) == true){
            workLocationExistsErrorLabel.setVisible(true);
            return; //Stops add code from executing below
        }
        
        //Add the work location to the workLocationArray
        String[] newWorkLocationArray = new String[MainJFrame.workLocationArray.length + 1];
        
        //Copy all locations from workLocationArray to newWorkLocationsArray
        for(int location = 0; location < MainJFrame.workLocationArray.length; location++){
            newWorkLocationArray[location] = MainJFrame.workLocationArray[location];
        }
        
        //Add new location
        newWorkLocationArray[MainJFrame.workLocationArray.length] = locationName;
        
        //Set newWorkLocationArray as workLocationArray
        MainJFrame.workLocationArray = newWorkLocationArray;
        
        //Update work locations list and worklocationcomboboxmodel
        updateWorkLocationsListValues();
        MainJFrame.updateWorkLocationComboBoxModel();
        
        //Set all error text invisible if execution successful
        workLocationExistsErrorLabel.setVisible(false);
        workLocationEmptyStringErrorLabel.setVisible(false);
        
        //Clear workLocationTextField
        workLocationTextField.setText("");
        
        
    }//GEN-LAST:event_addLocationButtonActionPerformed
    
    public void updateWorkLocationsListValues(){
        //Create default list model
        DefaultListModel listModel = new DefaultListModel();
        
        //For each location, add it to the default list model
        for(int location = 0; location < MainJFrame.workLocationArray.length; location ++){
            listModel.addElement(MainJFrame.workLocationArray[location]);
        }
        
        //Set list with listModel
        
        workLocationsList.setModel(listModel);
        
    }
    
    public boolean checkIfWorkLocationIsInWorkLocationArray(String checkedWorkLocation){
        
        //For each element of the workLocationArray, compare it's value to the checkedWorklocation
        for(int arrayLocation = 0; arrayLocation < MainJFrame.workLocationArray.length; arrayLocation++){
            
            if(MainJFrame.workLocationArray[arrayLocation].equals(checkedWorkLocation)){
                return true;
            }
            
        }
        
        //else, return false
        return false;

    }
    
    public void setDeletedLocationEmployeeLocationsToNull(String deletedLocation){
        
        //For all elements in the employee hash table, check if work location is the deletedLocation and if so, set to ERROR: NULL.
        
            
        //For each bucket
        for (int i = 0; i < MainJFrame.employeeHashTable.buckets.length; i++) {

            //For each employee
            for (int x = 0; x < MainJFrame.employeeHashTable.buckets[i].size(); x++) {
                
                EmployeeInfo employee = MainJFrame.employeeHashTable.buckets[i].get(x);
                
                if(employee.getWorkLocation().equals(deletedLocation) == true){
                    employee.setWorkLocation("ERROR: NULL");
                }

            }
        }
        
    }
    
    
    
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
            java.util.logging.Logger.getLogger(ManageWorkLocationsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageWorkLocationsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageWorkLocationsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageWorkLocationsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ManageWorkLocationsDialog dialog = new ManageWorkLocationsDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addLocationButton;
    private javax.swing.JButton doneButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel noWorkLocationSelectedErrorLabel;
    private javax.swing.JButton removeLocationButton;
    private javax.swing.JLabel workLocationEmptyStringErrorLabel;
    private javax.swing.JLabel workLocationExistsErrorLabel;
    private javax.swing.JTextField workLocationTextField;
    private javax.swing.JList<String> workLocationsList;
    // End of variables declaration//GEN-END:variables
}
