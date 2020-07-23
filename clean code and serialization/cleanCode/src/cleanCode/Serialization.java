package cleanCode;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class Serialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student();
		student1.Name = "Nikhil";
		student1.Roll = 533;
		
		try {
			FileOutputStream fileOutputObject = new FileOutputStream("C:\\Users\\duggi\\Desktop\\employee.ser");
			ObjectOutputStream outputStreamForSerialization = new ObjectOutputStream(fileOutputObject);
			outputStreamForSerialization.writeObject(student1);
			System.out.println("Employee serialized Sucessfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
