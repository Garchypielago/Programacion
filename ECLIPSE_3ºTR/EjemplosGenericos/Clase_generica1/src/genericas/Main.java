package genericas;
public class Main {
	public static void main(String args[]) {
		// Creamos una instancia de ClaseGenerica para Integer.
		ClaseGenerica1<Integer> intObj = new ClaseGenerica1<Integer>(88);
		intObj.classType();
		System.out.println(intObj.getClass().getSimpleName());
		System.out.println(intObj);

		// Creamos una instancia de ClaseGenerica para String.
		ClaseGenerica1<String> strObj = new ClaseGenerica1<String>("Test");
		strObj.classType();
		System.out.println(strObj.getClass().getSimpleName());
		System.out.println(strObj);
	}
}