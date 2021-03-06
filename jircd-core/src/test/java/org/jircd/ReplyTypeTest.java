/*
 * Copyright (c) 2010 Guillermo Castro
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jircd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/** @author <a href="mailto:github@javageek.org">Guillermo Castro</a> */
public class ReplyTypeTest implements TestConstants {

    @Test
    public void testFromCodeString() throws Exception {
        ReplyType type = ReplyType.fromCode(CODE_STR);
        assertEquals(ReplyType.RPL_WELCOME, type);
    }

    @Test
    public void testFromInvalidCodeString() throws Exception {
        ReplyType type = ReplyType.fromCode(INVALID_CODE_STR);
        assertEquals(ReplyType.UNKNOWN, type);
    }

    @Test
    public void testFromCode() throws Exception {
        ReplyType type = ReplyType.fromCode(CODE);
        assertEquals(ReplyType.RPL_WELCOME, type);
    }

    @Test
    public void testFromInvalidCode() throws Exception {
        ReplyType type = ReplyType.fromCode(INVALID_CODE);
        assertEquals(ReplyType.UNKNOWN, type);
    }

    @Test
    public void testToString() throws Exception {
        assertEquals(CODE_STR, ReplyType.RPL_WELCOME.toString());
        assertEquals(VERSION_CODE_STR, ReplyType.RPL_VERSION.toString());
    }
}
