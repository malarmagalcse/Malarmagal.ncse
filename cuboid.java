package lc.one;

public class Cuboid {
	public static void calculate(String input){
		String[] num=input.split(" ");
		int length=Integer.parseInt(num[0]);
		int width=Integer.parseInt(num[1]);
		int height=Integer.parseInt(num[2]);
		
		int totalSurfaceArea=2*(length*width+width*height+height*length);
		int volume=length*width*height;
		String op=Integer.toString(totalSurfaceArea)+" "+Integer.toString(volume);
		
		System.out.println(op);		
		
		
	}

	public static void main(String[] args) {
		calculate("1 2 3");
		
		
		
	}

}
