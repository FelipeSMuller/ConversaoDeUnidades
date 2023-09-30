package Metodos;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class metodosJava {

	// Método para efetuar a conversão de Celsius para Fahrenheit
	public Double conversaoFahrenheit(Double celsius) {

		// Criação de Strings, que armazenarão os valores decimais.
		String fahrenheitFormatado;

		String celsiusFormatado;

		// -------------------------------------

		DecimalFormat df = new DecimalFormat("#°F");

		DecimalFormat Df = new DecimalFormat("#°C");

		Double fahrenheit = 0.0;

		try {

			
			//Entrada do usuário.
			celsius = Double.parseDouble(

					JOptionPane.showInputDialog(null, "Insira um valor em Celsius, que será convertido em Fahrenheit"));

			if (celsius <= 0) {

				JOptionPane.showMessageDialog(null, "Insira apenas números positivos e maiores que 0");
			}

			else {

				celsiusFormatado = Df.format(celsius);

				fahrenheit = (celsius * 9 / 5) + 32;

				fahrenheitFormatado = df.format(fahrenheit);

				JOptionPane.showMessageDialog(null,
						"Valor em Celsius =  " + celsiusFormatado + "\nValor em Fahrenheit =  " + fahrenheitFormatado);
			}

		} catch (NumberFormatException | NullPointerException erro) {

			JOptionPane.showMessageDialog(null,
					"Você inseriu letras em um campo de números, ou fechou o programa incorretamente!! ");
		}

		return fahrenheit;

	}

	public Double conversaoMilha(Double km) {

		String kmFormatado;

		String milhaFormatada;

		DecimalFormat df = new DecimalFormat("#.# km");

		DecimalFormat Df = new DecimalFormat("#.#milhas");

		Double valorEmKM = 0.0;

		Double milhas = 0.0;

		try {

			km = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor ... Por exemplo 1(para 1KM)"));

			if (km <= 0) {

				JOptionPane.showMessageDialog(null,
						"Não é possível inserir uma quilometragem negativa ou igual a zero");

			}

			else {

				valorEmKM = km * 1000;

				milhas = valorEmKM * 0.621371;

				kmFormatado = df.format(valorEmKM);

				milhaFormatada = Df.format(milhas);

				JOptionPane.showMessageDialog(null,
						"Valor em KM = " + kmFormatado + "\nValor em milha =  " + milhaFormatada);

			}
		} catch (NumberFormatException | NullPointerException erro) {

			JOptionPane.showMessageDialog(null,
					"Você inseriu letras em um campo de números, ou fechou o programa incorretamente!! ");

		}

		return valorEmKM;

	}

	public Double conversaoPolegada(Double cm) {

		String cmFormatado;

		String polegadaFormatada;

		DecimalFormat df = new DecimalFormat("##.##cm");

		DecimalFormat Df = new DecimalFormat("#.#in");

		Double polegada = 0.0;

		try {

			cm = Double.parseDouble(
					JOptionPane.showInputDialog(null, "Digite um valor em Centímetros para converter em Polegadas"));

			if (cm <= 0) {

				JOptionPane.showMessageDialog(null, "Não é possível inserir um número negativo ou igual a zero");
			}

			else {

				cmFormatado = df.format(cm);

				polegada = cm / 2.54;

				polegadaFormatada = Df.format(polegada);

				JOptionPane.showMessageDialog(null,
						"Valor em Centímetro = " + cmFormatado + "\nValor em Polegada = " + polegadaFormatada);

			}

		} catch (NumberFormatException | NullPointerException erro) {

			JOptionPane.showMessageDialog(null,
					"Você inseriu letras em um campo de números, ou fechou o programa incorretamente!! ");

		}

		return polegada;

	}

}
