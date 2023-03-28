package Constructor;

public class Constructor_overload 
{
int age;
String name;
String address;

// constructor 1 with 2 argument
Constructor_overload(int a,String n){
	age = a;
	name = n;
	}
//constructor 1 with 2 argument
Constructor_overload(int a,String n,String add){
	age = a;
	name = n;
	address = add;
}
public void show() {
	System.out.println(name+" "+age+" "+address);
}
public static void main(String[] args) {
	Constructor_overload obj = new Constructor_overload(25,"Tushar");
	Constructor_overload obj1 = new Constructor_overload(25,"Tushar","Solapur");
	obj.show();
	obj1.show();
	
}
}
