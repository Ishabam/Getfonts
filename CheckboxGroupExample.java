import java.awt.*;
class CheckboxGroupExample{
  CheckboxGroupExample(){
    Frame f=new Frame("CheckboxGroup Example");
    CheckboxGroup cbg=new CheckboxGroup();
    Checkbox c1=new Checkbox("C++",cbg,false);
    c1.setBounds(100,100,50,50);
    Checkbox c2=new Checkbox("Java",cbg,true);
    c2.setBounds(100,150,50,50);

    f.add(c1);
    f.add(c2);

    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
  }
  public static void main(String[] args) {
    new CheckboxGroupExample();
  }
}
