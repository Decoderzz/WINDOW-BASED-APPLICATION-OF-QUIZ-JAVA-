import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Quiz extends JFrame implements ActionListener
{
	JFrame f;
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField t1,t2;
	JButton b1,b2,b3,b4;
	Quiz()
	{
		f=new JFrame("ONLINE QUIZ");
		f.getContentPane().setBackground(Color.cyan);
		f.setVisible(true);
		f.setSize(1500,1500);
		f.setBackground(Color.blue);
		f.setLayout(new FlowLayout(FlowLayout.CENTER,2000,5));
		f.setExtendedState(JFrame. MAXIMIZED_BOTH);
		JLabel ll=new JLabel(new ImageIcon(""));
		l1=new JLabel("UNITED COLLEGE OF ENGINEERING AND RESEARCH");
		b1=new JButton("WELCOME TO ONLINE QUIZ");
		b2=new JButton("Instructions");
		l2=new JLabel("NAME");
		t1=new JTextField(10);
		l3=new JLabel("ROLL NUMBER");
		t2=new JTextField(10);
		b3=new JButton("Start");
		b4=new JButton("Cancel");
		l4=new JLabel("1.Each question carry 5 marks.");
		l5=new JLabel("2.You can select only one option from A to D.");
		l6=new JLabel("3.No negative marks.");
		//b1.setForeground(Color.red);

		l1.setFont(new Font("",Font.BOLD,40));
		b1.setFont(new Font("",Font.BOLD,30));
		b2.setFont(new Font("",Font.BOLD,25));
		b3.setFont(new Font("",Font.BOLD,25));
		b4.setFont(new Font("",Font.BOLD,25));
		l4.setFont(new Font("",Font.BOLD,30));
		l5.setFont(new Font("",Font.BOLD,30));
		l6.setFont(new Font("",Font.BOLD,30));
		l2.setFont(new Font("",Font.BOLD,30));
		l3.setFont(new Font("",Font.BOLD,30));
		f.add(ll);
		f.add(l1);
		f.add(b1);
		f.add(b2);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(l2);
		f.add(t1);
		f.add(l3);
		f.add(t2);
		f.add(b3);
		f.add(b4);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource().equals(b3))
		{
			try
			{
				String s1=t1.getText();
				String s2=t2.getText();
				if(t1.getText().equals(""))
				{JOptionPane.showMessageDialog(null,"Enter candidate name");}
				else if(t2.getText().equals(""))
				{JOptionPane.showMessageDialog(null,"Enter Roll num");}
				else
				{f.setVisible(false);
				new Page1(f,s1,s2);
				}
			}
			finally
			{
				
			}
		}
		else
		{
			f.setVisible(false);
		}
	}


	public static void main(String...aaa)
	{
	new Quiz();
	Quiz f=new Quiz();
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}














//	first page 


