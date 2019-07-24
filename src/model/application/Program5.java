package model.application;

import java.io.File;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		/*
		 * Manipulando pastas com o File
		 */

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath=sc.nextLine();
		
		//Uma variavel do tipo File pode ser tanto o caminho de um arquivo quanto o caminho de uma pasta
		File path=new File(strPath);
		
		//Listar todos as pastas(diretorios) no caminho path
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("Folders: ");
		for(File folder: folders) {
			System.out.println(folder);
		}
		
		//Listar todos os Arquivos no caminho path
		File[] files = path.listFiles(File::isFile);

		System.out.println("Files: ");
		for (File file : files) {
			System.out.println(file);
		}
		
		//Criar novo Diretorio no caminho path
		boolean success =new File(strPath +"\\subdir").mkdir();
		System.out.println(success);
		sc.close();		
	}

}
