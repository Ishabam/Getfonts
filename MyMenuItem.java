import java.awt.*;
class MyMenuItem{
  MyMenuItem(){
    Frame f=new Frame("Menu items and sub-menus");
    Menubar m=new MenuBar();
    Menu mb=new Menu("Menu");
    Menu sb=new Menu("Sub-menu");
    MenuItem i1=new MenuItem("Item 1");
    MenuItem i2=new MenuItem("Item 2");
    MenuItem i3=new MenuItem("Item 3");
    MenuItem i4=new MenuItem("Item 4");
    MenuItem i5=new MenuItem("Item 5");
    mb.add(i1);
    mb.add(i2);
    mb.add(i3);
    sb.add(i4);
    sb.add(i5);
    mb.add(sb);
    m.add(m);
    f.setMenuBar(m);
    f.setSize(500,500);
    f.setLayout(null);
    f.setVisible(true);
  }
  public static void main(String[] args) {
    new MyMenuItem();
  }
}
