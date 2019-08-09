package com.sqisland.android.espresso.hermetic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/sqisland/android/espresso/hermetic/TestComponent;", "Lcom/sqisland/android/espresso/hermetic/ApplicationComponent;", "Builder", "app_debug"})
@dagger.Component()
public abstract interface TestComponent extends com.sqisland.android.espresso.hermetic.ApplicationComponent {
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/sqisland/android/espresso/hermetic/TestComponent$Builder;", "", "build", "Lcom/sqisland/android/espresso/hermetic/TestComponent;", "clock", "Lcom/sqisland/android/espresso/hermetic/Clock;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.sqisland.android.espresso.hermetic.TestComponent build();
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.sqisland.android.espresso.hermetic.TestComponent.Builder clock(@org.jetbrains.annotations.NotNull()
        com.sqisland.android.espresso.hermetic.Clock clock);
    }
}