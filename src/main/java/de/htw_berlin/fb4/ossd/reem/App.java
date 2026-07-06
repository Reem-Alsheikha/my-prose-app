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

import de.htw_berlin.fb4.ossd.prose.ProseBuilder;

//mvn exec:java -> run

public class App {

    public static void main(String[] args) {

        ProseBuilder builder = new ProseBuilder();


        builder.register(new FirstSentence());
        builder.register(new SecondSentence());
        builder.register(new FunnySentence());
        builder.register(new SeriousSentence());


        System.out.println(builder.get());
    }
}