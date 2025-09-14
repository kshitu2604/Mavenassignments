package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment4_collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String>Student01= new HashMap<String,String>();
		Student01.put("Name" , "John Doe");
		Student01.put("Age" ,"20");
		Student01.put("Category","Male");
		Student01.put("Roll Number" ," S1234");
		Student01.put("Grade", "A");
		Student01.put("Major", "Computer Science");
		Student01.put("Warranty", "3.8");
		Student01.put("Email", "john@example.c");
		Student01.put("Contact Number","9999997777");
		Student01.put("Address"," 123 ElmSt");
		
		Map<String,String>Student02= new HashMap<String,String>();
		Student02.put("Name","Jane Smith");
		Student02.put("Age"," 21");
		Student02.put("Category"," Female");
		Student02.put("Roll Number","S12346");
		Student02.put("Grade"," B");
		Student02.put("Major"," Mathematics");
		Student02.put("Warranty"," 3.5");
		Student02.put("Email"," jane@example.c");
		Student02.put("Contact Number"," 9876665666");
		Student02.put("putress"," 456 OakSt");
		
		Map<String,String>Student03= new HashMap<String,String>();
		Student03.put("Name "," Mike Brown");
		Student03.put("Age"," 22");
		Student03.put("Category"," Male");
		Student03.put("Roll Number ","S1234");
		Student03.put("Grade","A");
		Student03.put("Major"," Physics");
		Student03.put("Warranty"," 3.9");
		Student03.put("Email"," mike@example.com");
		Student03.put("Contact Number"," 8787876546");
		Student03.put("putress","789 Pine St");
		
		
		Map<String,Map<String,String>>Student1 = new HashMap<String,Map<String,String>>();
		Student1.put("Student1" , Student01);
		
		Map<String,Map<String,String>>Student2 = new HashMap<String,Map<String,String>>();
		Student2.put("Student2" , Student02);
		
		Map<String,Map<String,String>>Student3 = new HashMap<String,Map<String,String>>();
		Student3.put("Student3" , Student03);
		
		List<Map<String,Map<String,String>>>StudentList = new ArrayList<Map<String,Map<String,String>>>();
		StudentList.add(Student1);
		StudentList.add(Student2);
		StudentList.add(Student3);
		
		//------------------------------------------------------------------------------
		
		Map<String,String>Employee01= new HashMap<String,String>();
		Employee01.put("Employee ID" , "E001");
		Employee01.put("Name" ,"Alice Green");
		Employee01.put("Age","30");
		Employee01.put("Gender" ," Female");
		Employee01.put("Department", "Engineering");
		Employee01.put("Position", "Software Engineer");
		Employee01.put("Salary", "75,000");
		Employee01.put("Email", "alice@example.com@example.c");
		Employee01.put("Contact Number","9876543213");
		
		Map<String,String>Employee02= new HashMap<String,String>();
		Employee02.put("Employee ID","E002");
		Employee02.put("Name"," Bob Johnson");
		Employee02.put("Age"," 35");
		Employee02.put("Gender","Male");
		Employee02.put("Department","Marketing");
		Employee02.put("Position"," Marketing Manager");
		Employee02.put("Salary"," 85,000");
		Employee02.put("Email"," bob@example.com");
		Employee02.put("Contact Number"," 9876543214");
		
		Map<String,String>Employee03= new HashMap<String,String>();
		Employee03.put("Employee ID ","E003");
		Employee03.put("Name"," Carol White");
		Employee03.put("Age"," 28");
		Employee03.put("Gender ","Female");
		Employee03.put("Department","Sales");
		Employee03.put("Position"," Sales Executive");
		Employee03.put("Salary"," 65,000");
		Employee03.put("Email"," carol@example.com");
		Employee03.put("Contact Number"," 9876543215");
		
		
		Map<String,Map<String,String>>Employee1 = new HashMap<String,Map<String,String>>();
		Employee1.put("Employee1" , Employee01);
		
		Map<String,Map<String,String>>Employee2 = new HashMap<String,Map<String,String>>();
		Employee2.put("Employee2" , Employee02);
		
		Map<String,Map<String,String>>Employee3 = new HashMap<String,Map<String,String>>();
		Employee3.put("Employee3" , Employee03);
		
		List<Map<String,Map<String,String>>>EmployeeList = new ArrayList<Map<String,Map<String,String>>>();
		EmployeeList.add(Employee1);
		EmployeeList.add(Employee2);
		EmployeeList.add(Employee3);
		
		//-----------------------------------------------------------------------------------
		
		Map<String,String>Product01= new HashMap<String,String>();
		Product01.put("Product ID" , "P001");
		Product01.put("Name" ,"Laptop");
		Product01.put("Category","Electronics");
		Product01.put("Price" ," $1,200");
		Product01.put("Stock Quantity", "50");
		Product01.put("Supplier", "Tech Supplies");
		Product01.put("Warranty", "2 years");
		Product01.put("Rating", "4.5");
		Product01.put("Manufacturing Date","15-01-2023");
		Product01.put("Address"," 15-01-2025");
		
		Map<String,String>Product02= new HashMap<String,String>();
		Product02.put("Product ID","P002");
		Product02.put("Name"," Desk Chair");
		Product02.put("Category"," Furniture");
		Product02.put("Price","$150");
		Product02.put("Stock Quantity"," B");
		Product02.put("Supplier"," Office Depot");
		Product02.put("Warranty"," 1 year");
		Product02.put("Rating","4");
		Product02.put("Manufacturing Date"," 10-02-2023");
		Product02.put("Expiry Date","  N/A");
		
		Map<String,String>Product03= new HashMap<String,String>();
		Product03.put("Product ID"," P003");
		Product03.put("Name"," Coffee Maker");
		Product03.put("Category"," Kitchen");
		Product03.put("Price ","$75");
		Product03.put("Stock Quantity","100");
		Product03.put("Supplier"," KitchenWorld");
		Product03.put("Warranty"," 6 months");
		Product03.put("Rating"," 4.2");
		Product03.put("Manufacturing Date"," 20-03-2023");
		Product03.put("Expiry Date","20-03-2024");
		
		
		Map<String,Map<String,String>>Product1 = new HashMap<String,Map<String,String>>();
		Product1.put("Product1" , Product01);
		
		Map<String,Map<String,String>>Product2 = new HashMap<String,Map<String,String>>();
		Product2.put("Product2" , Product02);
		
		Map<String,Map<String,String>>Product3 = new HashMap<String,Map<String,String>>();
		Product3.put("Product3" , Product03);
		
		List<Map<String,Map<String,String>>>ProductList = new ArrayList<Map<String,Map<String,String>>>();
		ProductList.add(Product1);
		ProductList.add(Product2);
		ProductList.add(Product3);
		
		
		//------------------------------------------------------------------------------------
		
		Map<String,List<Map<String,Map<String,String>>>> Data = new HashMap<String,List<Map<String,Map<String,String>>>>();
		Data.put("StudentTable",StudentList);
		Data.put("EmployeeTable",EmployeeList);
		Data.put("ProductTable",ProductList);
		
		//--------------------------------------------------------------------------------------------
		
		System.out.println(Data.get("ProductTable").get(1).get("Product2").get("Supplier"));

	}

}

		