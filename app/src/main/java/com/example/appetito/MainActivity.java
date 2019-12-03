package com.example.appetito;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private Button btScan = null;
    public static final String EXTRA_MESSAGE_OPEN_BROWSER = "OPEN_BROWSER";
    public static final String URL_HOME = "https://icobasco.github.io/cocito_android/fakesite/";

    private String url = "";

    private IntentIntegrator mioIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mioIntent = new IntentIntegrator(this);
    }
}
