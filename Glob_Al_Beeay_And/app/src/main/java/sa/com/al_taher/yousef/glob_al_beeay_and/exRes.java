package sa.com.al_taher.yousef.glob_al_beeay_and;

import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.Gravity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class exRes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex_res);

        String[] YourAnswers = getIntent().getStringArrayExtra("YourAnswers");
        String[] correct_ans = getIntent().getStringArrayExtra("CorrectAnswers");



        for(int i=0;i<YourAnswers.length;i++){

            // get a reference for the TableLayout
            TableLayout table = (TableLayout)findViewById(R.id.tableLayout);
            // create a new TableRow
            TableRow row = new TableRow(this);

            row.setBackgroundResource(R.drawable.row_borders);




            // create a new TextView for showing xml data
            TextView id_te = new TextView(this);

            // set the text to "text xx"
            id_te.setText(""+(i+1));
            id_te.setPadding(80,20,80,0);






            TextView yourAnsw = new TextView(this);
            // set the text to "text xx"
            yourAnsw.setText(YourAnswers[i]);
            yourAnsw.setPadding(80,20,80,0);
            yourAnsw.setWidth(350);
            yourAnsw.setGravity(Gravity.RIGHT);
            yourAnsw.setBackgroundResource(R.drawable.borders);

            TextView corAnsw = new TextView(this);
            // set the text to "text xx"
            corAnsw.setText(correct_ans[i]);
            corAnsw.setPadding(0,20,80,0);
            corAnsw.setWidth(350);
            corAnsw.setGravity(Gravity.RIGHT);

            // add the TextView  to the new TableRow



            row.addView(id_te);
            row.addView(yourAnsw);
            row.addView(corAnsw);

            // add the TableRow to the TableLayout
            table.addView(row, new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT));




        }




    }
}

