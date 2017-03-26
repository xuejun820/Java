package systemdemo;

public class SystemDemo {
public static void main(String[] args) {
	Person p=new Person("xuejun",23);
	p=null;
	System.gc();
}
}

class Person
{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public void finalize() throws Throwable
	{
		System.out.println("对象被释放："+this);
	}
	
}
