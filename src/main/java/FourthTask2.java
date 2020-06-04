import java.util.Scanner;

public class FourthTask2 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = "";
		
		while (!str.toLowerCase().equals("exit")) {
			System.out.println("Input an animal: ");
			str = sc.next();
			if (Cow.name.equals(str.toLowerCase())) {
				AnimalVoice.getVoice(new Cow());
			} else if (Cat.name.equals(str.toLowerCase())) {
				AnimalVoice.getVoice(new Cat());
			} else if (Dog.name.equals(str.toLowerCase())) {
				AnimalVoice.getVoice(new Dog());
			} else {
				System.out.println("We haven't got that animal.");
			}
		}
		sc.close();
	}
}
