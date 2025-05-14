package idh.java.sets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import idh.java.sets.util.NameGenerator;

public class HashSetDemo {

	public static void main(String[] args) throws IOException {

		NameGenerator ng = new NameGenerator();
		
		List<Student> studentList = new ArrayList<Student>();

		
		//20 Studis generieren und zur Liste hinzufügen
		for(int matrikel = 8669480; matrikel < 8669500; matrikel ++) {
			Student student = new Student(ng.getName(), matrikel);
			studentList.add(student);
		}
		for (Student student : studentList) {
			System.out.println(student);
		}
		System.out.println("Anzahl Studierende: " + studentList.size());
		
		// Studi mit bereits vergebener Matrikelnummer zur Liste hinzufügen
		studentList.add(new Student(ng.getName(), 8669480));
		System.out.println("Anzahl Studierende: " + studentList.size());
		
		// Matrikelnummer in der Liste mehrfach vergeben
		System.out.println("Mehrfach vorhandene Matrikelnummer in Studiliste:");
		for (Student student : studentList) {
			if(student.getMatrikelNummer()==8669480) {
				System.out.println(student);
			}
		}
		
		// TODO: StudentSet anlegen und mit allen Einträgen der Liste füttern
		
		
		// TODO: Schauen, wer im StudentSet gelandet ist
		
	}

}
