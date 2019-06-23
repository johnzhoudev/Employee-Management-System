/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 565174
 */
import java.util.*;
import java.util.Arrays;

public class MyHashTable {
        
        // ATTRIBUTES

        // buckets is an array of ArrayList.  Each item in an ArrayList is a EmployeeInfo
        // object holding a reference value pointing to a student.

        public ArrayList<EmployeeInfo>[] buckets;
        public int numberOfEntities;

        // CONSTRUCTOR

        public MyHashTable(int howManyBuckets) {
                // Construct the hash table (open hashing/closed addressing) as an array of howManyBuckets ArrayLists.

                // Instantiate an array to have an ArrayList as each element of the array.
                buckets = new ArrayList[howManyBuckets];

                // For each element in the array, instantiate its ArrayList.
                for (int i = 0; i < howManyBuckets; i++) {
                        buckets[i] = new ArrayList();  // Instantiate the ArrayList for bucket i.
                }
                
                numberOfEntities = 0;
        }


        // METHODS

        public int calcBucket(int employeeNumber) {
        		//Returns the modulo (and thus bucket address) of the employee number taking into account the length of the bucket array.
                return(employeeNumber % buckets.length);		
        }


        public void addToTable(EmployeeInfo employeeToAdd) {
                // Add a specified employee to the hash table.
        	buckets[this.calcBucket(employeeToAdd.employeeNumber)].add(employeeToAdd);
                numberOfEntities += 1;
        }


        public EmployeeInfo removeFromTable(int employeeNumber) {
                // Remove a specified employee from the hash table and return the removed employee reference value.
        	
        	int bucketAddress = this.calcBucket(employeeNumber);
        	
        	for (int i = 0; i < buckets[bucketAddress].size(); i++) {	//Search buckets[x] for the employeeNumber.
        		
        		EmployeeInfo currentSearchEmployee = buckets[bucketAddress].get(i);
        		
        		if (employeeNumber == currentSearchEmployee.employeeNumber) { //At this point, comparedEmployee holds the reference value of the employee to be removed.
        			buckets[bucketAddress].remove(currentSearchEmployee);
        			numberOfEntities -= 1;
                                return (currentSearchEmployee);		//Return the removed employee reference.
        		}
        	}
        	
        	return null; //if employee is not found, return Null.
        }


        public boolean isInTable(int employeeNumber) {
                // Return true if the specified employee is in the hash table, false otherwise.
        	
        	int bucketAddress = this.calcBucket(employeeNumber);		//bucketAddress holds the address of the bucket employeeNumber resides in.
        	
        	for (int i = 0; i < buckets[bucketAddress].size(); i++) {		//Search the bucket for the employeeNumber
        		        		
        		if(employeeNumber == buckets[bucketAddress].get(i).employeeNumber) {		//If employeeNumber found, return true.
        			return true;

        		}
        	}
        	
        	return false; 	//If the employee is not found, return False.
        	
        }
        
        public void printTable() {
        	//Prints each element of each bucket for the entire table.
        	
        	for (int i = 0; i < buckets.length; i++) {
        		
        		System.out.println("");
        		
        		System.out.println("Bucket " + i + ":");
        		
        		for (int x = 0; x < buckets[i].size(); x++) {
        			EmployeeInfo employeeToPrint = buckets[i].get(x);
        			System.out.println(employeeToPrint.firstName + " " + employeeToPrint.lastName + " " + employeeToPrint.employeeNumber);
        		}
        		
        	}
        	
        }
        
        public void printAnnualNetIncomes() {
        	//Prints all employees in the hash table, sorted by bucket, along with their annual net income
	
        	for (int i = 0; i < buckets.length; i++) {
        		
        		System.out.println("");
        		
        		System.out.println("Bucket " + i + ":");
        		
        		for (int x = 0; x < buckets[i].size(); x++) {
        			EmployeeInfo employeeToPrint = buckets[i].get(x);
        			
        			if (employeeToPrint instanceof FTEmp) {
        				System.out.print(employeeToPrint.firstName + " " + employeeToPrint.lastName + " ");
        				System.out.println(" Salary: " + ((FTEmp) employeeToPrint).calcAnnualNetIncome());
        			}
        			
        			else {
        				System.out.print(employeeToPrint.firstName + " " + employeeToPrint.lastName + " ");
        				System.out.println(" Salary: " + ((PTEmp) employeeToPrint).calcAnnualNetIncome());
        			}
        		}
        		
        	}
        	
        }
        
        public EmployeeInfo readFromTable(int empNum) {
        	//Returns reference value of employee
        	
        	int bucketAddress = calcBucket(empNum);
        	
        	for (int x = 0; x < buckets[bucketAddress].size(); x++) {
        		
        		EmployeeInfo searchedEmployee = buckets[bucketAddress].get(x);
        		
        		if(empNum == searchedEmployee.employeeNumber) {
        			return searchedEmployee;
        		}
        		
        	}
        	
			return null; //If employee is not found, return null.
        }
        
