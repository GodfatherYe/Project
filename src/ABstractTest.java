import javax.crypto.interfaces.DHPublicKey;

abstract class Employee{
	private String name;
	private String id;
	private double pay;
	Employee(String name,String id,Double pay) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.id=id;
		this.pay=pay;
	}
	abstract void work();
}

class Programmer extends Employee{
	Programmer(String name,String id,double pay) {
	
		// TODO Auto-generated constructor stub
	super(name, id, pay);
	}
	public void work() {
		System.out.println("Coding..");
	}
	
}
class Manager extends Employee{
	private double bonus;
	Manager(String name,String id,double pay,double bonus){
		super(name, id, pay);
		this.bonus=bonus;
	}
	public void work() {
		System.out.println("Manager work..");
		System.out.println(bonus);
	}
	
}

public class ABstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager t=new Manager("Ye","110",66,1.4);
		t.work();
	}

}
