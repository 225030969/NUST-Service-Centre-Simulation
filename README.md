# NUST-Service-Centre-Simulation
## 1. Group Information
| # | Student Number | Full Name |
|---|----------------|-----------|
| 1 |  225030969     | Siteketa Marthin  |
| 2 |   225172569    | Othello Joseph|
| 3 |    224035339   | Daven   Mutande  |
| 4 |   225171856    | Shaida Mutendere |
| 5 |   224072528    | Romeo Beukes|
| 6 | 225148374      |  Karaererue Mberiuana|
| 7 | 225071940      | Tjameya Petrus |
| 8 | 225049384      |Sacha Blockstein |    

**Submitted by: [225030969] – [Marthin Siteketa]**

**GitHub Repository:**https://github.com/225030969/NUST-Service-Centre-Simulation/edit/main/README.md

---

## 2. What This Project Contains

| File | Part | Purpose |
|------|------|---------|
| `Student.java` | — | Data holder: Student No, Name, Service Type, Estimated Service Time |
| `StudentQueue.java` | A1 | Custom FIFO queue — `enqueue`, `dequeue`, `peek`, `isEmpty`, `displayQueue` |
| `StudentServiceList.java` | A2 | Custom singly linked list — `insertStudent`, `deleteStudent`, `searchStudent`, `displayStudents` |
| `PostfixEvaluator.java` | A3 | Custom array-based stack — `push`, `pop`, `peek` + postfix evaluation (independent exercise) |
| `DailyStatistics.java` | A4 | Array processing for the six daily statistics |
| `Metrics.java` | B/C | Counts data-value comparisons, swaps, shifts and execution time |
| `Sorters.java` | B | Selection, Insertion, Merge and Quick Sort, all written from scratch |
| `SortingExperiment.java` | C | Timed experiment on 20/50/100/500 elements + the almost-sorted test |
| `PartDemo.java` | A + B | Runs every required demonstration and trace in one go |
| `ServiceCentre.java` | D | The integrated menu-driven system |
| `PSEUDOCODE.md` | E | Pseudocode for every required operation |

No built-in `sort()`, `java.util.Stack`, `java.util.Queue` or `java.util.LinkedList`
is used anywhere. `java.util.Scanner` is used only for keyboard input and
`java.util.Random` only to generate the Part C test data — neither replaces a
required data structure or algorithm.



### Run

There are three entry points. Run them from the same folder:
# 1. The integrated service-centre system (PART D) — this is the main program
java ServiceCentre

# 2. All Part A and Part B demonstrations and traces, for the report screenshots
java PartDemo

# 3. The Part C sorting experiment on its own
java SortingExperiment

# 4. The independent postfix stack exercise (Task A3) on its own
java PostfixEvaluator


## 4. Using the Menu (Part D)

```
========================================
        CAMPUS SERVICE CENTRE
========================================
 1. Add student to waiting queue
 2. Serve next student (remove from queue)
 3. Display waiting students
 4. Add student service record (Linked List)
 5. Display student service records
 6. Search for student record
 7. Remove student record
 8. Display daily statistics
 9. Sort service times
10. Run sorting experiment
11. Exit
========================================
```

| Option | Structure / Operation used |
|--------|----------------------------|
| 1 | Queue — `enqueue()` |
| 2 | Queue — `dequeue()`; the served student's time is also stored in the **array** and a record is added to the **linked list** |
| 3 | Queue — traversal / display |
| 4 | Singly Linked List — insertion (beginning / end / specified position) |
| 5 | Singly Linked List — traversal / display |
| 6 | Singly Linked List — linear search by student number |
| 7 | Singly Linked List — deletion by student number |
| 8 | Array processing — the six daily statistics |
| 9 | Selection / Insertion / Merge / Quick Sort on the recorded service times |
| 10 | The full Part C experiment (20, 50, 100, 500 + almost-sorted) |

The program starts with four sample students already in the waiting queue so it
can be demonstrated immediately. Serve a few students with option 2, then try
options 5, 8 and 9 to see the linked list, array and sorting components working
on real data.

## 6. Division of Work

| Member | Parts worked on |
|--------|-----------------|
|Shaida Mutendere  225171856  | Task A1 (Queue)|
|  | Task A2 (Linked List), Part D menu options 4–7 |
|Romeo Beukes   224072528  | Task A3 (Stack) and Task A4 (Array statistics) |
| Siteketa Marthin 225030969 | Tasks B1 and B2 (Selection and Insertion Sort) |
| Siteketa Marthin 225030969 | Tasks B3 and B4 (Merge and Quick Sort) |
|Siteketa Marthin 225030969| Part C experiment, Part E pseudocode, Part F report |

All members are responsible for understanding the complete submitted solution.
