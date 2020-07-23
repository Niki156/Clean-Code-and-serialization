package cleanCode;

import java.io.Serializable;

public class Student implements Serializable{
	String Name;
	int Roll;
	Student(String name, int roll)
	{
		this.Name = name;
		this.Roll = roll;
	}
	Student()
	{
		
	}
}
