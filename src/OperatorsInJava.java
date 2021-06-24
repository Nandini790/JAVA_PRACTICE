import java.util.Arrays;

public class OperatorsInJava {
    public static void main(String[] args) {

        // ============ Arithmetic Operators

        // *** Unary Arithmetic Operators

//		+
//		-
//		++
//		--

        int i = +10;
        int i2 = -10;
        int i3 = ++i;
        int i4 = i++;
        int i5 = --i;
        int i6 = i--;

        // *** Binary Arithmetic Operators

//		+
//		-
//		/
//		%
//		*

        int i7 = 10 + 1;
        int i8 = i7 - 1;
        int i9 = i8 / 2;
        int i10 = i9 % 2;
        int i11 = 5 % 10;
        int i12 = i10 * 3;

        System.out.println(i7);
        System.out.println(i8);
        System.out.println(i9);
        System.out.println("Hello " + "World" + "!"); // used for concatination

        // ============ Assignment Operators

//		=
//		+=
//		-=
//		*=
//		/=
//		%=

        int i13 = 10;
        i13 += 2;
        System.out.println(i13);

        // ============ Relational Operators

//		==
//		!=
//		>
//		<
//		>=
//		<=

        System.out.println("===== Relational Operators =====");

        int y = 10;
        int j = 20;

        System.out.println(y == j);
        System.out.println(y != j);
        System.out.println(y > j);
        System.out.println(y < j);
        System.out.println(y >= j);
        System.out.println(y <= j);

        // ============ Logical Operators

//		&
//		&&
//		|
//		||
//		!
//		^

        System.out.println(false && (5 / 5 == 0) );
        System.out.println(true || (5 / 7 == 0) );
        System.out.println("!true = " + !true);
        System.out.println(true ^ false);


        // ============ Bitwise Operators

//		&
//		|
//		^
//		~
//		>>
//		>>>
//		<<

        System.out.println("4 & 5 = " + (4 & 5)); // 4
        /*
         * 				1 0 0
         * 				& & &
         * 				1 0 1
         * 				-----
         * 				1 0 0 = 4
         */

        System.out.println("4 | 5 = " + (4 | 5)); // 5
        /*
         * 				1 0 0
         * 				| | |
         * 				1 0 1
         * 				-----
         * 				1 0 1 = 5
         */

        System.out.println("4 ^ 5 = " + (4 ^ 5)); // 1
        /*
         * 				1 0 0
         * 				^ ^ ^
         * 				1 0 1
         * 				-----
         * 				0 0 1 = 1
         */

        // ============ Ternary Operator

//		(condition) ? true expression : false expression

        System.out.println(5 > 1 ? "2 is greater than one" : "2 is not less than one");
        System.out.println(2 < 1 ? "2 is greater than one" : "2 is not less than one");

        // ============ Operator Precedence
//
//		Precedence highest to lowest among brackets.
//		()
//		[]
//		·
//
//       Precedence highest to lowest among postfix and prefix.
//		++
//		--
//
//       Precedence highest to lowest among urinary operators.
//		+
//		—
//		!
//		~
//		( type )
//
//      Precedence highest to lowest among binary operators.
//		*
//		/
//		%
//		+
//		–
//
//      Precedence highest to lowest among shift operator.
//		<<
//		>>
//		>>>
//
//      Precedence highest to lowest among rational operators.
//		<
//		<=
//		>
//		>=
//		instanceof
//
//      Precedence highest to lowest among equality operator.
//		==
//		!=
//
//      Precedence highest to lowest among bitwise operator.
//
//		&
//
//
//		^
//
//
//		|
//
//
//		&&
//
//
//		||
//
//
//		? :
//
//      Precedence highest to low among Assignment operators
//		=
//		+=
//		-=
//		*=
//		/=
//		%=

        // Using Parantheses

        /*
        Parentheses raise the precedence of the operations that are inside them. This is
        often necessary to obtain the result you desire. For example, consider the
        following expression:

         a >> b + 3

         This expression first adds 3 to b and then shifts a right by that result. That is,
        this expression can be rewritten using redundant parentheses like this:
        a >> (b + 3)

        However, if you want to first shift a right by b positions and then add 3 to that result,
         you will need to parenthesize the expression like this:

           (a >> b) + 3
         */

        int a = 5;
        int b = 5;
        System.out.println("------------------------------");
        System.out.println(a >> (b + 3)); // 0

        // After altering parantheses

        System.out.println((a >> b) + 3); //3


        // Test equality btw String and other objects using == and equals()

        String s = new String("hello");
        String h = "hello";
        System.out.println("*******************");

        System.out.println(s==h);  //false
        System.out.println(s.equals(h));  //true

        int n = 78;
        int v = 79;

        System.out.println(n==v); //false

        int[] ar = {1,2,3};
        int[] yu = {1,2,3};

        System.out.println(Arrays.equals(ar, yu)); //true
        System.out.println(ar == yu);  //false

    }
}
