package Humanity;

public class Human {

  /*
    Создайте класс "Человек", конструктор которого принимает имя.
    При попытке вывести объект этого класса на экран должна выводиться строка "Человек по имени ...".
    Добавьте в класс "Человек" метод "приветствие", который будет выводить строку: "Я родился!"
    Создайте классы "Мужчина" и "Женщина", которые будут наследниками класса "Человек".
    Попытка вывести их на экран должна приводить к выводу строки "Мужчина по имени ..."
    или "Женщина по имени ..."
    Метод "приветствие" класса "Женщина" должен выводить строку: "Я родилась!"
   */
  private String name;
  private String type;

  public Human(String name) {
    this.name = name;
    setType("Human");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  protected void setType(String type) {
    this.type = type;
  }

  protected String getType() {
    return type;
  }

  public String greet() {
    return "i was born!";
  }

  @Override
  public String toString() {
    return getType() + " with name " + getName();
  }
}