class Page1 implements ActionListener
{
	int m=0;
	JFrame f1,p;
	JRadioButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
	JLabel l1;
	JButton b11;
	String ss1,ss2;
	Page1(JFrame f,String s1,String s2)
	{
		ButtonGroup g11=new ButtonGroup();
		f1=f;
		ss1=s1;
		ss2=s2;
		p=new JFrame("QUIZ");
		p.setVisible(true);
		p.setSize(1000,1000);
		p.setLayout(new FlowLayout(FlowLayout.CENTER,2000,5));
		p.setExtendedState(JFrame. MAXIMIZED_BOTH);
		b1=new JRadioButton("Question 1");
		b2=new JRadioButton("Question 2");
		b3=new JRadioButton("Question 3");
		b4=new JRadioButton("Question 4");
		b5=new JRadioButton("Question 5");
		b6=new JRadioButton("Question 6");
		b7=new JRadioButton("Question 7");
		b8=new JRadioButton("Question 8");
		b9=new JRadioButton("Question 9");
		b10=new JRadioButton("Question 10");
		g11.add(b1);
		g11.add(b2);
		g11.add(b3);
		g11.add(b4);
		g11.add(b5);
		g11.add(b6);
		g11.add(b7);
		g11.add(b8);
		g11.add(b9);
		g11.add(b10);
		l1=new JLabel("Good Luck !!! You can proceed.");
		l1.setFont(new Font("",Font.BOLD,50));
		b11=new JButton("SAVE and SUBMIT");
		b11.setFont(new Font("",Font.BOLD,35));
		b1.setFont(new Font("",Font.BOLD,30));
		b2.setFont(new Font("",Font.BOLD,30));
		b3.setFont(new Font("",Font.BOLD,30));
		b4.setFont(new Font("",Font.BOLD,30));
		b5.setFont(new Font("",Font.BOLD,30));
		b6.setFont(new Font("",Font.BOLD,30));
		b7.setFont(new Font("",Font.BOLD,30));
		b8.setFont(new Font("",Font.BOLD,30));
		b9.setFont(new Font("",Font.BOLD,30));
		b10.setFont(new Font("",Font.BOLD,30));
		//p.setBackground(Color.cyan);
		p.add(l1);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b10);
		p.add(b11);
		b11.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource().equals(b1))
		{
			p.setVisible(false);
			new Q1(p,m,f1,ss1,ss2);
		}
		if(ae.getSource().equals(b2))
		{
			p.setVisible(false);
			new Q2(p,m,f1,ss1,ss2);
		}
		if(ae.getSource().equals(b3))
		{
			p.setVisible(false);
			new Q3(p,m,f1,ss1,ss2);
		}
		if(ae.getSource().equals(b4))
		{
			p.setVisible(false);
			new Q4(p,m,f1,ss1,ss2);
		}
		if(ae.getSource().equals(b5))
		{
			p.setVisible(false);
			new Q5(p,m,f1,ss1,ss2);
		}
		if(ae.getSource().equals(b6))
		{
			p.setVisible(false);
			new Q6(p,m,f1,ss1,ss2);
		}
		if(ae.getSource().equals(b7))
		{
			p.setVisible(false);
			new Q7(p,m,f1,ss1,ss2);
		}
		if(ae.getSource().equals(b8))
		{
			p.setVisible(false);
			new Q8(p,m,f1,ss1,ss2);
		}
		if(ae.getSource().equals(b9))
		{
			p.setVisible(false);
			new Q9(p,m,f1,ss1,ss2);
		}
		if(ae.getSource().equals(b10))
		{
			p.setVisible(false);
			new Q10(p,m,f1,ss1,ss2);
		}
		if(ae.getSource().equals(b11))
		{
			p.setVisible(false);
			JOptionPane.showMessageDialog(null,"Submitted Succesfully");
			JOptionPane.showMessageDialog(null,"The candidate "+ss1+" with roll num "+ss2+"  score is::"+m);
		}
	}
	public void marks(int m1)
	{
		m=m+m1;
	}
}











//CODE FOR QUESTION 1


class Q1 implements ActionListener
{
	int m1;
	String sss1,sss2;
	JFrame f2,q;
	JLabel l1;
	JRadioButton b1,b2,b3,b4;
	JButton b5;
	Q1(JFrame f,int m,JFrame f1,String ss1,String ss2)
	{
		m1=m;
		f2=f;
		sss1=ss1;
		sss2=ss2;
		q=new JFrame("QUESTION 1");
		ButtonGroup j=new ButtonGroup();
		JLabel ll=new JLabel(new ImageIcon(""));
		l1=new JLabel("1.Number of primitive datatypes in java are?");
		b1=new JRadioButton("6");
		b2=new JRadioButton("7");
		b3=new JRadioButton("8");
		b4=new JRadioButton("9");
		b5=new JButton("Save and next");
		l1.setFont(new Font("",Font.BOLD,50));
		b1.setFont(new Font("",Font.BOLD,40));
		b2.setFont(new Font("",Font.BOLD,40));
		b3.setFont(new Font("",Font.BOLD,40));
		b4.setFont(new Font("",Font.BOLD,40));
		b5.setFont(new Font("",Font.BOLD,50));
		q.setVisible(true);
		q.setSize(1000,1000);
		q.setLayout(new FlowLayout(FlowLayout.CENTER,2000,5));
		q.setExtendedState(JFrame. MAXIMIZED_BOTH);
		q.add(ll);
		j.add(b1);
		j.add(b2);
		j.add(b3);
		j.add(b4);
		q.add(l1);
		q.add(b1);
		q.add(b2);
		q.add(b3);
		q.add(b4);
		q.add(b5);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource().equals(b5))
		{
			if(b3.isSelected())
			m1=m1+5;
			q.setVisible(false);
			Page1 k=new Page1(f2,sss1,sss2);
			k.marks(m1);
		}
	}
}
















