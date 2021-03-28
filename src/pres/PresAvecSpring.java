package pres;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import metier.IMetier;




public class PresAvecSpring {
	public static void main(String[] args) {
		ApplicationContext context=
				new ClassPathXmlApplicationContext("config.xml");
		IMetier metier= context.getBean(IMetier.class);
		System.out.println(metier.calcul());
		}


}
 
