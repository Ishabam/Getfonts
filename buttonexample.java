import java.awt.event.*;
import java.awt.*;
class buttonexample{
  public static void main(String args[]){
    Frame f=new Frame();
    final  TextField tf=new TextField();
    tf.setBounds(100,80,50,30);
    Button b =new Button("click");
    b.setBounds(120,100,70,50);

    b.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        tf.setText("Welcome");
      }
    });

    f.add(b);
    f.add(tf);
    f.setSize(500,500);
    f.setLayout(null);
    f.setVisible(true);
  }

}
