package assignment3;



public class Animal {
    
    String name;
    String type;
    String food;
    boolean venomous;

    Animal(){
        this.name = "Manush";
        this.type = "Chordata";
        this.venomous = false;
        this.food = "Everything";
    }

    Animal(String name, String type, boolean venomous){
        this.name = name;
        this.type = type;
        this.venomous = venomous;
    }

    Animal (String name, String type, String food){
        this.name = name;
        this.type = type;
        this.food = food;

    }

    void eat(String naam, String khabar){
        System.out.println(naam + " Eats " + khabar);
    }

    void bite(boolean a, String naam){
        // here a means if the animal is venomous or not
        // if it's  venomous then it will bite else it will not  bite
       
        if(a == true){
            System.out.println(naam + " Bites");
        }
        else{
            System.out.println(naam + " Does Not Bite");
        }
    }

    void bite(String s, String naam){
            // here string s is represent the main food of that animal 
            // if the main food is "meat" then the animal will bite , else it will not

        String mangsho = "meat";
        boolean res = mangsho.equalsIgnoreCase(s);//to check if the main food is meat or not
        
        if(res== true){
            System.out.println(naam + " Bites");
        }
        else{
            System.out.println(naam + " Does Not Bite");
        }
    }   
}
