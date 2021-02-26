import java.awt.*;
class MyList{
  MyList(){
    Frame f=new Frame("list layout");
    List c=new List(5);
    c.setBounds(100,100,75,75);
    c.add("Item1");
    c.add("Item2");
    c.add("Item3");
    c.add("Item4");
    c.add("Item5");
    f.add(c);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
  }
  public static void main(String[] args) {
    new MyList();
  }
}
