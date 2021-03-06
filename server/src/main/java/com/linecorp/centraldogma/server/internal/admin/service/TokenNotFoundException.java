/*
 * Copyright 2018 LINE Corporation
 *
 * LINE Corporation licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.linecorp.centraldogma.server.internal.admin.service;

public class TokenNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 7795045154004749414L;

    public TokenNotFoundException() {}

    public TokenNotFoundException(String message) {
        super(message);
    }

    public TokenNotFoundException(Throwable cause) {
        super(cause);
    }

    public TokenNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    protected TokenNotFoundException(String message, Throwable cause, boolean enableSuppression,
                                     boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
