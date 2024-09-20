package stack.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackMinMethodTest {

    @Test
    public void testStackPush() {

        StackMinMethod stack = new StackMinMethod();

        stack.push(10);
        Assertions.assertEquals(10, stack.root.value);
        Assertions.assertEquals(10, stack.minNode.value);
        stack.push(5);
        Assertions.assertEquals(5, stack.root.value);
        Assertions.assertEquals(5, stack.minNode.value);
        stack.push(8);
        Assertions.assertEquals(8, stack.root.value);
        Assertions.assertEquals(5, stack.minNode.value);
        stack.push(15);
        stack.push(3);
        stack.push(20);

        Assertions.assertEquals(3, stack.min());
    }

    @Test
    public void testStackPop() {

        StackMinMethod stack = new StackMinMethod();

        stack.push(10);
        stack.push(5);
        stack.push(8);
        stack.push(15);
        stack.push(3);
        stack.push(20);

        Assertions.assertEquals(20, stack.root.value);
        Assertions.assertEquals(3, stack.minNode.value);

        Assertions.assertEquals(3, stack.min());
        Assertions.assertEquals(20, stack.pop());

        Assertions.assertEquals(3, stack.min());
        Assertions.assertEquals(3, stack.root.value);
        Assertions.assertEquals(3, stack.minNode.value);

        Assertions.assertEquals(3, stack.pop());
        Assertions.assertEquals(5, stack.min());
        Assertions.assertEquals(15, stack.root.value);
        Assertions.assertEquals(5, stack.minNode.value);

    }
}