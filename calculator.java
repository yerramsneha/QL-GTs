package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;


public class calculator {
 JFrame frame = new JFrame();
 JPanel panel = new JPanel();
 JTextArea textarea = new JTextArea(2,10);
 
 JButton button1 = new JButton();
 JButton button2 = new JButton();
 JButton button3 = new JButton();
 JButton button4 = new JButton();
 JButton button5 = new JButton();
 JButton button6 = new JButton();
 JButton button7 = new JButton();
 JButton button8 = new JButton();
 JButton button9 = new JButton();
 JButton button0 = new JButton();
 
 
 JButton buttonadd = new JButton();
 JButton buttonsub = new JButton();
 JButton buttonmul = new JButton();
 JButton buttondiv = new JButton();
 JButton buttonclear = new JButton();
 JButton buttondot = new JButton();
 JButton buttonequal = new JButton();
 
 double number1,number2,result;
 int addc,mulc=0,divc=0,subc=0;
 
 public calculator() {
	 frame.setSize(340,450);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setVisible(true);
	 frame.setTitle("Krishna");
	 
	 //frame.setResizable(false);
 frame.add(panel);
 panel.setBackground(Color.LIGHT_GRAY);
 Border border = BorderFactory.createLineBorder(Color.RED,4);
 panel.add(textarea);
 
 textarea.setBackground(Color.BLACK);
 Border tborder = BorderFactory.createLineBorder(Color.BLUE,3);
 textarea.setBorder(tborder);
 Font font = new Font("arial", Font.BOLD,33);
 textarea.setFont(font);
 textarea.setForeground(Color.WHITE);
 
 textarea.setPreferredSize(new Dimension(2,10));
 textarea.setLineWrap(true);
 
 button1.setPreferredSize(new Dimension (128,128));
 button1.setIcon(new ImageIcon("C:\\Users\\SaiKrishnaKumarKomma\\OneDrive - ValueMomentum, Inc\\Desktop\\button1.png"));
 
 button2.setPreferredSize(new Dimension (128,128));
 button2.setIcon(new ImageIcon("C:\\Users\\SaiKrishnaKumarKomma\\OneDrive - ValueMomentum, Inc\\Desktop\\button2.png"));
 
 button3.setPreferredSize(new Dimension (128,128));
 button3.setIcon(new ImageIcon("C:\\Users\\SaiKrishnaKumarKomma\\OneDrive - ValueMomentum, Inc\\Desktop\\button1.png"));
 
 button4.setPreferredSize(new Dimension (128,128));
 button4.setIcon(new ImageIcon("C:\\Users\\SaiKrishnaKumarKomma\\OneDrive - ValueMomentum, Inc\\Desktop\\button1.png"));

 button5.setPreferredSize(new Dimension (128,128));
 button5.setIcon(new ImageIcon("C:\\Users\\SaiKrishnaKumarKomma\\OneDrive - ValueMomentum, Inc\\Desktop\\button1.png"));
 
 button6.setPreferredSize(new Dimension (128,128));
 button6.setIcon(new ImageIcon("C:\\Users\\SaiKrishnaKumarKomma\\OneDrive - ValueMomentum, Inc\\Desktop\\button1.png"));

 button7.setPreferredSize(new Dimension (128,128));
 button7.setIcon(new ImageIcon("C:\\Users\\SaiKrishnaKumarKomma\\OneDrive - ValueMomentum, Inc\\Desktop\\button1.png"));
 
 button8.setPreferredSize(new Dimension (128,128));
 button8.setIcon(new ImageIcon("C:\\Users\\SaiKrishnaKumarKomma\\OneDrive - ValueMomentum, Inc\\Desktop\\button1.png"));

 button9.setPreferredSize(new Dimension (128,128));
 button9.setIcon(new ImageIcon("C:\\Users\\SaiKrishnaKumarKomma\\OneDrive - ValueMomentum, Inc\\Desktop\\button1.png"));

 button0.setPreferredSize(new Dimension (128,128));
 button0.setIcon(new ImageIcon("C:\\Users\\SaiKrishnaKumarKomma\\OneDrive - ValueMomentum, Inc\\Desktop\\button1.png"));

 
 }
 
 
}
