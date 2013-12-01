package strange_dice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solver {

	private static List<List<Integer>> product(List<Integer> A, List<Integer> B, List<Integer> C){
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for (Integer a : A) {
			for (Integer b : B) {
				for (Integer c : C) {
					ArrayList<Integer> list = new ArrayList<Integer>();
					list.add(a);
					list.add(b);
					list.add(c);
					result.add(list);
				}
			}
		}
		return result;
	}

	private static void printer(String message){
		System.out.println("=============================");
		System.out.println(message);
		System.out.println("=============================");
	}

	public static int wins(List<List<Integer>> prods, int firstPos, int secondPos){
		int counter = 0;
		for (List<Integer> list : prods) {
			if(list.get(firstPos) > list.get(secondPos))
				counter++;
		}
		return counter;
	}
	public static void main(String[] args){
		System.out.println("Running...");
		ArrayList<Integer> dieA = new ArrayList<Integer>(Arrays.asList(2,6,7));
		ArrayList<Integer> dieB = new ArrayList<Integer>(Arrays.asList(1,5,9));
		ArrayList<Integer> dieC = new ArrayList<Integer>(Arrays.asList(4,3,8));
		List<List<Integer>> products = product(dieA, dieB, dieC);
		int aPos = 0, bPos = 1, cPos = 2;
		int prodLength = products.size();

		printer("A vs B");
		int awins = wins(products,aPos,bPos);
		int bwins = prodLength - awins;
		System.out.println("A: "+new Fraction(awins, prodLength).simplify().toString());
		System.out.println("B: "+new Fraction(bwins, prodLength).simplify().toString());

		printer("B vs C");
		int cwins = wins(products,cPos,bPos);
		bwins = prodLength - cwins;
		System.out.println("C: "+new Fraction(cwins, prodLength).simplify().toString());
		System.out.println("B: "+new Fraction(bwins, prodLength).simplify().toString());

		printer("C vs A");
		cwins = wins(products,cPos,aPos);
		awins = prodLength - cwins;
		System.out.println("C: "+new Fraction(cwins, prodLength).simplify().toString());
		System.out.println("A: "+new Fraction(awins, prodLength).simplify().toString());

	}
}
