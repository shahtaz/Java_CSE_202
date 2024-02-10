package sec;

import java.util.Scanner;

public class Vehicle {

    Scanner yohoho = new Scanner(System.in);
    
    public int seatCapacity;
    public String fuelType;
    public float fualQuantity;
    public boolean isAC;


    //start will calculate how much fuel can be stored in the fueltank
    // a == fualQuantity and b == available fuel in the tank
    public float start(float a, float b){
        float rem = a - b;
        System.out.println("You Can Buy " + rem + "Liter Of Fuel");
        
        System.out.println("Please Enter How Much You Wanna Buy:");
        float buyf=0.00f;

        while(true){
            buyf = yohoho.nextFloat();
            
            if(buyf >= rem){
                stop(rem);
            }
            else{
                System.out.println("You Have Purchased " + buyf + " Liter Fuel");
               return buyf;
                
            }
        }

    }

    public void stop(float org){
        System.out.println("Not Enough Space. Enter Less Then " + org);
    }

  
    //_______________________________________________________________________
    // addFuel method will be used to check if the fuel type is correct or not 
    // ----------------------------------------------------------------------

    public float addFuel(String naam,int code, float fuel, float have){

        float fres=0.00f;

        String f1 = "GASOLINE";
        String f2 = "DIESEL";
        String f3 = "PETROL";
        String f4 = "CNG";

        System.out.println("Select an Option:");
        
        System.out.println("\t1. " + f1);
        System.out.println("\t2. " + f2);
        System.out.println("\t3. " + f3);
        System.out.println("\t4. " + f4);

        int fueltype = yohoho.nextInt();

        switch (fueltype) {
            case 1:{
                    if(fueltype == code){
                        fres = start(fuel, have);
                    }
                    else{
                        System.out.println( f1 + " Is Wrong Fuel For " + naam );
                    }
                }
                break;
            

            case 2:{
                if(fueltype == code){
                   fres =   start(fuel, have);
                }
                else{
                    System.out.println(f2 + " Is Wrong Fuel For " + naam);
                }
                break;
            }
            case 3:{
                if(fueltype == code){
                    fres =    start(fuel, have);
                }
                else{
                    System.out.println(f3 + " Is Wrong Fuel for " + naam);
                }
                break;
            }
            case 4:{
                if(fueltype== code ){
                    fres =  start(fuel, have);
                }
            else{
                System.out.println(f4 + "Is Wrong Fuel for " + naam);
            }
                break;
            }

        
            default:{
                System.out.println("Invalid Input");
                break;
            }
                
        }

        return fres;

        

    }

    public boolean acOnOff(boolean res){
        
        System.out.println("Select An Option::");
        System.out.println("\t1.Turn Off AC");
        System.out.println("\t2.Turn on AC");

        int acop = yohoho.nextInt();

        switch(acop){
            case 1:{
                System.out.println("Ac is off");
                res = false;
                break;
            }

            case 2:{
                System.out.println("Ac is on");
                res = true;
                break;
            }

            default:{
                System.out.println("Invalid Input");
                break;
            }
        }

        return res;

    }

}
