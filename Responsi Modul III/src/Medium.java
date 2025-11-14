public class Medium {
    private Node head;

    public Medium() {
        this.head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void selectionSort() {
        for (Node i = head; i != null; i = i.next) {
            Node minNode = i;
            for (Node j = i.next; j != null; j = j.next) {
                if (j.data < minNode.data) {
                    minNode = j;
                }
            }
            if (minNode != i) {
                int temp = i.data;
                i.data = minNode.data;
                minNode.data = temp;
            }
        }
    }

    public void insertionSort() {
        if (head == null || head.next == null) {
            return;
        }

        Node sorted = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            sorted = sortedInsert(sorted, current);
            current = next;
        }

        head = sorted;
    }
        
    public void binarySearch(int indeks) {
        int left = 0;
        int right = getSize() - 1;
        boolean found = false;

        while (left <= right) {
            int mid = (left + right) / 2;
            Node midNode = getNodeAt(mid);

            if (midNode.data == indeks) {
                System.out.println("Target: " + indeks + " ada di indeks: " + mid);
                found = true;
                break;
            } else if (midNode.data < indeks) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Target: " + indeks + " tidak ditemukan.");
        }
    }

    public void linearSearch(int indeks) {
        Node current = head;
        int index = 0;
        boolean found = false;

        while (current != null) {
            if (current.data == indeks) {
                System.out.println("Target: " + indeks + " ada di indeks: " + index);
                found = true;
                break;
            }
            current = current.next;
            index++;
        }

        if (!found) {
            System.out.println("Target: " + indeks + " tidak ditemukan.");
        }
    }

    public int getSize() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    private Node getNodeAt(int index) {
        Node current = head;
        int count = 0;
        while (current != null && count < index) {
            current = current.next;
            count++;
        }
        return current;
    }

    private Node sortedInsert(Node sorted, Node newNode) {
        if (sorted == null || sorted.data >= newNode.data) {
            newNode.next = sorted;
            return newNode;
        } else {
            Node current = sorted;
            while (current.next != null && current.next.data < newNode.data) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            return sorted;
        }
    }

    public void display() {
    Node current = head;
    while (current != null) {
        System.out.print(current.data);
        if (current.next != null) {
            System.out.print(" -> ");
        }
        current = current.next;
        }
    System.out.println();
    }
}
