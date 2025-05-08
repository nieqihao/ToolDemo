package com.nqh.toolutil;

import android.content.Context;
import android.widget.Toast;

/**
 * Description:
 * author: shangshengda
 * Date: 2025/5/8 15:19
 */
public class ToolUtilOne {
    /**
     * Displays a short duration Toast message.
     *
     * @param context the context to use
     * @param message the message to display
     */
    public static void showShort(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
