package com.projects.j2se.akash;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class CalcButtonPanelSimple extends JPanel {
	
	CalcButton [] bArr = new CalcButton[18]; 
	public CalcButtonPanelSimple()
	{
		GridBagConstraints c = new GridBagConstraints();
		this.setLayout(new GridBagLayout());
		//Generating The buttons to be added
		for(int i = 0; i < 10 ; i++)
		{
			bArr[i] = new CalcButton(i+"");	
		}
		bArr[10] = new CalcButton("M+");
		bArr[11] = new CalcButton("/");
		bArr[12] = new CalcButton("x");
		bArr[13] = new CalcButton("bksp");
		bArr[14] = new CalcButton("-");
		bArr[15] = new CalcButton("+");
		bArr[16] = new CalcButton("=");
		bArr[17] = new CalcButton(".");
		//Positioning the button
		
		//button M+
		c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 0;
	    c.gridy = 0;
	    this.add(bArr[10], c);
	    //button /
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 1;
	    c.gridy = 0;
	    this.add(bArr[11], c);
	    //button x
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 2;
	    c.gridy = 0;
	    this.add(bArr[12], c);
	    //button <-
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 3;
	    c.gridy = 0;
	    this.add(bArr[13], c);
	    //button 7
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 0;
	    c.gridy = 1;
	    this.add(bArr[7], c);
	    //button 8
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 1;
	    c.gridy = 1;
	    this.add(bArr[8], c);
	    //button 9
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 2;
	    c.gridy = 1;
	    this.add(bArr[9], c);
	    //button -
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 3;
	    c.gridy = 1;
	    this.add(bArr[14], c);
	    
	    //button 4
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 0;
	    c.gridy = 2;
	    this.add(bArr[4], c);
	    //button 5
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 1;
	    c.gridy = 2;
	    this.add(bArr[5], c);
	    //button 6
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 2;
	    c.gridy = 2;
	    this.add(bArr[6], c);
	    //button +
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 3;
	    c.gridy = 2;
	    this.add(bArr[15], c);
	    //button 1
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 0;
	    c.gridy = 3;
	    this.add(bArr[1], c);
	    //button 2
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 1;
	    c.gridy = 3;
	    this.add(bArr[2], c);
	    //button 3
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 2;
	    c.gridy = 3;
	    this.add(bArr[3], c);
	    //button =
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 3;
	    c.gridy = 3;
	    this.add(bArr[16], c);
	    
	    //button 0
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 1;
	    c.gridy = 4;
	    this.add(bArr[0], c);
	    //button .
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 2;
	    c.gridy = 4;
	    this.add(bArr[17], c);
	    
	    this.setVisible(true);
	}
	

}
