package assignment3;

import java.util.*;

public class AnimalKingdom {

    public static void main(String[] args){
        
        Scanner yoho = new Scanner(System.in);
        
        Animal a1 = new Animal();
            //for a1
                System.out.println("\n::Enter info about first Animal::");
                System.out.println("---------------------------------");
            //taking input for the first animal
                System.out.println("Enter the name of the Animal");
                a1.name = yoho.nextLine();
                System.out.println("Enter the Type of " + a1.name);
                a1.type = yoho.nextLine();
                System.out.println("Is it venemous? (true/false)");
                a1.venomous = yoho.nextBoolean();
                yoho.nextLine();    // this is for to clear the enter key (new line key ) from the buffer
                System.out.println("What is the main food of " + a1.name);
                a1.food = yoho.nextLine();
                
        
    // for a2 and a3 i will be assign values but it can be taken as input from the user with the yoho scanner;
        
        //animal 2 : a2
        Animal a2 = new Animal("BOT FLY", "Arthropoda", true);
        
        // animal 3 : a3
        Animal a3 = new Animal("Lion", "Chordata", "Meat");
 
        //code output starts from here;
        // output format:: (name)is under (type) :: eat_method :: bite_method

        //a1
        System.out.println(a1.name + " is under " + a1.type);
        a1.eat(a1.name, a1.food);
        a1.bite( a1.venomous, a1.name);

        //a2
        System.out.println("\n-----------------------");
        System.out.println(a2.name + " is under " + a2.type);
        a2.eat(a2.name, a2.food);
        // Here we did not take any input or assigned any value to food so it will output::"NULL".
        a2.bite(a2.venomous, a2.name);

        //a3
        System.out.println("\n-----------------------");
        System.out.println(a3.name + " is under " + a3.type);
        a3.eat(a3.name,a3.food);
        a3.bite(a3.food, a3.name);

        yoho.close();

    }
}