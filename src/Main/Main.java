package Main;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {


    public static void main(String[] args) {

        List<Person> list = new ArrayList<Person>();
        String Num;
        Set<String> citySet=new HashSet<>();
        citySet.add("Tehran");
        citySet.add("Mashhad");
        citySet.add("Qazvin");
        citySet.add("Zahedan");
        citySet.add("Kerman");
        List <String> listCities=new ArrayList<>(citySet);


        Set<String> nameSet=new HashSet<>();
        nameSet.add("Ali");
        nameSet.add("Amir");
        nameSet.add("Ahmad");
        nameSet.add("Mehran");
        nameSet.add("Somayeh");
        nameSet.add("Mahdiyeh");
        nameSet.add("Heshmatollah");
        List <String> listNames=new ArrayList<>(nameSet);

        Set<String> lastnameSet=new HashSet<>();
        lastnameSet.add("Alavi");
        lastnameSet.add("Taghavi");
        lastnameSet.add("Hajiyan");
        lastnameSet.add("MoienFar");
        lastnameSet.add("Afzali");
        List <String> listLastNames=new ArrayList<>(lastnameSet);


        Random random=new Random();
        for(int i=0; i<20;i++) {
            Num= Integer.toString(i);
            list.add(new Person(10+random.nextInt(40),
                    (listNames.get(random.nextInt(listNames.size()))),
                    (listLastNames.get(random.nextInt(listLastNames.size()))),
                    new Address(("AlleyNo." + Num),
                            ("StreetNo." + Num),
                            (1+random.nextInt(10)),
                            (listCities.get(random.nextInt(listCities.size()))),
                            ("Postalcode" + Num))));
        }

        //  System.out.println(list);
        list.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .collect(Collectors.toList())
                .forEach(System.out::println);
// answer of wanted statements:


//        list.stream()
//                .sorted(Comparator.comparingInt(Person::getFirstNameLength))
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

//        Comparator<Person> nameLengthComp=(a,b)->a.getFirstNameLength()-b.getFirstNameLength();
//        list.stream()
//                .sorted(nameLengthComp)
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

//
//       list.stream()
//                .filter(l->"Tehran".equals(l.getAddressCity())&& l.getAddressZone()<5)
//                .forEach(System.out::println);



        System.out.println("******Start of***********reduce()***************");
        //This method takes two parameters: the identity and the accumulator.
        // The identity element is both the initial value of the reduction
        // and the default result if there are no elements in the stream.
        // The accumulator function takes two parameters:
        // a partial result of the reduction and the next element of the stream.
        // It returns a new partial result.
        // The Stream.reduce() method returns the result of the reduction.

        int maxAge = list.stream().mapToInt(Person::getAge)
                .reduce(0, (a1, a2) -> a1 > a2 ? a1 : a2);
        System.out.printf("The oldest user's age: %s%n", maxAge);

        System.out.println("*****End of ***********reduce()******************\n");

        System.out.println("\n******Start of***********peek()***************");

        //The Stream.peek() method is mainly to support debugging,
        // where you want to see the elements as they flow past
        // a certain point in a pipeline.

        //The Stream.peek() method returns a stream consisting of
        // the elements of this stream, additionally performing the provided action
        // on each element as elements are consumed from the resulting stream.

        Stream.of("bus", "car", "bicyle", "flight", "train")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());

        System.out.println("*****End of ***********peek()******************\n");


        System.out.println("\n******Start of***********anymatch()***************");

        //Stream.anyMatch() returns whether any elements of
        // this stream match the provided predicate.
        // May not evaluate the predicate on all elements
        // if not necessary for determining the result.
        // If the stream is empty then false is returned and the predicate is not evaluated.
        boolean result = list.stream().anyMatch(e->e.getFirstName().matches("Mehran"));
        System.out.println(result);

        System.out.println("*****End of ***********anymatch()******************\n");






    }

}