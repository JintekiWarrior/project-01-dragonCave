import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class storyGameTest {
    StoryGame storyGame;

    @BeforeEach
    void setUp() {
         storyGame = new StoryGame();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void storyStart()
    {
        String expected = "You are in aland full of dragons. In front of you, you see two caves.\n" +
                "In one cave, the dragon is friendly and will share his treasure with you. The other\n" +
                "dragon is greedy and hungry and will eat you on sight. Which cave will you go into?\n";
        String actual = storyGame.storyStart();
        assertEquals(expected, actual);
    }

    @Test
    void endingOne()
    {
        String expected = "You approach the cave...\n" +
                "It is dark and spooky...\n" +
                "A large dragon jumps out in front of you! He opens his jaws and..\n" +
                "Gobbles you down in one bite!";
        String actual = storyGame.endingOne();
        assertEquals(expected, actual);
    }

    @Test
    void endingTwo()
    {
        String expected = "You approach the cave...\n" +
                "It is dark and spooky...\n" +
                "A large dragon jumps out in front of you! He opens his jaws and..\n" +
                "Hands you all of the treasure.";
        String actual = storyGame.endingTwo();
        assertEquals(expected, actual);
    }
}