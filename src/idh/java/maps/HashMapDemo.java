package idh.java.maps;

import java.util.ArrayList;
import java.util.List;

import idh.java.maps.util.NameGenerator;

public class HashMapDemo {

	public static void main(String[] args) throws Exception {

		NameGenerator ng = new NameGenerator();

		List<Student> studentList = new ArrayList<Student>();

		Student student = null;
		// 10 Studis generieren und zur Liste hinzufügen
		for (int matrikel = 8669490; matrikel < 8669500; matrikel++) {
			student = new Student(ng.getName(), matrikel);
			studentList.add(student);
		}
		// Letzten Studi noch einmal hinzufügen
		System.out.println("Anzahl Studierende: " + studentList.size());

		Course course = new Course("Java2", 11);
		for (Student participant : studentList) {
			course.addMember(participant);
		}
		

	}

}
