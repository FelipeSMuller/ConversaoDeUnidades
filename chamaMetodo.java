package Metodos;

import javax.swing.JOptionPane;

public class chamaMetodo {

	public static void main(String[] args) {

		/*
		 * Conversor de Unidades Desenvolva um programa que contenha métodos para
		 * converter entre unidades de medida, como Celsius para Fahrenheit, quilômetros
		 * para milhas, ou centímetros para polegadas, com base na escolha do usuário
		 */

		// Instanciando um novo objeto
		metodosJava Conversao = new metodosJava();

		// Criação da variavel, onde o usuário pode escolher o comportamento do programa
		int userInput = 0;

		// Entrada em um loop, onde a condição acaba quando o usuario digite um número
		// menor que 0
		do {

			// Verificação da entrada do usuário
			try {

				userInput = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Escolha uma opção \n1-Converter Celsius para Fahrenheit \n2-KM para Milha \n3-Centímetro para polegada"));

				// Caso o usuario digite um número menor ou igual a 0 , dispara uma mensagem.
				if (userInput <= 0) {

					JOptionPane.showMessageDialog(null,
							"Não é possível inserir números nulos ou negativos nesse campo!!! \nERRO");

				}

				// Captura de um possível erro, caso o usuario digite insira letras em um campo
				// de numeros ou finalize o programa
			} catch (NumberFormatException | NullPointerException e) {

				JOptionPane.showMessageDialog(null,
						"Dados inválidos inseridos, ou o programa foi fechado incorretamente \nERRO");
			}

			// Inicio das condições.
			switch (userInput) {

			case 1:

				// Caso o usuario escolha a opção 1, A conversão de Celsius para Fahrenheit
				// ocorre.
				Double inputUser = 0.0;

				Conversao.conversaoFahrenheit(inputUser);

				break;

			case 2:

				// Caso o usuario escolha a opção 2, A conversão de KM para Milha
				// ocorre.
				Double km = 0.0;

				Conversao.conversaoMilha(km);

				break;

			case 3:
				// Caso o usuario escolha a opção 3, A conversão de Centímetros para Polegada
				// ocorre.
				Double cm = 0.0;

				Conversao.conversaoPolegada(cm);

				break;

			default:

				//Caso o usuario não escolha nenhuma das opções disponibilizadas, a aplicação acaba.
				JOptionPane.showMessageDialog(null, "Nenhuma opção válida foi escolhida, aplicação finalizada");

				break;

			}

		} while (userInput > 0);

	}

}
