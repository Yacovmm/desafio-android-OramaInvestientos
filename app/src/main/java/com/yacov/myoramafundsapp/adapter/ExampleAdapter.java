package com.yacov.myoramafundsapp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yacov.myoramafundsapp.R;
import com.yacov.myoramafundsapp.model.Example;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;

/**
 * Created by YacovR on 28-Jan-18.
 */

public class ExampleAdapter  extends RecyclerView.Adapter<ExampleAdapter.ViewHolder> {

    private List<Example> examples;
    private Context context;

    public ExampleAdapter() {
    }

    public ExampleAdapter(List<Example> examples, Context context) {
        this.examples = examples;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_funds, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ExampleAdapter.ViewHolder holder, int position) {
        holder.name.setText(examples.get(position).getSimpleName());
        holder.valor.setText(examples.get(position).getOperability().getMinimumInitialApplicationAmount());

        double profiMes = Double.parseDouble(
                examples.get(position).getProfitabilities().getMonth() != null ? examples.get(position).getProfitabilities().getMonth() : "0");
        double profiAno = Double.parseDouble(
                examples.get(position).getProfitabilities().getM12() != null ? examples.get(position).getProfitabilities().getM12() : "0");
        DecimalFormat decimalFormat = new DecimalFormat("##.##%");

        holder.profitMes.setText(String.valueOf(decimalFormat.format(profiMes)));
        holder.profitAno.setText(String.valueOf(decimalFormat.format(profiAno)));
    }

    @Override
    public int getItemCount() {
        return examples.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView name, valor, profitMes, profitAno;

        public ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.fundoNameID);
            valor = itemView.findViewById(R.id.valorID);
            profitMes = itemView.findViewById(R.id.profitMesID);
            profitAno = itemView.findViewById(R.id.profitAnoID);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        }
    }
}
