package br.com.caelum.argentum.reader;

import java.util.Calendar;

import org.junit.Test;

public class CandlestickTest {

	@Test(expected = IllegalArgumentException.class)
	public void precoMaximoNaoPodeSerMenorQueMinino() {
		new Candlestick(10, 20, 20, 10, 10000, Calendar.getInstance());
	}

	@Test(expected = IllegalArgumentException.class)
	public void naoCriarCandlestickComDataNula() {
		new Candlestick(10, 20, 20, 50, 10000, null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void aberturaNaoPodeTerValorNegativo() {
		new Candlestick(-1, 10, 20, 50, 10000, Calendar.getInstance());
	}

	@Test(expected = IllegalArgumentException.class)
	public void fechamentoNaoPodeTerValorNegativo() {
		new Candlestick(10, -1, 20, 50, 10000, Calendar.getInstance());
	}

	@Test(expected = IllegalArgumentException.class)
	public void minimoNaoPodeTerValorNegativo() {
		new Candlestick(10, 20, -1, 50, 10000, Calendar.getInstance());
	}

	// Este teste não é válido pois o preço máximo já não pode ser menor que o
	// preço mínimo. Então ele cai na primeira condição na criação do
	// Candlestick, e o teste precoMaximoNaoPodeSerMenorQueMinino() já cobre
	// esta condição.
	@Test(expected = IllegalArgumentException.class)
	public void maximoNaoPodeTerValroNegativo() {
		new Candlestick(10, 20, 20, -1, 10000, Calendar.getInstance());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void volumeNaoPodeTerValorNegativo() {
		new Candlestick(10, 20, 20, 50, -1, Calendar.getInstance());
	}

}
