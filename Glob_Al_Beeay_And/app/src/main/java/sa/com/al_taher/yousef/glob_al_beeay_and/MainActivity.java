package sa.com.al_taher.yousef.glob_al_beeay_and;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GoToQuestions(View view) {

        Intent goToQus = new Intent(this,Levels.class);
        startActivity(goToQus);
    }


    public void GoToWilki(View view) {

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ar.wikipedia.org/wiki/برنامج_جلوب"));
        startActivity(browserIntent);


    }

    public void GoToDevlpoer(View view) {

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://yousef-altaher.sa"));
        startActivity(browserIntent);


    }

    public void GoToGLOBEWEB(View view) {

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.globe.gov"));
        startActivity(browserIntent);

    }

    public void GoToAbout(View view) {

        Intent browserIntent = new Intent(this,about.class);
        startActivity(browserIntent);

    }

    }

