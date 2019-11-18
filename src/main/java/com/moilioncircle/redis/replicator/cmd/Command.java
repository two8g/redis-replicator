/*
 * Copyright 2016-2018 Leon Chen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.moilioncircle.redis.replicator.cmd;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.moilioncircle.redis.replicator.event.Event;

/**
 * @author Leon Chen
 * @since 2.1.0
 */
public interface Command extends Event {
    @JsonProperty("command")
    default String getCommandName() {
        String s = getClass().getSimpleName().toUpperCase();
        return s.substring(0, s.length() - 7);
    }
}