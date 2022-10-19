package Student;

public class Student extends Person{
	public double Literature, Math, English, Physical, Chemical, Biology, History, Geography, Ethic, Informatic;

	public double getLiterature() {
		return Literature;
	}

	public void setLiterature(double literature) {
		Literature = literature;
	}

	public double getMath() {
		return Math;
	}

	public void setMath(double math) {
		Math = math;
	}

	public double getEnglish() {
		return English;
	}

	public void setEnglish(double english) {
		English = english;
	}

	public double getPhysical() {
		return Physical;
	}

	public void setPhysical(double physical) {
		Physical = physical;
	}

	public double getChemical() {
		return Chemical;
	}

	public void setChemical(double chemical) {
		Chemical = chemical;
	}

	public double getBiology() {
		return Biology;
	}

	public void setBiology(double biology) {
		Biology = biology;
	}

	public double getHistory() {
		return History;
	}

	public void setHistory(double history) {
		History = history;
	}

	public double getGeography() {
		return Geography;
	}

	public void setGeography(double geography) {
		Geography = geography;
	}

	public double getEthic() {
		return Ethic;
	}

	public void setEthic(double ethic) {
		Ethic = ethic;
	}

	public double getInformatic() {
		return Informatic;
	}

	public void setInformatic(double informatic) {
		Informatic = informatic;
	}

	public Student(String iD, String name, String classID, String birth, String gender, String address, double literature,
			double math, double english, double physical, double chemical, double biology, double history,
			double geography, double ethic, double informatic) {
		super(iD, name, classID, birth, gender, address);
		Literature = literature;
		Math = math;
		English = english;
		Physical = physical;
		Chemical = chemical;
		Biology = biology;
		History = history;
		Geography = geography;
		Ethic = ethic;
		Informatic = informatic;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String iD, String name, String classID, String birth, String gender, String address) {
		super(iD, name, classID, birth, gender, address);
		// TODO Auto-generated constructor stub
	}

	public double GPA() {
		return (Literature + Math + English + Physical + Chemical + History + Geography + Ethic + Informatic) / 10;
	}
	
	@Override
	public String Rank() {
		// TODO Auto-generated method stub
		String Rank;
		if(GPA() == 10)
			Rank = "Excellent";
		else if(GPA() >= 8.5)
			Rank = "Good";
		else if(GPA() >= 7.0)
			Rank = "Medium";
		else if(GPA() >= 5.5)
			Rank = "Average";
		else
			Rank = "Fail";
		return Rank;
	}
	
}
