package efe.com.layoutexample;


import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.widget.GridLayout;
import android.widget.TextView;




/**
 * Created by Mustafa on 8.10.2017.
 */

public class GridLayoutActivity extends Activity {

    GridLayout pnlGrid;

    TextView txtBaslik1;
    TextView txtBaslik2;
    TextView txtMarka1;
    TextView txtMarka2;
    TextView txtMarka3;
    TextView txtMarka4;
    TextView txtMarka5;
    TextView txtFiyat1;
    TextView txtFiyat2;
    TextView txtFiyat3;
    TextView txtFiyat4;
    TextView txtFiyat5;

    private void init(){
        pnlGrid = new GridLayout(this);
        pnlGrid.setBackgroundColor(Color.CYAN);
        pnlGrid.setOrientation(GridLayout.HORIZONTAL);
        pnlGrid.setColumnCount(4);
        pnlGrid.setRowCount(6);
        GridLayout.LayoutParams lp = new GridLayout.LayoutParams(GridLayout.spec(0), GridLayout.spec(0,2));

        txtBaslik1 = new TextView(this);
        txtBaslik1.setText("Markalar");
        txtBaslik1.setTextAlignment(txtBaslik1.TEXT_ALIGNMENT_CENTER);
        txtBaslik1.setTextSize(45);
        txtBaslik1.setTextColor(Color.BLACK);
        txtBaslik1.setBackgroundColor(Color.CYAN);
        lp.setGravity(Gravity.FILL_HORIZONTAL);
        txtBaslik1.setLayoutParams(lp);

        txtBaslik2 = new TextView(this);
        txtBaslik2.setText("Fiyatlar");
        txtBaslik2.setBackgroundColor(Color.GREEN);
        txtBaslik2.setTextColor(Color.BLACK);
        lp = new GridLayout.LayoutParams(GridLayout.spec(0), GridLayout.spec(2,2));
        lp.setGravity(Gravity.FILL_HORIZONTAL);
        txtBaslik2.setTextSize(45);
        txtBaslik2.setTextAlignment(txtBaslik1.TEXT_ALIGNMENT_CENTER);
        txtBaslik2.setLayoutParams(lp);

        txtMarka1 = new TextView(this);
        txtMarka1.setTextSize(35);
        txtMarka1.setTextColor(Color.MAGENTA);
        txtMarka1.setTextAlignment(txtMarka1.TEXT_ALIGNMENT_CENTER);
        GridLayout.LayoutParams lp2 = new GridLayout.LayoutParams(GridLayout.spec(1), GridLayout.spec(0,2));
        lp2.setGravity(Gravity.FILL_HORIZONTAL);
        txtMarka1.setLayoutParams(lp2);

        txtMarka2 = new TextView(this);
        txtMarka2.setTextSize(35);
        txtMarka2.setTextAlignment(txtMarka2.TEXT_ALIGNMENT_CENTER);
        lp = new GridLayout.LayoutParams(GridLayout.spec(2), GridLayout.spec(0,2));
        lp.setGravity(Gravity.FILL_HORIZONTAL);
        txtMarka2.setLayoutParams(lp);

        txtMarka3 = new TextView(this);
        txtMarka3.setTextSize(35);
        txtMarka3.setTextAlignment(txtMarka3.TEXT_ALIGNMENT_CENTER);
        lp = new GridLayout.LayoutParams(GridLayout.spec(3), GridLayout.spec(0,2));
        lp.setGravity(Gravity.FILL_HORIZONTAL);
        txtMarka3.setLayoutParams(lp);

        txtMarka4 = new TextView(this);
        txtMarka4.setTextSize(35);
        txtMarka4.setTextAlignment(txtMarka4.TEXT_ALIGNMENT_CENTER);
        lp = new GridLayout.LayoutParams(GridLayout.spec(4), GridLayout.spec(0,2));
        lp.setGravity(Gravity.FILL_HORIZONTAL);
        txtMarka4.setLayoutParams(lp);

        txtMarka5 = new TextView(this);
        txtMarka5.setTextSize(35);
        txtMarka5.setTextAlignment(txtMarka5.TEXT_ALIGNMENT_CENTER);
        lp = new GridLayout.LayoutParams(GridLayout.spec(5), GridLayout.spec(0,2));
        lp.setGravity(Gravity.FILL_HORIZONTAL);
        txtMarka5.setLayoutParams(lp);

        txtFiyat1 = new TextView(this);
        txtFiyat1.setTextSize(34);
        txtFiyat1.setTextAlignment(txtFiyat1.TEXT_ALIGNMENT_CENTER);
        lp = new GridLayout.LayoutParams(GridLayout.spec(1), GridLayout.spec(2,2));
        lp.setGravity(Gravity.FILL_HORIZONTAL);
        txtFiyat1.setLayoutParams(lp);

        txtFiyat2 = new TextView(this);
        txtFiyat2.setTextSize(34);
        txtFiyat2.setTextAlignment(txtFiyat2.TEXT_ALIGNMENT_CENTER);
        lp = new GridLayout.LayoutParams(GridLayout.spec(2), GridLayout.spec(2,2));
        lp.setGravity(Gravity.FILL_HORIZONTAL);
        txtFiyat2.setLayoutParams(lp);

        txtFiyat3 = new TextView(this);
        txtFiyat3.setTextSize(34);
        txtFiyat3.setTextAlignment(txtFiyat3.TEXT_ALIGNMENT_CENTER);
        lp = new GridLayout.LayoutParams(GridLayout.spec(3), GridLayout.spec(2,2));
        lp.setGravity(Gravity.FILL_HORIZONTAL);
        txtFiyat3.setLayoutParams(lp);

        txtFiyat4 = new TextView(this);
        txtFiyat4.setTextSize(34);
        txtFiyat4.setTextAlignment(txtFiyat4.TEXT_ALIGNMENT_CENTER);
        lp = new GridLayout.LayoutParams(GridLayout.spec(4), GridLayout.spec(2,2));
        lp.setGravity(Gravity.FILL_HORIZONTAL);
        txtFiyat4.setLayoutParams(lp);

        txtFiyat5 = new TextView(this);
        txtFiyat5.setTextSize(34);
        txtFiyat5.setTextAlignment(txtFiyat1.TEXT_ALIGNMENT_CENTER);
        lp = new GridLayout.LayoutParams(GridLayout.spec(5), GridLayout.spec(2,2));
        lp.setGravity(Gravity.FILL_HORIZONTAL);
        txtFiyat5.setLayoutParams(lp);

        pnlGrid.addView(txtBaslik1); pnlGrid.addView(txtBaslik2);
        pnlGrid.addView(txtMarka1);  pnlGrid.addView(txtMarka2);
        pnlGrid.addView(txtMarka3);  pnlGrid.addView(txtMarka4);
        pnlGrid.addView(txtMarka5);  pnlGrid.addView(txtFiyat1);
        pnlGrid.addView(txtFiyat2);  pnlGrid.addView(txtFiyat3);
        pnlGrid.addView(txtFiyat4);  pnlGrid.addView(txtFiyat5);


    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
        this.setContentView(pnlGrid);

        Resources res = this.getResources();
        String[] markalar = res.getStringArray(R.array.araba_markalar);
        int[] fiyatlar = res.getIntArray(R.array.araba_fiyatlar);

        txtMarka1.setText(markalar[0]); txtMarka2.setText(markalar[1]);
        txtMarka3.setText(markalar[2]); txtMarka4.setText(markalar[3]);
        txtMarka5.setText(markalar[4]);

        txtFiyat1.setText(fiyatlar[0]+"$"); txtFiyat2.setText(fiyatlar[1]+"$");
        txtFiyat3.setText(fiyatlar[2]+"$"); txtFiyat4.setText(fiyatlar[3]+"$");
        txtFiyat5.setText(fiyatlar[4]+"$");
    }
}
