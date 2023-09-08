package coreJava;

public class C_JDKJREKVM {
  public static void main(String[] args) {
    System.out.println("main");
    /*
     * JDK : java development kit : contains JRE and other jars needed for development
     * JRE : java runtime environment : provides rutime env for the java programs to run : provides java class libraries
     * JVM : java virtual machine : abstract machine that enables us to run java program on any machine
     * \
     * WORA : write once run anywhere
     * platform independent
     * secure
     * multi threaded
     * \
     * JVM working : java compiles the java code to java byte code, then JVM translates byte code to machine code
     * 
     *    JAVA PROGRAM --java compiler--> JAVA BYTECODE --jvm--> MACHINE CODE --cpu--> output
     * 
     * java has automatic garbage collection, as a programmer, it is very important to take care of memory allocation and deallocation as
     * memory is scarce in nature
     * 
     * memory areas : 
     * - method area : (or class area) : allocated for class strucutures, method data and constructor field data
     * - heap area : objects created are stored in the heap area
     *      it is shared runtime data area and stores the actual object in memory
     *      this memory is allocated for all class instances and arrays
     * - stack area : each thread had its own stack, stores partial data that will be required while returning data to method calls
     *      the memory for stack needs not be contiguous
     * - program counter registers : each JVM thread has a program counter register associated to it
     * 
     * 
     * Garbage collection in java
     * garbage collector tuning : GC process causes rest of the processes or threads to be paused and thus costly in nature.
     *  this can be eliminated by using several garbage collection based algorithms
     */
  }
}
