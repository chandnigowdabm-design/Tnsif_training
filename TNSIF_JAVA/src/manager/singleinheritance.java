package manager;

class course
{
	String courseName="Java programming";

void showCourse()
{
	System.out.println("course:"+courseName);
}
}
class student extends course
{
	String Name ="Chand";

void showStudent()
{
	System.out.println("student:"+Name);
}
}

public class singleinheritance {

	public static void main(String[] args) {
		student std =new student() {
			std.showStudent();
			std.showCourse();
		}

	}

}
