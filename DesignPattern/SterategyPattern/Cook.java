package SterategyPattern;

public class Cook {
	//접근점
	private Tools tool;

	public void setTool(Tools tool) {
		this.tool = tool;
	}
	
	public void cook() {
		if(tool == null){
			System.out.println("요리 불가능");
		}else{
			tool.cook(); //delegate
		}
	}
}
