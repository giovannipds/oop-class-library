/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author giovannipds
 */
public class Loan {
  private LocalDate date;
  private LocalTime time;
  private Book book;
  private User user;

  public Loan(Book book, User user) {
    this.book = book;
    this.user = user;
    this.date = LocalDate.now();
    this.time = LocalTime.now();
  }

  // date
  public LocalDate getDate() {
    return this.date;
  }
  public void setDate(LocalDate date) {
    this.date = date;
  }

  // time
  public LocalTime getTime() {
    return this.time;
  }
  public void setTime(LocalTime time) {
    this.time = time;
  }

  // book
  public Book getBook() {
    return this.book;
  }
  public void setBook(Book book) {
    this.book = book;
  }

  // user
  public User getUser() {
    return this.user;
  }
  public void setUser(User user) {
    this.user = user;
  }
}
