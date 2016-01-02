package com.delisle.clickcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int i;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i = 0;
        text = (TextView) findViewById(R.id.main_text);
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.layout_activity_main);

        layout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                i++;
                // on récupère le textview à éditer
                text.setText(Integer.toString(i));
            }
        });

    }

}
