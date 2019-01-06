package spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Company {

	@SuppressWarnings("resource")
	public static void main( String[] args ){
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("springcomb.xml");
    	
    	employee emp = (employee) context.getBean("employee");
    	System.out.println(emp.getLists());
    	
    	school sch = (school) context.getBean("school");
    	System.out.println(sch.toString());
    	
    }
}
