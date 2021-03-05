import java.awt.*;
import java.awt.event.*;
class D extends Frame{
  D(){
    this.addWindowListener(new WindowAdapter(){
      public void windowClosing(WindowEvent e){
        System.exit(0);
      }
    });
    setSize(500,500);
    setLayout(null);
    setVisible(true);
  }
  public void paint(Graphics g){
    this.setBackground(new Color(51,204,255));
    g.setColor(new Color(255,255,204));
    g.fillRect(110,110,150,240);
    g.setColor(new Color(153,102,0));
    g.fillPolygon (new int[] {110,260,185}, new int[] {110,110,35}, 3);
    g.setColor(Color.green);
    g.fillRect(0,350,500,20);
    g.setColor(new Color(153,153,153));
    g.fillRect(148,148,60,60);
    g.fillRect(148,225,60,125);
    g.setColor(Color.black);
    g.drawString("Welcome", 150, 250);
  }
  public static void main(String[] args) {
    new D();
  }
}
