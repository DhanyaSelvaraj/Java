import java.awt.*;
import java.awt.event.*;

class sample extends Frame implements ActionListener,ItemListener,MouseListener,MouseMotionListener
{
	MenuBar mbar;
	Label l1,l2;
	TextField t1,t2;
	Button b1,b2;
	Choice ch;
	Checkbox c1,c2,c3,c4,c5;
	CheckboxGroup cbg;
	TextArea ta;

	sample()
	{
		mbar=new MenuBar();
		setMenuBar(mbar);

		Menu file=new Menu("File");

		MenuItem fm1=new MenuItem("New");
		file.add(fm1);
		
		MenuItem fm2=new MenuItem("Open");
		file.add(fm2);

		MenuItem fm3=new MenuItem("Save");
		file.add(fm3);

		MenuItem fm4=new MenuItem("Save As");
		file.add(fm4);

		MenuItem fm5=new MenuItem("Print");
		file.add(fm5);
		
		mbar.add(file);

		//Second Menu
		
		Menu efile=new Menu("Edit");

		MenuItem em1=new MenuItem("Undo");
		efile.add(em1);
		
		MenuItem em2=new MenuItem("Cut");
		efile.add(em2);

		MenuItem em3=new MenuItem("Copy");
		efile.add(em3);

		MenuItem em4=new MenuItem("Past");
		efile.add(em4);

		MenuItem em5=new MenuItem("Delete");
		efile.add(em5);
		
		mbar.add(efile);
		
		//Third Menu

		Menu ffile=new Menu("Format");

		MenuItem ffm1=new MenuItem("Word Wrap");
		ffile.add(ffm1);

		MenuItem ffm2=new MenuItem("Font");
		ffile.add(ffm2);

		mbar.add(ffile);

		setLayout(null);		

		//To visible Frame

		setVisible(true);
		setSize(500,700);
		setBackground(Color.red);

		//Label

		l1=new Label("UserName");
		l2=new Label("PassWord");
		
		//Textfield

		t1=new TextField();
		t2=new TextField();

		t2.setEchoChar('$');

		Panel p=new Panel(new GridLayout(2,2));

		p.add(l1);
		p.add(t1);
		p.add(l2);
		p.add(t2);

		add(p);

		p.setBounds(100,120,350,60);

		//Button

		b1=new Button("Sign in");
		b2=new Button("Cancel");
		
		b1.setBounds(180,230,90,40);
		b2.setBounds(300,230,90,40);
		
		add(b1);
		add(b2);

		b1.addActionListener(this);
		b2.addActionListener(this);

		//Choice

		ch=new Choice();

		ch.add("Java");
		ch.add("C++");
		ch.add("C");
		ch.add("HTML");

		add(ch);
		ch.setBounds(230,300,90,40);
		ch.addItemListener(this);

		//Checkbox

		c1=new Checkbox("Music");
		c2=new Checkbox("Reaading Book");
		c3=new Checkbox("Dancing");
	
		Panel cpan=new Panel(new GridLayout(1,3));
	
		cpan.add(c1);
		cpan.add(c2);
		cpan.add(c3);

		add(cpan);

		cpan.setBounds(200,450,250,40);

		//Radiobutton

		cbg=new CheckboxGroup();
		
		c4=new Checkbox("Male",cbg,false);
		c5=new Checkbox("Female",cbg,true);

		add(c4);
		add(c5);
	
		c4.setBounds(200,550,80,40);
		c5.setBounds(280,550,80,40);

		//Textarea

		ta=new TextArea();
	
		add(ta);
	
		ta.setBounds(150,600,150,100);

		addMouseListener(this);

		addMouseMotionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Sign in"))
		{
			System.out.println("Action Done");
			
			System.out.println("UserName= "+t1.getText());
			System.out.println("Password= "+t2.getText());

			ta.setText(t1.getText());
		}
		if(e.getActionCommand().equals("Cancel"))
		{
			System.exit(0);
		}
	}
	public void itemStateChanged(ItemEvent ss)
	{
		System.out.println(ch.getSelectedItem());
	}
	public void mouseExited(MouseEvent me)
	{
		System.out.println("Exited");
		setBackground(Color.red);
	}
	public void mouseEntered(MouseEvent me)
	{
		System.out.println("Entered");
		setBackground(Color.pink);
	}
	public void mouseReleased(MouseEvent me)
	{
		System.out.println("Released");
	}
	public void mousePressed(MouseEvent me)
	{
		System.out.println("Pressed");
	}
	public void mouseClicked(MouseEvent me)
	{
		System.out.println("Clicked");
	}
	public void mouseMoved(MouseEvent me)
	{
		System.out.println("X= "+me.getX());
		System.out.println("Y= "+me.getY());
	}
	public void mouseDragged(MouseEvent me)
	{
	}
}
class demoawt
{
	public static void main(String args[])
	{
		sample obj=new sample();
	}
}