package efe.com.layoutexample;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.RelativeLayout;

/**
 * Created by Mustafa on 1.10.2017.
 */

public class RelativeLayoutActivity extends Activity {
    RelativeLayout rl;
    RelativeLayout.LayoutParams lp;
    RelativeLayout.LayoutParams lp2;
    RelativeLayout.LayoutParams lp3;
    RelativeLayout.LayoutParams lp4;

    private void init(){
        rl = new RelativeLayout(this);

        Button btnButon1 = new Button(this);
        btnButon1.setText("SolÜst");
        lp = new RelativeLayout.LayoutParams(500,300);
        lp.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        lp.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        btnButon1.setLayoutParams(lp);

        Button btnButon2 = new Button(this);
        btnButon2.setText("SolAlt");
        lp = new RelativeLayout.LayoutParams(500,300);
        lp.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        btnButon2.setLayoutParams(lp);

        Button btnButon3 = new Button(this);
        btnButon3.setText("SağAlt");
        lp = new RelativeLayout.LayoutParams(500,300);
        lp.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        btnButon3.setLayoutParams(lp);

        Button btnButon4 = new Button(this);
        btnButon4.setText("SağÜst");
        lp = new RelativeLayout.LayoutParams(500,300);
        lp.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        lp.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        btnButon4.setLayoutParams(lp);

        rl.addView(btnButon1);
        rl.addView(btnButon2);
        rl.addView(btnButon3);
        rl.addView(btnButon4);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
        setContentView(rl);
    }
}
