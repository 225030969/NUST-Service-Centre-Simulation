import java.util.Scanner;

public class StudentServiceSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentLinkedList serviceList = new StudentLinkedList();

        serviceList.insertAtEnd(new Student("225030001", "Klaus", "Registration", 12));
        serviceList.insertAtEnd(new Student("225030002", "Martha", "Financial Aid", 8));
        serviceList.insertAtEnd(new Student("225030003", "Johanna", "Transcripts", 15));
        serviceList.insertAtEnd(new Student("225030004", "David", "ID Card Issue", 5));

        boolean running = true;

        while (running) {
            System.out.println("\n=================================================");
            System.out.println("   STUDENT SERVICE CENTER MANAGEMENT SYSTEM      ");
            System.out.println("=================================================");
            System.out.println(" 1. Add Student Record (Insert at End)");
            System.out.println(" 2. Add Student Record (Insert at Position)");
            System.out.println(" 3. Delete Student Record by Student No");
            System.out.println(" 4. Search Student Record");
            System.out.println(" 5. Display All Active Student Records");
            System.out.println(" 6. Evaluate Expression (Postfix Stack)");
            System.out.println(" 7. Compute Daily Service Statistics (Array)");
            System.out.println(" 8. Benchmark Sorting Algorithms");
            System.out.println(" 0. Exit System");
            System.out.println("=================================================");
            System.out.print("Select an option (0-8): ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.print("Enter Student No: ");
                    String no1 = scanner.nextLine();
                    System.out.print("Enter Full Name: ");
                    String name1 = scanner.nextLine();
                    System.out.print("Enter Service Type: ");
                    String service1 = scanner.nextLine();
                    System.out.print("Enter Estimated Time (mins): ");
                    int time1 = Integer.parseInt(scanner.nextLine());
                    serviceList.insertAtEnd(new Student(no1, name1, service1, time1));
                    break;

                case "2":
                    System.out.print("Enter Student No: ");
                    String no2 = scanner.nextLine();
                    System.out.print("Enter Full Name: ");
                    String name2 = scanner.nextLine();
                    System.out.print("Enter Service Type: ");
                    String service2 = scanner.nextLine();
                    System.out.print("Enter Estimated Time (mins): ");
                    int time2 = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter Position (1 to " + (serviceList.getSize() + 1) + "): ");
                    int pos = Integer.parseInt(scanner.nextLine());
                    serviceList.insertAtPosition(new Student(no2, name2, service2, time2), pos);
                    break;

                case "3":
                    System.out.print("Enter Student No to Delete: ");
                    String delNo = scanner.nextLine();
                    serviceList.deleteStudent(delNo);
                    break;

                case "4":
                    System.out.print("Enter Student No to Search: ");
                    String searchNo = scanner.nextLine();
                    Student found = serviceList.searchStudent(searchNo);
                    if (found != null) {
                        System.out.println("Record Found: " + found);
                    } else {
                        System.out.println("Student record with No: " + searchNo + " not found.");
                    }
                    break;

                case "5":
                    serviceList.displayStudents();
                    break;

                case "6":
                    System.out.print("Enter Postfix Expression (e.g. '5 3 + 2 *'): ");
                    String expr = scanner.nextLine();
                    try {
                        double val = PostfixEvaluator.evaluate(expr);
                        System.out.println("Evaluation Result: " + val);
                    } catch (Exception e) {
                        System.out.println("Error evaluating expression: " + e.getMessage());
                    }
                    break;

                case "7":
                    int[] dailyTimes = {12, 5, 8, 4, 15, 20, 9, 11, 3, 14};
                    DailyStatistics.computeAndDisplayStatistics(dailyTimes);
                    break;

                case "8":
                    int[] sampleArray = {17, 5, 23, 8, 14, 3, 11, 20, 6, 9};
                    System.out.println("\n--- Running Selection Sort ---");
                    SelectionSortDemo.selectionSort(sampleArray.clone());
                    System.out.println("\n--- Running Insertion Sort ---");
                    InsertionSortDemo.insertionSort(sampleArray.clone());
                    System.out.println("\n--- Running Merge Sort ---");
                    int[] mergeTarget = sampleArray.clone();
                    MergeSortDemo.mergeSort(mergeTarget, 0, mergeTarget.length - 1);
                    System.out.println("Merge Sort Result: " + java.util.Arrays.toString(mergeTarget));
                    break;

                case "0":
                    running = false;
                    System.out.println("Exiting Student Service Management System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid selection. Please choose a number between 0 and 8.");
            }
        }
        scanner.close();
    }
}

