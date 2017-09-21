package com.example.katarie.apppoo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.sql.BatchUpdateException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner spinner = (Spinner) findViewById(R.id.vehicle_type);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.vehicule_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        final TextView marque = (TextView) findViewById(R.id.brand);
        final TextView modele = (TextView) findViewById(R.id.model);
        final TextView kilometres = (TextView) findViewById(R.id.kilometers);
        final TextView nbhours = (TextView) findViewById(R.id.hours);
        final TextView nbpower = (TextView) findViewById(R.id.power);
        final Button button = (Button) findViewById(R.id.send);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {

                if (position == 0) {
                    kilometres.setVisibility(view.GONE);
                    nbhours.setVisibility(view.GONE);
                    nbpower.setVisibility(view.GONE);
                    button.setEnabled(false);
                }
                if (position == 1){
                    kilometres.setVisibility(view.VISIBLE);
                    nbhours.setVisibility(view.GONE);
                    nbpower.setVisibility(view.GONE);
                    button.setEnabled(true);
                }
                if (position == 2){
                    nbhours.setVisibility(view.VISIBLE);
                    nbpower.setVisibility(view.GONE);
                    kilometres.setVisibility(view.GONE);
                    button.setEnabled(true);
                }
                if (position == 3){
                    nbpower.setVisibility(view.VISIBLE);
                    nbhours.setVisibility(view.GONE);
                    kilometres.setVisibility(view.GONE);
                    button.setEnabled(true);
                }

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int position = spinner.getSelectedItemPosition();
                String brand = marque.getText().toString();
                String model = modele.getText().toString();
                String kilometers = kilometres.getText().toString();
                String hours = nbhours.getText().toString();
                String power = nbpower.getText().toString();

                Intent intent = new Intent(MainActivity.this, VehicleActivity.class);
                intent.putExtra("position", position);
                intent.putExtra("brand", brand);
                intent.putExtra("model", model);
                intent.putExtra("kilometers", kilometers);
                intent.putExtra("hours", hours);
                intent.putExtra("power", power);
                startActivity(intent);
            }
        });
    }
}
