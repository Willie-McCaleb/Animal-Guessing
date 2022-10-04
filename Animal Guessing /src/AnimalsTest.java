import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnimalsTest {

    @Test
    void createTreeTest() {
        Animals.createTree();

        assertTrue(Animals.root.data.equals("Does it live in land? "));
        assertTrue(Animals.root.left.data.equals("Is it a mammal? "));
        assertTrue(Animals.root.left.left.data.equals("Does the male carry the eggs? "));
        assertTrue(Animals.root.left.right.data.equals("Seal"));
        assertTrue(Animals.root.left.left.left.data.equals("Are they colorful? "));
        assertTrue(Animals.root.left.left.right.data.equals("Seahorse"));
        assertTrue(Animals.root.left.left.left.left.data.equals("Is it called a small-mouth ,big-mouth, or spotted within their species name? "));
        assertTrue(Animals.root.left.left.left.right.data.equals("Are they peaceful? "));
        assertTrue(Animals.root.left.left.left.right.left.data.equals("Guppy"));
        assertTrue(Animals.root.left.left.left.right.right.data.equals("Goldfish"));
        assertTrue(Animals.root.left.left.left.left.left.data.equals("Tarpon"));
        assertTrue(Animals.root.left.left.left.left.right.data.equals("Bass"));
        assertTrue(Animals. root.right.data.equals("Can it fly? "));
        assertTrue(Animals.root.right.left.data.equals("Is it poisonous to eat? "));
        assertTrue(Animals.root.right.left.left.data.equals("Rabbit "));
        assertTrue(Animals.root.right.left.right.data.equals("Cane Toad"));
        assertTrue(Animals.root.right.right.data.equals("Do it eat roadkill? "));
        assertTrue(Animals.root.right.right.left.data.equals("woodpecker"));
        assertTrue(Animals.root.right.right.right.data.equals("Buzzard"));
    }
}

