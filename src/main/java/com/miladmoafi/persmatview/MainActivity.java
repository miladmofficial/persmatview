package com.miladmoafi.persmatview;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PFTextView pfTextView = new PFTextView(this);
        setContentView(pfTextView);
    }
}
