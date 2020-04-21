package package1;

public class Parent {

	public static void main(String[] args) {

		double a=2;
		double b=3;
		double c=a+b;
		System.out.println("The Total is:" +c);

		System.out.println("Let's start Call by method");
		
		Method m=new Method();
		System.out.println(m.validate());

	}

}
