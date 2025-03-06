package com.studyopedia;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Exp5{
 public static List<Integer> parseStringToIntegerList(String[] numbers) {
   List<Integer> integerList = new ArrayList<>();
   for (String num : numbers) {
     integerList.add(Integer.parseInt(num));
   }
   return integerList;
 }
 public static int calculateSum(List<Integer> integerList) {
   int sum = 0;
   for (Integer num : integerList) {
     sum += num;
   }
   return sum;
 }
 public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   System.out.println("Enter numbers separated by spaces:");
   String input = scanner.nextLine();
   String[] numberStrings = input.split("\\s+");
   List<Integer> numbers = parseStringToIntegerList(numberStrings);
  
   int sum = calculateSum(numbers);
   System.out.println("The sum of the numbers is: " + sum);
   scanner.close();
 }
} 
