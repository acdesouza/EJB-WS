package componentes.model;

import javax.ejb.Stateless;
import javax.jws.WebService;

@WebService
@Stateless
public class ConversorTemperaturaEJB {

	public double celsiusToFahrenheit(double celsius) {
		return (9.0/5.0)*celsius+32;
	}
}
