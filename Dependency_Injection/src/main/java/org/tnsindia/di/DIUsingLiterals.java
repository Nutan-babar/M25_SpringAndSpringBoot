package org.tnsindia.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIUsingLiterals {
	
	public static void main(String[] args) {
		//hard coding
		//Student s=new Student();
		//using IOS
		 ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		Student s1=c.getBean("s1",Student.class);
		s1.display();
      //	s.Student_Name="Nutan B";
        //	a.display();	
	}

}
