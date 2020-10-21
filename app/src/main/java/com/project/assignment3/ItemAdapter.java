package com.project.assignment3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import javax.security.auth.callback.Callback;

public class ItemAdapter extends ArrayAdapter<Item> {
    private int resourceId;
    public ItemAdapter(Context context,int textViewResourceId, List<Item> objects){
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Item item = getItem(position);
        View view;
        ViewHolder viewHolder;

        if (convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId, null);

            viewHolder = new ViewHolder();
            viewHolder.itemImage = (ImageView) view.findViewById(R.id.item_image);
            viewHolder.itemName = (TextView) view.findViewById(R.id.item_name);
            viewHolder.itemAPI = (TextView) view.findViewById(R.id.item_api);

            view.setTag(viewHolder);
        }else{
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }


        viewHolder.itemImage.setImageResource(item.getImg_url());
        viewHolder.itemName.setText(item.getName());

        viewHolder.itemAPI.setText(item.getApi());
        return view;
    }

    class ViewHolder{
        ImageView itemImage;
        TextView itemName;
        TextView itemAPI;
    }

}
