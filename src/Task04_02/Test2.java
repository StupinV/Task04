package Task04_02;

public class Test2 {
	
    public Test2(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int age;
    public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		
		Test2 cat = new Test2(5,"Barsik");
        System.out.println("Name: " + cat.name);
        System.out.print("Age: " + cat.age);

	}
	
	

}
