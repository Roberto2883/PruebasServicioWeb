package beans;

import javax.ejb.Stateless;
import javax.jws.WebService;

//indicamos que este EJB ser� de tipo Stateless
@Stateless
//ser� expuesto por un web services e indicar el nombre de la interface por endpoint
@WebService(endpointInterface="beans.ServicioSumarWS")
public class ServicioSumarImpl implements ServicioSumarWS{

	@Override
	public int sumar(int a, int b) {
		return a+b;
	}

}
