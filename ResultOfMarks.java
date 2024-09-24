
public class ResultOfMarks {

	public static void main(String[] args) {
		StudentMarks objMarks=new StudentMarks();
		objMarks.setMarks(10, 20,70);
		System.out.println("Subject 1 Marks: " + objMarks.getSubject11());
	    System.out.println("Subject 2 Marks: " + objMarks.getSubject2());
	    System.out.println("Subject 3 Marks: " + objMarks.getSubject3());
	    
	    objMarks.getResults();
		
	}

}
