package com.sqisland.android.espresso.hermetic;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ClockModule_ProvideClockFactory implements Factory<Clock> {
  private final ClockModule module;

  public ClockModule_ProvideClockFactory(ClockModule module) {
    this.module = module;
  }

  @Override
  public Clock get() {
    return Preconditions.checkNotNull(
        module.provideClock(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ClockModule_ProvideClockFactory create(ClockModule module) {
    return new ClockModule_ProvideClockFactory(module);
  }

  public static Clock proxyProvideClock(ClockModule instance) {
    return Preconditions.checkNotNull(
        instance.provideClock(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
