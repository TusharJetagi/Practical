package String;

public class String_Buffer 
{
		public static void main(String[] args) 
		{
			
	// concept of string literal
			String name="Tushar";
			String name1="Tushar";
			System.out.println(name==name1);	
			System.out.println("length: "+name.length());
			System.out.println(name.indexOf('s'));
			System.out.println(name.charAt(3));
			
			// ArithmeticException
			int a= 20,b=0;
			System.out.println("Result : "+(a+b));
			
			// compareTo method
			String s1 = "hello";
			String s2 = "hello";
			String s3 = "melon";
			String s4 = "hen";
			String s5 = "fish";
			
			System.out.println(s1.compareTo(s2));
			System.out.println(s1.compareTo(s3));
			System.out.println(s1.compareTo(s4));
			System.out.println(s1.compareTo(s5));
			
			// contains method
			System.out.println(name.contains("san"));
			System.out.println(name.contains("riy"));
			
			// equals method and equalsIgnoreCase method
			String w1 = "Welcome";
			String w2 = "welcome";
			System.out.println(w1.equals(w2));
			System.out.println(w1.equalsIgnoreCase(w2));
			
			

	 StringBuffer buffer = new StringBuffer(); // initial capacity 16
			System.out.println(buffer.capacity()); //16
			buffer.append("Hello Java");
			System.out.println(buffer);

			System.out.println(buffer.capacity()); //16
			buffer.append(" Welcome to Anudip");
			System.out.println(buffer);
			 
		    System.out.println(buffer.capacity()); //(n*2)+2 = (16*2)+2 = 31+2 =34
		    buffer.insert(10," World");
		    System.out.println(buffer);
		
		    // substring is used in two way
		    // 1) By giving the starting index and it will print rest of the string
			System.out.println(buffer.indexOf("weclome"));
			System.out.println(buffer.substring(17));
			
			//2) by giving the start index and the end index -1
			System.out.println(buffer.indexOf("Java"));
			System.out.println(buffer.substring(6, 10));
			
			buffer.delete(11, 16);
			System.out.println(buffer);
			
			System.out.println();
			// string builder -modifiable
			
			StringBuilder builder = new StringBuilder("Java 20");
			System.out.println(builder);
			System.out.println(builder.capacity()); //23
			builder.reverse();
			System.out.println(builder);
			builder.replace(3, 7, "Python");
			System.out.println(builder);
	}
		}


