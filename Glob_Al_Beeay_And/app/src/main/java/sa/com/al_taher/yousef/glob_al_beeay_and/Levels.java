package sa.com.al_taher.yousef.glob_al_beeay_and;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class Levels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);
        Log.d("nnnnnnnnnnnnnn","");

    }

    public void Level1(View view) {

        String[] array_question = {" أي من العناصر التالية تلعب دوراً مهما في برنامج جلوب :","ماهي الكلمة التي يستخدمها برنامج جلوب لوصف إجراءات جمع البيانات :"," من مجالات البحث في برنامج جلوب ؟","بروتوكول الغيوم هو احد بروتوكولات بحث عن؟"," أي من البروتوكولات التالية يمكن اجراؤها دون شراء أداة علمية :","يلعب  دوراً هاما في امتصاص الأشعة فوق البنفسجية :","اقل درجة حرارة للجو في موقع الدراسة خلال 24 ساعة ؟","اعلى درجة حرارة للجو في موقع الدراسة خلال 24 ساعة :","درجة حرارة الجو في موقع الدراسة وقت القياس :"," الجهاز المستخدم في تحديد احداثيات مواقع الدراسة ؟"};
        String[] array_choise1 = {"العلماء","بروتوكولات","قاع المحيطات ","النظام الأرضي","الحرارة","بخار الماء","درجة الحرارة العظمى","درجة الحرارة العظمى","درجة الحرارة العظمى ","Gps"};
        String[] array_choise2 = {"الطلاب والمعلمين","التجارب","الجبال والصخور","الكواكب","الضغط الجوي ","النيتروجين","درجة الحرارة الصغرى ","درجة الحرارة الصغرى","درجة الحرارة الصغرى ","الاسقاط"};
        String[] array_choise3 = {"المدربين","التحليل","الغلاف الجوي","التربة","الغيوم","الأوزون","درجة حرارة الجو","درجة حرار الجو الحالية","درجة حرارة الجو الحالية ","البوصلة"};
        String[] array_choise4 = {"جميع ما ذكر","التنظيم","النجوم","الغلاف الجوي","قياس المطر","الأكسجين","درجة حرارة التربة","درجة حرارة التربة","درجة حرارة التربة","المنظار"};
        String[] array_correct = {"جميع ما ذكر","بروتوكولات","الغلاف الجوي","الغلاف الجوي","الغيوم","الأوزون","درجة الحرارة الصغرى ","درجة الحرارة العظمى","درجة حرارة الجو الحالية ","Gps"};
        int level = 1;

        Intent goToQus = new Intent(this,Quesions.class);
        goToQus.putExtra("array_question",array_question);
        goToQus.putExtra("array_choise1",array_choise1);
        goToQus.putExtra("array_choise2",array_choise2);
        goToQus.putExtra("array_choise3",array_choise3);
        goToQus.putExtra("array_choise4",array_choise4);
        goToQus.putExtra("array_correct",array_correct);
        goToQus.putExtra("level",level);
        startActivity(goToQus);


    }

    public void Level2(View view) {

        SharedPreferences preferences = getApplicationContext().getSharedPreferences("levels", Context.MODE_PRIVATE);
        String is = preferences.getString("Second","no");



        if(is.equals("ok")) {


            String[] array_question = {"درجة الحرارة الموجودة على عمق 10 سم تحت سطح الأرض :"," لكي يتم تنظيف صندوق الحماية من الداخل والخارج يتم استخدام : "," اذا كانت الغيوم تفطي اكثر من 90% تعتبر السماء :","مالذي يمكنك استخدامة للمساعدة في تحديد ارتفاع السحاب :","وحدة قياس الضغط الجوي هي :"," كيف يتم تنصيف أنواع الغيوم :"," تظهر الغيوم المنخفضة القريبة من المراقب على شكل : "," نوع من أنواع الغيوم تختفي بسرعة : "," الغيوم التي تتألف من بلورات ثلجية وهي صعبة الرؤية :"," الغيوم ذات شكل متناسق هي : "};
            String[] array_choise1 = {"درجة الحرارة العظمى","قطعة قماش جافة ونظيفة","مبعثرة","البالون","التيرمومتر","عمرها ","كبيرة الطول","غيوم ثابتة ","غيوم منحفضة ","غيوم تراكمية "};
            String[] array_choise2 = {"درجة الحرارة الصغرى ","منفاخ الهواء","متكسرة","مقياس الارتفاع","المليميتر","ارتفاعها","تظهر باللون الأحمر","غيوم منتشرة ","غيوم متوسطة ","غيوم طبقية"};
            String[] array_choise3 = {"درجة حرارة الجو الحالية ","الماء","متلبدة","المتر الالكتروني","السنتيميتر","كثافتها","كبيرة الحجم","ذات العمر الصغير","غيوم مرتفعة","غيوم الرهج"};
            String[] array_choise4 = {"درجة حرارة التربة ","مادة كحولية","معزولة","يدك والعين","المليبار","لونها","صغيرة العرض","الركامية","غيوم طبقية","غيوم تفاعلية"};
            String[] array_correct = {"درجة حرارة التربة ","قطعة قماش جافة ونظيفة","متلبدة","يدك والعين","المليبار","ارتفاعها","كبيرة الحجم","ذات العمر الصغير","غيوم مرتفعة","غيوم طبقية"};
            int level = 2;

            Intent goToQus = new Intent(this, Quesions.class);
            goToQus.putExtra("array_question", array_question);
            goToQus.putExtra("array_choise1", array_choise1);
            goToQus.putExtra("array_choise2", array_choise2);
            goToQus.putExtra("array_choise3", array_choise3);
            goToQus.putExtra("array_choise4", array_choise4);
            goToQus.putExtra("array_correct", array_correct);
            goToQus.putExtra("level", level);

            startActivity(goToQus);

        }else{

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("لا يمكن دخول هذا المستوى قبل ان تحصل على ٧ من اصل ١٠ في المستوى السابق");

            alertDialogBuilder.setPositiveButton("حسنا",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface arg0, int arg1) {

                        }
                    });


            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();


        }

    }

    public void Level3(View view) {

        SharedPreferences preferences = getApplicationContext().getSharedPreferences("levels", Context.MODE_PRIVATE);
        String is = preferences.getString("Thired","no");

        if(is.equals("ok")) {

            String[] array_question = {"تم الإعلان عن برنامج جلوب في عام :"," لمعيارة ميزان الحرارة الكحولي يتم استخدام :","قياس مقدار سقوط المطر يتم تكرارة كل : "," الغيوم التي يطلق عليها نفاثة هي الغيوم :","يقل الضغط الجوي لزيادة الارتفاع عن سطح الأرض بمقدار 1 مليبار لكل :","لقياس درجة الحرارة العظمى والصغرى يتم استخدام :","الجهاز المستخدم لقياس الضغط الجوي ؟"," يتم أخذ قراءات الغلاف الجوي ؟","السحب المنتفخة مثل كرات القطن هي :"," الغيوم التي يمكن رؤية الشمس أو القمر من خلالها هي :"};
            String[] array_choise1 = {"1994","الماء الصافي","ساعة","الشريطية","متر","ميزان الحرارة الالكتروني","باروميتر","يوميا","غيوم الرهج","غيوم النمر"};
            String[] array_choise2 = {"1996","الماء العكر","يوم","الطبيعية","10 متر","ميزان الحرارة الزئبقي ","هيجروميتر","أسبوعيا","غيوم القزع","غيوم الصوف"};
            String[] array_choise3 = {"1998","الماء والثلج المبشور","شهر","المرتفعة","50 متر","جهاز الاستشعار","أنيموميتر","شهريا","غيوم القرد","غيوم الطاخر"};
            String[] array_choise4 = {"1999","بخار الماء","ثلاثه اشهر","المتوسطة","100 متر","البوصلة","ثيرموميتر","سنويا","غيوم الخسيف","غيوم السمحاق"};
            String[] array_correct = {"1994","الماء والثلج المبشور","يوم","الشريطية","10 متر","ميزان الحرارة الزئبقي ","باروميتر","يوميا","غيوم الخسيف","غيوم السمحاق"};
            int level = 3;

            Intent goToQus = new Intent(this, Quesions.class);
            goToQus.putExtra("array_question", array_question);
            goToQus.putExtra("array_choise1", array_choise1);
            goToQus.putExtra("array_choise2", array_choise2);
            goToQus.putExtra("array_choise3", array_choise3);
            goToQus.putExtra("array_choise4", array_choise4);
            goToQus.putExtra("array_correct", array_correct);
            goToQus.putExtra("level", level);

            startActivity(goToQus);

        }else{


            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("لا يمكن دخول هذا المستوى قبل ان تحصل على ٧ من اصل ١٠ في المستوى السابق");

            alertDialogBuilder.setPositiveButton("حسنا",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface arg0, int arg1) {

                        }
                    });


            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();

        }

    }
}

