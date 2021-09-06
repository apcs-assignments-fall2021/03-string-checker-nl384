# String Checker Assignment

In this assignment, you'll be writing three methods to carry out some String operations. Using the Java String methods will be very helpful.

The first method is countABC(). This method takes a String as input, and returns the total number of 'a', 'b', or 'c' chars in that String. The method has the following signature: public static int countABC(String str) {}

The second method is containsThe(). This method takes a String as input, and returns a boolean equal to whether or not the String contains "the" or "The". The method has the following signature: public static boolean containsThe(String str) {}

The final method is isPalindrome(). This method takes a String as input, and returns a boolean equal to whether or not the String is a palindrome (a palindrome is a word that is the same forwards and backwards, like "racecar"). The method has the following signature: public static boolean isPalindrome(String str) {}

After writing the three methods and testing that they work, use Scanner in your main code to ask the user to type in a String. Then, run all three methods on that String and print out some messages depending on that result. 

In addition, you might want to use the scan.nextLine() method instead of scan.next(). Whereas scan.next() only reads in the next String that they type, scan.nextLine() reads in the entire line of text they entered. 

Example of what your program may look like when it is being run:
```shell script
Please enter a string: 
the athenian school
Your string contains 3 a's, b's, or c's
Your string DOES contain the
Your string IS NOT a palindrome
```

<br />
<br />

Add code to [MyMain.java](src/main/java/MyMain.java) to implement the above methods.

## Run your code with:
The easiest way to run your code is to press the play button in [MyMain.java](src/main/java/MyMain.java).

However, you can also run your code by typing the following into the Terminal.

```shell script
make run
```

Alternatively, if that doesn't work, use:

```shell script
./gradlew run
```

## Run your tests with:
The easiest way to run your code is to press the play button in [MyTests.java](src/test/java/MyTests.java).

However, you can also run your code by typing the following into the Terminal.

```shell script
make test
```

Alternatively, if that doesn't work, use:

```shell script
./gradlew test
```