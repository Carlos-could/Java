import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EinButtonBeispielUno extends JFrame
{
    JButton derOger;

    public static void main(String[] args)
    {
        EinButtonBeispiel frame = new EinButtonBeispiel();
        frame.setVisible(true);
    }

    public EinButtonBeispielUno()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        derOger = new JButton("klick mich");

        getContentPane().add(derOger, BorderLayout.SOUTH);
    }

}
