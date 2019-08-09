package com.sqisland.android.espresso.hermetic;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<Clock> clockProvider;

  public MainActivity_MembersInjector(Provider<Clock> clockProvider) {
    this.clockProvider = clockProvider;
  }

  public static MembersInjector<MainActivity> create(Provider<Clock> clockProvider) {
    return new MainActivity_MembersInjector(clockProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectClock(instance, clockProvider.get());
  }

  public static void injectClock(MainActivity instance, Clock clock) {
    instance.clock = clock;
  }
}
