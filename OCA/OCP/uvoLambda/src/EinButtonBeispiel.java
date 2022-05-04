import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EinButtonBeispiel extends JFrame implements ActionListener
{	
	class AugustusSchreiber implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			augustuslabel.setText(zaehler++ +" <-  ich bin vom INNER KLASS Augustus-Schreiber geaendert worden!!");			
		}		
	}
	
	int zaehler;
	boolean rOg;
	JButton derOger;
	JLabel augustuslabel ;
	JButton btnTestbutton;
	public static void main(String[] args)
	{
		EinButtonBeispiel augustus = new EinButtonBeispiel();
		augustus.setVisible(true);
	}

	public EinButtonBeispiel()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		derOger = new JButton("klick mich");
		
		getContentPane().add(derOger, BorderLayout.SOUTH);
		
		augustuslabel= new JLabel("AUGUSTO");
		getContentPane().add(augustuslabel, BorderLayout.NORTH);
		
		btnTestbutton = new JButton("TESTBUTTON");
		btnTestbutton.addActionListener(new ActionListener() 
											{
												public void actionPerformed(ActionEvent e)
												{
													System.out.println("ich bin der TESTBUTTON!!");
												}
											}
									    );
		getContentPane().add(btnTestbutton, BorderLayout.WEST);
		
		SchreibeInDerKonsole sik = new SchreibeInDerKonsole();
		derOger.addActionListener(sik);
		derOger.addActionListener(this);
		//AugustusSchreiber as = new AugustusSchreiber();	//DIESE ZEILE WILL ICH MICH ERSPAREN
		derOger.addActionListener(new AugustusSchreiber());	//DAS IST EIN ANONYMES OBJEKT!!!
		
		//ANONYME KLASSE UND ANONYMES OBJEKT, ALLES IN BUTTO "derOger" angewendet
		derOger.addActionListener(new ActionListener()
									{
										@Override
										public void actionPerformed(ActionEvent e)
										{
											System.out.println("ich bin das ANONYME OBJEKT EINER ANONYME KLASSE!!"); 
											
										}
									}
		
								  );
		derOger.addActionListener(
				e -> {
					    System.out.println("Handled Lambda listener");
					 }
				                 );	
		
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(rOg)
		{
			getContentPane().setBackground(Color.GREEN);
		}
		else
		{
			getContentPane().setBackground(Color.RED);
		}
		rOg= !rOg;
	}
}
