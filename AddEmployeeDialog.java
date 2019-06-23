/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.awt.Color;

/**
 *
 * @author 565174
 */
public class AddEmployeeDialog extends javax.swing.JDialog {
    //ATTRIBUTES
    private Color red;
    private Color black;
    
    /**
     * Creates new form AddEmployeeDialog
     */
    public AddEmployeeDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        //Set Colors
        black = new Color(0,0,0);
        red = new Color(255,0,0);
        
        //Set partTimeRadioButton as selected so that there is never a scenario where both buttons are not selected.
        //Automatically calls partTimeRadioButtonStateChanged and updates PTEmp options
        partTimeRadioButton.setSelected(true);
        
        //Set work location combo box model
        workLocationComboBox.setModel(MainJFrame.workLocationModel);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        partOrFullTimeButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        hourlyWageLabel = new javax.swing.JLabel();
        hoursPerWeekLabel = new javax.swing.JLabel();
        weeksPerYearLabel = new javax.swing.JLabel();
        annualSalaryLabel = new javax.swing.JLabel();
        employeeNumberTextField = new javax.swing.JTextField();
        firstNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        hoursPerWeekTextField = new javax.swing.JTextField();
        hourlyWageTextField = new javax.swing.JTextField();
        weeksPerYearTextField = new javax.swing.JTextField();
        annualSalaryTextField = new javax.swing.JTextField();
        partTimeRadioButton = new javax.swing.JRadioButton();
        fullTimeRadioButton = new javax.swing.JRadioButton();
        addEmployeeButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        deductionRateTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        genderComboBox = new javax.swing.JComboBox<>();
        workLocationComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Employee Wizard", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 153, 153))); // NOI18N

        jLabel1.setText("To add an Employee, fill out all required fields and click \"Add\".");

        jLabel2.setText("Employee Number:");

        jLabel3.setText("First Name:");

        jLabel4.setText("Last Name:");

        jLabel5.setText("Part or Full Time Status:");

        hourlyWageLabel.setText("Hourly Wage:");

        hoursPerWeekLabel.setText("Hours Per Week:");

        weeksPerYearLabel.setText("Weeks Per Year:");

        annualSalaryLabel.setText("Annual Salary:");

        employeeNumberTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeNumberTextFieldMouseClicked(evt);
            }
        });

        hoursPerWeekTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hoursPerWeekTextFieldMouseClicked(evt);
            }
        });
        hoursPerWeekTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoursPerWeekTextFieldActionPerformed(evt);
            }
        });

        hourlyWageTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hourlyWageTextFieldMouseClicked(evt);
            }
        });

        weeksPerYearTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                weeksPerYearTextFieldMouseClicked(evt);
            }
        });

        annualSalaryTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                annualSalaryTextFieldMouseClicked(evt);
            }
        });

        partOrFullTimeButtonGroup.add(partTimeRadioButton);
        partTimeRadioButton.setText("Part-Time");
        partTimeRadioButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                partTimeRadioButtonStateChanged(evt);
            }
        });

        partOrFullTimeButtonGroup.add(fullTimeRadioButton);
        fullTimeRadioButton.setText("Full-Time");

        addEmployeeButton.setText("Add");
        addEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("Deduction Rate:");

        deductionRateTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deductionRateTextFieldMouseClicked(evt);
            }
        });

        jLabel7.setText("Gender:");

        jLabel8.setText("Work Location:");

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        workLocationComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(addEmployeeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelButton))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(66, 66, 66)
                            .addComponent(partTimeRadioButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 312, Short.MAX_VALUE)
                            .addComponent(fullTimeRadioButton)
                            .addGap(81, 81, 81))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lastNameTextField)
                                .addComponent(firstNameTextField)
                                .addComponent(deductionRateTextField)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(employeeNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(workLocationComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(genderComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 111, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hoursPerWeekLabel)
                            .addComponent(hourlyWageLabel)
                            .addComponent(weeksPerYearLabel)
                            .addComponent(annualSalaryLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(annualSalaryTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(hourlyWageTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                                .addComponent(hoursPerWeekTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(weeksPerYearTextField)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 345, Short.MAX_VALUE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(employeeNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(deductionRateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(workLocationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(partTimeRadioButton)
                    .addComponent(fullTimeRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hourlyWageLabel)
                    .addComponent(hourlyWageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hoursPerWeekLabel)
                    .addComponent(hoursPerWeekTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weeksPerYearLabel)
                    .addComponent(weeksPerYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(annualSalaryLabel)
                    .addComponent(annualSalaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addEmployeeButton)
                    .addComponent(cancelButton))
                .addGap(15, 15, 15))
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

    
    //OTHER METHODS
    
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        //Closes Add Employee Dialog Box
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void partTimeRadioButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_partTimeRadioButtonStateChanged
        // TODO add your handling code here:
        
        //Update Options when partTimeRadioButton state changes
        partOrFullTimeOptionsVisibilityUpdate();
        
    }//GEN-LAST:event_partTimeRadioButtonStateChanged

    private void addEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeButtonActionPerformed
        // TODO add your handling code here:
        
        //Get Employee
        EmployeeInfo addedEmployee = createEmployeeFromFields();
        
        //Catch if addedEmployee was not created properly (addedEmployee.employeeNumber = -1)
        //If caught, add to table and updatetablevalues methods are not performed!
        if (addedEmployee.employeeNumber == -1){
            return;
        }
        
        //Add employee to hash table
        MainJFrame.employeeHashTable.addToTable(addedEmployee);
        
        //Update main table values in MainJFrame
        MainJFrame.updateTableValuesFromHashTable();
        
        //Dispose of Dialog Box
        dispose();
        
    }//GEN-LAST:event_addEmployeeButtonActionPerformed

    private void employeeNumberTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeNumberTextFieldMouseClicked
        // TODO add your handling code here:
        //Sets text to an empty string and changes text color IF RED (as in the result of NumberFormatException)
        if (employeeNumberTextField.getForeground() == red){
            employeeNumberTextField.setText("");
            employeeNumberTextField.setForeground(black);
        }
    }//GEN-LAST:event_employeeNumberTextFieldMouseClicked

    private void deductionRateTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deductionRateTextFieldMouseClicked
        // TODO add your handling code here:
        //Sets text to an empty string and changes text color IF RED (as in the result of NumberFormatException)
        if (deductionRateTextField.getForeground() == red){
            deductionRateTextField.setText("");
            deductionRateTextField.setForeground(black);
        }
    }//GEN-LAST:event_deductionRateTextFieldMouseClicked

    private void hourlyWageTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hourlyWageTextFieldMouseClicked
        // TODO add your handling code here:
        //Sets text to an empty string and changes text color IF RED (as in the result of NumberFormatException)
        if (hourlyWageTextField.getForeground() == red){
            hourlyWageTextField.setText("");
            hourlyWageTextField.setForeground(black);
        }
    }//GEN-LAST:event_hourlyWageTextFieldMouseClicked

    private void hoursPerWeekTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoursPerWeekTextFieldMouseClicked
        // TODO add your handling code here:
        //Sets text to an empty string and changes text color IF RED (as in the result of NumberFormatException)
        if (hoursPerWeekTextField.getForeground() == red){
            hoursPerWeekTextField.setText("");
            hoursPerWeekTextField.setForeground(black);
        }
    }//GEN-LAST:event_hoursPerWeekTextFieldMouseClicked

    private void weeksPerYearTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_weeksPerYearTextFieldMouseClicked
        // TODO add your handling code here:
        //Sets text to an empty string and changes text color IF RED (as in the result of NumberFormatException)
        if (weeksPerYearTextField.getForeground() == red){
            weeksPerYearTextField.setText("");
            weeksPerYearTextField.setForeground(black);
        }
    }//GEN-LAST:event_weeksPerYearTextFieldMouseClicked

    private void annualSalaryTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annualSalaryTextFieldMouseClicked
        // TODO add your handling code here:
        //Sets text to an empty string and changes text color IF RED (as in the result of NumberFormatException)
        if (annualSalaryTextField.getForeground() == red){
            annualSalaryTextField.setText("");
            annualSalaryTextField.setForeground(black);
        }
    }//GEN-LAST:event_annualSalaryTextFieldMouseClicked

    private void hoursPerWeekTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoursPerWeekTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hoursPerWeekTextFieldActionPerformed

    private EmployeeInfo createEmployeeFromFields(){
        //If Employee is not created properly and the exception is caught, the catch block will set the employeeNumber to -1.
        
        //exceptions array is used to keep track of exceptions occurring for each category, 0 means exception has not occurred, 1 means it has.
        int[] exceptions = new int[6];
        for(int x = 0; x < 6; x++){
            exceptions[x] = 0;
        }
        
        //Declare Employee
        EmployeeInfo employee = null;
        
        //Get Employee Number; Catches NumberFormatException
        //Instantiate Emp Num outside of try block
        int employeeNumber = -1;
        
        try{
            employeeNumber = Integer.parseInt(employeeNumberTextField.getText());
            
        }catch(java.lang.NumberFormatException ex){
            employeeNumberTextField.setForeground(red);
            employeeNumberTextField.setText("ERROR: Invalid Integer.");
            exceptions[0] = 1;
        }
        
        //Catch exception where employee number is negative
        if(employeeNumber < 0 && exceptions[0]==0){
            employeeNumberTextField.setForeground(red);
            employeeNumberTextField.setText("ERROR: Positive Integers Only.");
            employeeNumber = -1;
            exceptions[0] = 1;
        }
        
        //Catch exception where employee number is already in use; skip if employee number is -1 (error)
        if(employeeNumber > -1 && exceptions[0]==0){
            if(MainJFrame.employeeHashTable.isInTable(employeeNumber) == true){
                employeeNumberTextField.setForeground(red);
                employeeNumberTextField.setText("ERROR: Employee Number " + employeeNumber + " already in use.");
                employeeNumber = -1;
            }
        }

        //Get First Name
        String firstName = firstNameTextField.getText();
        
        //Get Last Name
        String lastName = lastNameTextField.getText();
        
        //Get Deduction Rate; Catch NumberFormatException
        //Instantiate deductionRate outside of try block
        double deductionRate = -1;
        try{
            deductionRate = Double.parseDouble(deductionRateTextField.getText());
            
        }catch(java.lang.NumberFormatException ex){
            deductionRateTextField.setForeground(red);
            deductionRateTextField.setText("ERROR: Invalid Decimal Number.");
            employeeNumber = -1;
            exceptions[1] = 1;
        }
        
        //Catch if deduction rate is negative
        if(deductionRate < 0 && exceptions[1] == 0){
            deductionRateTextField.setForeground(red);
            deductionRateTextField.setText("ERROR: Positive Decimals Only.");
            employeeNumber = -1;
            exceptions[1] = 1;
        }
        
        //Catch if deduction rate is greater than 1
        if(deductionRate > 1 && exceptions[1] == 0){
            deductionRateTextField.setForeground(red);
            deductionRateTextField.setText("ERROR: Deduction Rate Greater than 1.");
            employeeNumber = -1;
        }
        
        //Get Gender
        String gender = (String)genderComboBox.getSelectedItem();
        
        //Get Work Location
        String workLocation = (String)workLocationComboBox.getSelectedItem();
        
        
        
        if(checkPartTimeStatus() == true){//For Part Time Employees
            //Instantiate hourly wage outside of try block
            double hourlyWage = -1;
            //Get Hourly Wage
            try{
                hourlyWage = Double.parseDouble(hourlyWageTextField.getText());
            
            }catch(java.lang.NumberFormatException ex){
                hourlyWageTextField.setForeground(red);
                hourlyWageTextField.setText("ERROR: Invalid Decimal Number.");
                employeeNumber = -1;
                exceptions[2] = 1;
            }
            
            //Catch if Hourly Wage is negative
            if(hourlyWage < 0 && exceptions[2] == 0){
                hourlyWageTextField.setForeground(red);
                hourlyWageTextField.setText("ERROR: Positive Decimals Only.");
                employeeNumber = -1;
            }
            
            //Get Hours per week
            double hoursPerWeek = -1;
            try{
                hoursPerWeek = Double.parseDouble(hoursPerWeekTextField.getText());
            
            }catch(java.lang.NumberFormatException ex){
                hoursPerWeekTextField.setForeground(red);
                hoursPerWeekTextField.setText("ERROR: Invalid Decimal Number.");
                employeeNumber = -1;
                exceptions[3] = 1;
            }
            
            //Catch if Hours per week is negative
            if(hoursPerWeek < 0 && exceptions[3]==0){
                hoursPerWeekTextField.setForeground(red);
                hoursPerWeekTextField.setText("ERROR: Positive Decimals Only.");
                employeeNumber = -1;
                exceptions[3] = 1;
            }
            
            //Catch if Hours per week is greater than 168
            if(hoursPerWeek > 168 && exceptions[3]==0){
                hoursPerWeekTextField.setForeground(red);
                hoursPerWeekTextField.setText("ERROR: HPW Exceeds Natural Max.");
                employeeNumber = -1;
            }
            
            
            //Get weeks per year
            double weeksPerYear = -1;
            try{
                weeksPerYear = Double.parseDouble(weeksPerYearTextField.getText());
            
            }catch(java.lang.NumberFormatException ex){
                weeksPerYearTextField.setForeground(red);
                weeksPerYearTextField.setText("ERROR: Invalid Decimal Number.");
                employeeNumber = -1;
                exceptions[4] = 1;
            }
            
            //Catch if weeks per year is negative
            if(weeksPerYear < 0 && exceptions[4] == 0){
                weeksPerYearTextField.setForeground(red);
                weeksPerYearTextField.setText("ERROR: Positive Decimals Only.");
                employeeNumber = -1;
                exceptions[4] = 1;
            }
            
            //Catch if weeks per year exceeds 52
            if(weeksPerYear > 52 && exceptions[4] == 0){
                weeksPerYearTextField.setForeground(red);
                weeksPerYearTextField.setText("ERROR: WPY Exceeds Natural Max.");
                employeeNumber = -1;
            }
                        
            //Instantiate PTEmp as employee to be returned
            employee = new PTEmp(employeeNumber, firstName,lastName, deductionRate, gender, workLocation, hourlyWage, hoursPerWeek, weeksPerYear);
        }
        else{//For Full Time Employees
            
            //Get Annual Salary
            double annualSalary = -1;
            try{
                annualSalary = Double.parseDouble(annualSalaryTextField.getText());
            
            }catch(java.lang.NumberFormatException ex){
                annualSalaryTextField.setForeground(red);
                annualSalaryTextField.setText("ERROR: Invalid Decimal Number.");
                employeeNumber = -1;
                exceptions[5] = 1;
            }
            
            //Catch if Annual salary is negative
            if(annualSalary < 0 && exceptions[5] == 0){
                annualSalaryTextField.setForeground(red);
                annualSalaryTextField.setText("ERROR: Positive Decimals Only.");
                employeeNumber = -1;
            }
            
            //Instantiate FTEmp as employee to be returned
            employee = new FTEmp(employeeNumber,firstName,lastName, deductionRate, gender, workLocation, annualSalary);
            
        }
        
        return employee;
    }
    
    private void partOrFullTimeOptionsVisibilityUpdate(){
        
        if(checkPartTimeStatus() == true){//If Part Time Employee
            
            //Set all full time options invisible and text fields blank
            annualSalaryLabel.setVisible(false);
            annualSalaryTextField.setVisible(false);
            
            annualSalaryTextField.setText("");
            annualSalaryTextField.setForeground(black);

            
            
            //Set all part time options visible
            hourlyWageLabel.setVisible(true);
            hoursPerWeekLabel.setVisible(true);
            weeksPerYearLabel.setVisible(true);
            
            hourlyWageTextField.setVisible(true);
            hoursPerWeekTextField.setVisible(true);
            weeksPerYearTextField.setVisible(true);
        }
        
        else{//New Employee is Full Time Employee
            
            //Set all part time options invisible and text fields blank
            hourlyWageLabel.setVisible(false);
            hoursPerWeekLabel.setVisible(false);
            weeksPerYearLabel.setVisible(false);
            
            hourlyWageTextField.setVisible(false);
            hoursPerWeekTextField.setVisible(false);
            weeksPerYearTextField.setVisible(false);
            
            hourlyWageTextField.setText("");
            hoursPerWeekTextField.setText("");
            weeksPerYearTextField.setText("");
            
            hourlyWageTextField.setForeground(black);
            hoursPerWeekTextField.setForeground(black);      
            weeksPerYearTextField.setForeground(black);      
            
            //Set all full time options true
            annualSalaryLabel.setVisible(true);
            annualSalaryTextField.setVisible(true);
        }
        
    }
    
    private boolean checkPartTimeStatus(){//Returns true for part time, false for full time
        return partTimeRadioButton.isSelected();
}
    
    
    
    
    
    
    //MAIN METHOD STUFF BELOW
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
            java.util.logging.Logger.getLogger(AddEmployeeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddEmployeeDialog dialog = new AddEmployeeDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton addEmployeeButton;
    private javax.swing.JLabel annualSalaryLabel;
    private javax.swing.JTextField annualSalaryTextField;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField deductionRateTextField;
    private javax.swing.JTextField employeeNumberTextField;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JRadioButton fullTimeRadioButton;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JLabel hourlyWageLabel;
    private javax.swing.JTextField hourlyWageTextField;
    private javax.swing.JLabel hoursPerWeekLabel;
    private javax.swing.JTextField hoursPerWeekTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.ButtonGroup partOrFullTimeButtonGroup;
    private javax.swing.JRadioButton partTimeRadioButton;
    private javax.swing.JLabel weeksPerYearLabel;
    private javax.swing.JTextField weeksPerYearTextField;
    private javax.swing.JComboBox<String> workLocationComboBox;
    // End of variables declaration//GEN-END:variables
}
