package Encapsulation;
class Java_Batch	// encapsulated class
{
	// private data member
	private String name;
	private int batch_id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBatch_id() {
		return batch_id;
	}
	public void setBatch_id(int batch_id) {
		this.batch_id = batch_id;
	}
}
public class Encapsul_Test1 
{
	public static void main(String[] args) {
		Java_Batch jb = new Java_Batch();
		jb.setName("Java Core");
		jb.setBatch_id(4778);
		System.out.println(jb.getName()+" "+jb.getBatch_id());
	}

}
