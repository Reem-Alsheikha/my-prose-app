package de.htw_berlin.fb4.ossd.reem;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class SeriousSentenceTest {

    @Test
    void testGet() {
        SeriousSentence sentence = new SeriousSentence();

        assertTrue(sentence.get().length() > 10);
    }
}
