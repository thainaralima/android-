package br.com.meuapp.appthainara;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashactivity);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mostrarMainActivity();
            }
        }, 2000);
    }

    private void mostrarMainActivity() {
        Intent intent = new Intent(
                splashActivity.this,MainActivity.class
        );
        startActivity(intent);
        finish();
    }
}