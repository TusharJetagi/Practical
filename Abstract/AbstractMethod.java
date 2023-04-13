package Abstract;

abstract class AbstractMethod1
{
	abstract void areaofRectangle();
	abstract void peremeterofRectangle();
		
}
class Demo1 extends AbstractMethod1{
	int l=5 ,w=8;
	void areaofRectangle() 
	{
		int a = l*w;
		System.out.println("Area is:-"+a);
		
	}
	@Override
	void peremeterofRectangle() {
		// TODO Auto-generated method stub
		
	}
}
class Demo2 extends AbstractMethod1{
	void peremeterofRectangle() {
		int l=6,w=6;
		int p = 2*(l+w);
		System.out.println("Peremeter is:- "+p);
	}

	@Override
	void areaofRectangle() {
		// TODO Auto-generated method stub
		
	}
}
public class AbstractMethod{
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		Demo2 d1 = new Demo2();
		d.areaofRectangle();
		d1.peremeterofRectangle();
	}
}
