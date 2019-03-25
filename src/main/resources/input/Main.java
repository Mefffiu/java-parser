package input;

import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Main {
    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello world!");

        for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i);
        }

        while (true) {
            System.out.println("...");
        }
    }
}