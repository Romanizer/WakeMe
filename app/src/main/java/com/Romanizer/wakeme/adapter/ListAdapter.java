package com.Romanizer.wakeme.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.Romanizer.wakeme.R;

public class ListAdapter extends BaseAdapter {

    private Context context;
    private String[] plantNames;
    private String[] imgUrl;
    private static LayoutInflater inflater = null;

    public ListAdapter(Context context, String[] names, String[] imgUrl) {
        // TODO Auto-generated constructor stub
        this.context = context;
        this.plantNames = names;
        this.imgUrl = imgUrl;
        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    //Getter for Image Url for plant at position x
    public String getImgUrl(int position){
        return imgUrl[position];
    }

    //Getter for Name of plant (Used to get Name of position)
    public String getName(int position){
        return plantNames[position];
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        if(plantNames != null) return plantNames.length;
        return 0;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return imgUrl[position];
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public Context getContext() {
        return context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View vi = convertView;
        //if (vi == null) vi = inflater.inflate(R.layout.plant_entry, null);

        //TODO stuff2

        return vi;
    }
}