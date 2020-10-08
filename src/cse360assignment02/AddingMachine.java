// Name: Tianchen Mu
// ASU ID: 1215686342
// Lecture Time: Thu 9am - 10:15am
// Project: assignment1, version control
// Github URL: https://github.com/NilaBlueshirt/CSE360-fall2020

package cse360assignment02;

public class AddingMachine {
    private int total;
    private String history;

    public AddingMachine() {
        total = 0;  // not needed - included for clarity
        history = "0";
    }

    public int getTotal() {
        return total;
    }

    public void add(int value) {
        total = total + value;
        history = history + " + " + value;
    }

    public void subtract(int value) {
        total = total - value;
        history = history + " - " + value;
    }

    public String toString() {
        return history;
    }

    public void clear() {
        total = 0;
        history = "0";
    }

    public static void main(String[] args) {
        AddingMachine test = new AddingMachine();
        test.add(4);
        test.subtract(2);
        test.add(5);
        System.out.println("Total: " + test.getTotal());
        System.out.println(test.toString());
    }
}