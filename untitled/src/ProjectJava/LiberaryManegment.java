package ProjectJava;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 class LibraryManagement {
    Scanner inp = new Scanner(System.in);
    String filename = "book.txt";
    //    ======= Add Student =======
    public void addBook(){
        try {
            FileWriter file = new FileWriter(filename,true);
            System.out.println("------ Enter Book Details ------");
            System.out.println("Enter Book ID");
            int id = inp.nextInt();
            inp.nextLine();
            System.out.println("Enterd Book Title");
            String title = inp.nextLine();
            System.out.println("Enter Book Author");
            String author = inp.nextLine();
            System.out.println("Enter Availability");
            boolean isAvailable = inp.nextBoolean();
            file.write("ID : "+id+", Title : "+title+", Author : "+author+", Available : "+isAvailable+"\n");
            file.close();
            System.out.println("Books Added Successfully");

        }
        catch (IOException e){
            System.out.println("File Error : "+e.getMessage());
        }
    }
    //    ======= View All Books =======
    public void viewBooks(){
        try {
            BufferedReader read = new BufferedReader(new FileReader(filename));
            String line;
            System.out.println("----- All Books -----");
            while ((line  = read.readLine())!=null){
                System.out.println(line);
            }
            read.close();
        }catch (IOException e){
            System.out.println("Error : "+e.getMessage());
        }
    }
    //    ======= Search Book =======
    public void searchBook(){
        System.out.println("Enter Book ID");
        int bookID = inp.nextInt();
        boolean found = false;
        try {
            BufferedReader read = new BufferedReader(new FileReader(filename));
            String line;
            while ((line=read.readLine()) != null){
                if(line.contains("ID : "+bookID)){
                    System.out.println("Book Found ");
                    System.out.println(line);
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("Book Not Found");
            }
        } catch (IOException e){
            System.out.println("Error : "+e.getMessage());
        }
    }
    //    ======== Borrow Book =======
    public void borrowBook() {
        System.out.println("Enter Book Id");
        int bookId = inp.nextInt();
        boolean found = false;

        try {
            BufferedReader read = new BufferedReader(new FileReader(filename));
            List<String> lines = new ArrayList<>();
            String line;

            while ((line = read.readLine()) != null) {
                String[] part = line.split(",");

                int id = Integer.parseInt(part[0].split(":")[1].trim()); // ✅ get number after "ID :"

                if (id == bookId) {
                    found = true;
                    boolean available = Boolean.parseBoolean(part[3].split(":")[1].trim()); // ✅ extract true/false

                    if (available) {
                        part[3] = "Available : false"; // update availability
                        System.out.println("You borrowed the book " + part[1].split(":")[1].trim());
                    } else {
                        System.out.println("Book already borrowed");
                    }
                }
                lines.add(String.join(",", part));
            }
            read.close();

            // rewrite file
            BufferedWriter wr = new BufferedWriter(new FileWriter(filename));
            for (String ln : lines) {
                wr.write(ln);
                wr.newLine();
            }
            wr.close();

            if (!found) {
                System.out.println("Book Not Found");
            }
        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
    //    ======== Return Book =======
    public void returnBook() {
        System.out.println("Enter Book Id");
        int bookId = inp.nextInt();
        boolean found = false;

        try {
            BufferedReader read = new BufferedReader(new FileReader(filename));
            List<String> lines = new ArrayList<>();
            String line;

            while ((line = read.readLine()) != null) {
                String[] part = line.split(",");

                int id = Integer.parseInt(part[0].split(":")[1].trim()); // ✅ get number after "ID :"

                if (id == bookId) {
                    found = true;
                    boolean available = Boolean.parseBoolean(part[3].split(":")[1].trim()); // ✅ extract true/false

                    if (!available) {
                        part[3] = "Available : true"; // update availability
                        System.out.println("Return Book Successfully " + part[1].split(":")[1].trim());
                    } else {
                        System.out.println("Book not borrowed");
                    }
                }
                lines.add(String.join(",", part));
            }
            read.close();

            // rewrite file
            BufferedWriter wr = new BufferedWriter(new FileWriter(filename));
            for (String ln : lines) {
                wr.write(ln);
                wr.newLine();
            }
            wr.close();

            if (!found) {
                System.out.println("Book Not Found");
            }
        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        LibraryManagement obj = new LibraryManagement();
        Scanner inp = new Scanner(System.in);
        char check = 'a';

        while (check != 'e' && check != 'E') {
            System.out.println("---- Features ----");
            System.out.println("Click 'a' to add new book ");
            System.out.println("Click 'v' to view all books ");
            System.out.println("Click 's' to search books ");
            System.out.println("Click 'b' to borrow books ");
            System.out.println("Click 'r' to return books ");
            System.out.println("Click 'e' to exit program ");
            System.out.println("Enter Option :- ");
            check = inp.next().charAt(0);

            switch (check) {
                case 'a':
                    obj.addBook();
                    break;
                case 'v':
                    obj.viewBooks();
                    break;
                case 's':
                    obj.searchBook();
                    break;
                case 'b':
                    obj.borrowBook();
                    break;
                case 'r':
                    obj.returnBook();
                    break;
                case 'e':
                case 'E':
                    System.out.println("Exiting Program");
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        }

    }
}
