package Student;

public abstract class Person {
	public String ID;
	public String Name;
	public String ClassID;
	public int Birth;
	public String Gender;
	public String Address;
	
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getClassID() {
		return ClassID;
	}
	public void setClassID(String classID) {
		ClassID = classID;
	}
	public int getBirth() {
		return Birth;
	}
	public void setBirth(int birth) {
		Birth = birth;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	
	public Person(String iD, String name, String classID, int birth, String gender, String address) {
		super();
		ID = iD;
		Name = name;
		ClassID = classID;
		Birth = birth;
		Gender = gender;
		Address = address;
	}
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public abstract String Rank();
}
