import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    ImageIcon i1, i3;
    Image i2;
    JTextField userTF;
    JPasswordField passTF;
    JButton login, clear, signUP;
    JLabel label, text, pass, userID;
    Font myFont;
    public Login(){
        setTitle("Bank Management System");

        setLayout(null);

        myFont = new Font("Helvetica", Font.BOLD, 14);

        // Bank Logo
        i1 = new ImageIcon(ClassLoader.getSystemResource("logo.png"));
        i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        i3 = new ImageIcon(i2);

        label = new JLabel(i3);
        label.setBounds(80,80,100,100);
        add(label);

        // Bank Name
        text = new JLabel("বাংলাদেশ ব্যাংক");
        text.setFont(new Font("Helvetica", Font.BOLD, 30));
        text.setBounds(210, 100, 400, 40);
        add(text);

        // User ID & Text Field
        userID = new JLabel("Username:");
        userID.setFont(myFont);
        userID.setBounds(90, 210, 100, 30);
        add(userID);

        userTF = new JTextField();
        userTF.setBounds(200, 210, 210, 30);
        userTF.setFont(myFont);
        add(userTF);

        // Password & Text Field
        pass = new JLabel("Password:");
        pass.setFont(myFont);
        pass.setBounds(90, 250, 100, 30);
        add(pass);

        passTF = new JPasswordField();
        passTF.setBounds(200, 250, 210, 30);
        passTF.setFont(myFont);
        add(passTF);

        // Login Button
        login = new JButton("LOG IN");
        login.setBounds(200, 290, 210, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        // Clear Button
        /*clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);*/

        // Sign Up Button
        signUP = new JButton("Don't have an account?");
        signUP.setBounds(200, 330, 210, 30);
        signUP.setBorder(null);
        signUP.setBackground(null);
        signUP.setForeground(Color.GREEN);
        signUP.addActionListener(this);
        add(signUP);

        // Page Setup
        getContentPane().setBackground(Color.WHITE);

        setSize(550, 500);
        setLocation(380, 80);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){
        /*if (ae.getSource() == clear){
            userTF.setText("");
            passTF.setText("");
        }*/
        if (ae.getSource() == login){

        }
        if (ae.getSource() == signUP){
            setVisible(false);
            new SignupOne().setVisible(true);
        }
    }
    public static void main(String[] args) { new Login();}
}