//CODE FOR QUESTION 2


class Q2 implements ActionListener
{
	int m1;
	String sss1,sss2;
	JFrame f2,q;
	JLabel l1;
	JRadioButton b1,b2,b3,b4;
	JButton b5;
	Q2(JFrame f,int m,JFrame f1,String ss1,String ss2)
	{
		m1=m;
		f2=f;
		sss1=ss1;
		sss2=ss2;
		q=new JFrame("QUESTION 2");
		ButtonGroup j=new ButtonGroup();
		l1=new JLabel("2.What is the size of float and double in java?");
		b1=new JRadioButton("32 & 64");
		b2=new JRadioButton("32 & 32");
		b3=new JRadioButton("64 & 64");
		b4=new JRadioButton("64 & 32");
		b5=new JButton("Save and next");
		JLabel ll=new JLabel(new ImageIcon(""));
		l1.setFont(new Font("",Font.BOLD,38));
		b1.setFont(new Font("",Font.BOLD,40));
		b2.setFont(new Font("",Font.BOLD,40));
		b3.setFont(new Font("",Font.BOLD,40));
		b4.setFont(new Font("",Font.BOLD,40));
		b5.setFont(new Font("",Font.BOLD,50));
		q.setVisible(true);
		q.setSize(1000,1000);
		q.setLayout(new FlowLayout(FlowLayout.CENTER,2000,5));
		q.setExtendedState(JFrame. MAXIMIZED_BOTH);
		j.add(b1);
		j.add(b2);
		j.add(b3);
		j.add(b4);
		q.add(ll);
		q.add(l1);
		q.add(b1);
		q.add(b2);
		q.add(b3);
		q.add(b4);
		q.add(b5);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource().equals(b5))
		{
			if(b1.isSelected())
			m1=m1+5;
			q.setVisible(false);
			Page1 k=new Page1(f2,sss1,sss2);
			k.marks(m1);
		}
	}
}















//CODE FOR QUESTION 3



class Q3 implements ActionListener
	{int m1;
	String sss1, sss2;
	JFrame f2, q;
	JLabel l1;
	JRadioButton b1, b2, b3, b4;
	JButton b5;
	Q3(JFrame f, int m, JFrame f1, String ss1, String ss2)
	{
		m1=m;
		f2=f;
		sss1=ss1;
		sss2=ss2;
		q=new JFrame("QUESTION 3");
		ButtonGroup j=new ButtonGroup();
		l1=new JLabel("3.Select the valid statement :");
		b1=new JRadioButton("char[] ch = new char(5)");
		b2=new JRadioButton("char[] ch = new char[5]");
		b3=new JRadioButton("char[] ch = new char()");
		b4=new JRadioButton("char[] ch = new char[]");
		b5=new JButton("Save and next");
		JLabel ll=new JLabel(new ImageIcon(""));
		l1.setFont(new Font("", Font.BOLD, 50));
		b1.setFont(new Font("", Font.BOLD, 40));
		b2.setFont(new Font("", Font.BOLD, 40));
		b3.setFont(new Font("", Font.BOLD, 40));
		b4.setFont(new Font("", Font.BOLD, 40));
		b5.setFont(new Font("", Font.BOLD, 50));
		q.setVisible(true);
		q.setSize(1000, 1000);
		q.setLayout(new FlowLayout(FlowLayout.CENTER, 2000, 5));
		q.setExtendedState(JFrame. MAXIMIZED_BOTH);
		j.add(b1);
		j.add(b2);
		j.add(b3);
		j.add(b4);
		q.add(ll);
		q.add(l1);
		q.add(b1);
		q.add(b2);
		q.add(b3);
		q.add(b4);
		q.add(b5);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource().equals(b5))
		{
			if(b2.isSelected())
			m1=m1+5;
			q.setVisible(false);
			Page1 k=new Page1(f2, sss1, sss2);
			k.marks(m1);
		}
	}
}




















//CODE FOR QUESTION 4


