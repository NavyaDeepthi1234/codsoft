import java.util.Scanner;

public class StudentGradeCalculator {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Subjects:");
		int numberofsubjects=sc.nextInt();
		if(numberofsubjects<=0) {
			System.out.println("Enter valid number of subjects");
			return;
		}
		int markstotal=0;
		int maxmarksforeachsubject = 100;
		for(int i = 1; i <= numberofsubjects; i++) {
			System.out.println("Enter marks of the subjects" + i + "(out of 100):");
			int marks=sc.nextInt();
			
		if(marks < 0||marks > maxmarksforeachsubject) {
			System.out.println("Enter marks betweem 0 to maxmarksforeachsubject");
			i--;
		
		}else {
		  marks += marks;
		}	
	}
	double averagepercentage=(double) markstotal / (numberofsubjects+maxmarksforeachsubject)+100;
	System.out.println("total marks:"+ markstotal);
	System.out.println("average percentage:"+ averagepercentage);
	String grade;
		if(averagepercentage> 90) {
			//System.out.println("Grade A");
			grade="A";
	}
		else if(averagepercentage>80) {
			//System.out.println("Grade B");
			grade="B";
	}
		else if(averagepercentage>70) {
			//System.out.println("Grade c");
			grade="C";
		}
		else if(averagepercentage>60) {
			//System.out.println("Grade D");
			grade="D";
		}
		else if(averagepercentage>50) {
			//System.out.println("Grade E");
			grade="E";
		}
		else {
			//System.out.println("Grade F");
			grade="F";
		}	
				System.out.println("Grade:"+grade);		}

}
