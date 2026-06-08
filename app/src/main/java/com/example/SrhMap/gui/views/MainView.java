package com.example.SrhMap.gui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class MainView extends View {

    public MainView(Context context) {
        this(context, null);
    }

    public MainView(
            Context context,
            @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MainView(
            Context context,
            @Nullable AttributeSet attrs,
            int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}