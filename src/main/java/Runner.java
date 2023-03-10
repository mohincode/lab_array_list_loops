import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list

        scottishIslands.add("Coll");

//        2. Add "Tiree" to the start of the list

        scottishIslands.add(0, "Tiree");

//        3. Add "Islay" after "Jura" and before "Mull"

        scottishIslands.add(scottishIslands.indexOf("Jura") + 1, "Islay");

//        4. Print out the index position of "Skye"

        System.out.println(scottishIslands.indexOf("Skye"));

//        5. Remove "Tresco" from the list by name

        scottishIslands.remove("Tresco");

//        6. Remove "Arran" from the list by index

        scottishIslands.remove(scottishIslands.indexOf("Arran"));


//        7. Print the number of islands in your arraylist

        System.out.println(scottishIslands.size());

//        8. Sort the list alphabetically

        Collections.sort(scottishIslands);

//        9. Print out all the islands using a for loop

        for (String scottishIsland : scottishIslands) {
            System.out.print(scottishIsland + " ");
        }


        System.out.println(scottishIslands);

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers); // requires loops

//        1. Print out a list of the even integers

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                System.out.print(numbers.get(i) + " ");
            }
        }

//        2. Print the difference between the largest and smallest value
        int max = 0;

        System.out.println();

        for (int i = 0; i < numbers.size(); i += 1) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        System.out.println(max);

        int min = max;

        for (int i = 0; i < numbers.size(); i += 1) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }
        System.out.println(min);

        System.out.println((max - min));

//        3. Print True if the list contains a 1 next to a 1 somewhere.

        for (int i = 0; i < numbers.size(); i += 1) {
            if (numbers.get(i) == 1 && numbers.get(i + 1) == 1) {
                System.out.println("True");
            }
        }

//        4. Print the sum of the numbers,

        int total = 0;

        for (int i = 0; i < numbers.size(); i += 1) {  // for each of the numbers in the array
            total += numbers.get(i);                     // do this function for each (add each number to the total)
            }
        System.out.println(total);                       // print the total to be shown


//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.

//          So [2, 7, 13, 2] would have sum of 9.

        int total2 = 0;

        for (int i = 0; i < numbers.size(); i += 1) {
            if (numbers.get(i) != 13) {   // if the current number is not 13
                total2 += numbers.get(i); // add it to the total
            } else {                      // otherwise (if it is 13)
                break;                    // bun the program
            }
        }
        System.out.println(total2);


        }

    }

