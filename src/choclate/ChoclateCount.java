package choclate;

public class ChoclateCount {

	

int existingchoclate=23;
int maximumchoclate=63;

void calculatechoclatecount()  {
	
	while(existingchoclate<=63) {
	
	existingchoclate+=5;
	
	System.out.println("choclates inside the box"+ existingchoclate);
	}
if (existingchoclate>63) {
	System.out.println("choclates box is already full");
}
}
	
}