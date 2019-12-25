import java.lang.Math;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set; 

interface Lambda{
	public static boolean asalBul(int n) {
	    for(int i = 2;i < n; i++) {
	        if(n%i == 0)
	            return false;
	    }
	    return true;
	}
}

public class Homework {

	private static List<Integer> list = new ArrayList<>();
	private static List<Integer> F50k = new ArrayList<>();
	private static List<Integer> F50a = new ArrayList<>();
	private static Set<Integer> intersection = new HashSet<Integer>();

	public static void main(String[] args) {
		int max = 1_000_000; 
	    int min = 1000;
		int i = 0;
	    int range = max - min + 1;
		for(i = 0;i <= 100_000;i++) {
			int number = (int)(Math.random() * range) + min;
			list.add(number);
		}
		i = 0;
		for(Integer n : list) {
			if(Lambda.asalBul(n) && i <= 50_000) 
				F50k.add(n);
			else if(Lambda.asalBul(n) && i > 50_000)
				F50a.add(n);
			i++;
		}
		intersection.addAll(F50k);
	    intersection.retainAll(F50a);
		System.out.println("F50k kumesi: " + F50k);
		System.out.println("F50a kumesi: " + F50a);
	    System.out.println("F50k ve F50a kumelerinin kesisimleri: " + intersection);
	}

}
