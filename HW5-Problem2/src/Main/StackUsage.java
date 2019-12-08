package Main;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StackUsage {
    public static void main(String args[]) {

        // creating stack
        Stack st = new Stack();

        // populating stack
        st.push("Java");
        st.push("HTML");
        st.push("Python");
        st.push("C++");


        int vals[] = { 2, 4, 6, 8, 10, 12, 14, 16 };

        int sum = Arrays.stream(vals).sum();
        System.out.printf("The sum of values: %d%n", sum);

        long n = Arrays.stream(vals).count();
        System.out.printf("The number of values: %d%n", n);



        // checking the top object
/*
        Scanner scanner=new Scanner(System.in);
        System.out.println("For usage of peek, enter \"peek\" and for pop, enter \"pop\" . . .");
        String scan=scanner.nextLine().toLowerCase();
        if (scan.equals("peek")) {
            System.out.println("First situation:     "+st);
            System.out.println("Top object is: " + st.peek());
            System.out.println("Second situation:     "+st);
        } else if(scan.equals("pop")) {
            System.out.println("First situation:     "+st);
            System.out.println("Top object is: " + st.pop());
            System.out.println("Second situation:     "+st);
        } else {
            System.out.println("Take care about your dictation, just peek or pop ");
        }
        */
    }
}