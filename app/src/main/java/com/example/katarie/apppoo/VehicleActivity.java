package com.example.katarie.apppoo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by katarie on 21/09/2017.
 */

public class VehicleActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle);

        Intent intent = getIntent();
        int position = intent.getIntExtra("position", 0);
        String brand = intent.getStringExtra("brand");
        String model = intent.getStringExtra("model");
        String kilometers = intent.getStringExtra("kilometers");
        String hours = intent.getStringExtra("hours");
        String power = intent.getStringExtra("power");

        TextView textView = (TextView) findViewById(R.id.vehicle_description);

        if (position == 1) {
            Car vroum = new Car(brand, model, kilometers);
            textView.setText(vroum.getDescription());
        }
        if (position == 2) {
            Boat brr = new Boat(brand, model, hours);
            textView.setText(brr.getDescription());
        }
        if (position == 3) {
            Moto grr = new Moto(brand, model, power);
            textView.setText(grr.getDescription());
        }
    }
}
