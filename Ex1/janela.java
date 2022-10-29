package Ex1;

import javax.swing.*;

public class janela extends JFrame {

public janela() {
    JFrame jf = new JFrame();
    jf.setTitle("Menu");
    jf.setSize (600, 500);
    jf.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    jf.setLocationRelativeTo(null);
    jf.setResizable(false);
    jf.setVisible(true);

}

public static void main (String[] args) {

    new janela();

}

}