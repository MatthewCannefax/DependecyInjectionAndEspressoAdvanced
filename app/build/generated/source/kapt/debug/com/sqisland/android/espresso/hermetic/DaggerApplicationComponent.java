package com.sqisland.android.espresso.hermetic;

import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerApplicationComponent implements ApplicationComponent {
  private ClockModule clockModule;

  private DaggerApplicationComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.clockModule = builder.clockModule;
  }

  @Override
  public void inject(MainActivity mainActivity) {
    injectMainActivity(mainActivity);
  }

  private MainActivity injectMainActivity(MainActivity instance) {
    MainActivity_MembersInjector.injectClock(
        instance, ClockModule_ProvideClockFactory.proxyProvideClock(clockModule));
    return instance;
  }

  public static final class Builder {
    private ClockModule clockModule;

    private Builder() {}

    public ApplicationComponent build() {
      if (clockModule == null) {
        throw new IllegalStateException(ClockModule.class.getCanonicalName() + " must be set");
      }
      return new DaggerApplicationComponent(this);
    }

    public Builder clockModule(ClockModule clockModule) {
      this.clockModule = Preconditions.checkNotNull(clockModule);
      return this;
    }
  }
}
