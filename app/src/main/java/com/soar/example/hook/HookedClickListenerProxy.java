package com.soar.example.hook;

import android.view.View;
import android.widget.Toast;

/**
 * NAME：YONG_
 * Created at: 2019/4/22
 * Describe:
 */
public class HookedClickListenerProxy implements View.OnClickListener {

    private View.OnClickListener origin;

    public HookedClickListenerProxy(View.OnClickListener origin) {
        this.origin = origin;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(), "Hook Click Listener", Toast.LENGTH_SHORT).show();
        if (origin != null) {
            origin.onClick(v);
        }
    }
}
