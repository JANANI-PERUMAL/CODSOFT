package cs;
import java.util.Scanner;

public class Studentgradecalculator
{
	Scanner sn = new Scanner(System.in);
	int num;	//number of subjects
	int marks[];
	double total=0;
	int average;
	String grade;
	Studentgradecalculator()
	{
		System.out.println("Enter the number of subjects:");
		num = sn.nextInt();
		marks=new int[num];
		System.out.println("Enter the marks obtained in each subject:");
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter the subject " + (i+1) +" mark : ");
			marks[i]=sn.nextInt();
			total += marks[i];
		}
		System.out.println("Total marks obtained by a student is: " + total);
	}
	 void calculateaverage()
	 {
		 average =  (int) (total/num);
		 System.out.println("Average percentage: " + average);
	     
	    	 if(average>90)
	    	 {
	    		 System.out.println("Grade A");
	    		
	    	 }
	    	 else if(average<=90 && average>80)
	    	 {
	    		 System.out.println("Grade B");
	    		 
	    	 }
	    	 else if(average<=80 && average>70)
	    	 {
	    		 System.out.println("Grade C");
	    		 
	    		 
	    	 }
	    	 else if(average<=70 && average>60)
	    	 {
	    		 System.out.println("Grade D");
	    		
	    		 
	    	 }
	    	 else if(average<=70 && average>60)
	    	 {
	    		 System.out.println("Grade D");
	    		 
	         }
	    	 else if(average<=60 && average>50)
	    	 {
	    		 System.out.println("Grade E");
	    	 }
	    	 else
	    	 {
	    		System.out.println("FAILED"); 
	    	 }
	    		 
	 }
	 public static void main(String[] args)
	{
         Studentgradecalculator obj = new   Studentgradecalculator();
         obj.calculateaverage();
	}

}
