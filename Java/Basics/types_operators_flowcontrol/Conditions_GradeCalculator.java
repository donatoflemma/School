package types_operators_flowcontrol;



public class Conditions_GradeCalculator {

	public static void main(String[] args) {
		
		int score =75;
		String grade;
		
		//--------------------------
		if (score <= 60) 
			grade = "Fail";
		else if (score < 70)
			grade = "D";
		else if (score < 80)
			grade = "C";
		else if (score < 90)
			grade = "B";
		else if (score <= 100)
			grade = "A";
		else
			grade = "Invalid score";
		
		System.out.println(grade);
		
		//---------------------------
		if (score <= 60) 						grade = "Fail";
		else if(score >= 60 &&  score < 70) 	grade = "D";			
		else if(score >= 70 &&  score < 80)		grade = "C";				
		else if(score >= 80 &&  score < 90)		grade = "B";					
		else if(score >= 90 &&  score <= 100)	grade = "A";
		else grade = "Invalid score";
		
		System.out.println(grade);
		
		
	}
	
}
