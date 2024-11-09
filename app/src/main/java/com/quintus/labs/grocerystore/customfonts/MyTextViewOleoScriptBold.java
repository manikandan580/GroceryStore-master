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

public class MyTextViewOleoScriptBold extends TextView {

    public MyTextViewOleoScriptBold(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public MyTextViewOleoScriptBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyTextViewOleoScriptBold(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/OleoScript-Bold.ttf");
            setTypeface(tf);
        }
    }

}