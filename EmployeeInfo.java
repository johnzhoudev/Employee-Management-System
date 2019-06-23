/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 565174
 */
public class EmployeeInfo {
	
	//Attributes
	
	protected int employeeNumber;
	protected String firstName;
	protected String lastName;
	protected double deductionRate; //A decimal number
        
        protected String gender; //Male, Female, Other
        protected String workLocation;//City

	
	//Constructors
	
	public EmployeeInfo(int eN, String fN, String lN, double dR, String g, String wL){
		
		employeeNumber = eN;
		firstName = fN;
		lastName = lN;	
		deductionRate = dR;
                gender = g;
                workLocation = wL;
	}
	
	public EmployeeInfo(int eN) {
		employeeNumber = eN;
		firstName = "a";
		lastName = "z";
		deductionRate = 0;
                gender = "a";
                workLocation = "na";

	}
	
	public EmployeeInfo(int eN, String fN, String lN){
		
		employeeNumber = eN;
		firstName = fN;
		lastName = lN;	
		deductionRate = 0;
                gender = "a";
                workLocation = "na";
	}
	
	//METHODS
	
	//GETTERS AND SETTERS
	
	public int getEmployeeNumber() {
		return(employeeNumber);
	}
	
	public String getFirstName() {
		return(firstName);
	}
	
	public String getLastName() {
		return(lastName);
	}
	
	public double getDeductionRate() {
		return(deductionRate);
	}
        
        public String getGender(){
            return(gender);
        }
        
        public String getWorkLocation(){
            return(workLocation);
        }
        
        public void setWorkLocation(String newWorkLocation){
            
            workLocation = newWorkLocation;
            
        }
        
        public void addEmployeeAttributesTo2DArray(Object[][] attributeArray, int employeeNumInArray){
            
            attributeArray[employeeNumInArray][0] = employeeNumber;
            attributeArray[employeeNumInArray][1] = lastName;
            attributeArray[employeeNumInArray][2] = firstName;
            attributeArray[employeeNumInArray][3] = gender;
            attributeArray[employeeNumInArray][4] = workLocation;
            
            if(this instanceof FTEmp){
                attributeArray[employeeNumInArray][5] = "Full Time";
                attributeArray[employeeNumInArray][6] = ((FTEmp)this).calcAnnualGrossIncome();
            }
            
            else{//Instance of PTEmp
                attributeArray[employeeNumInArray][5] = "Part Time";
                attributeArray[employeeNumInArray][6] = ((PTEmp)this).calcAnnualGrossIncome();
            }
            
        }
	
	
}

