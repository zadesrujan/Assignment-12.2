package handling;
//here we cretaed package as handling which that organizes a set of related classes and interfaces.
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		//public : it can be called from anywhere.
		//static : doesn't belong to a specific object.
		//void : returns to no value.
		//main : is special because it will start the program.
		// TODO Auto-generated method stub
		String[] arr = new String[7]; 
		// Initializing the string array of size 7

        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); 
        // Scanner object to get the user

        // input

        for (int i = 0; i < arr.length; i++) { 
        	// Getting input from the user

            // Assuming only one word will

            // be entered
//here it will print the one word and once the word is printed then it will increment to next one
            System.out.print("String #" + (i + 1) + ": ");
//here it will point the scanner to take next element in the array
            arr[i] = sc.next();

        }

        String str;
        //initializing a string datatype

        System.out.print("\nEnter the string to search: ");

        str = sc.next(); 
        // Getting the search string from user

        String str1 = searchString(arr, str); 
        // calling the method to search

                                                // string in array

        if (str1 == null) { 
        	// If method returned null, that means string not

                            // found

            System.out.println("String not found.");

        } else { 
        	// else string found and result printed accordingly

            System.out.println("String found.");
          //system : is a class in java language pacakge.
			//out : static member of the system class.
			//println : to print what is output.

        }

    }

    // method to search the string

    private static String searchString(String[] arr, String str) {
 //Flow of try catch block.,If an exception occurs in try block then the control of execution
 //is passed to the catch block from try block. The exception is caught up by the corresponding catch block
        try {

            int i;
            //initializing the int data type

            for (i = 0; i < arr.length; i++) { 
            	// for loop to search the string

                                                // in array

                if (arr[i].equals(str)) { 
                	// If string found stop the loop

                    break;

                }

            }

            if (i == arr.length) { 
            	
            	throw new ValueNotFoundException();
            	// So exception is thrown

            } else {

                return str; 
                // if i is less than array length, it means value

               // found , so returned the string itself

            }

        } catch (ValueNotFoundException e) {

            return null; 
            // If exception caught then null is returned

        }

    }


	}


