package com.soar.example.fix;

import android.content.Context;
import android.widget.Toast;

/**
 * NAME：YONG_
 * Created at: 2019/4/19
 * Describe: https://blog.csdn.net/lijia1201900857/article/details/79468986
 */
public class TestClass {
    public void showToast(String str, Context context) {
        Toast.makeText(context, "i am bug!" + 1 / 0, Toast.LENGTH_SHORT).show();
        //        Toast.makeText(context,"i am ok!",Toast.LENGTH_SHORT).show();
    }
}
