package model.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Item;

public class ProgramExercicioProposto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Digite o caminho do Arquivo: ");
		String path=sc.nextLine();
	
		try {
			File file=new File(path);
			BufferedReader br=new BufferedReader(new FileReader(path));
			
			//CRIANDO NOVO ARQUIVO NO MESMO DIRETORIO
			String name=file.getParent().toString()+"\\out.csv";
			System.out.println(name);
			BufferedWriter bw=new BufferedWriter(new FileWriter(name));
			List<Item> list=new ArrayList<>();
			String line=br.readLine();
			while(line!=null) {
				String[] array=line.split(",");
				list.add(new Item(array[0], Double.parseDouble(array[1]), Integer.parseInt(array[2])));
				line=br.readLine();
			}
			
			
			for(Item c: list) {
				bw.append(c.toString()+"\n");
				System.out.println(c);
			}
			
			
			br.close();
			bw.close();
		}
		catch(IOException e) {
			System.out.println("Error: "+ e );
		}
		finally {
			sc.close();
		}
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
