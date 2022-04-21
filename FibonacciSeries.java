package week1.day1.assignments;

public class FibonacciSeries {
	// initialize 3 variables 
	//assign values for first 2 variables
	//fix a range to run a loop
	//for loop condition to iterate
	//print a,add c =a+b,a=b,b=c
public static void main(String[] args) {
	int num1=2;
	int num2=5;
	int nextnum;
	int range = 8;
	for(int i =2;i<=range;i++) {
		System.out.println(num1);
		nextnum=num1+num2;
		num1=num2;
		num2=nextnum;
	}
}
}
