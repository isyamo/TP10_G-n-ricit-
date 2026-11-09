package ma.projet.EX2;

public class TestTripletH {

	public static void main(String[] args) {

		TripletH<Integer, String, Double> th = new TripletH<>(16, "yahya", 1.80);

		th.affiche();

		TripletH<String, Integer, Boolean> th2 = new TripletH<>("Yousra", 30, false);
		th2.affiche();

	}

}
