package com.yacov.myoramafundsapp;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.yacov.myoramafundsapp.adapter.ExampleAdapter;
import com.yacov.myoramafundsapp.api.Client;
import com.yacov.myoramafundsapp.api.Service;
import com.yacov.myoramafundsapp.model.Example;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProgressDialog pd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        initViews();



    }

    private void initViews() {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewID);
        pd = new ProgressDialog(this);
        pd.setMessage("Fetching data!");
        pd.setCancelable(false);
        pd.show();
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.addItemDecoration(
                new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        loadJson();
    }

    private void loadJson() {

        try{

            Client client = new Client();
            Service service = client.getClient().create(Service.class);
            Call<List<Example>> call = service.getExample();
            call.enqueue(new Callback<List<Example>>() {
                @Override
                public void onResponse(Call<List<Example>> call, Response<List<Example>> response) {
                    List<Example> examples = response.body();
                    recyclerView.setAdapter(new ExampleAdapter(examples, getApplicationContext()));
                    pd.hide();
                }

                @Override
                public void onFailure(Call<List<Example>> call, Throwable t) {
                    Log.d("Error", t.getMessage());
                    Toast.makeText(getApplicationContext(), t.toString(), Toast.LENGTH_LONG).show();
                    pd.hide();
                }
            });

        }catch (Exception e){
            Log.d("Error", e.getMessage());
            Toast.makeText(getApplicationContext(), e.toString(), Toast.LENGTH_LONG).show();
        }
    }
}
