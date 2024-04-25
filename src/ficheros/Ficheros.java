/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ficheros {

	public static void main(String[] args) {
            
                System.out.println("Estoy introduciendo la modificacion en el proyecto de mi compañero");
		
		Scanner sc = new Scanner(System.in);
		String path = "";
		
		do {
			try {
				System.out.println("Introduce un path:");
				path = sc.nextLine();
				
				if(!path.equals("")) {
					File f = new File(path);
					muestraInfoRuta(f);
				}
				
			} catch (FileNotFoundException e){
				System.out.println(e);
			}
		} while (path.equals("")); 
		
		System.out.println("Fin del programa");
	}

	
	public static void muestraInfoRuta (File ruta) throws FileNotFoundException {
		if(!ruta.exists()) {
			throw new FileNotFoundException("La ruta no existe");
		}else if (ruta.isDirectory()) {
			File[] lista = ruta.listFiles();
			for (int i=0; i<lista.length; i++) {
				if(lista[i].isDirectory()) {
					System.out.println("[*]" + lista[i].getName());
					System.out.println();
				}
			}
			
			for (int i=0; i<lista.length; i++) {
				if(lista[i].isFile()) {
					System.out.println("[*]" + lista[i].getName());
					System.out.println("Esta es la modificacion hecha por sebas");	
							
				}
			}

		}
		
	}
	
}