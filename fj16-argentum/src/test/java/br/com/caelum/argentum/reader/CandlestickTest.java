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

	// Este teste n�o � v�lido pois o pre�o m�ximo j� n�o pode ser menor que o
	// pre�o m�nimo. Ent�o ele cai na primeira condi��o na cria��o do
	// Candlestick, e o teste precoMaximoNaoPodeSerMenorQueMinino() j� cobre
	// esta condi��o.
	@Test(expected = IllegalArgumentException.class)
	public void maximoNaoPodeTerValroNegativo() {
		new Candlestick(10, 20, 20, -1, 10000, Calendar.getInstance());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void volumeNaoPodeTerValorNegativo() {
		new Candlestick(10, 20, 20, 50, -1, Calendar.getInstance());
	}

}
