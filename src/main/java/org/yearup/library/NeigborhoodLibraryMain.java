package org.yearup.library;

import java.util.Scanner;

public class NeigborhoodLibraryMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Show the user the current book inventory
        //Only show the product names and IDs


        // Welcome User &
        System.out.println("Greetings! Welcome to the Neighborhood Library.");
        boolean done = false;
        while (!done) { //loop until user says no
            System.out.println("Would you like choose a book from us today? (Enter yes/no)");
            // Read users response
            String userResponse = scanner.nextLine();
            if (userResponse.equalsIgnoreCase("Yes")) {
                System.out.println("Fantastic! Take a look at what we currently have in stock: \n");
            } else if (userResponse.equalsIgnoreCase("No")) {
                System.out.println("No sweat! We'd love to have you back soon.");
                return;
            }

            Books[] bookInventory = BookInventory.bookInventory;
            for (Books i : bookInventory) {
                //
                if (i.isCheckedOut()) continue;
                else
                System.out.println(i.getIsbn() + " " + i.getTitle());
            }


            // Parse their choice and get it from the list
            System.out.println("\nWhat is the Product ID of your book?");
            String selectedISBN = scanner.nextLine();

            Books selectedBook = null;

            for (Books b : bookInventory) {
                if (selectedISBN.equals(b.getIsbn())) {
                    selectedBook = b;
                    // Tell the user they've made a great choice.
                    System.out.println("Voila! I have your book....Great choice!");
                    break;
                }
            }

            // Ask them are they sure they would like selected book
            System.out.println("Are you sure you would like this book? (yes/no) ");
            //Read the response
            String acceptBook = scanner.nextLine();


            if (acceptBook.equalsIgnoreCase("yes")) {
                System.out.println("Great! Lets get this checked out for you.");
                System.out.println("Before we check you out, lets get your name.");
                String userName = scanner.nextLine();


                System.out.println("Okay " + userName + " lets get you out of here!");
                done = true;


            } else if (acceptBook.equalsIgnoreCase("No")) {
                System.out.println("Whoops! Feel free to check out some of our other books!");
            }

            System.out.println("\nYou have successfully checked out" + selectedBook.getTitle());
        }
    }
}
