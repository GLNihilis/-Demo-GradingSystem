package Student;

public class Student extends Person{
	public double Mark;
	
	
	public double getMark() {
		return Mark;
	}
	public void setMark(double mark) {
		Mark = mark;
	}
	
	
	public Student(String iD, String name, String classID, int birth, String gender, String address, double mark) {
		super(iD, name, classID, birth, gender, address);
		Mark = mark;
	}
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String iD, String name, String classID, int birth, String gender, String address) {
		super(iD, name, classID, birth, gender, address);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String Rank() {
		// TODO Auto-generated method stub
		return null;
	}

}
