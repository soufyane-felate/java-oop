package com.example.ex2_java.ArrayList;

import java.util.ArrayList;

public class Book {
    String isbn,title,author;
    int pages;
    public Book(String isbn , String title,String author,int pages){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
        this.pages=pages;
    }
    public void setIsbn(String isbn){
        this.isbn=isbn;
    }
    public String getIsbn(){
        return isbn;
    }
}
class Library{
    ArrayList<Book>bookArrayList=new ArrayList<>();
    public void addBook(Book book){
        bookArrayList.add(book);
    }
    public void removeBook(String isbn){
        Book BR=null;
        for (Book book :bookArrayList){
            if (book.getIsbn()==isbn){
                BR=book;
                break;
            }
        }if (BR!=null){
            bookArrayList.remove(BR);
            System.out.println("Isbn : "+ isbn +" Removed");
        }
        else System.out.println("nop");

    }

    public void displayAllBooks(){
        if (bookArrayList.isEmpty()){
            System.out.println("Is empty ...");
        }else {
            for (Book book :bookArrayList){
                System.out.println("Isbn : "+book.isbn +" ,Title : "+book.title +" ,author : "+ book.author+ " ,pages : " + book.pages);

            }
        }
    }
    public void findBookByIsbn(String isbn){
        boolean found =false;
        for (Book book:bookArrayList){
            if (book.isbn==isbn){
                System.out.println(isbn +" : is found");
                found=true;
                break;
            }
        }if (!found){
            System.out.println(isbn +" not found ");
        }
    }

}
class Main1{
    public static void main(String[] args){
        Library library= new Library();
        library.addBook(new Book("S3","khawf","oussama moslim",2500));
        library.addBook(new Book("S6","bassatin arbistan","oussama moslim",3500));
        library.addBook(new Book("S03","ard zikola","UNKOWN",1500));

        System.out.println("all books :");
        library.displayAllBooks();

        System.out.println(" books remove : ");
        library.removeBook("S03");

        System.out.println(" books find : ");
        library.findBookByIsbn("S6");

 System.out.println("all books R :");
        library.displayAllBooks();



    }


}
