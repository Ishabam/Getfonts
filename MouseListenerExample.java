import java.awt.*;
import java.awt.event.*;
class MouseListenerExample{
  Label l;
  MouseListenerExample(){
    l=new Label();

    addMouseListener(this);

    l.setBounds(100,100,50,30);
    l.setSize(500,500);
    l.setLayout(null);
    l.setVisible(true);
  }
  public void mouseClicked(MouseEvent e){
    l.setText("Mouse Clicked");
  }
  public void mouseEntered(MouseEvent e){
    l.setText("Mouse Entered");
  }
  public void mouseExited(MouseEvent e){
    l.setText("Mouse Exited");
  }
  public void mousePressed(MouseEvent e){
    l.setText("Mouse Pressed");
  }
  public void mouseReleased(MouseEvent e){
    l.setText("Mouse Released");
  }
  public static void main(String[] args) {
    new MouseListenerExample();
  }
}