        public void generateTestHashTable(){//Call it by the hash table!
            //Generate Sample Employees and Add them to the Hash Table
            EmployeeInfo[] arrayOfEmployees = new EmployeeInfo[100];

            for(int x = 1; x <= 100; x++) {

                arrayOfEmployees[x-1] = new FTEmp
                                                            (x,
                                                                    "first_" + Integer.toString(x),
                                                                    "last_" + Integer.toString(x),
                                                                    1/x,
                                                                    "Male",
                                                                    "Mississauga",
                                                                    x*23.4);
            }

            EmployeeInfo[] arrayOfPTEmployees = new EmployeeInfo[100];

            for(int x = 1; x <=100; x++) {

                int i = x + 1000;

                arrayOfPTEmployees[x-1] = new PTEmp
                                                            (i,
                                                                    "First_" + Integer.toString(i),
                                                                    "last_" + Integer.toString(i),
                                                                    1/i,
                                                                    "Male",
                                                                    "Mississauga",
                                                                    i - 500,
                                                                    2,
                                                                    2);
            }


            //Add employees to hashTable

            for(int x = 0; x < 100; x++) {
                this.addToTable(arrayOfEmployees[x]);
            }

            for(int x = 0; x < 100; x++) {
                this.addToTable(arrayOfPTEmployees[x]);
            }

            PTEmp customEmployee1 = new PTEmp(565174, "John", "Zhou", 0.0, "Male", "Mississauga", 10, 10, 10);
            this.addToTable(customEmployee1);

            FTEmp customEmployee2 = new FTEmp(420, "Alicia", "Pan", 0.0, "Female", "Mississauga", 120000);
            this.addToTable(customEmployee2);

            }
        
        public Object[][] create2DArrayOfAllEmployeeAttributes(){
            //Instantiate counter to track each employee's position in the array.
            int employeeNumInArray = 0;
            
            
            //Instantiate 2D Array
            Object[][] allEmployeesArray = new Object[numberOfEntities][7];

            //For each bucket
            for (int bucket = 0; bucket < buckets.length; bucket++) {
                //For Each Employee
                for (int currentEmployee = 0; currentEmployee < buckets[bucket].size(); currentEmployee++) {
                    
                    EmployeeInfo employeeToPrint = buckets[bucket].get(currentEmployee);
                    employeeToPrint.addEmployeeAttributesTo2DArray(allEmployeesArray, employeeNumInArray);
                    
                    //Increase Counter
                    employeeNumInArray ++;
                    
                }
            }
            
            return allEmployeesArray;
        }
        
        public Object[][] create2DArrayOfAllEmployeeAttributes(EmployeeInfo[] arrayOfEmployees){
            
            
            //Instantiate 2D Array
            Object[][] allEmployeesArray = new Object[arrayOfEmployees.length][7];

            //make 2d array from arrayOfEmployees
            for (int employeeNumInArray = 0; employeeNumInArray < arrayOfEmployees.length; employeeNumInArray++) {
                arrayOfEmployees[employeeNumInArray].addEmployeeAttributesTo2DArray(allEmployeesArray, employeeNumInArray);
            }
            
            return allEmployeesArray;
        }
        
        public MyHashTable createFilteredHashTable(String searchedEmpNum){
            
            //Find length of searchedEmpNum for future string building from actual employee numbers for comparison
            int lengthOfSearchedEmpNum = searchedEmpNum.length();
            
            //Instantiate filteredHashTable
            MyHashTable filteredHashTable = new MyHashTable(10);
            
            //Go through each element of the original hash table and add it to the filteredHashTable if it matches searchedEmpNum
            
            //For each bucket
            for (int bucket = 0; bucket < buckets.length; bucket++) {
                //For each employee in each bucket
                for(int employeePosition = 0; employeePosition < buckets[bucket].size(); employeePosition++){
                    
                    //Get employee
                    EmployeeInfo employee = buckets[bucket].get(employeePosition);

                    String employeeNumberAsString = Integer.toString(employee.employeeNumber);
                    
                    if(employeeNumberAsString.length() >= lengthOfSearchedEmpNum){//Only execute if employeeNumberAsString is long enough
                        //Get a string of the first x digits of the employee number for comparison
                        String comparisonEmployeeNumber = employeeNumberAsString.substring(0,lengthOfSearchedEmpNum);
                        
                        //If comparison string == searchedEmpNum, add to filterd hash table
                        if(comparisonEmployeeNumber.equals(searchedEmpNum) == true){
                            filteredHashTable.addToTable(this.readFromTable(employee.employeeNumber));
                        }
                    }
 
                }
     
            }
            
            return filteredHashTable;
        }
        
        
        public EmployeeInfo[] sortHashTableByEmpNum(){
            EmployeeInfo[] arrayOfSortedEmployees = new EmployeeInfo[numberOfEntities];
            int[] arrayOfEmployeeNumbers = new int[numberOfEntities];
            
            //Fill array of sorted employee numbers
            int employeeNumInArray = 0;
            //For each bucket
            for (int bucket = 0; bucket < buckets.length; bucket++) {
                //For Each Employee
                for (int currentEmployee = 0; currentEmployee < buckets[bucket].size(); currentEmployee++) {
                    
                    arrayOfEmployeeNumbers[employeeNumInArray] = (buckets[bucket].get(currentEmployee)).employeeNumber;
                    
                    //Increase Counter
                    employeeNumInArray ++;
                    
                }
            }            
            
            //Sort array of sorted employees
            Arrays.sort(arrayOfEmployeeNumbers);
            
            //Convert employee numbers into employee references
            for(int empPosition = 0; empPosition < numberOfEntities; empPosition++){
                arrayOfSortedEmployees[empPosition] = this.readFromTable(arrayOfEmployeeNumbers[empPosition]);
            }
            
            return arrayOfSortedEmployees;
            
        }
                
        
}
