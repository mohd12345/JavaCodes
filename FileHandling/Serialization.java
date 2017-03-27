import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	String name;
	String id;
	int salary;
	//int bonus;
	public Employee(String name, String id, int salary, int bonus) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		//this.bonus = bonus;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	
}

public class Serialization{
	
	public static void main(String[] args) throws IOException {
	
		String path = "E:\\aazam.dat";
		FileOutputStream fo  = new FileOutputStream(path);
		ObjectOutputStream os = new ObjectOutputStream(fo);
		Employee aazam = new Employee("aazam", "12", 1000, 13813);
		Employee aazam1 = new Employee("mohd", "13", 2000, 12331);
        Employee ojha = new Employee("Anurudh", "14", 31314, 12434);
    //	aazam.salary = aazam.salary+100;
		os.writeObject(aazam);
		os.writeObject(aazam1);
		os.writeObject(ojha);
		os.close();
		fo.close();
		System.out.println("Object save in file..");
	}
}