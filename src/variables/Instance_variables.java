package variables;

public class Instance_variables {
	public int rollnum;
	public String name;
	public int totalMarks;
	public int number;
	public static void main(String args[])
	{
		Instance_variables in=new Instance_variables();
		in.rollnum=10091;
		in.name="Aditi";
		in.totalMarks=480;
		in.number=10012;
		
		System.out.println(in.rollnum);
		System.out.println(in.name);
		System.out.println(in.totalMarks);
		System.out.println(in.number);
		
	}
}
