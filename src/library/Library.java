/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library;

/**
 *
 * @author giovannipds
 */
public class Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Sup!");

        Book bookOne = new Book("The Fellowship of the Ring", new String[]{"J.R.R. Tolkien"}, "Artenova");
        bookOne.setPages(423);

        Book bookTwo = new Book("The Two Towers", new String[]{"J.R.R. Tolkien"}, "Artenova");
        bookTwo.setPages(352);

        User gio = new User("Giovanni");
        gio.setAge(34);
        gio.setGenre("Male");
        gio.setTel("5554999680088");

        User carlosTadeu = new User("Carlos Tadeu");
        carlosTadeu.setGenre("Male");

        Loan firstLoan = new Loan(bookOne, gio);
        Loan secondLoan = new Loan(bookTwo, carlosTadeu);

        System.out.println("-----EMPRÉSTIMO 1-----");
        System.out.println("Livro: " + firstLoan.getBook().getTitle());
        System.out.println("Para: " + firstLoan.getUser().getName());
        System.out.println("Data: " + firstLoan.getDate());
        System.out.println("Hora: " + firstLoan.getTime());

        System.out.println("-----EMPRÉSTIMO 2-----");
        System.out.println("Livro: " + secondLoan.getBook().getTitle());
        System.out.println("Para: " + secondLoan.getUser().getName());
        System.out.println("Data: " + secondLoan.getDate());
        System.out.println("Hora: " + secondLoan.getTime());
    }
    
}
