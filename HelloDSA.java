package basics;

import java.math.BigDecimal;

/**
 * HelloDSA
 */
public class HelloDSA {

  public static void main(String[] args){
    BigDecimal bd = new BigDecimal(500);
    bd = bd.multiply(new BigDecimal(30));
    System.out.println("hello dsa " + bd);
  }
}