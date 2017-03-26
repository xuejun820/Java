package clone;

public class CloneDemo 
{
	public static void main(String[] args) throws CloneNotSupportedException {
		Person p1=new Person("xuejun");
		Person p2=(Person) p1.clone();
		p2.setName("xiaohui");
		System.out.println(p2);
	}
}

class Person implements Cloneable
{
	private String name;

	
	
	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
	
}