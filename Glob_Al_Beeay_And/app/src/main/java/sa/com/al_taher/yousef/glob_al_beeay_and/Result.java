package sa.com.al_taher.yousef.glob_al_beeay_and;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    String[] correct_ans;
    String[] YourAnswers;
    int sM;
    int levelM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        final TextView resu = (TextView) findViewById(R.id.textView3);

        int s = getIntent().getIntExtra("Results",0);
        int level = getIntent().getIntExtra("level",0);
        YourAnswers = getIntent().getStringArrayExtra("YourAnswers");
        correct_ans = getIntent().getStringArrayExtra("CorrectAnswers");

        sM = s;
        levelM = level;

        SharedPreferences preferences = getApplicationContext().getSharedPreferences("levels", 0);
        SharedPreferences.Editor editor = preferences.edit();

        if (s>= 7){



            if (level == 1){


                editor.putString("Second","ok");


            }else if (level == 2){
                editor.putString("Thired","ok");

            }

            editor.commit();

        }




        resu.setText(s+"/ 10");




    }

    public void GoToQuestions(View view) {

        Intent goToQus = new Intent(this,MainActivity.class);
        startActivity(goToQus);

    }

    public void GoToCheRes(View view) {

        Intent goToRes = new Intent(this,exRes.class);
        goToRes.putExtra("CorrectAnswers",correct_ans);
        goToRes.putExtra("YourAnswers",YourAnswers);

        startActivity(goToRes);


    }

    public void GotToLevel(View view) {

            Intent a = new Intent(this,Levels.class);


                startActivity(a);







    }
}
