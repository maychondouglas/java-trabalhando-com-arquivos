package model.application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program1 {
	/*
	 * Acessando Arquivo Existente e imprimindo todas as linhas deste arquivo
	 */

	public static void main(String[] args) {
		
		
		//USA-SE O "\\" POIS O "\" E PREFIXO DE "\n" ...
		//Para acessar determinado arquivo Existente....
		File file = new File("C:\\Users\\Maychon\\Desktop\\projetos-java\\Trabalhando-Com-Arquivos\\in.txt");
		Scanner sc=null;
		try {
			//ESTANCIANDO O SCANNER PARA ACESSAR O ARQUIVO
			sc=new Scanner(file);
			
			//TESTA SE EXISTE OUTRA LINHA NO ARQUIVO
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e) {
			System.out.println("Erro in open file: "+ e.getMessage() );
		}
		finally {
			if(sc!=null) {
				sc.close();
			}
		}
	}

}
