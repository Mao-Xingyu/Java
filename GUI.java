import javax.swing.JOptionPane;

public class GUI {
    
public static void main(String[] args) {
    
    String name = JOptionPane.showInputDialog("Enter your name");
    JOptionPane.showMessageDialog(null, "Hello " + name);

    int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
    JOptionPane.showMessageDialog(null, "You are " + age + "years old");

    double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height(m)"));
    JOptionPane.showMessageDialog(null, "You are " + height + "m tall");

    double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight(kg)"));
    JOptionPane.showMessageDialog(null, "You are " + weight  + "kg");

    double BMI = (weight / (height * height));
    BMI = Math.round(BMI*100.0)/100.0;
    JOptionPane.showMessageDialog(null, "Your BMI is " + BMI  + "kg/m\u00B2");


}

}
