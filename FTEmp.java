/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 565174
 */
public class FTEmp extends EmployeeInfo{
	
	//ATTRIBUTES
	
	private double yearlySalary;
	
	//CONSTRUCTORS
	
	public FTEmp(int empNum, String fN, String lN, double dR, String g, String wL, double sal) {
		
		super(empNum, fN, lN, dR, g, wL);
		yearlySalary = sal;
		
	}
	
	//METHODS
		
	public double calcAnnualGrossIncome() {
		//Returns annual gross income, which is just the yearly salary for FTEmps
		return(yearlySalary);
	}
	
	public double calcAnnualNetIncome() {
		//Returns annual net income, which is the yearly salary with deductions
		return(yearlySalary * (1-deductionRate));
	}
        
        
        //GETTERS AND SETTERS
        
        public double getYearlySalary(){
            return yearlySalary;
        }
}
