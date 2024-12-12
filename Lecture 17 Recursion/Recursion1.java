public class Recursion1{

    static int N = 10;

    // Print numbers from n to 1.
    public static void printNum1(int n){
        if (n==0){              // Base Case
            return;
        }

        System.out.println(n);
        
        printNum1(n-1);          // Recurive Call
    };

    // Print numbers from 1 to n.
    public static void printNum2(int n){
        if (n==N){              // Base Case
            return;
        }

        System.out.println(n);
        
        printNum2(n+1);          // Recurive Call
    };


    // Sum of n natural numbers
    public static int sumNum(int n, int limit){
        if (n > limit){
            return 0;
        }
        
        return n + sumNum(n+1, limit);
    }  


    // Factorial of n
    public static long factorial(long n){
        
        if (n==0){
            return 1;
        }
        return n * factorial (n-1);

    }

    // Fibonacci Series
    public static void fibSeries(int a, int b, int n){
        if (n-2 == 0){
            return;
        }

        int c = a+b;
        System.out.print(" " + c);

        fibSeries(b, c, n-1);


    }

    // XpowerN
    public static int calPow1(int x, int n){
        if (x == 0) {
            return 0;
        }

        if (n == 1){
            return x ;
        }

        return x * calPow1(x, n-1);
    } 

    // calPow function 2 (stack height = logn)  
    public static int calPow2(int x, int n){
        if ( x == 0 ){
            return 0;
        }
        if ( n == 1){
            return x;
        }

        if (n % 2 == 0){
            return calPow2(x, n/2) * calPow2(x, n/2);
        }
        else {
            return calPow2(x, n/2) * calPow2(x, n/2) * x;
        }
    }
 

    public static long measureMemoryUsage(Runnable function) {
        // Run garbage collection to reduce interference
        System.gc();
        long beforeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        
        // Execute the function
        function.run();
        
        long afterMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        
        return afterMemory - beforeMemory;
    }

    public static void main(String args[]){
        // printNum1(6);
        // printNum2(1);

        // System.out.println(sumNum(1, 10));
        // System.out.println(factorial(20));

        // System.out.print("0 1");
        // fibSeries(0, 1, 10);

        long startTime = System.nanoTime();
        System.out.println(calPow1(2, 5));       // 2^5 = 32
        long endTime = System.nanoTime();
        System.out.println("Time by funcA: "+ (endTime-startTime));

        startTime = System.nanoTime();
        System.out.println(calPow2(2, 5));       // 2^5 = 32
        endTime = System.nanoTime();
        System.out.println("Time by funcB: "+ (endTime-startTime));

        long memoryUsedByFunctionA = measureMemoryUsage(() -> calPow1(2, 200));
        System.out.println("Memory used by functionA: " + memoryUsedByFunctionA / 1024 + " KB");
        long memoryUsedByFunctionB = measureMemoryUsage(() -> calPow2(2, 5));
        System.out.println("Memory used by functionA: " + memoryUsedByFunctionB / 1024 + " KB");

    }
}