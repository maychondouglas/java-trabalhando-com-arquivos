package model.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program4 {

	public static void main(String[] args) {
		/*
		 * File-Writer
		 * BufferedWriter
		 * DO MESMO JEITO QUE TEMOS O BUFFEREDREADER TEM O BUFFEREDWRITER PARA ESCREVER NO ARQUIVO
		 */
		
		String[] lines = new String[] {"Good morning!", "Good afternoon!", "Good night!"};
		
		
		
		//Endereco do Arquivo - se ja existir ; Endereco para criar o Arquivo - se não existir ainda
		String path="C:\\Users\\Maychon\\Desktop\\projetos-java\\Trabalhando-Com-Arquivos\\out.txt";
		
		//Cria/Recria Arquivo.txt
		//BufferedWriter br=new BufferedWriter(new FileWriter(path, true));
		
		//Adiciona ao final de um Arquivo Existente
		try (BufferedWriter bw=new BufferedWriter(new FileWriter(path, true))){
			for(String line: lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace(); //mostra a pilha de excecoes
		}
	}

}
