/*
 * Copyright 2017 LINE Corporation
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

package com.linecorp.centraldogma.server.internal.storage;

import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

import com.linecorp.centraldogma.common.Author;
import com.linecorp.centraldogma.common.CentralDogmaException;

public interface StorageManager<T> {

    void close(Supplier<CentralDogmaException> failureCauseSupplier);

    boolean exists(String name);

    T get(String name);

    default T create(String name, Author author) {
        return create(name, System.currentTimeMillis(), author);
    }

    T create(String name, long creationTimeMillis, Author author);

    Map<String, T> list();

    Set<String> listRemoved();

    void remove(String name);

    T unremove(String name);

    void ensureOpen();
}
