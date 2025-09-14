package assignments;

public class Assignment3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] Empname = new String[3];
		int[] Empid = new int[3];
		
		Assignment3_1 obj1 = new Assignment3_1();
		Empname[0]= obj1.emp1Name;
		Empname[1]= obj1.emp2Name;
		Empname[2]= obj1.emp3Name;
		
		Empid[0]=obj1.emp1Id;
		Empid[1]=obj1.emp2Id;
		Empid[2]=obj1.emp3Id;
		
		System.out.println("Employee Name:" + Empname[0] + " Employee ID:" + Empid[0]);
		System.out.println("Employee Name:" + Empname[1] + " Employee ID:" + Empid[1]);
		System.out.println("Employee Name:" + Empname[2] + " Employee ID:" + Empid[2]);
		

	}

}
