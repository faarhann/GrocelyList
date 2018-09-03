import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);
private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit){
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGreceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }


    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To Print Choice Options. ");
        System.out.println("\t 1 - To Print The List of Grocery items. ");
        System.out.println("\t 2 - To Add an item to the List. ");
        System.out.println("\t 3 - To Modify an item in the list. ");
        System.out.println("\t 4 - To Remove an item from the list. ");
        System.out.println("\t 5 - To Search for an item in the List. ");
        System.out.println("\t 6 - To Quit The application. ");
    }

    public static void addItem(){
        System.out.print("Please enter the grocery item: ");
        groceryList.addGreceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("current item name");
        String itemNumber = scanner.nextLine();
        System.out.print("New Item Name");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNumber, newItem);
    }

    public static void removeItem(){

        System.out.print("Enter item name");
        String itemNumber = scanner.nextLine();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNumber);
    }

    public static void searchForItem(){
        System.out.print("Enter item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)){
            System.out.println("Found " + searchItem + " in our groceryList");
        }else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }
}
