import  java.awt.*;
import java.awt.event.*;
class cbge{
  cbge(){
    Frame f=new Frame("radio buttons");
    final Label l=new Label("CheckboxGroup Example");
    l.setAlignment(l.CENTER);
    l.setSize(400,100);
    CheckboxGroup cbg=new CheckboxGroup();
    Checkbox c1=new Checkbox("Java",cbg,true);
    c1.setBounds(100,100,50,50);
    Checkbox c2=new Checkbox("C++",cbg,false);
    c2.setBounds(100,150,50,50);
    f.add(l);
    f.add(c1);
    f.add(c2);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);

    c1.addItemListener(new ItemListener(){
      public void itemStateChanged( ItemEvent e){
        l.setText("Java Checkbox:Checked");
      }
    });

    c2.addItemListener(new ItemListener(){
      public void itemStateChanged(ItemEvent e){
        l.setText("C++ Checkbox:Checked");
      }
    });
  }
  public static void main(String[] args) {
    new cbge();
  }
}
