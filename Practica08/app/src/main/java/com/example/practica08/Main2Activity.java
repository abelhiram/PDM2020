package com.example.practica08;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import static com.example.practica08.R.layout.activity_main2;
public class Main2Activity extends Activity {
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TextView tv = new TextView(this);
        tv.setText("Actividad Dos");
        setContentView(activity_main2);
        Bundle extras = getIntent().getExtras();
        String valor1 = extras.getString("Valor1");
        String valor2 = extras.getString("Valor2");
        Toast.makeText(getApplicationContext(), "Valores:\n Valor uno: " + valor1 +
                "\n Valor dos: " + valor2, Toast.LENGTH_LONG).show();
        Button button1 = (Button) findViewById(R.id.btn2);
        button1.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),
                        MainActivity.class);
                startActivity(i);
            }
        });
    }
}