package org.itstep.pastukhov.volley;

import android.app.Activity;
import android.content.Context;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

/**
 * Created by student on 16.11.2015.
 */
public class SimpleRequest {
    MainActivity activity;

    public SimpleRequest(MainActivity activity) {
        this.activity = activity;
    }

    // Instantiate the RequestQueue.
    String url = "http://www.google.com";

    // Request a string response from the provided URL.
    StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
            new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    activity.setText(response);
                }
            }, new Response.ErrorListener() {
        @Override
        public void onErrorResponse(VolleyError error) {
        }
    });

}

