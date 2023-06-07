package org.lessons.java;

import java.util.Scanner;

public class LibraryCatalog {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("how many books do you want to add? ");
        int booksNumber = Integer.parseInt(scanner.nextLine());

        Book[] books = new Book[booksNumber];

        for (int i = 0; i < booksNumber ; i++) {
            System.out.println("Insert data of book " + (i + 1));

            try {
                System.out.println("Insert the Title: ");
                String title = scanner.nextLine();
                System.out.println("Insert the Author: ");
                String author = scanner.nextLine();
                System.out.println("Insert the number of pages: ");
                int pages = Integer.parseInt(scanner.nextLine());
                System.out.println("Insert the Publisher: ");
                String publisher = scanner.nextLine();

                Book book = new Book(title, pages, author, publisher);
                books[i] = book;
            } catch (RuntimeException e) {
                System.out.println("Error: " + e.getMessage());
                i--; // Retry input for the current book
            }
        }

        System.out.println("Library Catalog: ");

        for (int i = 0; i < booksNumber; i++) {
            System.out.println(books[i]);
        }

        scanner.close();
    }
}
