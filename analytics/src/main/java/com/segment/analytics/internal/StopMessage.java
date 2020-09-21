package com.segment.analytics.internal;

import com.segment.analytics.messages.Message;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Date;
import java.util.Map;

class StopMessage implements Message {
  static final StopMessage STOP = new StopMessage();

  private StopMessage() {}

  @Nonnull
  @Override
  public Type type() {
    throw new UnsupportedOperationException();
  }

  @Nonnull
  @Override
  public String messageId() {
    throw new UnsupportedOperationException();
  }

  @Nonnull
  @Override
  public Date timestamp() {
    throw new UnsupportedOperationException();
  }

  @Nullable
  @Override
  public Map<String, ?> context() {
    throw new UnsupportedOperationException();
  }

  @Nullable
  @Override
  public String anonymousId() {
    throw new UnsupportedOperationException();
  }

  @Nullable
  @Override
  public String userId() {
    throw new UnsupportedOperationException();
  }

  @Nullable
  @Override
  public Map<String, Object> integrations() {
    throw new UnsupportedOperationException();
  }

  @Override
  public String toString() {
    return "FlushMessage{}";
  }
}
