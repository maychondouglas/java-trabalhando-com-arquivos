package model.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program2 {

	public static void main(String[] args) {
		/*
		 * 
		 */
		
		String path="C:\\Users\\Maychon\\Desktop\\projetos-java\\Trabalhando-Com-Arquivos\\in.txt";
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			
			fr=new FileReader(path); //estabelendo uma sequencia de leitura a partir do arquivo que estiver neste caminho
			br=new BufferedReader(fr); //o br e estanciado apos o fr pois e uma abstracao maior, para agilizar o acesso
			
			String line=br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line=br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: "+e.getMessage());
		}
		finally {
			try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		

	}

}
