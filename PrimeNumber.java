package week1.day1.assignments;

public class PrimeNumber {
	public static void main(String[] args) {
		int a = 17;
		boolean flag = false;
		for (int i = 2; i <=a/2;i++ ) {
			if (a%i == 0) {
				flag = true;
				break;
			}
		
		}
		if(!flag) {
			System.out.println(" PrimeNumber");
		}
		else {
			System.out.println("Not an Prime Number ");
		}

		}
	}


