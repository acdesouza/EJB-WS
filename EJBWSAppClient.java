import componentes.model.ConversorTemperaturaEJB;
import componentes.model.ConversorTemperaturaEJBService;

public class EJBWSAppClient {

  public static void main(String[] args) {
    ConversorTemperaturaEJBService service = new ConversorTemperaturaEJBService();
    ConversorTemperaturaEJB conversorTemperaturaEJB = service.getConversorTemperaturaEJBPort();
    System.out.println("36o Celsius in Fahrenheit: [" + conversorTemperaturaEJB.celsiusToFahrenheit(36) + "]");
  }

}
