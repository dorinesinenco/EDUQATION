package main;

import java.util.ArrayList;

import data.Student;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> students = new ArrayList<>();
		
		students.add(new Student("Вася Пекус", 21, 9.5f));
		students.add(new Student("Nana Pecus", 12, 5.5f));
		students.add(new Student("Tanea Pecus", 29, 11.5f));

		for (Student student : students) {
			System.out.println(student.getFulName());
		}
		
		students.forEach(s->System.out.println(s.getAge()));
		students.forEach(System.out::println);
		students.forEach(Application::printStudent);
	}
	
	public static void printStudent(Student s) {
		System.out.println(s.getMark());
	}
	

}
