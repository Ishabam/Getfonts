import javax.swing.*;
public class JSpinnerExample {
  public static void main(String[] args) {
    JFrame f = new JFrame("Spinner Example");
    SpinnerModel value = new SpinnerNumberModel(5,0,10,1);
    JSpinner s = new JSpinner(value);
    s.setBounds(100,100,50,30);
    f.add(s);
    f.setVisible(true);
    // f.setLayout(null);
    f.setSize(300,300);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
