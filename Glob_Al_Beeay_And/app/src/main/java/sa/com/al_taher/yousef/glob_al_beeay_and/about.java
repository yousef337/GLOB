package sa.com.al_taher.yousef.glob_al_beeay_and;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        WebView about = (WebView) findViewById(R.id.aboutpage);
        about.getSettings().setLoadWithOverviewMode(true);
        about.getSettings().setUseWideViewPort(true);
        about.loadUrl("file:///android_asset/about.html");


    }
}
