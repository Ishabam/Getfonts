import java.awt.*;
import java.awt.event.*;
class TextFieldExample extends Frame implements ActionListener{
  TextField t1,t2,t3;
  Button b1,b2;
  Label l1,l2,l3;
  TextFieldExample(){
    t1=new TextField();
    t1.setBounds(50,50,150,20);
    t2=new TextField();
    t2.setBounds(50,100,150,20);
    t3=new TextField();
    t3.setBounds(50,150,150,20);
    b1=new Button("+");
    b1.setBounds(50,200,150,20);
    b2=new Button("-");
    b2.setBounds(150,200,150,20);
    l1=new Label("First Number");
    l1.setBounds(10,50,150,20);
    l2=new Label("Second Number");
    l2.setBounds(10,100,150,20);
    l3=new Label("Result");
    l3.setBounds(10,150,150,20);

    b1.addActionListener(this);
    b2.addActionListener(this);

    add(t1);
    add(t2);
    add(t3);
    add(b1);
    add(b2);
    add(l1);
    add(l2);
    add(l3);

    setSize(300,300);
    setLayout(null);
    setVisible(true);
  }
  public void actionPerformed(ActionEvent e){
    String s1=t1.getText();
    String s2=t2.getText();

    int a=Integer.parseInt(s1);
    int b=Integer.parseInt(s2);
    int c=0;

    if(e.getSource() == b1){
      c=a+b;
    }
    else
    if(e.getSource() == b2){
      c=a-b;
    }
    String result= String.valueOf(c);
    t3.setText(result);
  }
  public static void main(String args[]){
    new TextFieldExample();
  }
}
