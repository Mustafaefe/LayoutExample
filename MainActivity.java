package efe.com.layoutexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

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

    private void makeToast(String title, String message){

        Toast toast = new Toast(this);

        LayoutInflater li = MainActivity.this.getLayoutInflater();
        View v = li.inflate(R.layout.custom_toast, null);

        FrameLayout pnlOuter = (FrameLayout) v.findViewById(R.id.pnlOuter);
        LinearLayout pnlInner = (LinearLayout) pnlOuter.findViewById(R.id.pnlInner);

        TextView txtTitle = (TextView) pnlInner.findViewById(R.id.txtTitle);
        txtTitle.setText(title);

        TextView txtMessage = (TextView) pnlInner.findViewById(R.id.txtMessage);
        txtMessage.setText(message);

        toast.setView(pnlOuter);
        toast.setDuration(Toast.LENGTH_LONG);
        //toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
        setContentView(R.layout.activity_main);
    }

    public void showToast(View Button){
        makeToast("EFE TİCARET", "MERHABALAR");
    }
}
