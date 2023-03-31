/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

/**
 *
 * @author giovannipds
 */
public class User {
  private String name;
  private int age;
  private String genre; // todo: define type
  private String tel;

  public User(String name) {
    this.name = name;
  }

  // name
  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }

  // age
  public int getAge() {
    return this.age;
  }
  public void setAge(int age) {
    this.age = age;
  }

  // genre
  public String getGenre() {
    return this.genre;
  }
  public void setGenre(String genre) {
    this.genre = genre;
  }

  // tel
  public String getTel() {
    return this.tel;
  }
  public void setTel(String tel) {
    this.tel = tel;
  }
}
