package gui;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        try {
            String name = JOptionPane.showInputDialog("Enter your name");
            JOptionPane.showMessageDialog(null, "Hello " + name);

            int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you"));
            JOptionPane.showMessageDialog(null, "You are " + age + " years old");

            float height = Float.parseFloat(JOptionPane.showInputDialog("How tall are you in metres?"));
            JOptionPane.showMessageDialog(null, "You are " + height + "m tall");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "There was an error. Please make sure to answer all questions in the right format.");
        }

    }

}
