import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HacksaMain {

	public static void main(String[] args) {
		//Professor professor = new Professor("choi");
		//Lecture lecture1 = new Lecture("소프트웨어 공학");
		//Student student = new student("안제원");
		ApplicationContext factory = new ClassPathXmlApplicationContext(
				new String[]{"applicationContext.xml"});
		Professor professor =(Professor)factory.getBean("professor");
		Lecture lecture2 = (Lecture)factory.getBean("lecture2");
		Student student1 = (Student)factory.getBean("student1");
		professor.addLecture(lecture2);
		professor.showLecture();
		lecture2.addStudent(student1);
		lecture2.showStudent();
	}

}
