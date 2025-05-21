/*Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify
your answer which one is better.*/
package github1;

public class String_performance2b1 {
    public static void main(String[] args) {
        int iterations = 10000;
        String appendText = "AIET";

        // Test with StringBuffer (thread-safe, synchronized)
        StringBuffer stringBuffer = new StringBuffer();
        long startTimeBuffer = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(appendText);
        }

        long endTimeBuffer = System.nanoTime();
        long durationBuffer = endTimeBuffer - startTimeBuffer;

        // Test with StringBuilder (non-thread-safe, faster)
        StringBuilder stringBuilder = new StringBuilder();
        long startTimeBuilder = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(appendText);
        }

        long endTimeBuilder = System.nanoTime();
        long durationBuilder = endTimeBuilder - startTimeBuilder;

        // Output results
        System.out.println("Time taken by StringBuffer: " + durationBuffer + " ns");
        System.out.println("Time taken by StringBuilder: " + durationBuilder + " ns");

        // Conclusion
        if (durationBuffer > durationBuilder) {
            System.out.println("\nConclusion: StringBuilder is faster than StringBuffer for single-threaded operations.");
        } else {
            System.out.println("\nConclusion: StringBuffer is comparable or faster, but typically slower in practice due to synchronization overhead.");
        }
    }
}

