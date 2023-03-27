package Access_Mod;
import package_eg.*;
public class Default_AM {
	public static void main(String[] args) { // outside package can not access default method and class
		Default_AM_Tst obj = new Default_AM_Tst(); //Compile Time Error  
		obj.msg(); //Compile Time Error  
	
	}
}
