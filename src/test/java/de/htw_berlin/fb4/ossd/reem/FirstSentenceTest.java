package de.htw_berlin.fb4.ossd.reem;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class FirstSentenceTest {

    @Test
    void testGet() {
        FirstSentence sentence = new FirstSentence();

        assertTrue(sentence.get().length() > 10);
    }
}
