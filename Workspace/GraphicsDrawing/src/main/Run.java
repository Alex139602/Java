package main;

public class Run {
	
	public static void main(String[] args){
		try{
			Run program = new Run();
		} catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public Run(){
		System.out.println("Hello World");
	}

}
