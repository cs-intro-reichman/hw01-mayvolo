/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        int random1 = (int) (Math.random() * (max - min) + min);
        int random2 = (int) (Math.random() * (max - min) + min);
        int random3 = (int) (Math.random() * (max - min) + min);
        int minrandom = Math.min(random1, Math.min(random2,random3));
        System.out.println(random1);
        System.out.println(random2);
        System.out.println(random3);
        System.out.println("The minimal generated number was " + minrandom);
	}
}
