/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

/**
 *
 * @author giovannipds
 */
public class Book {
  private String title;
  private String[] authors;
  private String area;
  private String publisher;
  private int year;
  private int edition;
  private int pages;

  public Book(String title, String[] authors, String publisher) {
    this.title = title;
    this.authors = authors;
    this.publisher = publisher;
  }

  // title
  public String getTitle() {
    return this.title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  // authors
  public String[] getAuthors() {
    return this.authors;
  }
  public void setAuthors(String[] authors) {
    this.authors = authors;
  }

  // area
  public String getArea() {
    return this.area;
  }
  public void setArea(String area) {
    this.area = area;
  }

  // publisher
  public String getPublisher() {
    return this.publisher;
  }
  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  // year
  public int getYear() {
    return this.year;
  }
  public void setYear(int year) {
    this.year = year;
  }

  // edition
  public int getEdition() {
    return this.edition;
  }
  public void setEdition(int edition) {
    this.edition = edition;
  }

  // pages
  public int getPages() {
    return this.pages;
  }
  public void setPages(int pages) {
    this.pages = pages;
  }
}
