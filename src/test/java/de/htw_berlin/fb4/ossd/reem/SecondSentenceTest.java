package de.htw_berlin.fb4.ossd.reem;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SecondSentenceTest {

    @Test
    void testGet() {
        SecondSentence sentence = new SecondSentence();

        assertTrue(sentence.get().length() > 10);
    }
}
