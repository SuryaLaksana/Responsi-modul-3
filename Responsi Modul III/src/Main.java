public class Main {
    public static void main(String[] args) {
        Medium medium = new Medium();
        System.out.println("Linked List sebelum sorting:");
        medium.add(0);  medium.add(67);  medium.add(98);  medium.add(33);  medium.add(1);
        medium.add(92); medium.add(67);  medium.add(89);  medium.add(1);   medium.add(40);
        medium.add(20); medium.add(52);  medium.add(14);  medium.add(50);  medium.add(77);
        medium.add(6);  medium.add(27);  medium.add(54);  medium.add(36);  medium.add(8);
        medium.add(67); medium.add(13);  medium.add(95);  medium.add(37);  medium.add(16);
        medium.add(74); medium.add(73);  medium.add(81);  medium.add(13);  medium.add(40);
        medium.add(36); medium.add(6);   medium.add(23);  medium.add(44);  medium.add(62);
        medium.add(35); medium.add(56);  medium.add(65);  medium.add(5);   medium.add(85);
        medium.add(17); medium.add(27);  medium.add(67);  medium.add(74);  medium.add(70);
        medium.add(60); medium.add(59);  medium.add(23);  medium.add(71);  medium.add(64);
        medium.add(99); medium.add(39);  medium.add(6);   medium.add(88);  medium.add(10);
        medium.add(88); medium.add(44);  medium.add(24);  medium.add(22);  medium.add(88);
        medium.add(73); medium.add(14);  medium.add(38);  medium.add(27);  medium.add(9);
        medium.add(82); medium.add(1);   medium.add(17);  medium.add(51);  medium.add(50);
        medium.add(27); medium.add(88);  medium.add(43);  medium.add(3);   medium.add(95);
        medium.add(6);  medium.add(3);   medium.add(51);  medium.add(93);  medium.add(37);
        medium.add(9);  medium.add(59);  medium.add(89);  medium.add(17);  medium.add(82);
        medium.add(41); medium.add(70);  medium.add(14);
        medium.display();
        System.out.println();

        long startTime, endTime;
        double waktu;

        System.out.print("Waktu eksekusi Selection Sort:");
        startTime = System.nanoTime();
        medium.selectionSort();
        endTime = System.nanoTime();
        waktu = (double)(endTime - startTime) / 1000000000.0;
        System.out.printf(" %.9f detik%n%n", waktu);
        System.out.print("Waktu eksekusi Insertion Sort:");
        startTime = System.nanoTime();
        medium.insertionSort();
        endTime = System.nanoTime();
        waktu = (double)(endTime - startTime) / 1000000000.0;
        System.out.printf(" %.9f detik%n", waktu);

        System.out.println("Linked List setelah sorting:");
        medium.insertionSort();
        medium.display();
        System.out.println();

        System.out.print("Waktu eksekusi Linear Search:");
        startTime = System.nanoTime();
        endTime = System.nanoTime();
        waktu = (double)(endTime - startTime) / 1000000000.0;
        System.out.printf(" %.9f detik%n", waktu);
        System.out.print("Linear Search -> ");
        medium.linearSearch(50);
        System.out.println();

        System.out.print("Waktu eksekusi Binary Search:");
        startTime = System.nanoTime();
        endTime = System.nanoTime();
        waktu = (double)(endTime - startTime) / 1000000000.0;
        System.out.printf(" %.9f detik%n", waktu);
        System.out.print("Binary Search -> ");
        medium.binarySearch(89);
    }
}
