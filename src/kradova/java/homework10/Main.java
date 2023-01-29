package homework10;

import homework9.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "apricot", "pear", "grapes");

        printWordsStartedByA(fruits);
        printFruitLength(fruits);
        printSumOfLetters(fruits);
    }

    public static void printWordsStartedByA(List<String> fruits) {
        System.out.println("Print fruits which are started by \"a\"");
        fruits.stream().filter(fruit -> fruit.charAt(0) == 'a').forEach(System.out::println);
    }

    public static void printFruitLength(List<String> fruits) {
        System.out.println("\nPrint fruits with length greater than 4");
        fruits.stream().filter(fruit -> fruit.length() > 4).forEach(System.out::println);
    }

    public static void printSumOfLetters(List<String> fruits) {
        System.out.println("\nPrint the sum of the letters of the first three fruits");
        var result = fruits.stream()
                .limit(3)
                .map(String::length)
                .reduce(0, Integer::sum);
        System.out.println(result);
    }
}
