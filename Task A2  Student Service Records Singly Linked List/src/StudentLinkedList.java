public class StudentLinkedList {
    private Node head;
    private int size;

    public StudentLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public int getSize() { return size; }
    public boolean isEmpty() { return head == null; }

    public void insertAtBeginning(Student student) {
        Node newNode = new Node(student);
        newNode.setNext(head);
        head = newNode;
        size++;
        System.out.println("[INSERT HEAD] Added: " + student.getName());
    }

    public void insertAtEnd(Student student) {
        Node newNode = new Node(student);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
        System.out.println("[INSERT END] Added: " + student.getName());
    }

    public void insertAtPosition(Student student, int position) {
        if (position < 1 || position > size + 1) {
            System.out.println("Invalid position " + position + ". Valid range: 1 to " + (size + 1));
            return;
        }

        if (position == 1) {
            insertAtBeginning(student);
            return;
        }

        Node newNode = new Node(student);
        Node current = head;
        for (int i = 1; i < position - 1; i++) {
            current = current.getNext();
        }

        newNode.setNext(current.getNext());
        current.setNext(newNode);
        size++;
        System.out.println("[INSERT POS " + position + "] Added: " + student.getName());
    }

    public boolean deleteStudent(String studentNo) {
        if (isEmpty()) {
            System.out.println("List is empty. Deletion failed.");
            return false;
        }

        if (head.getData().getStudentNo().equalsIgnoreCase(studentNo)) {
            System.out.println("[DELETED] " + head.getData().getName());
            head = head.getNext();
            size--;
            return true;
        }

        Node current = head;
        while (current.getNext() != null && !current.getNext().getData().getStudentNo().equalsIgnoreCase(studentNo)) {
            current = current.getNext();
        }

        if (current.getNext() != null) {
            System.out.println("[DELETED] " + current.getNext().getData().getName());
            current.setNext(current.getNext().getNext());
            size--;
            return true;
        }

        System.out.println("Student with ID " + studentNo + " not found.");
        return false;
    }

    public Student searchStudent(String studentNo) {
        Node current = head;
        while (current != null) {
            if (current.getData().getStudentNo().equalsIgnoreCase(studentNo)) {
                return current.getData();
            }
            current = current.getNext();
        }
        return null;
    }

    public void displayStudents() {
        if (isEmpty()) {
            System.out.println("\n--- Student Service Records: [EMPTY] ---");
            return;
        }

        System.out.println("\n=========================================================================");
        System.out.println("                        STUDENT SERVICE RECORDS                          ");
        System.out.println("=========================================================================");
        Node current = head;
        int index = 1;
        while (current != null) {
            System.out.printf("%2d. %s\n", index++, current.getData());
            current = current.getNext();
        }
        System.out.println("=========================================================================");
    }
}