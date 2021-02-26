import java.awt.*;
import java.awt.event.*;
class MyPanel{
  MyPanel(){
    Frame f=new Frame("Panel Example");
    Panel p=new Panel();
    p.setBounds(40,80,200,200);
    p.setBackground(color.BLACK);
    Button b1=new Button("Button-1");
    b1.setBounds(50,100,80,30);
    b1.setBackground(color.Yellow);
    Button b2=new Button("Button-2");
    b2.setBounds(50,150,80,30);
    b2.setBackground(color.Pink);
    f.add(p);
    p.add(b1);
    p.add(b2);
    f.setSize(500,500);
    f.setVisible(true);
    f.setLayout(null);
  }
  public static void main(String[] args) {
    new MyPanel();
  }
}
