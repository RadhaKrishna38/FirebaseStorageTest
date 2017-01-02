package tdevm.storagetest.adapter;

import android.content.ContentValues;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Tridev on 25-11-2016.
 */
public class GridAdapter extends BaseAdapter {
     Context context;
    String string = "1234567890";

    public GridAdapter(Context c){
        this.context = c;
    }


    @Override
    public int getCount() {
        return string.length();
    }

    @Override
    public Object getItem(int i) {
        return string.charAt(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = new TextView(context);
        textView.setText(String.valueOf(string.charAt(i)));
        return view;
    }
}
