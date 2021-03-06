package chap02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		Greeter g1= ctx.getBean("greeter", Greeter.class);
		Greeter g2= ctx.getBean("greeter", Greeter.class);
		
		Greeter g3= ctx.getBean("greeter2", Greeter2.class);
		
		String msg = g1.greet("스프링");
		System.out.println(msg);
		
		System.out.println("(g1 == g2) = "+(g1==g2));
		System.out.println("(g1 == g3) = "+(g1==g3));
		ctx.close();
	}

}
