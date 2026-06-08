package com.example.SrhMap.gui.fragments;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.SrhMap.R;

public class MapFragment extends View {

    public MapFragment(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // Your custom drawing code here
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        canvas.drawCircle(200, 200, 100, paint);
    }
}