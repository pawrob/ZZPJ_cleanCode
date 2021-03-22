package pl.zzpj2021.solid.srp.book.solution;

import java.util.Map;

public class Printer {
    /**
     * Prints all pages
     * @return
     */
    public static String printAllPages(Book book) {

        StringBuilder allPages = new StringBuilder();
        for(int i=0; i < book.countPages(); i++) {
            allPages.append(i).append(" ").append(book.getCurrentPageContents()).append('\n');
            book.turnPage();
        }
        return  allPages.toString();
    }
}
