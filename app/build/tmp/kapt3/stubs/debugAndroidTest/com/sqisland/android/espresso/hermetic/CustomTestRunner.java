package com.sqisland.android.espresso.hermetic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016\u00a8\u0006\u000b"}, d2 = {"Lcom/sqisland/android/espresso/hermetic/CustomTestRunner;", "Landroid/support/test/runner/AndroidJUnitRunner;", "()V", "newApplication", "Landroid/app/Application;", "cl", "Ljava/lang/ClassLoader;", "className", "", "context", "Landroid/content/Context;", "app_debug"})
public final class CustomTestRunner extends android.support.test.runner.AndroidJUnitRunner {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Application newApplication(@org.jetbrains.annotations.Nullable()
    java.lang.ClassLoader cl, @org.jetbrains.annotations.Nullable()
    java.lang.String className, @org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        return null;
    }
    
    public CustomTestRunner() {
        super();
    }
}