package org.itstep.pastukhov.volley;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    SimpleRequest simpleRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.simpleText);

        simpleRequest = new SimpleRequest(this);
        RequestQueueSingleton.getInstance(this).addToRequestQueue(simpleRequest.stringRequest);
    }

    public void setText(String text) {
        textView.setText(text);
    }
}
