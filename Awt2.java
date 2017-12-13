import java.awt.*;
import java.awt.event.*;

class Sample extends Frame implements ActionListener
{
	Label l1;
	TextField t1;
	Button b1,b2;
	Sample()
	{
		//Visible frame

		setLayout(null);
		setVisible(true);
		setSize(500,500);

		//Lable
		
		l1=new Label("Open");
	
		//Textfield
		
		t1=new TextField();
				
		Panel p=new Panel(new GridLayout(1,1));
		
		p.add(l1);
		p.add(t1);
			
		p.setBounds(80,100,200,40);
		add(p);

		//Button
		b1=new Button("Sign in");
		b2=new Button("Cancel");

		b1.setBounds(130,200,80,30);
		b2.setBounds(250,200,80,30);

		add(b1);
		add(b2);
	
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Sign in"))
		{
			try{
				Runtime.getRuntime().exec(t1.getText());
			}catch(Exception d){}		
		}
		t1.setText("");
		if(e.getActionCommand().equals("Cancel"))
		{
			System.exit(0);
		}	
	}
}
class Awt2
{
	public static void main(String args[])
	{
		Sample obj=new Sample();
	}
}