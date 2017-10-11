package efe.com.layoutexample;


import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Mustafa on 8.10.2017.
 */

public class GridLayoutActivity extends Activity {

    GridLayout pnlGrid;
    Button btnButon;
    Button btnButon2;
    TextView txtBaslik1;
    TextView txtBaslik2;

    private void init(){
        pnlGrid = new GridLayout(this);
        pnlGrid.setOrientation(GridLayout.HORIZONTAL);
        pnlGrid.setColumnCount(4);
        pnlGrid.setRowCount(6);
        GridLayout.LayoutParams lp = new GridLayout.LayoutParams(GridLayout.spec(0), GridLayout.spec(0,2));

        txtBaslik1 = new TextView(this);
        txtBaslik1.setText("Baslık Annnnnnnnnnnnnnn");
        txtBaslik1.setBackgroundColor(Color.CYAN);
        lp.setGravity(Gravity.FILL_HORIZONTAL);
        txtBaslik1.setLayoutParams(lp);

        txtBaslik2 = new TextView(this);
        txtBaslik2.setText("Baslık Bnnnnnnnnnnnnnnn");
        txtBaslik2.setBackgroundColor(Color.GREEN);
        lp = new GridLayout.LayoutParams(GridLayout.spec(0), GridLayout.spec(2,2));
        lp.setGravity(Gravity.FILL_HORIZONTAL);
        txtBaslik2.setLayoutParams(lp);

        pnlGrid.addView(txtBaslik1);
        pnlGrid.addView(txtBaslik2);

        for(int i=0; i<20; i++){
            btnButon = new Button(this);
            btnButon.setText("Buton: "+(i+1));
            btnButon.setTextColor(Color.BLACK);
            btnButon.setLayoutParams(lp);
            pnlGrid.addView(btnButon);
        }


    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
        this.setContentView(pnlGrid);
    }
}
