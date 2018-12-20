package com.example.sahithi.dictionary;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
public class MyListAdapter extends ArrayAdapter<ListItem> {

    private Context context;

    public MyListAdapter(Activity context,ArrayList<ListItem> list){
        super(context,0,list);
        this.context=context;
    }

    @Override
    public View getView(int position,View view,ViewGroup parent) {

        View listItemView=view;
        if(listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_itemlayout,parent,false);

        }

        final ListItem listItem=getItem(position);

        TextView textView=(TextView)listItemView.findViewById(R.id.word_name);
        textView.setText(listItem.getName());
        return listItemView;

    }
}