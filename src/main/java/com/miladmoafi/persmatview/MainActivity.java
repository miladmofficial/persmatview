package com.miladmoafi.persmatview;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Draw Custom TextView in Context
        PFTextView pfTextView = new PFTextView(this);
        setContentView(pfTextView);
    }
}
