/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author John
 */
public class ReadFromTextFile {
    
    //ATTRIBUTES
    public BufferedReader bufferedReader;
    public File savedEmployeesFile;
    
    //CONSTRUCTOR
    public ReadFromTextFile() //Instantiates bufferedReader! Remember to close using closeBufferedReader() when using!!!!
            throws IOException {
        savedEmployeesFile = new File("src/readMe.txt");
        bufferedReader = new BufferedReader(new FileReader(savedEmployeesFile));
    }
    
    //METHODS
    
    //"P" or "F"%empNum%"fName"%"lName"%dedRate%yearlySalary OR HourlyWage%Hours/week%wk/yr

    
    public void buildHashTableFromTextFile(MyHashTable employeeHashTable) //Also builds work location string array
        throws IOException, NumberFormatException{
        
        //Make employee hash 
        String numberOfEntitiesString = readOneSection();
        
        int numberOfEntities = Integer.parseInt(numberOfEntitiesString);
        
        for(int employee = 1; employee <= numberOfEntities; employee++){
            EmployeeInfo addEmployee = readDataForOneEmployee();
            employeeHashTable.addToTable(addEmployee);
        }
        
        //Make String array of work locations
        
        //Read an extra one section to read the hidden "new line" text
        readOneSection();
        
        int numberOfWorkLocations = Integer.parseInt(readOneSection());
        
        //make new array of work locations strings
        MainJFrame.workLocationArray = new String[numberOfWorkLocations];

        
        for(int workLocation = 0; workLocation < numberOfWorkLocations; workLocation++){
            //Empty readonesection to get rid of newline text
            readOneSection();
            MainJFrame.workLocationArray[workLocation] = readOneSection();
        }
                
        
    }
    
    public String readOneCharacter()
        throws IOException{
        String character = Character.toString((char)bufferedReader.read());
        
        return character;
    }
    
    public String readOneSection()//Reads the last % sign!!! So skip is not necessary
        throws IOException{
        String characterJustRead = readOneCharacter();
        
        
        
        String readSection = "";
        do{
            if(characterJustRead.equals("\uffff") == true){
                return "This text will throw numberFormatException which will trigger a system reset upon the newline / blank string input:) ;)))))";
            }
            readSection += characterJustRead;
            characterJustRead = readOneCharacter();
        }while(characterJustRead.equals("%") == false);
        
        return readSection;
    }
    
    public EmployeeInfo readDataForOneEmployee()
        throws IOException{
        //Declare Employee
        EmployeeInfo employee;
        
        //Read first Character to idenfity if PTE or FTE
        String partTimeOrFullTime = readOneSection();

        //Read Employee Number
        int employeeNumber = Integer.parseInt(readOneSection());
       
        //Read First Name
        String employeeFirstName = readOneSection();
        
        //Read last Name
        String employeeLastName = readOneSection();
        
        //Read deduction rate
        double employeeDeductionRate = Double.parseDouble(readOneSection());
        
        //Read gender
        String gender = readOneSection();
        
        //Read Work Location
        String workLocation = readOneSection();
        
        //Read remaining data depending on PTE or FTE
        if(partTimeOrFullTime.equals("\r\nP") == true){//If Employee is Part Time
            
            double hW = Double.parseDouble(readOneSection());
            double hPW = Double.parseDouble(readOneSection());
            double wPY = Double.parseDouble(readOneSection());
            
            //Create Employee
            employee = new PTEmp(employeeNumber, employeeFirstName, employeeLastName, employeeDeductionRate, gender, workLocation, hW,hPW,wPY);    
        }
        else{//If employee is full time
            
            double yearlySalary = Double.parseDouble(readOneSection());
            
            //Create Employee
            employee = new FTEmp(employeeNumber, employeeFirstName, employeeLastName, employeeDeductionRate, gender, workLocation, yearlySalary);
        }
                
        return employee;
    }
    
    public void closeBufferedReader()
        throws IOException{
        bufferedReader.close();
    }
}
