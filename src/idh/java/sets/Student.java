package idh.java.sets;

public class Student{
	String name;
	int matrikelNummer;

	public int getMatrikelNummer() {
		return matrikelNummer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name, int mNum) {
		super();
		this.name = name;
		this.matrikelNummer = mNum;
	}

	@Override
	public String toString() {
		return matrikelNummer + " " + name;
	}

	@Override
	public boolean equals(Object o) {
		if (! (o instanceof Student))
			return false;
		Student s = (Student) o;
		return this.hashCode() == s.hashCode();
	}
	
	@Override
	public int hashCode() {
		return matrikelNummer;
	}
	
}
