package BiggestOfThree;

public class Main {

	public static void main(String[] args) {
		BiggestOfThree m,m1,m2,m3,m4;
		m=new BiggestOfThree();
		m.find();
		m.display();
		m1=new BiggestOfThree(100);
		m1.find();
		m1.display();
		m2=new BiggestOfThree(100,25);
		m2.find();
		m2.display();
		m3=new BiggestOfThree(100,25,2);
		m3.find();
		m3.display();
		m4=new BiggestOfThree(m);
		m4.find();
		m4.display();

	}

}
