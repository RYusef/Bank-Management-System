import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupOne extends JFrame implements ActionListener{
    JLabel formNO, pDetails, name, fName, mName, dob, gender, rel, marital, address, postCode, email, mob, pass, cPass;
    JTextField nameTF, fNameTF, mNameTF, relTF, addressTF, postCodeTF, emailTF, mobTF;
    JRadioButton male, female, other, married, unmarried ;
    JComboBox date,month,year;
    ButtonGroup genderBtn, maritalBtn;
    JButton register, back;
    JPasswordField passTF, cPassTF;
    Font myFont;
    long random;
    SignupOne(){
        setLayout(null);

        // Form no.
        Random ran = new Random();
        random = Math.abs(ran.nextLong() % 9000L) + 1000L;

        myFont = new Font("Calibri", Font.BOLD, 14);
        
        formNO = new JLabel("APPLICATION FORM NO. " + random);
        formNO.setFont( new Font("Calibri", Font.BOLD, 18));
        formNO.setBounds(150, 10, 250,40);
        add(formNO);

        /*pDetails = new JLabel("Page 1: Personal Details");
        pDetails.setFont(new Font("Calibri", Font.BOLD, 22));
        pDetails.setBounds(290, 80, 300,30);
        add(pDetails);*/

        // Name
        name = new JLabel("Name:");
        name.setFont(myFont);
        name.setBounds(50, 60, 200,30);
        add(name);

        nameTF = new JTextField();
        nameTF.setFont(myFont);
        nameTF.setBounds(180, 60, 300,30);
        add(nameTF);

        // Father's Name
        fName = new JLabel("Father's Name:");
        fName.setFont(myFont);
        fName.setBounds(50, 100, 200,30);
        add(fName);

        fNameTF = new JTextField();
        fNameTF.setFont(myFont);
        fNameTF.setBounds(180, 100, 300,30);
        add(fNameTF);

        // Mother's Name
        mName = new JLabel("Mother's Name:");
        mName.setFont(myFont);
        mName.setBounds(50, 140, 200,30);
        add(mName);

        mNameTF= new JTextField();
        mNameTF.setFont(myFont);
        mNameTF.setBounds(180, 140, 300,30);
        add(mNameTF);

        // Date of Birth
        dob = new JLabel("Date of Birth:");
        dob.setFont(myFont);
        dob.setBounds(50, 180, 200,30);
        add(dob);

        String dates[]= {"","1","2","3","4","5","6","7","8","9",
                "10","11","12","13","14","15","16","17",
                "18","19","20","21","22","23","24","25",
                "26","27","28","29","30","31"};
        date = new JComboBox(dates);
        date.setBounds(180,180,100,30);
        date.setBackground(Color.WHITE);
        add(date);

        String months[]= {"","JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG", "SEP","OCT","NOV","DEC"};
        month = new JComboBox(months);
        month.setBounds(280,180,100,30);
        month.setBackground(Color.WHITE);
        add(month);

        String years[]= {"","1990","1991","1992","1993","1994",
                "1995","1996","1997","1998","1999","2000",
                "2001","2002","2003","2004","2005","2006",
                "2007","2008","2009","2010","2011","2012",
                "2013","2014","2015","2016","2017","2018",
                "2019","2020","2021","2022","2023","2024"};
        year = new JComboBox(years);
        year.setBounds(380,180,100,30);
        year.setBackground(Color.WHITE);
        add(year);

        // Gender
        gender = new JLabel("Gender:");
        gender.setFont(myFont);
        gender.setBounds(50, 220, 200,30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(180, 220, 100,30);
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(280, 220, 100,30);
        female.setBackground(Color.WHITE);
        add(female);

        other = new JRadioButton("Other");
        other.setBounds(380, 220, 100,30);
        other.setBackground(Color.WHITE);
        add(other);

        genderBtn = new ButtonGroup();
        genderBtn.add(male);
        genderBtn.add(female);
        genderBtn.add(other);

        // Religion
        rel = new JLabel("Religion:");
        rel.setFont(myFont);
        rel.setBounds(50, 260, 200,30);
        add(rel);

        relTF = new JTextField();
        relTF.setFont(myFont);
        relTF.setBounds(180, 260, 300,30);
        add(relTF);

        // Marital Status
        marital = new JLabel("Marital Status:");
        marital.setFont(myFont);
        marital.setBounds(50, 300, 200,30);
        add(marital);

        married = new JRadioButton("Married");
        married.setBounds(180, 300, 100,30);
        married.setBackground(Color.WHITE);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(280, 300, 100,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

        maritalBtn = new ButtonGroup();
        maritalBtn.add(married);
        maritalBtn.add(unmarried);

        // Address
        address= new JLabel("Address:");
        address.setFont(myFont);
        address.setBounds(50, 340, 200,30);
        add(address);

        addressTF = new JTextField();
        addressTF.setFont(myFont);
        addressTF.setBounds(180, 340, 300,30);
        add(addressTF);

        // PostCode
        postCode= new JLabel("Post Code:");
        postCode.setFont(myFont);
        postCode.setBounds(50, 380, 200,30);
        add(postCode);

        postCodeTF = new JTextField();
        postCodeTF.setFont(myFont);
        postCodeTF.setBounds(180, 380, 300,30);
        add(postCodeTF);

        // Email
        email = new JLabel("Email:");
        email.setFont(myFont);
        email.setBounds(50, 420, 200,30);
        add(email);

        emailTF = new JTextField();
        emailTF.setFont(myFont);
        emailTF.setBounds(180, 420, 300,30);
        add(emailTF);

        // Mobile No
        mob = new JLabel("Mobile No:");
        mob.setFont(myFont);
        mob.setBounds(50, 460, 200,30);
        add(mob);

        mobTF = new JTextField();
        mobTF.setFont(myFont);
        mobTF.setBounds(180, 460, 300,30);
        add(mobTF);

        // Password
        pass = new JLabel("Password:");
        pass.setFont(myFont);
        pass.setBounds(50, 500, 200,30);
        add(pass);

        passTF = new JPasswordField();
        passTF.setFont(myFont);
        passTF.setBounds(180, 500, 300,30);
        add(passTF);

        // Confirm Password
        cPass = new JLabel("Confirm Password:");
        cPass.setFont(myFont);
        cPass.setBounds(50, 540, 200,30);
        add(cPass);

        cPassTF = new JPasswordField();
        cPassTF.setFont(myFont);
        cPassTF.setBounds(180, 540, 300,30);
        add(cPassTF);

        register = new JButton("Register");
        register.setBackground(Color.GRAY);
        register.setForeground(Color.WHITE);
        register.setFont(new Font("Helvetica", Font.PLAIN, 14));
        register.setBounds(380, 600, 100, 30);
        register.addActionListener(this);
        add(register);

        back = new JButton("Back");
        back.setBackground(Color.GRAY);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Helvetica", Font.PLAIN, 14));
        back.setBounds(50, 600, 80, 30);
        back.addActionListener(this);
        add(back);

        /* = new JLabel("Page 1: Personal Details");
        .setFont(myFont);
        .setBounds(100, 340, 200,30);
        add();

         = new JTextField();
        .setFont(myFont);
        .setBounds(180, 140, 300,30);
        add();
        */

        // Frame
        this.getContentPane().setBackground(Color.WHITE);
        this.setSize(550, 720);
        this.setLocation(380, 10);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) { new SignupOne(); }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String formNO = "" + random;
        String name = nameTF.getText();
        String fName = fNameTF.getText();
        String mName = mNameTF.getText();
        String gender = null;
        if (male.isSelected()){
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        }
        else if (other.isSelected()){
            gender = "Other";
        }
        String rel = relTF.getText();
        String marital = null;
        if (married.isSelected()){
            marital = "Married";
        } else if (unmarried.isSelected()) {
            marital = "Unmarried";
        }
        String address = addressTF.getText();
        String postCode = postCodeTF.getText();
        String email = emailTF.getText();
        String mob = mobTF.getText();
        String pass = Arrays.toString(passTF.getPassword());
        String cPass = Arrays.toString(cPassTF.getPassword());

        if (ae.getSource() == register){
            if (name.equals("") ||fName.equals("")|| mName.equals("")|| gender == null || rel.equals("")|| marital == null|| address.equals("")|| postCode.equals("")|| email.equals("")|| mob.equals("")|| pass.equals("")|| cPass.equals("")){
                JOptionPane.showMessageDialog(null, "Text Fields Can't Be Empty");
            }
            else {
                JOptionPane.showMessageDialog(null, "Account Created!");
                setVisible(false);
                new Login().setVisible(true);
            }
        }
        if (ae.getSource() == back){
            setVisible(false);
            new Login().setVisible(true);
        }
    }
}
