package co.yedam.inheritance;

public class ArtistExample {
	public static void main(String[] args) { 
		Shape shape = new Shape();
		Triangle tri = new Triangle();
		Circle cir = new Circle();
		Rectangle rect = new Rectangle();
		
		
		Artist artist = new Artist();
		artist.paint(tri); //매개변수 다형성
	}
}
