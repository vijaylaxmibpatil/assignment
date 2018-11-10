package com.example.vijaylaxmi.assignment;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner country,state,city;
    TextView txt;
    List clist=new ArrayList();
    List slist=new ArrayList();
    List ctlist=new ArrayList();
    ArrayAdapter adaptersp_country,adaptersp_state,adaptersp_city;
    Object coun,stat,cit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        country=(Spinner)findViewById(R.id.spinner);
        state=(Spinner)findViewById(R.id.spinner2);
        city=(Spinner)findViewById(R.id.spinner3);

        txt=(TextView)findViewById(R.id.textView4);
//country

        clist.clear();
        clist.add("-- Select Country --");
        txt.setText("");
        country.setOnItemSelectedListener(this);
        clist.add("India");
        clist.add("Italy");
        clist.add("china");
        clist.add("USA");


        adaptersp_country = new ArrayAdapter<String>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, clist);
        adaptersp_country.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        country.setAdapter(adaptersp_country);

//city
        // slist.clear();
        slist.add("-- Select State --");

        state.setOnItemSelectedListener(this);
        adaptersp_state = new ArrayAdapter<String>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, slist);
        adaptersp_state.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        state.setAdapter(adaptersp_state);

        stat = state.getSelectedItem();
//state
        // ctlist.clear();
        ctlist.add("-- Select City --");

        city.setOnItemSelectedListener(this);
        adaptersp_city = new ArrayAdapter<String>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, ctlist);
        adaptersp_city.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        city.setAdapter(adaptersp_city);

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        coun=country.getSelectedItem();

        if(coun==null || coun.equals("-- Select Country --")){
            slist.clear();
            slist.add("-- Select State --");
            ctlist.clear();
            ctlist.add("-- Select City --");
            txt.setText("");
            //   Toast.makeText(MainActivity.this, "Please Select Country..", Toast.LENGTH_SHORT).show();
            return;
        }else {
            slist.clear();
            slist.add("-- Select State --");
            if (coun.equals("India")) {
                slist.add("Karnataka");
                slist.add("Maharashtra");
                slist.add("Kerala");
                slist.add("Rajastan");
            } else if (coun.equals("China")) {
                slist.add("Shandong");
                slist.add("Fujian");
                slist.add("Hunan");
                slist.add("Yunnan");
            } else if (coun.equals("Japan")) {
                slist.add("Lo Stato Italian");

            } else {
                slist.add("California");
                slist.add("Florida");
                slist.add("Texas");
                slist.add("Washington");
            }

        }


        stat = state.getSelectedItem();
        ctlist.clear();
        ctlist.add("-- Select City --");
        if(stat==null || stat.equals("-- Select State --")){
            ctlist.clear();
            ctlist.add("-- Select City --");
            txt.setText("");
            return;
        }else{
            if(stat.equals("Karnataka")){
                ctlist.add("Haveri");
                ctlist.add("Hubli");
                ctlist.add("Dharwad");

            }else if(stat.equals("Maharashtra")){
                ctlist.add("Kolhapur");
                ctlist.add("Mumbai");
                ctlist.add("Kolhapur");

            }else if(stat.equals("Kerala")){
                ctlist.add("Kochi");
                ctlist.add("Vishakapatanam");
            }else if(stat.equals("Rajastan")){
                ctlist.add("Nagpur");
                ctlist.add("Ajmer");

            }else if(stat.equals("Shandong")){
                ctlist.add("Jinan");
                ctlist.add("Yantai");
            }else if(stat.equals("Fujian")){
                ctlist.add("Fuzhou");
                ctlist.add("putian");
            }else if(stat.equals("Hunan")){

                ctlist.add("Zhuzhou");
                ctlist.add("Changde");
            }else if(stat.equals("Yunnan")){
                ctlist.add("Dali");
                ctlist.add("Yuxi");
            }else if(stat.equals("Saitama")){
                ctlist.add("San jose");
                ctlist.add("Oakland");
            }else if(stat.equals("Sappora")){
                ctlist.add("North Sappora");
                ctlist.add("South Sappora");
            }else if(stat.equals("Sendai")){
                ctlist.add("South Sendai");
                ctlist.add("North sendai");
            }else if(stat.equals("Shinjuku")){
                ctlist.add("Yotsuya");
                ctlist.add("Ichigaya");

            }else if(stat.equals("California")){

                ctlist.add("Chichibu");
                ctlist.add("Soka");
            }else if(stat.equals("Florida")){
                ctlist.add("Miami");
                ctlist.add("Orlando");

            }else if(stat.equals("Texas")){

                ctlist.add("Dallas");
                ctlist.add("Austin");
            }else if(stat.equals("Washington")){
                ctlist.add("Seattle");
                ctlist.add("Tacoma");

            }

        }
        cit = city.getSelectedItem();

        if(coun==null && stat==null && cit==null){
            txt.setVisibility(View.INVISIBLE);
        }else{
            txt.setText("You Are Selected : Country="+coun+" State="+stat+" City="+cit);
        }



    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}
