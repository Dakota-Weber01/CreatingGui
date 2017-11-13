package GUI.view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import GUI.controller.GUIAppController;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SpringLayout;
public class GUIPanel extends JPanel
{
private SpringLayout appLayout;
private JButton firstButton;	
private GUIAppController appController;
public GUIPanel(GUIAppController appController)
	{
	super();
	this.appController = appController;
	firstButton = new JButton("Click on the button");
	appLayout = new SpringLayout();
	setupPanel();
	}
	private void setupPanel()
	{
		this.setBackground(Color.MAGENTA);
		this.add(firstButton);
	}
	private void setupLayout()
	{
		
	}
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				changeScreenColor();
			}
		});
	}
	private void changeScreenColor()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 258);
		this.setBackground(new Color(red, green, blue));
	}
}
