package swing;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
public class Swing extends JFrame{

    public static void main(String[] args) {
        Swing swing = new Swing();
        JFrame janela = new JFrame("TESTANDO"); 
        janela.setVisible(true); 
        janela.setDefaultCloseOperation(janela.EXIT_ON_CLOSE);
        janela.setSize(400,200);
        JButton butao = new JButton("soma");
        janela.add(butao);
}
}