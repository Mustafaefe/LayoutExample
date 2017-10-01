package efe.com.layoutexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout lLayout;
    ScrollView sv;
    Button btn;
    RadioButton rdo;

    private void init(){
        sv = new ScrollView(this);
        lLayout = new LinearLayout(this);
        lLayout.setOrientation(LinearLayout.VERTICAL);

        for(int i=0; i<20; i++){

            if (i%2 == 0) {
                LinearLayout.LayoutParams lp1 = new LinearLayout.LayoutParams(750,250);
                lp1.gravity = Gravity.START;
                lp1.setMargins(5,5,5,5);
                btn = new Button(this);
                btn.setText("buton " + i);
                btn.setLayoutParams(lp1);
                lLayout.addView(btn);
            }
            else {
                LinearLayout.LayoutParams lp2 = new LinearLayout.LayoutParams(600, 250);
                lp2.gravity = Gravity.END;
                rdo = new RadioButton(this);
                rdo.setText("radio buton " + i);
                rdo.setLayoutParams(lp2);
                lLayout.addView(rdo);
            }
            TextView tv = new TextView(this);
            tv.setText("ARA "+(i+1));
            tv.setTextSize(20f);
            LinearLayout.LayoutParams lp3 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT);
            lp3.gravity = Gravity.CENTER_HORIZONTAL;
            lp3.setMargins(10,10,10,10);
            tv.setLayoutParams(lp3);
            lLayout.addView(tv);

        }
        sv.addView(lLayout);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
        setContentView(sv);
    }
}
