package com.projects.j2se.akash;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class CalcFrame extends JFrame
{
	private CalcDisplayArea da;
	private CalcButtonPanelSimple bp;
	public CalcFrame(String title)
	{
		super(title);
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		da = new CalcDisplayArea();
		bp = new CalcButtonPanelSimple();
		//Add Display Area
		c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 0;
	    c.gridy = 0;
	    this.add(da, c);
	    
	    //Add Button Pane
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 0;
	    c.gridy = 1;
	    this.add(bp, c);
		this.pack();
	}
	
	
	public static void main(String[] args)
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //createAndShowGUI();
            	CalcFrame calculator = new CalcFrame("JCalculator");
        		calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        		calculator.setVisible(true);
            }
        });
		
	}
	
}