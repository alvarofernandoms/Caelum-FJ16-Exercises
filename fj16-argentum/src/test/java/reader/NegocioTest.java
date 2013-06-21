package reader;

import java.util.Calendar;
import junit.framework.Assert;
import org.junit.Test;

import reader.Negocio;



public class NegocioTest {

	@Test
	public void dataNegocioEhImutavel() {
		// se criar um negocio no dia 15..
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, 15);
		Negocio n = new Negocio(10, 5, c);

		// ainda que eu tente mudar a data para 20...
		n.getData().set(Calendar.DAY_OF_MONTH, 20);

		// ele continua no dia 15
		Assert.assertEquals(15, n.getData().get(Calendar.DAY_OF_MONTH));
	}

	@Test(expected = IllegalArgumentException.class)
	public void naoCriaNegocioComDataNula() {
		new Negocio(10, 5, null);
	}

}
