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
    private TextView strategyID,publicoAlvoID ,tituloID,initialDateID,
            riskProfileID,gestorNomeID,cnpjID,limitTimeID,convertDaysID,
            minimiumApplyAddID,minimiumApplyID,profitDayID,profitMonthID,profitYearID,aboutID;
    ;

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
        publicoAlvoID = (TextView)findViewById(R.id.publicoAlvoID);
        tituloID = (TextView)findViewById(R.id.tituloID);
        initialDateID = (TextView)findViewById(R.id.initialDateID);
        riskProfileID = (TextView)findViewById(R.id.riskProfileID);
        gestorNomeID = (TextView)findViewById(R.id.gestorNomeID);
        cnpjID = (TextView)findViewById(R.id.cnpjID);
        limitTimeID = (TextView)findViewById(R.id.limitTimeID);
        convertDaysID = (TextView)findViewById(R.id.convertDaysID);
        minimiumApplyAddID = (TextView)findViewById(R.id.minimiumAplyAddID);
        minimiumApplyID = (TextView)findViewById(R.id.minimiumAplyID);
        profitDayID = (TextView)findViewById(R.id.profitDayID);
        profitMonthID = (TextView)findViewById(R.id.profitMonthID);
        profitYearID = (TextView)findViewById(R.id.profitYearID);
        aboutID = (TextView)findViewById(R.id.aboutID);

        String titulo = getIntent().getExtras().getString("complete_name");
        String about = getIntent().getExtras().getString("strengths");
        String mesProfit = getIntent().getExtras().getString("mesProfit");
        String anoProfit = getIntent().getExtras().getString("AnoProfit");
        String diaProfit = getIntent().getExtras().getString("diaProfit");
        String strategy = getIntent().getExtras().getString("strategy");
        String minimoApply = getIntent().getExtras().getString("minimum_initial_application");
        String minimoAddApply = getIntent().getExtras().getString("minimum_subsequent_application");
        String quotationApply = getIntent().getExtras().getString("application_quotation");
        String timeLimitApply = getIntent().getExtras().getString("application_time_limit");
        String cnpj = getIntent().getExtras().getString("cnpj");
        String publicoAlvo = getIntent().getExtras().getString("targetAudiance");
        String gestoNome = getIntent().getExtras().getString("fundManagerName");
        String riskProfile = getIntent().getExtras().getString("riskName");
        String initialDate = getIntent().getExtras().getString("intial_date");




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

        minimiumApplyID.setText(minimoApply);
        minimiumApplyAddID.setText(minimoAddApply);
        limitTimeID.setText(timeLimitApply);
        cnpjID.setText(cnpj);
        publicoAlvoID.setText(publicoAlvo);
        gestorNomeID.setText(gestoNome);
        riskProfileID.setText(riskProfile);
        initialDateID.setText(initialDate);
        convertDaysID.setText(quotationApply);

    }


}
