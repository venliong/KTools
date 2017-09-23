package com.jiangkang.tools.utils;

import android.content.Context;
import android.widget.Toast;

import com.jiangkang.tools.King;
import com.jiangkang.tools.R;
import com.jiangkang.tools.widget.SuperToast;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by jiangkang on 2017/9/8.
 */

public class ToastUtils {


    public static void showShortToast(String msg){
        Toast.makeText(King.getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }

    public static void showLongToast(String msg){
        Toast.makeText(King.getApplicationContext(), msg, Toast.LENGTH_LONG).show();
    }


    public static void showToast(String msg, int duration){
        final Timer timer = new Timer();
        final Toast toast = Toast.makeText(King.getApplicationContext(),msg,Toast.LENGTH_LONG);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                toast.show();
            }
        },0,3500);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                toast.cancel();
                timer.cancel();
            }
        },duration);

    }

}
