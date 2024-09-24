
public class StudentMarks {
	
	private int subject1;
	private int subject2;
	private int subject3;
	
	public void setMarks(int maths,int physics,int chemistry) {
		this.subject1=maths;
		this.subject2=physics;
		this.subject3=chemistry;
	}	
	 public int getSubject11(){
		return subject2;
		}
		
	public int getSubject2() {
		return subject2;
		}
		
	public int getSubject3() {
		return subject3;
		}
		
	public void getResults() {
		int average=(subject1+subject2+subject3)/3;
		System.out.println("Average of marks:"+average);
		
		if (average>=80 && average<=100) {
			System.out.println("Grade is: "+ "A");
		}
		else if(average>=73 && average <=79) {
			System.out.println("Grade is: "+ "B+");
		}
		else if(average>=65 && average <=72) {
			System.out.println("Grade is: "+ "B");
		}
		else if (average>=55 && average <=64) {
			System.out.println("Grade is: "+ "C");
		}
		else {
			System.out.println("Grade is: "+ "D");
		}
		
	}

}


