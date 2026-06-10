import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.println("Enter 5 elements:");

        for(int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Original List: " + list);

        int middleIndex = list.size() / 2;
        int middleElement = list.get(middleIndex);

        System.out.println("Middle Element: " + middleElement);

        list.remove(middleIndex);

        System.out.println("After Removing Middle Element: " + list);

        System.out.print("Enter element to search: ");
        int search = sc.nextInt();

        if(list.contains(search)) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }

        Collections.sort(list);

        System.out.println("Sorted List: " + list);

        sc.close();
    }
}