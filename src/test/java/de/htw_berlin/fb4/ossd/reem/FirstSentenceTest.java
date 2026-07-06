/*
 * Copyright (c) 2026 Reem Alsheikha
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * SPDX-License-Identifier: Apache-2.0
 */
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
