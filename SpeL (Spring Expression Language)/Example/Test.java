package spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String args[]) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spel/Spel.xml");
		 Demo d1 = ctx.getBean("demo",Demo.class);
		 System.out.println(d1);
		 SpelExpressionParser temp = new SpelExpressionParser();
		 org.springframework.expression.Expression expression =  temp.parseExpression("45+65");
		 System.out.println(expression.getValue());
	}
}
