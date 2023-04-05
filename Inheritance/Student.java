package Inheritance;

public class Student {
	int stud_id;
	String stud_name;
	Address add;   //Aggregation
	Student(int stud_id, String stud_name,Address add){
		this.stud_id=stud_id;
		this.stud_name=stud_name;
		this.add=add;
	}
	void show() {
		System.out.println(stud_id+" "+stud_name);
		System.out.println(add.City+" "+add.Dist+" "+add.Country);
	}

}
