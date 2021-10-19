import java.lang.Math;
import java.util.HashSet;


public class Main {
	public static void main(String [] args) {
		double square = 0;
		HashSet<Double> set = new HashSet<Double>();
			for (int i = 122; i >= 0; i--) {
				System.out.println(i);
			}
			for(double i = 2; i < 101; i++) {
				for(double k = 2; k < 101; k++) {
					square = Math.pow(i, k);
					set.add(square);
			}
		}
		System.out.println(set.size());
	}
}


