import java.awt.*;
import java.awt.event.*;
class PopupMenuExample{
  PopupMenuExample(){
    final Frame f=new Frame("PopupMenu Example");
    final PopupMenu p=new PopupMenu("Edit");
    MenuItem cut=new MenuItem("Cut");
    cut.setActionCommand("Cut");
    MenuItem copy=new MenuItem("Copy");
    copy.setActionCommand("Copy");
    MenuItem paste=new MenuItem("Paste");
    paste.setActionCommand("Paste");
    p.add(cut);
    p.add(copy);
    p.add(paste);
    f.addMouseListener(new MouseAdapter(){
      public void mouseClicked(MouseEvent e){
        p.show(f,e.getX(), e.getY());
      }
    });
    f.add(p);
    f.setSize(500,500);
    f.setLayout(null);
    f.setVisible(true);
  }
  public static void main(String[] args) {
    new PopupMenuExample();
  }
}
