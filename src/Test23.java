import java.util.logging.Handler;

import javax.net.ssl.HandshakeCompletedEvent;

class Aa{
	int num=9;
	Aa(){
		System.out.println("A run"+num);
	}
}

class Ai extends Aa
{ int num=60;
	Ai(int num){
		super();
		System.out.println("Zi run "+num);
	}
	public int hashCode() {
		return num;
	}
}

public class Test23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ai p=new Ai(8);
		Ai pAa=p;
		System.out.println(p.equals(pAa));
		System.out.println(Integer.toHexString(p.hashCode()));
		System.out.println(p.getClass().getName());
	}

}
