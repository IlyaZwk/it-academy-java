package homework10;

import java.io.*;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Homework10 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        task1();
        task2();
    }

    public static void task1() throws IOException, ClassNotFoundException {
        System.out.println();
        System.out.println("Task 1:");
        List<Book> books = new ArrayList<>();
        books.add(new Book("Оруэлл", "1984", 2021));
        books.add(new Book("Караткевич", "Седая легенда", 2020));
        books.add(new Book("Оруэлл", "Скотный двор", 2019));
        books.add(new Book("Оруэлл", "Дни в бирме", 2017));
        books.add(new Book("Караткевич", "Дикая охота короля страха", 2022));
        books.add(new Book("Толкиен", "Беовульф", 2023));
        books.add(new Book("Караткевич", "Черный замок Ольшанский", 2021));
        books.add(new Book("Толкиен", "Хоббит", 2024));
        books.add(new Book("Толкиен", "Властелин колец", 2019));


        writeBooksToFile(books);
        List<Book> bookList = readBooksToFile("resources/books.txt");
        System.out.println(bookList);

        Predicate<Book> filterByAuthor = book -> book.getAuthor().equals("Оруэлл");
        Predicate<Book> filterByYear = book -> book.getYearWrite() < 2022;
        List<Book> bookByYear = filterList("resources/books.txt", filterByYear);
        List<Book> bookByAuthor = filterList("resources/books.txt", filterByAuthor);
        System.out.println("book by author" + bookByAuthor);
        System.out.println("book by year" + bookByYear);
        List<Book> sortByAuthor = sortList("resources/books.txt");
        System.out.println("Sort by Author" + sortByAuthor);
        Predicate<Book> sublistByAuthor = book -> book.getAuthor().equals("Толкиен");
        List<Book> subList = subListList("resources/books.txt", sublistByAuthor);
        System.out.println("Sublist by Author" + subList);


    }

    private static List<Book> filterList(String filePath, Predicate<Book> predicate) throws IOException, ClassNotFoundException {
        List<Book> bookList = readBooksToFile(filePath);
        List<Book> filtredBook = bookList.stream().
                filter(predicate).toList();
        return filtredBook;
    }

    private static List<Book> readBooksToFile(String filePath) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream(filePath);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);


        List<Book> readBooks = (List<Book>) objectInputStream.readObject();
        return readBooks;

    }

    private static void writeBooksToFile(List<Book> books) throws IOException {
        FileOutputStream outputStream = new FileOutputStream("resources/books.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(books);

        objectOutputStream.close();

    }

    private static List<Book> sortList(String filePath) throws IOException, ClassNotFoundException {
        List<Book> bookList = readBooksToFile(filePath);
        List<Book> sortedBook = bookList.stream()
                .sorted((x,y)->x.getAuthor().compareTo(y.getAuthor())).collect(Collectors.toList());
        return sortedBook;
    }

    private static List<Book> subListList(String filePath, Predicate<Book> predicate) throws IOException, ClassNotFoundException {
        List<Book> bookList = readBooksToFile(filePath);
        List<Book> sublist = bookList.stream()
                .filter(predicate)
                .toList();
        return sublist;
    }

    public static void task2() {
        System.out.println();
        System.out.println("Task 2:");
        List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");
        myList.stream().
                filter(string -> string.matches("[a,b,c][1,2]")).
                sorted(Comparator.comparing(x -> x.replaceAll("[a-zA-Z]+", ""))).
                sorted(Collections.reverseOrder()).
                skip(1).
                limit(myList.size() - 1).
                map(String::toUpperCase).
                forEach(System.out::println);
    }

}
