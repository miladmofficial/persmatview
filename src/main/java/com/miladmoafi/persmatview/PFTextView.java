package com.miladmoafi.persmatview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class PFTextView extends TextView {

    public PFTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initialize();
    }

    public PFTextView(Context context) {
        super(context);
        initialize();
    }

    private void initialize(){
        this.setText(ConvertPersian(this.getText().toString()));
    }

    //Milad Moafi
    private String ConvertPersian(String string) {
        return string.replaceAll("0", "۰")
                .replaceAll("1", "۱")
                .replaceAll("2", "۲")
                .replaceAll("3", "۳")
                .replaceAll("4", "۴")
                .replaceAll("5", "۵")
                .replaceAll("6", "۶")
                .replaceAll("7", "۷")
                .replaceAll("8", "۸")
                .replaceAll("9", "۹");

    }
}
