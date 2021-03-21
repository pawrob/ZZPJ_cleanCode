package pl.zzpj2021.solid.srp.book.solution;

import pl.zzpj2021.solid.srp.book.solution.Book;

import java.util.Map;

public class Printer implements Printable{

    @Override
    public void printCurrent(Book book) {
        System.out.println(book.getCurrentPageContents());
    }

    @Override
    public String printAll(Book book) {

        String allPages = new String();
        for(Map.Entry<Integer, String> page : book.getPages().entrySet()) {
            allPages += (page.getKey() + " " + page.getValue());
        }
        return  allPages;
    }
}
