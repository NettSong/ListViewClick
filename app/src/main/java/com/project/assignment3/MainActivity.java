package com.project.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Item> itemList = new ArrayList<Item>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initList();

        ItemAdapter adapter = new ItemAdapter(MainActivity.this,
                R.layout.item, itemList);

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                Item info = itemList.get(position);
                Bundle bundle = new Bundle();

                bundle.putString("itemName", info.getName());
                bundle.putString("itemImage", info.getImg_url() + "");
                bundle.putString("itemLink", info.getLink());

                Intent intent = new Intent(MainActivity.this,ItemPage.class);

                intent.putExtras(bundle);
                startActivity(intent);
            }
        });



    }

    private void initList(){
        Item alpha = new Item("Alpha",R.drawable.alpha, "https://en.wikipedia.org/wiki/Alpha","API 1");
        itemList.add(alpha);
        Item  petitFour = new Item("Petit Four",  R.drawable.petit, "https://en.wikipedia.org/wiki/Petit_four", "API 2");
        itemList.add(petitFour);
        Item cupCake = new Item("Cupcake", R.drawable.cupcake, "https://en.wikipedia.org/wiki/Cupcake", "API 3");
        itemList.add(cupCake);
        Item donut = new Item("Donut", R.drawable.donut, "https://en.wikipedia.org/wiki/Doughnut", "API 4");
        itemList.add(donut);
        Item eclair = new Item("Eclair", R.drawable.eclair, "https://en.wikipedia.org/wiki/%C3%89clair", "API 5 - 7");
        itemList.add(eclair);
        Item froyo = new Item("Froyo", R.drawable.froyo, "https://en.wikipedia.org/wiki/Frozen_yogurt", "API 8");
        itemList.add(froyo);
        Item scu = new Item("SCU", R.drawable.scu, "https://en.wikipedia.org/wiki/Santa_Clara_University", "API 9");
        itemList.add(scu);
    }


}