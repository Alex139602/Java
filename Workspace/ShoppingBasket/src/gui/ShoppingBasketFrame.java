package gui;


import java.awt.*;

import javax.swing.*;


public class ShoppingBasketFrame extends JFrame{
	
	private static final long serialVersionUID = 7026057759618327943L;
	public static final String STRING_PRODUCT_NAME = "Product Name";
	public static final String STRING_PRODUCT_QUANTITY = "Product Quantity";
	public static final String STRING_PRODUCT_LATEST_PRICE = "Latest Price";
	public static final String STRING_BASKET = "Basket";
	public static final String STRING_NUMBER_ITEMS = "Number Of Items";
	public static final String STRING_APP_TITLE = "Shopping Basket";
	
	
	public static void main(String[] args) 
	{
		ShoppingBasketFrame frame = new ShoppingBasketFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension windowDim = new Dimension(800, 800);
		frame.setSize(windowDim);
		frame.setTitle(STRING_APP_TITLE);
		
		
		
		
		
		
		
		
		frame.setVisible(true);
	}
	
	
}
