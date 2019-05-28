package com.example.minimo2dsa;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class GetUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    public void doGetUser(View view) {

        new getUser(this).execute();
    }

    private class getUser extends AsyncTask<String, Void, String> {
        Context context;

        private getUser(Context context) {
            this.context = context;
        }
        @Override
        protected String doInBackground(String... urls) {

            final EditText username = (EditText) findViewById(R.id.username);

            return username.getText().toString();
        }

        @Override
        protected void onPostExecute(String result) {
            Intent i = new Intent(GetUser.this, MainActivity.class);
            i.putExtra("username",result);
            startActivity(i);
        }
    }
}
