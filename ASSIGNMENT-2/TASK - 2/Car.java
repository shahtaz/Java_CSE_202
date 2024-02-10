package sec;

import java.util.Scanner;

public class Car {
    public static void main(String[] args){

        Scanner yoho = new Scanner(System.in);

        Vehicle nissan = new Vehicle();
        Vehicle toyota = new Vehicle();
        Vehicle tesla = new Vehicle();

       nissan.seatCapacity = 4;
       nissan.fuelType = "Gasoline";
       nissan.fualQuantity =  55.99f;
       nissan.isAC = true;

       float avlFuel;
       avlFuel = 23.34f;// we can also scan it to make it dynamic with the help of the yoho scanner
       // avlFuel = yoho.nextFloat(); 

       
       //code for fuletype ::: gasoine = 1;      diesel = 2;     petrol = 3;     cng = 4
       int fuelCode = 1;
       float fuelres= 0.00f;


       

       System.out.println("Choose An Option:");
       System.out.println("1. Fual");
       System.out.println("2. AC");
       
       int op = yoho.nextInt();
       switch (op) {
        case 1:{
           fuelres = nissan.addFuel("Nissan",fuelCode,nissan.fualQuantity, avlFuel );
            
            break;
        }
        case 2:{
            nissan.isAC = nissan.acOnOff(nissan.isAC);
            break;
        }
        default:{
            System.err.println("Invalid Input");
        }
  
    }

    fuelres = fuelres + avlFuel;

    // after the operation
    System.out.println("Now you have " + fuelres + " liter of fuel" );
    if(nissan.isAC == true){
        System.out.println("and the AC is ON");
    }
    else{
        System.out.println("and the Ac id OFF");
    }
    

    yoho.close();

    }
}

