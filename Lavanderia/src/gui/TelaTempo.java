package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class TelaTempo extends JFrame{
    static int seconds = 10;


public TelaTempo(){
	
	
	final JFrame frame = new JFrame("Countdown");
    JPanel panel = new JPanel();
    setTitle("Lavanderia");
    final JLabel label = new JLabel();
    panel.add(label);
    frame.add(panel);
    frame.setSize(500, 500);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            seconds--;
            int dia = (int) TimeUnit.SECONDS.toDays(seconds);
            long horas = TimeUnit.SECONDS.toHours(seconds) - (dia * 24);
            long minutos = TimeUnit.SECONDS.toMinutes(seconds)
                    - (TimeUnit.SECONDS.toHours(seconds) * 60);
            long segundos = TimeUnit.SECONDS.toSeconds(seconds)
                    - (TimeUnit.SECONDS.toMinutes(seconds) * 60);
            label.setFont(new Font("SansSerif", Font.PLAIN,15));
            label.setText(horas + " Hour(s), " + minutos + " Minute(s) and "
                    + segundos + " Second(s)");
            if (seconds == 0) {
            	frame.setVisible(false);
            	JOptionPane.showMessageDialog(null,  "Roupas Prontas!", null, JOptionPane.ERROR_MESSAGE);
            }
        }
    });
    timer.start();
}


}









