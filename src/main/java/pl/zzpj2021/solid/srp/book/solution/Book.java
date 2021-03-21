package pl.zzpj2021.solid.srp.book.solution;


import java.util.HashMap;
import java.util.Map;

public class Book {
    private final String tittle;
    private final String author;
    private int currentPageNumber;
    private Map<Integer, String> pages = new HashMap<>();
    private int indexOnShelf;
    private String libraryRoomName;
    private String rowLocation;

    public String getCurrentPageContents(){
        return pages.get(currentPageNumber);
    }

    public void turnPage(){
        currentPageNumber++;
    }

    public Book(String tittle, String author, int indexOnShelf) {
        this.tittle = tittle;
        this.author = author;
        this.indexOnShelf = indexOnShelf;
        currentPageNumber = 0;
    }

    public String getTittle() {
        return tittle;
    }

    public String getAuthor() {
        return author;
    }

    public int getCurrentPageNumber() {
        return currentPageNumber;
    }

    public Map<Integer, String> getPages() {
        return pages;
    }

    public int getIndexOnShelf() {
        return indexOnShelf;
    }

    public String getLibraryRoomName() {
        return libraryRoomName;
    }

    public String getRowLocation() {
        return rowLocation;
    }
}
