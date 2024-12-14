import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[]args){
        
        Scanner scanner = new Scanner(System.in);
        while (true) {
            
        
        System.out.print("Is it day or night? (day/night): ");
        String timeOfDay = scanner.nextLine();
        if (timeOfDay.equalsIgnoreCase("end")) {
            System.out.println("Program terminated");
            break;
        }

        Knight knight;
        Wizard wizard;
        Merchant merchant;

        if (timeOfDay.equalsIgnoreCase("day")) {
         knight = new Knight("Adrian", 100, "Sword");
         wizard = new Wizard("Harry Potter" , 80, "Fireball");
         merchant = new Merchant("Robin Hood", 70, "Silks");
        }
        else {
         knight = new Knight("Shadow", 120, "Dagger");
         wizard = new Wizard("Malachi the Dark", 90, "Shadow Bolt");
         merchant = new Merchant("Silas the Smuggler", 80, "Moonstones");
        }


        
        
        System.out.println(knight);
        knight.defend();

        System.out.println(wizard);
        wizard.castSpell();

        System.out.println(merchant);
        merchant.trade();


        ArrayList<Peasant> peasants = new ArrayList<>();
        peasants.add(new Peasant("Jack Sparrow", 50, "Farming"));
        peasants.add(new Peasant("John Smith", 80, "Cooking"));
        peasants.add(new Peasant("Philip Fish", 100, "Fishing"));
        
        for (Peasant peasant : peasants) {
            System.out.println(peasant);
            peasant.work();
        }

       

        Interact.protect(knight);
        Interact.castSpell(wizard);
        Interact.tradeGoods(merchant);
        
        for (Peasant peasant : peasants) {
            Interact.workWith(peasant); 
        }
}
}
}
