package SterategyPattern;

public class Main {
	public static void main(String[] args) {
		Cook jiin = new Cook();
		
		jiin.cook();
		
		jiin.setTool(new knife());
		jiin.cook();
		
		jiin.setTool(new scssior());
		jiin.cook();
	}
}
