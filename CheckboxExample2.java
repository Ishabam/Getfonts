import java.awt.*;
import java.awt.event.*;
class CheckboxExample2 {
  CheckboxExample2(){
    Frame f=new Frame("CheckboxExample");
    final Label l=new Label();
    l.setAlignment(l.CENTER);
    l.setSize(400,100);
    Checkbox c1=new Checkbox("C++");
    c1.setBounds(100,100,50,50);
    Checkbox c2=new Checkbox("Java",true);
    c2.setBounds(100,150,50,50);

    f.add(l);
    f.add(c1);
    f.add(c2);

    c1.addItemListener(new ItemListener(){
      public void itemStateChanged(ItemEvent e){
        l.setText("C++ Checked:"+(e.getStateChange()==1?"Checked":"Unchecked"));
      }
    });
    c2.addItemListener(new ItemListener(){
      public void itemStateChanged(ItemEvent e){
        l.setText("java Checked:"+(e.getStateChange()==1?"Checked":"Unchecked"));
      }
    });
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
  }
  public static void main(String args[]){
    new CheckboxExample2();
  }
}
