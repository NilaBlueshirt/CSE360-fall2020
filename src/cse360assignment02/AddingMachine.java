// Name: Tianchen Mu
// ASU ID: 1215686342
// Lecture Time: Thu 9am - 10:15am
// Project: assignment1, version control

package cse360assign
public class AddingMachine {
    private int total;
    private int add_value;
    private int sub_value;

    public AddingMachine () {
        total = 0;  // not needed - included for clarity
        add_value = 0;
        sub_value = 0;
    }

    public int getTotal () {
        return total;
    }

    public void add (int value) {
        total += value;

    }

    public void subtract (int value) {
        total -= value;
    }

    public String toString () {
        return "";
    }

    public void clear() {
    }
}
