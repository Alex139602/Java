package main;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class FontViewer2Frame extends JFrame 
{
	private static final long serialVersionUID = 1L;
	
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 400;
	
	private JLabel sampleField;
	private String facename;
	private int fontStyle;
	private int fontSize;
	
	public FontViewer2Frame()
	{
		sampleField = new JLabel("Big Java");
		this.add(sampleField, BorderLayout.CENTER);
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		menuBar.add(createFileMenu());
		menuBar.add(createFontMenu());
		facename = "Serif";
		fontSize = 24;
		fontStyle = Font.PLAIN;
		
		setSampleFont();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}

	public JMenu createFileMenu() 
	{
		JMenu menu = new JMenu("File");
		menu.add(createFileExitItem());
		return menu;
	}
	
	private JMenuItem createSizeMenu() 
	{
		JMenu menu = new JMenu("Size");
		menu.add(createSizeItem("Smaller", -10));
		menu.add(createSizeItem("Larger", 10));
		return menu;
	}

	public JMenu createFontMenu() 
	{
		JMenu menu2 = new JMenu("Font");
		menu2.add(createFaceMenu());
		menu2.add(createSizeMenu());
		menu2.add(createStyleMenu());
		return menu2;
	}

	private JMenuItem createStyleMenu() 
	{
		JMenu menu = new JMenu("Style");
		menu.add(createStyleItem("Plain", Font.PLAIN));
		menu.add(createStyleItem("Bold", Font.BOLD));
		menu.add(createStyleItem("Italic", Font.ITALIC));
		menu.add(createStyleItem("Bold & Italic", Font.BOLD + Font.ITALIC));
		return menu;
	}
	
	private JMenuItem createSizeItem(String name, final int ds) 
	{
		JMenuItem item = new JMenuItem(name);
		
		class MenuItemListener implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				fontSize += ds;
				setSampleFont();
			}
			
		}
		MenuItemListener ml = new MenuItemListener();
		item.addActionListener(ml);
		return item;
	}

	private JMenuItem createFaceMenu() 
	{
		JMenu menu = new JMenu("Style");
		menu.add(createFaceItem("Serif"));
		menu.add(createFaceItem("Sans-Serif"));
		menu.add(createFaceItem("Monospaced"));
		return menu;
	}
	
	private JMenuItem createFileExitItem() 
	{
		JMenuItem item = new JMenuItem("Exit");
		class MenuItemListener implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
			
		}
		MenuItemListener ml = new MenuItemListener();
		item.addActionListener(ml);
		return item;
	}

	

	private JMenuItem createFaceItem(final String name) 
	{
		JMenuItem item = new JMenuItem(name);
		class MenuItemListener implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				facename = name;
				setSampleFont();
			}
			
		}
		MenuItemListener ml = new MenuItemListener();
		item.addActionListener(ml);
		return item;
	}

	

	public void setSampleFont() 
	{
		sampleField.setFont(new Font(facename, fontStyle, fontSize));
		sampleField.repaint();
	}

	private JMenuItem createStyleItem(String name, final int style) 
	{
		JMenuItem item = new JMenuItem(name);
		class MenuItemListener implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				fontStyle = style;
				setSampleFont();
			}
			
		}
		MenuItemListener ml = new MenuItemListener();
		item.addActionListener(ml);
		return item;
	}

	
	
	
	
	
	
	
	
	
	

}
