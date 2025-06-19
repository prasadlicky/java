import java.util.Arrays;
import java.util.Comparator;

class Item {
    int value, weight;

    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}

public class main {

    public static double fractionalKnapsack(int capacity, Item[] items) {
        Arrays.sort(items, Comparator.comparingDouble(item -> (double) item.value / item.weight));

        double totalValue = 0.0;
        int currentWeight = 0;

        for (int i = items.length - 1; i >= 0; i--) {
            if (currentWeight + items[i].weight <= capacity) {
                currentWeight += items[i].weight;
                totalValue += items[i].value;
            } else {
                int remainingCapacity = capacity - currentWeight;
                totalValue += items[i].value * ((double) remainingCapacity / items[i].weight);
                break;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        Item[] items = {
                new Item(60, 10),
                new Item(100, 20),
                new Item(120, 30)
        };

        int capacity = 50;

        double maxTotalValue = fractionalKnapsack(capacity, items);

        System.out.println("Maximum value: " + maxTotalValue);
    }
}
