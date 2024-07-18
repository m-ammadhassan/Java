public class If {
    public static void main(String[] args) {
        int numOne = 50;
        int numTwo = 20;

        System.out.println("Number One = " + numOne);
        System.out.println("Number Two = " + numTwo);

        if(numOne > numTwo)
            System.out.println("Number one is greater than number two!");

        if(numOne < numTwo)
            System.out.println("Number one is less than number two!");

        numTwo = 50;

        if(numOne == numTwo)
        {
            System.out.println("Number One = " + numOne);
            System.out.println("Number Two = " + numTwo);
            System.out.println("Number one and Number two are equal!");
        }

        numTwo = 20;

        if(numOne != numTwo)
        {
            System.out.println("Number One = " + numOne);
            System.out.println("Number Two = " + numTwo);
            System.out.println("Number one and Number two are not equal!");
        }
    }
}
