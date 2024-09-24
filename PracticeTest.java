
public class PracticeTest {
	//Instance variables also called non-static variables
	int id=10; //if we want to use non-static fields, we should create object
	static int id1=100;//class variables or global variables
	String name="Vijaya";//literal and instance variable

	public PracticeTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeTest student=new PracticeTest();
		System.out.println(student.id);
		System.out.println(new PracticeTest().name);

	}
	public static void test1() {
		System.out.println(id1);
	}

}
