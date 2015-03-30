
public class Professor {
	private String name;
	private Lecture lecture;
	
	public Professor(){
		
	}
	public Professor(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void addLecture(Lecture lecture){
		this.lecture = lecture;
	}
	public void showLecture(){
		System.out.println(lecture.getName());
	}
	
	
}
