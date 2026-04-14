

## Write Java programs for the following:

```
1. Write a program to print whether a number is even or odd, also take
input from the user.
2. Take name as input and print a greeting message for that particular name.
3. Write a program to input principal, time, and rate (P, T, R) from the user and
find Simple Interest.
4. Take in two numbers and an operator (+, -, *, /) and calculate the value.
(Use if conditions)
5. Take 2 numbers as input and print the largest number.
6. Input currency in rupees and output in USD.
7. To calculate Fibonacci Series up to n numbers.
8. To find out whether the given String is Palindrome or not.
9. To find Armstrong Number between two given number.
```

# Solutions

> Ignore any missing Classes, main methods or syntactic errors!


## 1. Write a program to print whether a number is even or odd, also take input from the user.

```java
import java.util.*;
public boolean isEven(){
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	sc.close();
	if(num % 2 == 0) return true;
	else return false;
}
```

## 2. Take name as input and print a greeting message for that particular name.

```java
import java.util.*;
public void greetUser(){
	Scanner sc = new Scanner(System.in);
	String name = sc.nextLine();
	sc.close();
	System.out.println("Hey there, how you doing " + name + "!")
}
```


## 3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

```java
import java.util.*;
public void calculateSI(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Give input for Principal, time, and rate respectively");
	System.out.println("by hitting enter after each input");
	int p = sc.nextInt();
	int t = sc.nextInt();
	int r = sc.nextInt();
	System.out.println("Simple interest: " + ((p*t*r) / 100));
}
```

## 4. Take in two numbers and an operator `(+, -, *, /)` and calculate the value.
(Use if conditions)

```java
import java.util.*;
public void operation(){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter 1st number: ");
	int a = sc.nextInt();
	System.out.print("Enter 2nd number: ");
	int b = sc.nextInt();
	System.out.println("Enter the rescpective operator you wish (+, -, *, /)");
	sc.nextLine();  // Consume the leftover newline
	String operator = sc.nextLine();
	scanner.close();
	if(operator.equals("+")){
		System.out.println("Result: " + (a+b));
	} else if (operator.equals("-")) {System.out.println("Result: " + (a-b));}
	else if (operator.equals("*")) {System.out.println("Result: " + (a*b));}
	else if (operator.equals("/")) {
		if(b != 0){
			System.out.println("Result: " + (a/b));
		} else {
			System.out.println("Cannot Divide by 0");
		}
	else {System.out.println("INVALID OPERATOR");}
}
```


## 5. Take 2 numbers as input and print the largest number.

```java
import java.util.*;
public void largestNumber(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Provide 2 numbers: (press enter after each input"));
	int n1 = sc.nextInt();
	int n2 = sc.nextInt();
	if (n1 > n2){ System.out.println(n1 + " Is Largest"); }
	else if (n1 < n2){ System.out.println(n2 + " Is Largest"); }
	else System.out.println("Both numbers are equal");
}
```


## 6.  Input currency in rupees and output in USD

```java
import java.util.*;
public void currencyConverter(){
	final double USDrate = 0.011;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter amount in Indian Currency: ");
	int rupees = sc.nextInt();
	System.out.println("In US Dollars: " + (rupees * USDrate) + "$");
}
```


## 7. To calculate Fibonacci Series up to n numbers.

```java
public void fibonacciSeq(int n){
	int firstTerm = 0, secondTerm = 1;
	if(n <= 0){
		System.out.println("Please enter a number greater than 0."); 
	} else {
		for(int i = 1; i <= n; i ++){
			System.out.print(firstTerm + ", ");
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;	
		}
	}
}
```


## 8. To find out whether the given String is Palindrome or not.

```java
public boolean isPalindrome(String s){
	String rev = new StringBuilder(s).reverse().toString();
	return s.equals(rev);
}
```

## 9. To find Armstrong Number between two given number.

```java
public void findArmstrongNums() {
    int num1 = 100, num2 = 150;
	if(num1 > num2){
		int temp = num1;
		num1 = num2;
		num2 = temp;
	}
	for(int i = num1; i <= num2; i++){
	    int temp = i;
		int len = Integer.toString(i).length();
		int sum = 0;
		while(temp > 0){
			int digit = temp % 10;
			sum += (int)(Math.pow(digit, len));
			temp = temp / 10;
		}
		if(sum == i) {
            System.out.print(i + " ");
        }
	}
}
```