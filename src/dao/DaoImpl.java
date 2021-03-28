package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dao")
/*
 * au demarrage creation d'un bean qui s'appelle dao
 */
public class DaoImpl implements IDao {
	//redefinir les methodes de l'interface
		@Override
		public double getData() {
			System.out.println("Version base de donnees");
			double temperature = 23;
			return temperature;
			
		}
		

		public void init() {
			System.out.println("Insttanciation de DaoImpl");
		}
	}

