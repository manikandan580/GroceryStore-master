package com.quintus.labs.grocerystore.customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Grocery App
 * https://github.com/manikandan580/GroceryStore
 * Created on 9-Nov-2024.
 * Created by : Manikandan.G:- http://manikandan.g132003.gmail.com
 */

public class MyTextViewSansBold extends TextView {

    public MyTextViewSansBold(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public MyTextViewSansBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyTextViewSansBold(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/OpenSans-Semibold.ttf");
            setTypeface(tf);
        }
    }

}