import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listA  =  new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            String atay = scanner.nextLine();
            listA.add(atay);
        }
        System.out.println(listA);
        ArrayList<String> listB = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String baha = scanner.nextLine();
            listB.add(baha);

        }
        System.out.println(listB);
        Collections.reverse(listB);
         ArrayList<String> listC = new ArrayList<>();

         listC.add(0,listA.get(0));
         listC.add(1,listB.get(0));
         listC.add(2,listA.get(1));
         listC.add(3,listB.get(1));
         listC.add(4,listA.get(2));
         listC.add(5,listB.get(2));
         listC.add(6,listA.get(3));
         listC.add(7,listB.get(3));
         listC.add(8,listA.get(4));
         listC.add(9,listB.get(4));

        System.out.println(listC);
        listC.sort(Comparator.comparing(String::length));


    }


}