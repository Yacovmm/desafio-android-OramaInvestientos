package com.yacov.myoramafundsapp.activity;

import android.app.ActionBar;
import android.support.design.widget.AppBarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.yacov.myoramafundsapp.R;

import java.text.DecimalFormat;


public class DetailsActivity extends AppCompatActivity {

    android.support.v7.widget.Toolbar toolbar;
    private TextView strategyID,profitYearID,profitMonthID,profitDayID,tituloID,aboutID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolBarDetaisID) ;
        setSupportActionBar(toolbar);
        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onBackPressed();
                }
            });
        }

        strategyID = (TextView)findViewById(R.id.strategyID);
        profitYearID = (TextView)findViewById(R.id.profitYearID);
        profitMonthID = (TextView)findViewById(R.id.profitMonthID);
        profitDayID = (TextView)findViewById(R.id.profitDayID);
        tituloID = (TextView)findViewById(R.id.tituloID);
        aboutID = (TextView)findViewById(R.id.aboutID);

        String titulo = getIntent().getExtras().getString("complete_name");
        String about = getIntent().getExtras().getString("strengths");
        String mesProfit = getIntent().getExtras().getString("mesProfit");
        String anoProfit = getIntent().getExtras().getString("AnoProfit");
        String diaProfit = getIntent().getExtras().getString("diaProfit");
        String strategy = getIntent().getExtras().getString("strategy");

        double profiMes = Double.parseDouble(mesProfit != null ? mesProfit  : "0");
        double profiAno = Double.parseDouble(anoProfit != null ? anoProfit  : "0");
        double profiDia = Double.parseDouble(diaProfit != null ? diaProfit  : "0");

        DecimalFormat decimalFormat = new DecimalFormat("##.##%");

        tituloID.setText(titulo);
        aboutID.setText(about);
        strategyID.setText(strategy);

        profitYearID.setText(String.valueOf(decimalFormat.format(profiAno)));
        profitMonthID.setText(String.valueOf(decimalFormat.format(profiMes)));
        profitDayID.setText(String.valueOf(decimalFormat.format(profiDia)));


    }


}
