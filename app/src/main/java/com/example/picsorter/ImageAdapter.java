package com.example.picsorter;

import android.content.Context;
import android.media.Image;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    // Constructor
    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.image_with_date, null);
        } else {
            view = convertView;
        }

        ImageView imgView = (ImageView) view.findViewById(R.id.picTaken);
        imgView.setLayoutParams(new GridView.LayoutParams(350, 350));
        imgView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imgView.setPadding(8, 8, 8, 8);
        TextView expireDateView = (TextView) view.findViewById(R.id.expireDate);

        imgView.setImageResource(mThumbIds[position]);
        expireDateView.setText(position);

        return view;
    }

    // Keep all Images in array
    public Integer[] mThumbIds = {
            R.drawable.sample0, R.drawable.sample3,
            R.drawable.sample4, R.drawable.sample5,
            R.drawable.sample6, R.drawable.sample7,
            R.drawable.sample0, R.drawable.sample1,
            R.drawable.sample2, R.drawable.sample3,
            R.drawable.sample4, R.drawable.sample5,
            R.drawable.sample6, R.drawable.sample7,
            R.drawable.sample0, R.drawable.sample1,
            R.drawable.sample2, R.drawable.sample3,
            R.drawable.sample4, R.drawable.sample5,
            R.drawable.sample6, R.drawable.sample7
    };
}
