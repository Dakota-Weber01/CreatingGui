package GUI.view;
import javax.swing.JPanel;
import GUI.controller.GUIAppController;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SpringLayout;
public class GUIPanel extends JPanel
{
private GUIAppController appController;
public GUIPanel(GUIAppController appController)
	{
	super();
	this.appController = appController;
	}
}
