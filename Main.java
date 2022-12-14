// menambahkan library scanner untuk input
import java.util.Scanner;
// menambahkan library arraylist untuk membuat list
import java.util.ArrayList;

import java.io.IOException;

class Main{
    // buat variable input dari class scanner untuk menerima inputan (@global variable)
    public static Scanner input = new Scanner(System.in);
    
    public static void clearConsole(){
		try{
			if(System.getProperty("os.name").contains("Windows")){
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else{
				System.out.print("\033\143");
			}
		} catch (IOException | InterruptedException ex) {}
	}
    
    public static void menu(){
        System.out.println(" Kantin Online\n");
        System.out.println(" 1. Add");
        System.out.println(" 2. Delete");
        System.out.println(" 3. Edit");
        System.out.println(" 4. Pay\n");
        System.out.print(" > input : [1..4] ");
    }
    
    // main program
    public static void main(String[] args){
        int pilihMenu = 0;
        
        do{
            do{
                // clearConsole();
                menu();
                
                try{
                    pilihMenu = input.nextInt();
                    input.nextLine();
                } catch(Exception e){
                    input.nextLine();
                    continue;
                }
            } while(pilihMenu < 1 || pilihMenu > 4);
            
            switch(pilihMenu){
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
            }
        } while(pilihMenu != 7);
    }
}
