package coreJava;

public class D_JavaVariables {
  public static void main(String[] args) {
    System.out.println("java variables");

    boolean booleanVar = true; //1 bit
    byte byteVar = 4; //1 byte : 8 bits : 64
    char charVar = 'c';//2 bytes
    short shortVar = 16;//2 bytes
    int intVar = 166;//4 bytes
    float floatVar = 12.2f;//4 bytes
    double doubleVar = 456.4;//8 bytes
    long longVar = 343225l;//8 bytes

    //literals in java
    //0x represents hexadecimal
    //0b represents binary

    int binNumber = 0b110;
    System.out.println(binNumber);

    int hexadecimalNumber = 0x11;
    System.out.println(hexadecimalNumber);
    
    int octalNumber = 022;
    System.out.println(octalNumber);

    //A : 65 : 01000001
    //B : 66 
    //...
    //a : 97
    //b : 98
    //...

    //33: !

    //ascii : american standard code for information interchange

    //  HI! => 72 73 33 => 01001000 01001001 00100001
    // above is 8 bits each : so 24 bits => 3 bytes

    //kilobytes : 10^3 : 1000 bytes : thousand
    //megabytes : 10^6 : 1000000 bytes : million
    //gigabytes : 10^9 : 1000000000 bytes : billion
    //terabytes : trillion of bytes

    //new standard : unicode : can use 8 bits for backward compatibility with ASCII, but can also use 16 bits
    //16 bits gives us more than 65000 possible letters

    //hexadecimal : has 16 digits : 0 to F
    //each place can have upto 15 numbers (1 to F) 
    //F is 15, being the highest : 8 4 2 1 : 15 : so each place of hexadecimal number has 4 bits 
    //hexadecimals are generally used with files

    //how to define colors
    //RGB : all colors are made of some amount of red, green and blue combination

    //different applications interpret incoming values of bits differently
    //for ex: for excel where 01000001 is 65 and is interpreted as the number 65
    //    for word the same bit set can be interpreted as A
    //    lets say we have 72 73 33 : for word this can be HI! but at the same time for photozhop, this can be 3 RGB values

    //How screen is made
    //screen is made of pixels : each pixel is using 24 bits : 8 bits of R, 8 bits of G, 8 bits of B
    //we have millions of such pixels on our screens now

    //How to represent videos only 0s and 1s
    //images sped up so that we can see them one after other in a flow, makes it look like a video

    //representing music
    //music can be represented as the notes(A to G), the time for which each note is played and the pressure
  }
}
