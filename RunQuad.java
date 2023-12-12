package quadrakill;
import java.util.*;

public class RunQuad {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
		System.out.println("Press R for Rectangle or S for Square. Press X to exit the program.");
		char c = scan.next().toUpperCase().charAt(0);
		
		switch(c) {
		case 'R': 
			System.out.println("A rectangle: ");
			Rectangle r = new Rectangle();
			r.showDescription();		
			continue;
			
		case 'S':
			System.out.println("A square: ");
			Square s = new Square();
			s.showDescription();
			continue;
		
		case 'X':
			System.out.println("Program ended.");
			break;
			}
		break;
		}
	}
}

class Quadrilateral{
	public void showDescription(){
		System.out.println("- is quadrilateral.");
	}
	
}

class Rectangle extends Quadrilateral{
	public void showDescription() {		
		System.out.println("- has 4 right sides.");
		super.showDescription();
		
	}
}

class Square extends Rectangle{
	public void showDescription() {
		System.out.println("- has 4 equal sides.");
		super.showDescription();
	}
}
