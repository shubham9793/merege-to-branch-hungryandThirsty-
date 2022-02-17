import java.util.Scanner;

public class Food {


    //  master branch 



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you hungry?");
		//boolean str = true;
		boolean str = sc.nextBoolean();
		if(str == true) {
			System.out.println("eat pizza");
			System.out.println("eat sandwitch");
			System.out.println("eat burger");
        }
	}

}
