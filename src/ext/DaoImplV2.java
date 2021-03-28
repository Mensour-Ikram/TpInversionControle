package ext;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import dao.IDao;
@Repository
public class DaoImplV2 implements IDao{

	@Override
	public double getData() {
	/*
	 * Version WS
	 */
		double data = 12;
		System.out.println("Version Web Service");
		return data;
	}
}
