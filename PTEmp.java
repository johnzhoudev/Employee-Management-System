/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 565174
 */
public class PTEmp extends EmployeeInfo {
	
	//ATTRIBUTES
	
	private double hourlyWage;
	private double hoursPerWeek;
	private double weeksPerYear;
	
	//CONSTRUCTORS
	
	public PTEmp(int empNum, String fN, String lN, double dR, String g, String wL, double hW, double hPW, double wPY) {
		
		super(empNum, fN, lN, dR, g, wL);
		hourlyWage = hW;
		hoursPerWeek = hPW;
		weeksPerYear = wPY;
		
	}
	
	//METHODS
	
	public double calcAnnualGrossIncome() {
		//Returns annual gross income
		return(hourlyWage * hoursPerWeek * weeksPerYear);
		
	}
	
	public double calcAnnualNetIncome() {
		//Returns annual net income
		return(calcAnnualGrossIncome() * (1-deductionRate));
	}
        
        //Getters and Setters
        
        public double getHourlyWage(){
            return hourlyWage;
        }
        
        public double getHoursPerWeek(){
            return hoursPerWeek;
        }
        
        public double getWeeksPerYear(){
            return weeksPerYear;
        }
	

}
