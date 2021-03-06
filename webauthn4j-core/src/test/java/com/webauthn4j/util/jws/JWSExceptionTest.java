/*
 * Copyright 2002-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.webauthn4j.util.jws;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

@SuppressWarnings("ThrowableNotThrown")
public class JWSExceptionTest {

    @Test
    public void constructor_test(){
        RuntimeException cause = new RuntimeException();
        JWSException exception;

        exception = new JWSException("dummy", cause);
        assertThat(exception.getMessage()).isEqualTo("dummy");
        assertThat(exception.getCause()).isEqualTo(cause);

        exception = new JWSException("dummy");
        assertThat(exception.getMessage()).isEqualTo("dummy");
        assertThat(exception.getCause()).isNull();

        exception = new JWSException(cause);
        assertThat(exception.getMessage()).isEqualTo(cause.toString());
        assertThat(exception.getCause()).isEqualTo(cause);
    }

}