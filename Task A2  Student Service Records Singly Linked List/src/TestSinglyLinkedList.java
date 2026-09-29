public class TestSinglyLinkedList {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();

        System.out.println("--- 1. Testing Initial Insertions ---");
        list.insertAtEnd(new Student("221045678", "Maria", "Registration", 12));
        list.insertAtEnd(new Student("222034512", "Tomas", "Student Card", 5));
        list.insertAtEnd(new Student("221067341", "Simon", "Documents", 4));
        list.displayStudents();

        System.out.println("\n--- 2. Testing Insertion at Position 3 ---");
        list.insertAtPosition(new Student("223041876", "Ndapewa", "Fees", 8), 3);
        list.displayStudents();

        System.out.println("\n--- 3. Testing Deletion (Tomas: 222034512) ---");
        list.deleteStudent("222034512");
        list.displayStudents();

        System.out.println("\n--- 4. Testing Search ---");
        Student result = list.searchStudent("223041876");
        if (result != null) {
            System.out.println("Found: " + result);
        } else {
            System.out.println("Student not found.");
        }
    }
}
