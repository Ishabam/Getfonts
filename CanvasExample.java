import java.awt.*;
class CanvasExample{
  CanvasExample(){
    Frame f=new Frame("Canvas Example");
    f.add(new MyCanvas());
    f.setLayout(null);
    f.setVisible(true);
    f.setSize(500,500);
  }
  public static void main(String[] args) {
    new CanvasExample();
  }
}

class MyCanvas extends Canvas{
  MyCanvas(){
    setBackground(Color.GRAY);
    setSize(400,400);
  }
  public void paint(Graphics g){
    g.setColor(Color.RED);
    // g.fillOval(75,75,150,75);
    g.fillCircle(75,150,150,75);
  }
}
