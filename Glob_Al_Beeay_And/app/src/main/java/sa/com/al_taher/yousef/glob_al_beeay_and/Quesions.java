package sa.com.al_taher.yousef.glob_al_beeay_and;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;


public class Quesions extends AppCompatActivity {

    int QuseionNumber = 0;
    int TotalCorrect = 0;
    String[] array_question;
    String[] array_choise1;
    String[] array_choise2;
    String[] array_choise3;
    String[] array_choise4;
    String[] array_correct;
    int level;

    String[] array_chossen_ques = new String[10];


    @Override
    public void onBackPressed(){
                super.onBackPressed();
            this.finish();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_quesions);
      //  Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

     /*   View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION ;
        decorView.setSystemUiVisibility(uiOptions);

*/
        array_question = getIntent().getStringArrayExtra("array_question");
        array_choise1 = getIntent().getStringArrayExtra("array_choise1");
        array_choise2 = getIntent().getStringArrayExtra("array_choise2");
        array_choise3 = getIntent().getStringArrayExtra("array_choise3");
        array_choise4 = getIntent().getStringArrayExtra("array_choise4");
        array_correct = getIntent().getStringArrayExtra("array_correct");
        level = getIntent().getIntExtra("level",0);

            qus();


    }


    public void qus(){


        if (QuseionNumber == 10 ) {

            Intent goToRes = new Intent(this,Result.class);
            goToRes.putExtra("Results",TotalCorrect);
            goToRes.putExtra("CorrectAnswers",array_correct);
            goToRes.putExtra("YourAnswers",array_chossen_ques);
            goToRes.putExtra("level",level);

            startActivity(goToRes);

            return;

        }else {
            final MediaPlayer clockdownsound = MediaPlayer.create(Quesions.this,R.raw.countdown);

            clockdownsound.start();


            final CountDownTimer timecountdown = new CountDownTimer(20000, 1000) {

                final ProgressBar timerPrograss = (ProgressBar) findViewById(R.id.progressBar3);


                public void onTick(long millisUntilFinished) {
                    timerPrograss.setProgress((int) millisUntilFinished / 1000);

                }

                public void onFinish() {

                    clockdownsound.stop();

                    array_chossen_ques[QuseionNumber] = "لم يتم اختيار اي اجابة";
                    QuseionNumber = QuseionNumber + 1;


                    qus();


                }
            }.start();

            final Button btn2 = (Button) findViewById(R.id.button3);
            final Button btn3 = (Button) findViewById(R.id.button4);
            final Button btn4 = (Button) findViewById(R.id.button5);





            //Log.d("AAAAAAA : ", "" + QuseionNumber);
            //Log.d("AAAAAAA : ", "" + TotalCorrect);

            final ProgressBar ProgrBar = (ProgressBar) findViewById(R.id.progressBar);
            ProgrBar.setProgress(QuseionNumber);

            final Animation animation = new TranslateAnimation(-200,0,-200,0);
// set Animation for 5 sec
            animation.setDuration(400);
//for button stops in the new position.
            animation.setFillAfter(true);

            final TextView ques = (TextView) findViewById(R.id.textView);
            ques.setText(array_question[QuseionNumber]);

            final Button btn1 = (Button) findViewById(R.id.button);
            btn1.setText(array_choise1[QuseionNumber]);

            final WebView gifImage = (WebView)findViewById(R.id.animetedGIF);
            gifImage.setBackgroundColor(Color.WHITE);
            gifImage.getSettings().setLoadWithOverviewMode(true);
            gifImage.getSettings().setUseWideViewPort(true);
            gifImage.setVisibility(View.INVISIBLE);

            final MediaPlayer AnswerChoseR = MediaPlayer.create(Quesions.this,R.raw.rightasnsoun);
            final MediaPlayer AnswerChossW = MediaPlayer.create(Quesions.this,R.raw.woranssou);


            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick( View view) {

                    btn1.setClickable(false);
                    btn2.setClickable(false);
                    btn3.setClickable(false);
                    btn4.setClickable(false);

                    timecountdown.cancel();
                    clockdownsound.stop();


                            array_chossen_ques[QuseionNumber] = btn1.getText().toString() ;

                    String gifImageUrl;

                    if (btn1.getText().toString().equals(array_correct[QuseionNumber])) {

                        TotalCorrect = TotalCorrect + 1;
                        gifImageUrl = "file:///android_asset/smily.gif";

                        gifImage.setVisibility(View.VISIBLE);
                        gifImage.loadUrl(gifImageUrl);
                        AnswerChoseR.start();

                    }else{
                        gifImage.setVisibility(View.VISIBLE);
                        gifImageUrl = "file:///android_asset/wrong.gif";
                        gifImage.loadUrl(gifImageUrl);
                        AnswerChossW.start();

                    }

                    QuseionNumber = QuseionNumber + 1;


                   new CountDownTimer(2000, 1000) {




                        public void onTick(long millisUntilFinished) {


                        }

                        public void onFinish() {
                            AnswerChoseR.stop();
                            AnswerChossW.stop();
                            gifImage.setVisibility(View.INVISIBLE);
                            gifImage.loadUrl("");


                            qus();


                        }
                    }.start();






                }
            });

                btn1.startAnimation(animation);




            btn2.setText(array_choise2[QuseionNumber]);

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    btn1.setClickable(false);
                    btn2.setClickable(false);
                    btn3.setClickable(false);
                    btn4.setClickable(false);
                    array_chossen_ques[QuseionNumber] = btn2.getText().toString() ;
                    timecountdown.cancel();
                    clockdownsound.stop();

                    String gifImageUrl;

                    if (btn2.getText().toString().equals(array_correct[QuseionNumber])) {

                        gifImage.setVisibility(View.VISIBLE);
                        TotalCorrect = TotalCorrect + 1;
                        gifImageUrl = "file:///android_asset/smily.gif";
                        gifImage.loadUrl(gifImageUrl);

                        final MediaPlayer clockdownsound = MediaPlayer.create(Quesions.this,R.raw.rightasnsoun);
                        clockdownsound.start();
                    }else{
                        gifImage.setVisibility(View.VISIBLE);

                        gifImageUrl = "file:///android_asset/wrong.gif";
                        final MediaPlayer clockdownsound = MediaPlayer.create(Quesions.this,R.raw.woranssou);
                        clockdownsound.start();
                        gifImage.loadUrl(gifImageUrl);

                    }

                    QuseionNumber = QuseionNumber + 1;


                    new CountDownTimer(2000, 1000) {




                        public void onTick(long millisUntilFinished) {


                        }

                        public void onFinish() {


                            AnswerChoseR.stop();
                            AnswerChossW.stop();
                            gifImage.setVisibility(View.INVISIBLE);
                            gifImage.loadUrl("");

                            qus();


                        }
                    }.start();




                }
            });

            btn2.startAnimation(animation);


            btn3.setText(array_choise3[QuseionNumber]);

            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    btn1.setClickable(false);
                    btn2.setClickable(false);
                    btn3.setClickable(false);
                    btn4.setClickable(false);
                    array_chossen_ques[QuseionNumber] = btn3.getText().toString() ;
                    timecountdown.cancel();
                    clockdownsound.stop();

                    String gifImageUrl;

                    if (btn3.getText().toString().equals(array_correct[QuseionNumber])) {
                        gifImage.setVisibility(View.VISIBLE);

                        TotalCorrect = TotalCorrect + 1;
                        gifImageUrl = "file:///android_asset/smily.gif";
                        gifImage.loadUrl(gifImageUrl);
                        final MediaPlayer clockdownsound = MediaPlayer.create(Quesions.this,R.raw.rightasnsoun);
                        clockdownsound.start();

                    }else{
                        gifImage.setVisibility(View.VISIBLE);

                        gifImageUrl = "file:///android_asset/wrong.gif";
                        gifImage.loadUrl(gifImageUrl);

                        final MediaPlayer clockdownsound = MediaPlayer.create(Quesions.this,R.raw.woranssou);
                        clockdownsound.start();
                    }

                    QuseionNumber = QuseionNumber + 1;


                    new CountDownTimer(2000, 1000) {




                        public void onTick(long millisUntilFinished) {


                        }

                        public void onFinish() {

                            AnswerChoseR.stop();
                            AnswerChossW.stop();
                            gifImage.setVisibility(View.INVISIBLE);
                            gifImage.loadUrl("");


                            qus();


                        }
                    }.start();



                }
            });

            btn3.startAnimation(animation);

            btn4.setText(array_choise4[QuseionNumber]);

            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    btn1.setClickable(false);
                    btn2.setClickable(false);
                    btn3.setClickable(false);
                    btn4.setClickable(false);
                    array_chossen_ques[QuseionNumber] = btn4.getText().toString() ;
                    clockdownsound.stop();
                    timecountdown.cancel();

                    String gifImageUrl;

                    if (btn4.getText().toString().equals(array_correct[QuseionNumber])) {
                        gifImage.setVisibility(View.VISIBLE);

                        TotalCorrect = TotalCorrect + 1;
                        gifImageUrl = "file:///android_asset/smily.gif";
                        gifImage.loadUrl(gifImageUrl);

                        final MediaPlayer clockdownsound = MediaPlayer.create(Quesions.this,R.raw.rightasnsoun);
                        clockdownsound.start();
                    }else{
                        gifImage.setVisibility(View.VISIBLE);

                        gifImageUrl = "file:///android_asset/wrong.gif";
                        gifImage.loadUrl(gifImageUrl);

                        final MediaPlayer clockdownsound = MediaPlayer.create(Quesions.this,R.raw.woranssou);
                        clockdownsound.start();
                    }

                    QuseionNumber = QuseionNumber + 1;


                    new CountDownTimer(2000, 1000) {




                        public void onTick(long millisUntilFinished) {


                        }

                        public void onFinish() {

                            AnswerChoseR.stop();
                            AnswerChossW.stop();
                            gifImage.loadUrl("");
                            gifImage.setVisibility(View.INVISIBLE);


                            qus();


                        }
                    }.start();





                }
            });

            btn4.startAnimation(animation);


        }
    }




}
