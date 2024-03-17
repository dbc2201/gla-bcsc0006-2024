package searching.linear.simple.student;

import org.instancio.Instancio;

import java.util.List;

public class FakeStudentCreatorService {
	public Student[] createFakeStudents(int count) {
		List<Student> students = Instancio.ofList(Student.class).size(count).create();
		return students.stream()
				.toArray(Student[]::new);
	}
}
