package comparable;

public class Students implements Comparable<Students>
{
	private String name;
	private int age;
	private float score;
	public Students(String name, int age, float score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	@Override
	public String toString() {
		return name +"\t\t " +age +"\t\t "+ score;
		
	}
	@Override
	public int compareTo(Students s) {
		if(this.score>s.score)      return -1;
		else if(this.score>s.score) return  1;
		else 
		{
			
		}
		return 0;
	}
	
	
	
	
}
