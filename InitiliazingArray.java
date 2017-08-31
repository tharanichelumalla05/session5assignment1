/*here declaring an integer array of size 10,initializing using for loop 1 to 10 and printing all even numbers from an array*/

package session5;// here I have created a package as session5
public class InitiliazingArray{
	//declares a class called InitiliazingArray
		//classes are the basics of opps(object oriented programming)
	public static void main(String []args){
		//TODO Auto-generated method stub
				//Here public is a access modifier which defines who can access this method
				//Here static a keyword which identifies class related thing
				//void is used to define return type of the method,void means method wont return any value
				//main is name of method
				//declares method String[]
				//String[]args means arguments will be passed into main method and says that main() as a parameter

		
		int a[]=new int[10];//initializing value a
		System.out.println("even numbers from 1 to 10 are"); 
				//system is used to return code
				//Println is used to print text even numbers from 1 to 10 are and gives output
		
		for ( int i = 1; i<a.length; i++){//for loop repeats a statement or group of statements while a given condition is true
			//i equals to 1,i less than a,i increment
						
			if (i % 2==0){//here if statement is true displays information
				System.out.println( i);
				//success
				//system is used to return code
				//out is static number
				//Println is used to print text i and gives output
			}
            }
 
        }
		
	

}