class Q4 implements ActionListener
{
	int m1;
	String sss1, sss2;
	JFrame f2, q;
	JLabel l1;
	JRadioButton b1, b2, b3, b4;
	JButton b5;
	Q4(JFrame f, int m, JFrame f1, String ss1, String ss2)
	{
		m1=m;
		f2=f;
		sss1=ss1;
		sss2=ss2;
		q=new JFrame("QUESTION 4");
		ButtonGroup j=new ButtonGroup();
		l1=new JLabel("4.Select the valid statement to declare and initialize an array :");
		b1=new JRadioButton("int[] A = {};");
		b2=new JRadioButton("int[] A = {1,2,3};");
		b3=new JRadioButton("int[] A = (1,2,3);");
		b4=new JRadioButton("int[][] A = {1,2,3};");
		b5=new JButton("Save and next");
		JLabel ll=new JLabel(new ImageIcon(""));
		l1.setFont(new Font("", Font.BOLD, 40));
		b1.setFont(new Font("", Font.BOLD, 40));
		b2.setFont(new Font("", Font.BOLD, 40));
		b3.setFont(new Font("", Font.BOLD, 40));
		b4.setFont(new Font("", Font.BOLD, 40));
		b5.setFont(new Font("", Font.BOLD, 50));
		q.setVisible(true);
		q.setSize(1000, 1000);
		q.setLayout(new FlowLayout(FlowLayout.CENTER, 2000, 5));
		q.setExtendedState(JFrame. MAXIMIZED_BOTH);
		j.add(b1);
		j.add(b2);
		j.add(b3);
		j.add(b4);
		q.add(ll);
		q.add(l1);
		q.add(b1);
		q.add(b2);
		q.add(b3);
		q.add(b4);
		q.add(b5);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource().equals(b5))
		{
			if(b2.isSelected())
			m1=m1+5;
			q.setVisible(false);
			Page1 k=new Page1(f2, sss1, sss2);
			k.marks(m1);
		}
	}
}















//CODE FOR QUESTION 5

class Q5 implements ActionListener
{
	int m1;
	String sss1, sss2;
	JFrame f2, q;
	JLabel l1;
	JRadioButton b1, b2, b3, b4;
	JButton b5;
	Q5(JFrame f, int m, JFrame f1, String ss1, String ss2)
	{
		m1 = m; f2 = f; sss1 = ss1; sss2 = ss2;
		q = new
		JFrame("QUESTION 5");
		ButtonGroup
		j = new
		ButtonGroup();
		l1 = new JLabel("5.Identify the correct definition of a package :");
		b1 = new JRadioButton("A package is a collection of editing tools.");
		b2 = new JRadioButton("A package is a collection of classes.");
		b3 = new JRadioButton("A package is a collection of classes and interfaces.");
		b4 = new JRadioButton("A package is a collection of interfaces.");
		b5 = new JButton("Save and next");
		JLabel ll = new
		JLabel(new ImageIcon(""));
		l1.setFont(new Font("", Font.BOLD, 50));
		b1.setFont(new Font("", Font.BOLD, 40));
		b2.setFont(new Font("", Font.BOLD, 40));
		b3.setFont(new Font("", Font.BOLD, 40));
		b4.setFont(new Font("", Font.BOLD, 40));
		b5.setFont(new Font("", Font.BOLD, 50));
		q.setVisible(true);
		q.setSize(1000, 1000);
		q.setLayout(new FlowLayout(FlowLayout.CENTER, 2000, 5));
		q.setExtendedState(JFrame. MAXIMIZED_BOTH);
		j.add(b1);
		j.add(b2);
		j.add(b3);
		j.add(b4);
		q.add(ll);
		q.add(l1);
		q.add(b1);
		q.add(b2);
		q.add(b3);
		q.add(b4);
		q.add(b5);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource().equals(b5))
		{
			if (b3.isSelected())
			m1 = m1 + 5;
			q.setVisible(false);
			Page1 k = new Page1(f2, sss1, sss2);
			k.marks(m1);
			}
		}
}









//CODE FOR QUESTION 6


