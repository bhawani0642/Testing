package com.acadgild.androidtesting;

import android.content.Context;
import android.content.Intent;

import com.acadgild.androidtesting.main.MainActivity;

/**
 * Created by Pri on 8/31/2017.
 */

public class ActivityUtil {
    private Context context;

    public ActivityUtil(Context context) {
        this.context = context;
    }

    public void startMainActivity() {
        context.startActivity(new Intent(context, MainActivity.class));
    }
}
