package structural.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Implement a decorator pattern for a TextEditor class that manipulates text.
 * * The base class should have a String getText() method that returns the initial text.
 * Add decorators to apply transformations such as uppercase, lowercase, and capitalizing the first letter of each word.
 * Write methods to apply these transformations in any order and return the transformed text.
 *
 * Following should return HELLO WORLD
 *
 * TextEditor textEditor = new UppercaseDecorator(new CapitalizeDecorator(new LowercaseDecorator
 * (new SimpleTextEditor("hELLO wORLD"))));
 * textEditor.getText();
 */
class DecoratorClientTest {

    @Test
    void testUppercaseDecorator() {
        TextEditor textEditor = new UppercaseDecorator(new SimpleTextEditor("Hello World"));
        assertEquals("HELLO WORLD", textEditor.getText());
    }

    @Test
    void testLowercaseDecorator() {
        TextEditor textEditor = new LowercaseDecorator(new SimpleTextEditor("Hello World"));
        assertEquals("hello world", textEditor.getText());
    }

    @Test
    void testCapitalizeDecorator() {
        TextEditor textEditor = new CapitalizeDecorator(new SimpleTextEditor("hello world"));
        assertEquals("Hello World", textEditor.getText());
    }

    @Test
    void testCombinedDecorators() {
        TextEditor textEditor = new UppercaseDecorator(new CapitalizeDecorator(new LowercaseDecorator(new SimpleTextEditor("hELLO wORLD"))));
        assertEquals("HELLO WORLD", textEditor.getText());
    }

}