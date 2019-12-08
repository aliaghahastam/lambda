package MainProject;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        Random random = new Random();
        int rand_int1 = random.nextInt(100);
        System.out.println("rand_int1:  "+ rand_int1+ "   which is used for the size of Arraylist ");

        for (int i = 0; i < rand_int1; i++) {
            int rand_int2 = random.nextInt(100);
            arrayList.add(i,rand_int2);
        }

        Predicate<Integer> OddCheckerPredicate= s->s%2==0;
        BiPredicate<Integer,Integer> ComparisonPredicate= (a,b)->a<b;

        int rand_int3 = 10+random.nextInt(20);
        rand_int3=(OddCheckerPredicate.test(rand_int3))?rand_int3:rand_int3-1;
        System.out.println("rand_int3:  "+ rand_int3+ "   which is used for limiting the nums in stream of arraylist ");
        ArrayList<Integer> arrayList1 = arrayList.stream()
               // .limit((rand_int3<rand_int1)? rand_int3:rand_int1)
                .limit( rand_int3)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("First mode: " + arrayList1);

        for (int i=0;i<arrayList1.size()-1;i=i+2){
            if(!ComparisonPredicate.test(arrayList1.get(i),arrayList1.get(i+1))){
                arrayList1.remove(i);
                arrayList1.remove(i);
                i=i+2;
            }
        }
        System.out.println("Second mode: " + arrayList1);

    }
}