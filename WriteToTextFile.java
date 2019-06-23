/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;

/**
 *
 * @author 565174
 */
public class WriteToTextFile {
    
    //ATTRIBUTES
    private BufferedWriter bufferedWriter;
    private File savedEmployeesFile;
    
    //CONSTRUCTOR
    
    public WriteToTextFile() 
            throws IOException {
        savedEmployeesFile = new File("src/readMe.txt");
        bufferedWriter = null;
    }
    
    //METHODS
    
    public void writeEmployeesToFile(MyHashTable employeeHashTable) //Also writes employee Locations
            throws IOException{
        
        
        //Deletes readMe.txt so that previously recorded employees are deleted. All necessary data is stored in the hash table.
        //This has to happen before bufferedWriter is initialized! For some reason, having bufferedWriter OPEN the file makes it invulnerable!
        savedEmployeesFile.delete();
        
        //Setup BufferedWriter, setup a new one each time because it closes at the end of the method
        bufferedWriter = new BufferedWriter(new FileWriter(savedEmployeesFile, true));
        
        //Write Number of Entities
        bufferedWriter.write(Integer.toString(employeeHashTable.numberOfEntities) + "%");
        bufferedWriter.newLine();
        
        //For Each Bucket:
        for(int currentBucket = 0; currentBucket < employeeHashTable.buckets.length; currentBucket++){
            //For Each employee in the bucket
            for (int currentEmployee = 0; currentEmployee < employeeHashTable.buckets[currentBucket].size(); currentEmployee++){
               
                //Create write string and fill with all info of employeeToPrint
                
               EmployeeInfo employeeToPrint = employeeHashTable.buckets[currentBucket].get(currentEmployee);
               
               String writeString;
               
               //Prepare generic employee info
               
               String empNum = String.valueOf(employeeToPrint.getEmployeeNumber());
               String firstName = employeeToPrint.getFirstName();
               String lastName = employeeToPrint.getLastName();
               String deductionRate = Double.toString(employeeToPrint.getDeductionRate());
               
               String gender = employeeToPrint.getGender();
               String workLocation = employeeToPrint.getWorkLocation();
               
               //Prepare PTE or FTE specific information
               
               if (employeeToPrint instanceof FTEmp){
                    String yearlySalary = Double.toString(((FTEmp) employeeToPrint).getYearlySalary());
                    
                    //Create writeString
                    writeString = "F" + "%" + empNum + "%" + firstName + "%" + lastName + "%" + deductionRate + "%" + gender + "%" + workLocation + "%" + yearlySalary + "%";
                    
               }
               else{//employeeToPrint is an instance of PTE
                   String hourlyWage = Double.toString(((PTEmp) employeeToPrint).getHourlyWage());
                   String hoursPerWeek = Double.toString(((PTEmp) employeeToPrint).getHoursPerWeek());
                   String weeksPerYear = Double.toString(((PTEmp) employeeToPrint).getWeeksPerYear());
                   
                   //Create writeString
                   writeString = "P" + "%" + empNum + "%" + firstName + "%" + lastName + "%" + deductionRate + "%" + gender + "%" + workLocation + "%" + hourlyWage + "%" + hoursPerWeek + "%" + weeksPerYear + "%";
                }
               
               //Write writeString to file
               
               bufferedWriter.write(writeString);
               bufferedWriter.newLine();
               
               
            }
            
        }
        
        //Write Num work locations
        //Write a % before this number to separate the number from the newline text
        bufferedWriter.write("%" + Integer.toString(MainJFrame.workLocationArray.length) + "%");
        bufferedWriter.newLine();
                
        //Write work locations
        for(int location = 0; location < MainJFrame.workLocationArray.length; location++){
        //Write a % before work location to separate the work location from the newline text

            String writeString = "%" + MainJFrame.workLocationArray[location] + "%";
            bufferedWriter.write(writeString);
            bufferedWriter.newLine();
        }
        
        
        //Looks like you have to close this guy to get the hash table actually written to the thing. This also means bufferedWriter must
        //be instantialized each time this method runs!
        bufferedWriter.close();
        
        
    }
    
    
    public void writeBlankEmployeesAndLocationsToFile()//File must be instantiated
        throws IOException{
        
        savedEmployeesFile.delete();
        
        bufferedWriter = new BufferedWriter(new FileWriter(savedEmployeesFile, true));
        
        //Write 0% nl %0% (No employees, no locations)
        bufferedWriter.write("0%");
        bufferedWriter.newLine();
        bufferedWriter.write("%1%");
        bufferedWriter.newLine();
        bufferedWriter.write("%Earth%");
        
        bufferedWriter.close();
        
    }
}
