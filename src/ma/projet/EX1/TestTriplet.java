package ma.projet.EX1;

public class TestTriplet {
	public static void main(String[] args) {
		
		// entier
		Triplet<Integer> tInt =new Triplet<>(1,2,3);
		tInt .affiche();
		
		//chaine
		Triplet<String> tStr =new Triplet<>("A", "B", "C");
		tStr.affiche();
		
		System.out.println("\n Second élément de tInt : "+tInt.getSecond());
		System.out.println("\n Premier élément de tInt : "+tInt.getPremier());
		System.out.println("\n Premier element de tStr : "+tStr.getPremier());
	}

}
