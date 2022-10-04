import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void constructorTest(){

        Node test1 = new Node( "test1");
        Node test2 = new Node( "test2");
        Node test3 = new Node( "test3");
        test1.left = test2;
        test1.right = test3;

        assertTrue( test1.data.equals("test1"));
        assertTrue( test1.left.data.equals("test2"));
        assertTrue( test1.right.data.equals("test3"));

    }
}