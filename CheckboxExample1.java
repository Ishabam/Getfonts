import java.awt.*;
class CheckboxExample1 extends Frame{
  CheckboxExample1(){
    Checkbox c1=new Checkbox("C++");
    c1.setBounds(50,50,50,30);
    Checkbox c2=new Checkbox("Java",true);
    c2.setBounds(50,100,50,30);

    add(c1);
    add(c2);

    setSize(400,400);
    setLayout(null);
    setVisible(true);
  }
 public static void main(String[] args) {
    new CheckboxExample1();    
  }
}
