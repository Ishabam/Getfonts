import java.awt.*;
import java.awt.event.*;
class ScrollbarExample1{
  ScrollbarExample1(){
    Frame f=new Frame("Scrollbar example");
    final Label l=new Label();
    l.setAlignment(l.CENTER);
    l.setSize(400,100);
    final Scrollbar s=new Scrollbar();
    s.setBounds(100,100,50,100);
    f.add(l);
    f.add(s);
    f.setSize(500,500);
    f.setLayout(null);
    f.setVisible(true);

    s.addAdjustmentListener(new AdjustmentListener(){
      public void adjustmentValueChanged(AdjustmentEvent e){
        l.setText("Vertical scrollbar value: "+s.getValue());
      }
    });
  }
  public static void main(String[] args) {
    new ScrollbarExample1();
  }
}
