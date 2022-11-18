import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

class Main {
  public static void main(String[] args) {
    int a;
    Scanner scanner =new Scanner(System.in);
    do{
      System.out.println("Press 1 to learn about salary.");
    System.out.println("Press 2 to learn about the job.");
    System.out.println("Press 3 to learn about demand.");
    System.out.println("Press 4 to view current students.");
    System.out.println("Press 5 to quit.");
    a=scanner.nextInt();
    if(a==1){
      System.out.println("$98,345 average salary in South Florida!");
    }if(a==2){
      System.out.println("US News - 100 Best Jobs!");
    }if(a==3){
      System.out.println("Top 10 Forbes In-Demand Jobs!");
    }if(a==4){
      System.out.println("Current Students:");
      try{
        FileReader fileReader = new FileReader("names.txt");
            Scanner scanner1 = new Scanner(fileReader);
            while(scanner1.hasNextLine()){
//index,co2TailpipeGpm,fuelType1,make,year
                String [] curLine =scanner1.nextLine().split(",");
                for(String s : curLine){
                    System.out.println(s);
                }
            }
        }
        catch(FileNotFoundException f){
            
        }
    }
    
    }while(a !=5);
    
    
    
  }
}