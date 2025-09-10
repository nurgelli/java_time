package com.practice.app;
import javax.swing.JOptionPane;
public class Gui {

    public static void main(String[] args){

        String name = JOptionPane.showInputDialog("Hello, How are you?");
        System.out.println(name); // it will show in console not as gui message

        int age = Integer.parseInt(JOptionPane.showInputDialog("your age"));
        JOptionPane.showMessageDialog(null, age);

        double height = Double.parseDouble(JOptionPane.showInputDialog("your height"));
        JOptionPane.showMessageDialog(null, height);

    }

}
