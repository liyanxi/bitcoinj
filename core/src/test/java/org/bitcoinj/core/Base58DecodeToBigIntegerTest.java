/*
 * Copyright 2011 Google Inc.
 * Copyright 2014 Andreas Schildbach
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.bitcoinj.core;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Base58DecodeToBigIntegerTest {

    @Test
    public void testDecodeToBigInteger() {
        byte[] input = Base58.decode("129");
        assertEquals(Utils.bytesToBigInteger(input), Base58.decodeToBigInteger("129"));
    }
}
