/*
 * Copyright 2018 FIX Protocol Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 */

package io.fixprotocol.conga.session;

public class SequenceRange {
  private long count;
  private long fromSeqNo;
  private long timestamp;

  public long getCount() {
    return count;
  }

  public long getFromSeqNo() {
    return fromSeqNo;
  }

  public long getTimestamp() {
    return timestamp;
  }

  public SequenceRange count(long count) {
    this.count = count;
    return this;
  }

  public SequenceRange fromSeqNo(long fromSeqNo) {
    this.fromSeqNo = fromSeqNo;
    return this;
  }

  public SequenceRange timestamp(long timestamp) {
    this.timestamp = timestamp;
    return this;
  }
}