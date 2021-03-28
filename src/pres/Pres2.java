package pres;
import java.io.*;
import java.lang.reflect.*;
import java.util.Scanner;

import dao.IDao;
import metier.IMetier;

public class Pres2 {

	public static void main(String[] args) {
		  try {
	             Scanner scanner=new Scanner(new File("config.txt"));
	             
	             String daoClassname=scanner.nextLine();
	             String metierClassName=scanner.nextLine();
	             Class cdao=Class.forName(daoClassname);
	             IDao dao= (IDao) cdao.getDeclaredConstructor().newInstance();
	             
	             Class cmetier=Class.forName(metierClassName);
	             IMetier metier=(IMetier) cmetier.getDeclaredConstructor().newInstance();
	             Method meth=cmetier.getMethod("setDao",IDao.class);
	             meth.invoke(metier,dao);
	             System.out.println(metier.calcul());
	           } catch (Exception e) { 
	        	   e.printStackTrace(); }
	         }

	

}
