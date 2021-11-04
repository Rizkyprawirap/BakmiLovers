package Core;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;


public class Main {

    Scanner scan = new Scanner(System.in);
    Vector<Bakmi> bakmiData =  new Vector<Bakmi>();
    String[] sauceList = {"Honey","Chili","Mayo","Soya"};
    Random random =  new Random();

    public Main() {

        int chooseMenu1 = 0;

        do {
            System.out.println("+-------------------------+");
            System.out.println("| Welcome to BakmiLovers! |");
            System.out.println("+-------------------------+");
            System.out.println("| 1. Add Bakmi            |");
            System.out.println("| 2. View Bakmi           |");
            System.out.println("| 3. Exit                 |");
            System.out.println("+-------------------------+");
            System.out.println("Choose >>");
            chooseMenu1 = scan.nextInt();scan.nextLine();

            if (chooseMenu1 == 1){
                mainMenu();
            }
            else if (chooseMenu1 == 2){
                viewBakmi();
            }

        }while(chooseMenu1 != 3);

        System.out.println("Thank you!");
    }

    public void mainMenu() {
        int chooseMenu2 = 0;

        System.out.println("+-------------------------------------+");
        System.out.println("| What kind of Bakmi you want to add? |");
        System.out.println("+-------------------------------------+");
        System.out.println("| 1. Bakmi Vegetable                  |");
        System.out.println("| 2. Bakmi Meat                       |");
        System.out.println("| 0. Back                             |");
        System.out.println("+-------------------------------------+");
        System.out.println("Choose >>");
        chooseMenu2 = scan.nextInt(); scan.nextLine();

        switch (chooseMenu2){

            case 1:
                addBakmiVegetable();
                break;
            case 2:
                addBakmiMeat();
                break;
            case 3:
                break;

        }

    }

    public void addBakmiMeat(){

        String id = "BK" + (random.nextInt((9-0)+1)+9);

        String bakmiName;
        Double bakmiPrice;
        String bakmiSize;
        String cutlet ="";
        Integer meatSize;

        do {
            System.out.println("Input bakmi name [end with ' Bakmi'] :");
            bakmiName = scan.nextLine();

        }while (!bakmiName.endsWith("Bakmi"));

        do {
            System.out.println("Input bakmi price [8000 .. 15000] :");
            bakmiPrice = scan.nextDouble();

        }while (bakmiPrice < 8000 || bakmiPrice > 15000);

        do {
            System.out.println("Input bakmi size [ Small | Big] :");
            bakmiSize = scan.nextLine();

        }while (!bakmiSize.equals("Small") && !bakmiSize.equals("Big"));

        do {
            System.out.println("Input meat size [ 1 - 200 ] gram :");
            meatSize = scan.nextInt();

        }while (meatSize < 1 || meatSize > 200);

        if(meatSize >= 1 && meatSize <= 49){
            cutlet = "Mince";
        }
        else if (meatSize >= 50 && meatSize <= 149){
            cutlet = "Slice";
        }
        else if (meatSize >= 150 && meatSize <= 200){
            cutlet = "Dice";
        }

        bakmiData.add(new Meats(id,bakmiName,bakmiPrice,bakmiSize,meatSize,cutlet));

        System.out.println("The new Bakmi Meat just added!");

    }

    public void addBakmiVegetable(){

        String id = "BK" + (random.nextInt((9-0)+1)+9);

        String bakmiName;
        Double bakmiPrice;
        String bakmiSize;
        String bakmiTopping;

        do {
            System.out.println("Input bakmi name [end with ' Bakmi'] :");
            bakmiName = scan.nextLine();

        }while (!bakmiName.endsWith("Bakmi"));

        do {
            System.out.println("Input bakmi price [8000 .. 15000] :");
            bakmiPrice = scan.nextDouble();

        }while (bakmiPrice < 8000 || bakmiPrice > 15000);

        do {
            System.out.println("Input bakmi size [ Small | Big] :");
            bakmiSize = scan.nextLine();

        }while (!bakmiSize.equals("Small") && !bakmiSize.equals("Big"));

        do {
            System.out.println("Input Topping [ None | Peanut | Tofu ] :");
            bakmiTopping = scan.nextLine();

        }while (!bakmiTopping.equals("None") && !bakmiTopping.equals("Peanut") && !bakmiTopping.equals("Tofu"));

        if(bakmiTopping.equals("None")){
            bakmiPrice += 0;
        }
        else if(bakmiTopping.equals("Peanut")){
            bakmiPrice += 2000;
        }
        else if(bakmiTopping.equals("Tofu")){
            bakmiPrice += 4000;
        }

        Integer randomSauce = random.nextInt(4);

        bakmiData.add(new Vegetables(id,bakmiName,bakmiPrice,bakmiSize,bakmiTopping,sauceList[randomSauce]));

        System.out.println("The new Bakmi Meat just added!");
    }

    public void viewBakmi(){
        bakmiData.forEach(bakmi -> {bakmi.printInfo();});
    }


    public static void main(String[] args) {new Main();}

}
