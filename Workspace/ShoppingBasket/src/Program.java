import javax.swing.JOptionPane;

import utils.Util;

import gui.ShoppingBasketFrame;

public class Program {

	public static void main(String[] args) {
		try{
			ShoppingBasketFrame.main(args);;
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.getStackTrace().toString());
			//System.exit(0);
		}
	}
	
}
