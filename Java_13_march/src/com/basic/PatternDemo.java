package com.basic;
/*
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 
 * for i :
 * initialization:
 * first no of pattern

 * condition
 * last no of pattern
 * 
 * incree/decree
 * smaller to bigger no : ++ ,<=
 * bigger to smaller no : --, >=
 * 
 * 
 * for j :
 * initialization:
 * first col of each row
 * same no: that no only
 * diff no: upper loop name

 * condition
 * last col of each row
 * same no: that no only
 * diff no: upper loop name
 * 
 * incree/decree:
 * check each row
 * smaller to bigger no : ++ ,<=
 * bigger to smaller no : --, >=
 * 
 * for k:
 * k completely depends on i
 * 
 * 5
 * 54
 * 543
 * 5432
 * 54321
 * 
 * 5
 * 45
 * 345
 * 2345
 * 12345
 * 
 * 1
 * 21
 * 321
 * 4321
 * 54321
 * 
 * 1
 * 10
 * 101
 * 1010
 * 10101
 * 
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 
 * 1
 * 23
 * 456
 * 78910
 * 
 *      1
 *     1 2
 *    1 2 3
 *   1 2 3 4
 *  1 2 3 4 5
 *  
 *  
 *      *      1*2    
 *     ***     2*2
 *    *****    3*2 
 *     ***
 *      * 
 */
public class PatternDemo {
public static void main(String[] args) {
//	int k=1;
	for (int i = 1; i <=3; i++) {
		for (int k = i; k<=3; k++) {
			System.out.print(" ");
		}
		for (int j = 1; j <=i*2-1; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	for (int i = 2; i >=1; i--) {
		for (int k = i; k<=3; k++) {
			System.out.print(" ");
		}
		for (int j = i*2-1; j >=1; j--) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
