package de.htw_berlin.fb4.ossd.reem;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class FunnySentenceTest {

    @Test
    void testGet() {
        FunnySentence sentence = new FunnySentence();

        assertTrue(sentence.get().length() > 10);
    }
}
