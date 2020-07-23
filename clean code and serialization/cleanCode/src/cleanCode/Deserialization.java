package cleanCode;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
public class Deserialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fileInputForDeserialization;
		System.out.println("Employee deserialized sucessfully..! ");
		Student deserializedObject = null;
		try {
			fileInputForDeserialization = new FileInputStream("C:\\Users\\duggi\\Desktop\\employee.ser");
			ObjectInputStream inputStreamForDeserialization = new ObjectInputStream(fileInputForDeserialization);
			deserializedObject = (Student)inputStreamForDeserialization.readObject();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Deserialized object name is : "+deserializedObject.Name);
		System.out.println("Deserialized object name is : "+deserializedObject.Roll);
		
	}

}
