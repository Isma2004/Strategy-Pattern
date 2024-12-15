package strategy;

public class Sorter {
    private SortStrategy strategy;

    // Constructor
    public Sorter(SortStrategy strategy) {
        this.strategy = strategy;
    }

    // Set a new strategy at runtime
    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    // Sort the array using the current strategy
    public void sort(int[] numbers) {
        strategy.sort(numbers);
    }
}