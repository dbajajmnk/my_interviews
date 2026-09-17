public class NumberAndBasicLogic{


public static void main(String[]args){

	EvenOdd evenOdd = new EvenOdd();
	boolean isOdd=evenOdd.checkNumber(10,false);
	boolean isEven = evenOdd.checkNumber(10,true);

	System.out.println("Is Even="+isEven);
	System.out.println("Is Odd="+isOdd);
	FindGreaterNumberFromTwo greaterNumber = new FindGreaterNumberFromTwo();
	greaterNumber.findGreaterNumber(10,20);

}


}