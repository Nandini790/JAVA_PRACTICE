public class Loops {
    public static void main(String[] args) {

        System.out.println("***** do-while loop *****");

        int i = 0;
        do {
            System.out.println("i: " + i++);
        } while (i < 5);


        System.out.println("****** for loop ******");

        for (int i1 = 0; i1 < 5; i1++) {
            System.out.println("i1: " + i1);

        }

        // Infinite loop
		/*for (;;)
		{
		}
		 */

        System.out.println("****** foreach loop ******");

        int[] arr = {1,2,3};
        for (int x : arr) {
            System.out.print(x + " ");

        }

        System.out.println("**** while loop ****");

        int counter = 0;
        while (counter < 5) {
            System.out.println("counter: " + counter++);
        }

        System.out.println("------ continue ------");

        for (int i2 = 0; i2 < 5; i2++) {
            if (i2 % 2 == 0) {
                continue;
            }
            System.out.println("counter: " + i2);
        }

        System.out.println("------- break -------");

        for (int i3 = 0; i3 < 5; i3++) {
            if (i3 == 3) {
                break;
            }
            System.out.println("counter: " + i3);
        }

        System.out.println("****** Switch ********");

        int m = 1;
        switch (m) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("This is default block");
        }

        // if-else statements

        int num1 = 100;
        int num2 = 200;

        if (num1 < num2) {
            System.out.println(" number 2 is greater");
        } else {
            System.out.println("number 1 is greater");
        }

        // Nested if

        int i1 = 3;
        int i2 = 2;
        int i3 = 10;
        if (i1 > i2) {
            if (i1 > i3)
                System.out.println("i1 is more than i2 and i3");
            else
                System.out.println("i1 is more than i2 but less than i3");
        }

        // if-else-if

        int orderPrice = 1000;

        if (orderPrice > 0 && orderPrice < 100) {
            System.out.println("You have 5% discount for this order");
        } else if (orderPrice >= 100 && orderPrice < 500) {
            System.out.println("You have 10% discount for this order");
        } else if (orderPrice >= 500 && orderPrice < 5000) {
            System.out.println("You have 15% discount for this order");
        }




    }
}
