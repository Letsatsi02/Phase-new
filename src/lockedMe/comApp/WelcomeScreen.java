import java.io.File;
import java.io.IOException;
import java.util.*;

public class WelcomeScreen {

	public static void main(String[] args) {
		
		String filename;
		char ch;
		File directory = new File("C://Users//Ashwini");
		
		String[] flist = directory.list();
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("******* Simplilearn Assignment 1 ********");
		System.out.println("------------------------------------------");
		System.out.println("******* Ashwini Kite *********************");
		System.out.println("******* Full Stack Developer  ************");
		System.out.println();
		
		do {
			System.out.println("Select File Option to perform any operation:-");
			System.out.println("1.File Creation");
			System.out.println("2.File List");
			System.out.println("3.File Delete");
			System.out.println("4.Search file");
			System.out.println("5.Exit");
			
			int choice = input.nextInt();
			switch (choise) {
			
			case 1:
				System.out.println("Enter the fine name for creating new file");
				file name = input.next();
					
				try {
					File name = new file("C:\\Users\\Ashwini" + filename + ".txt");
					
					if (file.createNewFile()) {
						System.out.println("File created Suscessfully \n");
			} else {
				if (file.exist()) {
					System.out.println("File already exist");
			} else {
				System.out.println("File dose not exist");
			}
				
			bollean b = file.deleted();
			if (b==true) {
				
				System.out.println("File deleted");
			} else {
				System.out.println("File not foud");			
			}
			
			}
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		break;
		
			}
		}
		}

}
