import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsEffective {
  public static void main(String[] args) {
    System.out.println("Primefactors of 44");
    for (Integer integer : primeFactors(44)) {
      System.out.println(integer);
    }
    System.out.println("Primefactors of 1000");
    for (Integer integer : primeFactors(1000)) {
      System.out.println(integer);
    }
    System.out.println("Primefactors of 32");
    for (Integer integer : primeFactors(32)) {
      System.out.println(integer);
    }
  }
} 