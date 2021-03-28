package metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dao.IDao;
@Service("metier")
public class MetierImpl implements IMetier {
	//Couplage faible
	@Autowired
	/*
	 * Une fois la classe instanciee affecte une valeur a la var dao
	 */
	private IDao dao  = null;
	
	@Override
	public double calcul() {
		double t=dao.getData();
		double res = t*Math.PI;
		return res;
	}

	
	/*
	 * Pour injecter la var dao
	 * un objet d'une classe qui implemente IDao
	 */
	
	

	public void setDao(IDao dao) {
		this.dao = dao;
		System.out.println("Injection des dependances");
	}
	public void init() {
		System.out.println("Initialisation e metier");
	}
	public MetierImpl() {
		System.out.println("Instanciation e metier");
	}

	

}