class Q6 implements ActionListener
{
	int m1;
	String sss1,sss2;
	JFrame f2,q;
	JLabel l1;
	JRadioButton b1,b2,b3,b4;
	JButton b5;
	Q6(JFrame f,int m,JFrame f1,String ss1,String ss2)
	{
		m1=m;
		f2=f;
		sss1=ss1;
		sss2=ss2;
		q=new JFrame("QUESTION 6");
		ButtonGroup j=new ButtonGroup();
		JLabel ll=new JLabel(new ImageIcon(""));
		l1=new JLabel("6.Find output : \n int ++a = 100; \n System.out.println(++a);");
		b1=new JRadioButton("101");
		b2=new JRadioButton("Compile Error");
		b3=new JRadioButton("100");
		b4=new JRadioButton("None");
		b5=new JButton("Save and next");
		l1.setFont(new Font("",Font.BOLD,50));
		b1.setFont(new Font("",Font.BOLD,40));
		b2.setFont(new Font("",Font.BOLD,40));
		b3.setFont(new Font("",Font.BOLD,40));
		b4.setFont(new Font("",Font.BOLD,40));
		b5.setFont(new Font("",Font.BOLD,50));
		q.setVisible(true);
		q.setSize(1000,1000);
		q.setLayout(new FlowLayout(FlowLayout.CENTER,2000,5));
		q.add(ll);
		q.setExtendedState(JFrame. MAXIMIZED_BOTH);
		j.add(b1);
		j.add(b2);
		j.add(b3);
		j.add(b4);
		q.add(l1);
		q.add(b1);
		q.add(b2);
		q.add(b3);
		q.add(b4);
		q.add(b5);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource().equals(b5))
		{
			if(b2.isSelected())
			m1=m1+5;
			q.setVisible(false);
			Page1 k=new Page1(f2,sss1,sss2);
			k.marks(m1);
		}
	}
}












//CODE FOR QUESTION 7


class Q7 implements ActionListener
{
	int m1;
	String sss1,sss2;
	JFrame f2,q;
	JLabel l1;
	JRadioButton b1,b2,b3,b4;
	JButton b5;
	Q7(JFrame f,int m,JFrame f1,String ss1,String ss2)
	{
		m1=m;
		f2=f;
		sss1=ss1;
		sss2=ss2;
		q=new JFrame("QUESTION 7");
		ButtonGroup j=new ButtonGroup();
		JLabel ll=new JLabel(new ImageIcon(""));
		l1=new JLabel("7.Identify the return type of a method that does not return any value :");
		b1=new JRadioButton("int");
		b2=new JRadioButton("void");
		b3=new JRadioButton("double");
		b4=new JRadioButton("None");
		b5=new JButton("Save and next");
		l1.setFont(new Font("",Font.BOLD,40));
		b1.setFont(new Font("",Font.BOLD,40));
		b2.setFont(new Font("",Font.BOLD,40));
		b3.setFont(new Font("",Font.BOLD,40));
		b4.setFont(new Font("",Font.BOLD,40));
		b5.setFont(new Font("",Font.BOLD,50));
		q.setVisible(true);
		q.setSize(1000,1000);
		q.setLayout(new FlowLayout(FlowLayout.CENTER,2000,5));
		q.add(ll);
		q.setExtendedState(JFrame. MAXIMIZED_BOTH);
		j.add(b1);
		j.add(b2);
		j.add(b3);
		j.add(b4);
		q.add(l1);
		q.add(b1);
		q.add(b2);
		q.add(b3);
		q.add(b4);
		q.add(b5);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource().equals(b5))
		{
			if(b2.isSelected())
			m1=m1+5;
			q.setVisible(false);
			Page1 k=new Page1(f2,sss1,sss2);
			k.marks(m1);
		}
	}
}








//CODE FOR QUESTION 8



class Q8 implements ActionListener
{
	int m1;
	String sss1,sss2;
	JFrame f2,q;
	JLabel l1;
	JRadioButton b1,b2,b3,b4;
	JButton b5;
	Q8(JFrame f,int m,JFrame f1,String ss1,String ss2)
	{
		m1=m;
		f2=f;
		sss1=ss1;
		sss2=ss2;
		q=new JFrame("QUESTION 8");
		ButtonGroup j=new ButtonGroup();
		JLabel ll=new JLabel(new ImageIcon(""));
		l1=new JLabel("8.Exception created by 'try' block is caught in which block :");
		b1=new JRadioButton("catch");
		b2=new JRadioButton("throw");
		b3=new JRadioButton("final");
		b4=new JRadioButton("none");
		b5=new JButton("Save and next");
		l1.setFont(new Font("",Font.BOLD,50));
		b1.setFont(new Font("",Font.BOLD,40));
		b2.setFont(new Font("",Font.BOLD,40));
		b3.setFont(new Font("",Font.BOLD,40));
		b4.setFont(new Font("",Font.BOLD,40));
		b5.setFont(new Font("",Font.BOLD,50));
		q.setVisible(true);
		q.setSize(1000,1000);
		q.setLayout(new FlowLayout(FlowLayout.CENTER,2000,5));
		q.add(ll);
		q.setExtendedState(JFrame. MAXIMIZED_BOTH);
		j.add(b1);
		j.add(b2);
		j.add(b3);
		j.add(b4);
		q.add(l1);
		q.add(b1);
		q.add(b2);
		q.add(b3);
		q.add(b4);
		q.add(b5);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource().equals(b5))
		{
			if(b1.isSelected())
			m1=m1+5;
			q.setVisible(false);
			Page1 k=new Page1(f2,sss1,sss2);
			k.marks(m1);
		}
	}
}












