public class AnimalVoice {
	
	public static <T extends Animal> void getVoice(T t) {
		t.voice();
	}
	
}
