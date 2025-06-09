class Detail {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String newName) {
		name = newName;
	}

	public void setAge(int newAge) {
		age = newAge;
	}
}

public class Encapsulation
{
	public static void main(String[] args) {
		Detail s1 = new Detail();
		s1.setName("india");
		s1.setAge(21);
		System.out.printf("%s %d",s1.getName(),s1.getAge());
	}
}