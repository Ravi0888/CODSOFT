import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FDemo extends JFrame implements ActionListener
{
	JTextField tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8,tx9;
	JLabel l,l1,l2,l3,l4,l5,l6,l7;
 JButton resultbutton, clearbutton,exitbutton;
	public FDemo()
	{
		setLayout(null);
		Font f=new Font(" ",Font.BOLD,30);
		l=new JLabel("-: Student Grade Calculator :-");
		l.setSize(500,50);
		l.setLocation(350,5);
		l.setFont(f);
		add(l);
		
		l1=new JLabel("Student Name :");
		l1.setSize(300,50);
		l1.setLocation(50,60);
		l1.setFont(f);
		add(l1);
		tx1=new JTextField();
		tx1.setSize(300,30);
		tx1.setLocation(270,70);
		add(tx1);
		tx1.setFont(f);
		
		l2=new JLabel("Subjects Name ");
		l2.setSize(300,150);
		l2.setLocation(50,50);
		add(l2);
		l2.setFont(f);
		
		
		 l3=new JLabel("Marks obtained / 100");
		l3.setSize(350,150);
		l3.setLocation(300,50);
		add(l3);
		l3.setFont(f);
		
		l4=new JLabel("Hindi");
		l4.setSize(300,50);
		l4.setLocation(70,180);
		l4.setFont(f);
		add(l4);
		tx2=new JTextField();
		tx2.setSize(100,30);
		tx2.setLocation(300,190);
		add(tx2);
		tx2.setFont(f);
		
		l4=new JLabel("English");
		l4.setSize(300,50);
		l4.setLocation(70,230);
		l4.setFont(f);
		add(l4);
		tx3=new JTextField();
		tx3.setSize(100,30);
		tx3.setLocation(300,240);
		add(tx3);
		tx3.setFont(f);
		
		l4=new JLabel("Chemistry");
		l4.setSize(300,50);
		l4.setLocation(70,280);
		l4.setFont(f);
		add(l4);
		tx4=new JTextField();
		tx4.setSize(100,30);
		tx4.setLocation(300,290);
		add(tx4);
		tx4.setFont(f);
		
		l4=new JLabel("Physics");
		l4.setSize(300,50);
		l4.setLocation(70,330);
		l4.setFont(f);
		add(l4);
		tx5=new JTextField();
		tx5.setSize(100,30);
		tx5.setLocation(300,340);
		add(tx5);
		tx5.setFont(f);
		
		l4=new JLabel("Mathmetics");
		l4.setSize(300,50);
		l4.setLocation(70,380);
		l4.setFont(f);
		add(l4);
		tx6=new JTextField();
		tx6.setSize(100,30);
		tx6.setLocation(300,390);
		add(tx6);
		tx6.setFont(f);
		
		l5=new JLabel("Total Marks");
		l5.setSize(300,50);
		l5.setLocation(600,180);
		l5.setFont(f);
		add(l5);
		tx7=new JTextField();
		tx7.setSize(100,30);
		tx7.setLocation(770,190);
		add(tx7);
		tx7.setFont(f);
		
		l4=new JLabel("Percentage");
		l4.setSize(300,50);
		l4.setLocation(600,280);
		l4.setFont(f);
		add(l4);
		tx8=new JTextField();
		tx8.setSize(100,30);
		tx8.setLocation(770,290);
		add(tx8);
		tx8.setFont(f);
		
		l4=new JLabel("Grade");
		l4.setSize(300,50);
		l4.setLocation(600,370);
		l4.setFont(f);
		add(l4);
		tx9=new JTextField();
		tx9.setSize(100,30);
		tx9.setLocation(770,380);
		add(tx9);
		tx9.setFont(f);
		
		resultbutton=new JButton("Result");
		resultbutton.setSize(150,70);
		resultbutton.setLocation(170,500);
		add(resultbutton);
		resultbutton.setFont(f);
		
		clearbutton=new JButton("Clear");
		clearbutton.setSize(150,70);
		clearbutton.setLocation(380,500);
		add(clearbutton);
		clearbutton.setFont(f);
		
		 exitbutton=new JButton("Exit");
		exitbutton.setSize(150,70);
		exitbutton.setLocation(600,500);
		add(exitbutton);
		exitbutton.setFont(f);
		setResizable(false);
		
		resultbutton.addActionListener(this);
		clearbutton.addActionListener(this);
		exitbutton.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==resultbutton)
		{
		String s1=tx2.getText();
		String s2=tx3.getText();
		String s3=tx4.getText();
		String s4=tx5.getText();
		String s5=tx6.getText();
		
		int suresultbutton=Integer.parseInt(s1);
		int sub2=Integer.parseInt(s2);
		int sub3=Integer.parseInt(s3);
		int sub4=Integer.parseInt(s4);
		int sub5=Integer.parseInt(s5);
		
		double totalmarks=suresultbutton+sub2+sub3+sub4+sub5;
		double percent=totalmarks/5;
		String grade=" " ;
		if(percent>=85)
		{
		 grade="A+";
		}
		else if(percent>=70&&percent<85)
		{
			 grade="A";
		}
		else if(percent>=55&&percent<70)
		{
			 grade="B";
		}
		else if(percent>=45&&percent<55)
		{
			grade="C";
		}
		else if(percent>=35&&percent<45)
		{
			 grade="D";
		}
		else if(percent<35)
		{
		    grade="F";
		}
		tx7.setText(" "+totalmarks);
		tx8.setText(" "+percent+"%");
		tx9.setText(" "+grade);
		}
if(e.getSource()==clearbutton)
		{
			tx1.setText("");
			tx2.setText("");
			tx3.setText("");
			tx4.setText("");
			tx5.setText("");
			tx6.setText("");
			tx7.setText("");
			tx8.setText("");
			tx9.setText("");
		}
		if(e.getSource()==exitbutton)
		{
			System.exit(0);
		}
}
}
class Task2
{
	public static void main(String args[])
	{
		FDemo f1=new FDemo();
		f1.setVisible(true);
		f1.setSize(1000,800);
		f1.setLocation(100,100);
		f1.setForeground(Color.red);
		f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
	}
}