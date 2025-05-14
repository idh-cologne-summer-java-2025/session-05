package idh.java.maps;

import java.util.Iterator;

import idh.java.maps.util.NameGenerator;

public class Course implements Iterable<Student> {
	
	// TODO: change to Map!
	Student[] members;
	
	int nextPosition = 0;
	String name;


	public Course(String name, int numberOfStudents) {
		this.members = new Student[numberOfStudents];
		this.name = name;
	}
	
	
	public void addMember(Student student) throws Exception {
		// TODO: Use Map!
		if (nextPosition < members.length)
			members[nextPosition++] = student;
		else
			throw new Exception("Class full");
	}
	
	public int size() {
		return members.length;
	}
	
	public Student getMember(int matrikel) {
		// TODO: Use Map!
		return members[matrikel];
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isFull() {
		return nextPosition >= members.length;
	}

	@Override
	public Iterator<Student> iterator() {
		return new StudentIterator(this);
	}

}
