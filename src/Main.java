import Humanity.*;
public class Main {

  public static void main(String[] args) {
    Human human = new Human("'Human' w/o gender");
    System.out.println(human);
    Human man = new Man("Arnold");
    System.out.println(man);
    System.out.println(man.greet());

    Human woman = new Woman("Sara");
    System.out.println(woman);
    System.out.println(woman.greet());
  }
}
