import java.util.Scanner;

public class SecondTask {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = "";
		
		while (!str.toLowerCase().equals("exit")) {
			System.out.println("Input an animal: ");
			str = sc.next();

			if (Cow.name.equals(str.toLowerCase())) {
				new Cow().voice();
			} else if (Cat.name.equals(str.toLowerCase())) {
				new Cat().voice();
			} else if (Dog.name.equals(str.toLowerCase())) {
				new Dog().voice();
			} else {
				System.out.println("We haven't got that animal.");
			}
		}
		sc.close();
	}
}
