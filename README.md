# Strategy-Pattern

## **Problem:**
Need to implement a flexible sorting mechanism where different sorting algorithms (e.g., QuickSort, MergeSort) can be selected and used interchangeably at runtime without altering the client code.

## **Solution:**
Implemented the **Strategy Pattern**, which defines a family of algorithms, encapsulates each one, and makes them interchangeable. The Strategy Pattern allows the algorithm to vary independently from clients that use it, promoting flexibility and reusability.

### **Components:**
1. **SortStrategy Interface (`SortStrategy.java`):** Defines the sorting method.
2. **Concrete Strategies (`QuickSort.java`, `MergeSort.java`):** Implement the `SortStrategy` interface with specific algorithms.
3. **Context Class (`Sorter.java`):** Maintains a reference to a `SortStrategy` and delegates the sorting task to the strategy.
4. **Main Class (`Main.java`):** Demonstrates selecting and using different sorting strategies at runtime.

## **Usage:**
1. **Instantiate Sorter with a Strategy:** Create a `Sorter` object with a specific `SortStrategy` (e.g., `QuickSort`).
2. **Sort the Array:** Call the `sort` method to sort the array using the selected strategy.
3. **Change Strategy at Runtime:** Modify the `Sorter`'s strategy to another (e.g., `MergeSort`) and sort again.
