package sorting.bubble;

import searching.linear.simple.student.FakeStudentCreatorService;
import searching.linear.simple.student.Student;

import java.util.Arrays;

public class StudentSorter {
	public void sort(Student[] students) {
		for (int counter = 0; counter < students.length; counter++) {
			for (int index = 0; index < (students.length - 1); index++) {
				if (students[index].getRollNumber() > students[index + 1].getRollNumber()) {
					Student temp = students[index];
					students[index] = students[index + 1];
					students[index + 1] = temp;
				}
			}
			
		}
	}
}