//CODE FOR QUESTION 9


class Q9 implements ActionListener
{
	int m1;
	String sss1,sss2;
	JFrame f2,q;
	JLabel l1;
	JRadioButton b1,b2,b3,b4;
	JButton b5;
	Q9(JFrame f,int m,JFrame f1,String ss1,String ss2)
	{
		m1=m;
		f2=f;
		sss1=ss1;
		sss2=ss2;
		q=new JFrame("QUESTION 9");
		ButtonGroup j=new ButtonGroup();
		JLabel ll=new JLabel(new ImageIcon(""));
		l1=new JLabel("9.Where is System class defined");
		b1=new JRadioButton("java.lang.package");
		b2=new JRadioButton("java.util.package");
		b3=new JRadioButton("java.io.package");
		b4=new JRadioButton("None");
		b5=new JButton("Save and next");
		l1.setFont(new Font("",Font.BOLD,50));
		b1.setFont(new Font("",Font.BOLD,40));
		b2.setFont(new Font("",Font.BOLD,40));
		b3.setFont(new Font("",Font.BOLD,40));
		b4.setFont(new Font("",Font.BOLD,40));
		b5.setFont(new Font("",Font.BOLD,50));
		q.setVisible(true);
		q.setSize(1000,1000);
		q.setLayout(new FlowLayout(FlowLayout.CENTER,2000,5));
		q.add(ll);
		q.setExtendedState(JFrame. MAXIMIZED_BOTH);
		j.add(b1);
		j.add(b2);
		j.add(b3);
		j.add(b4);
		q.add(l1);
		q.add(b1);
		q.add(b2);
		q.add(b3);
		q.add(b4);
		q.add(b5);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource().equals(b5))
		{
			if(b1.isSelected())
			m1=m1+5;
			q.setVisible(false);
			Page1 k=new Page1(f2,sss1,sss2);
			k.marks(m1);
		}
	}
}


















//CODE FOR QUESTION 10


class Q10 implements ActionListener
{
	int m1;
	String sss1,sss2;
	JFrame f2,q;
	JLabel l1;
	JRadioButton b1,b2,b3,b4;
	JButton b5;
	Q10(JFrame f,int m,JFrame f1,String ss1,String ss2)
	{
		m1=m;
		f2=f;
		sss1=ss1;
		sss2=ss2;
		q=new JFrame("QUESTION 10");
		ButtonGroup j=new ButtonGroup();
		JLabel ll=new JLabel(new ImageIcon(""));
		l1=new JLabel("10.Which of the following is used to find and fix bugs in the program ?");
		b1=new JRadioButton("JDK");
		b2=new JRadioButton("JRE");
		b3=new JRadioButton("JVM");
		b4=new JRadioButton("JDB");
		b5=new JButton("Save and next");
		l1.setFont(new Font("",Font.BOLD,40));
		b1.setFont(new Font("",Font.BOLD,40));
		b2.setFont(new Font("",Font.BOLD,40));
		b3.setFont(new Font("",Font.BOLD,40));
		b4.setFont(new Font("",Font.BOLD,40));
		b5.setFont(new Font("",Font.BOLD,50));
		q.setVisible(true);
		q.setSize(1000,1000);
		q.setLayout(new FlowLayout(FlowLayout.CENTER,2000,5));
		q.add(ll);
		j.add(b1);
		j.add(b2);
		j.add(b3);
		j.add(b4);
		q.add(l1);
		q.add(b1);
		q.add(b2);
		q.add(b3);
		q.add(b4);
		q.add(b5);
		q.setExtendedState(JFrame. MAXIMIZED_BOTH);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource().equals(b5))
		{
			if(b4.isSelected())
			m1=m1+5;
			q.setVisible(false);
			Page1 k=new Page1(f2,sss1,sss2);
			k.marks(m1);
		}
	}
}
