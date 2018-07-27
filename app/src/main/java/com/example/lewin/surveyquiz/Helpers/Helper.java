package com.example.lewin.surveyquiz.Helpers;

import android.content.Context;
import android.content.res.Resources;

public class Helper {
    public static int resourceIdWith(Context context, String imageName) {
        Resources res = context.getResources();
        int resourceId = res.getIdentifier(imageName, "drawable", context.getPackageName());
        return resourceId;
    }
}
