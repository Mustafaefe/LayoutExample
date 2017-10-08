package efe.com.layoutexample;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


/**
 * Created by Mustafa on 1.10.2017.
 */

public class RelativeLayoutActivity extends Activity {
    RelativeLayout rl;
    RelativeLayout.LayoutParams lp;
    Button btnButon1;
    Button btnButon2;
    Button btnButon3;
    Button btnButon4;
    Button btnButon5;
    TextView txtGosterge;

    private void init(){
        rl = new RelativeLayout(this);

        btnButon1 = new Button(this);
        btnButon1.setText("+2");
        lp = new RelativeLayout.LayoutParams(500,300);
        lp.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        lp.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        btnButon1.setLayoutParams(lp);

        btnButon2 = new Button(this);
        btnButon2.setText("-2");
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

        btnButon5 = new Button(this);
        btnButon5.setText("Sıfırla");
        btnButon5.setId(5);
        lp = new RelativeLayout.LayoutParams(500,300);
        lp.addRule(RelativeLayout.CENTER_HORIZONTAL);
        lp.addRule(RelativeLayout.CENTER_VERTICAL);
        btnButon5.setLayoutParams(lp);

        txtGosterge = new TextView(this);
        txtGosterge.setText(new String("0"));
        txtGosterge.setTextSize(50);
        lp = new RelativeLayout.LayoutParams(500,300);
        lp.addRule(RelativeLayout.CENTER_HORIZONTAL);
        lp.addRule(RelativeLayout.BELOW, btnButon5.getId());
        txtGosterge.setLayoutParams(lp);

        rl.addView(btnButon1);
        rl.addView(btnButon2);
        rl.addView(btnButon3);
        rl.addView(btnButon4);
        rl.addView(btnButon5);
        rl.addView(txtGosterge);
    }

    //Wrapper Class
    private void btn_IkiserArttir(){
        btnButon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String previousStringValue = txtGosterge.getText().toString();
                int previousValue = Integer.parseInt(previousStringValue);
                int newValue = previousValue+2;
                txtGosterge.setText(new String(newValue+""));
            }
        });
    }

    //Wrapper Event
    private void btn_BirerArttir(){
        btnButon4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String previousStringValue = txtGosterge.getText().toString();
                int previousValue = Integer.parseInt(previousStringValue);
                int newValue = previousValue+1;
                txtGosterge.setText(new String(newValue+""));
            }
        });
    }

    private void btn_IkiserAzalt(){
        btnButon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String previousStringValue = txtGosterge.getText().toString();
                int previousValue = Integer.parseInt(previousStringValue);
                int newValue = previousValue-2;
                txtGosterge.setText(new String(newValue+""));
            }
        });
    }

    private void btn_BirerAzalt(){
        btnButon3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String previousStringValue = txtGosterge.getText().toString();
                int previousValue = Integer.parseInt(previousStringValue);
                int newValue = previousValue-1;
                txtGosterge.setText(new String(newValue+""));
            }
        });
    }

    private void btn_Sifirla(){
        btnButon5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String previousStringValue = txtGosterge.getText().toString();
                int previousValue = Integer.parseInt(previousStringValue);
                int newValue = 0;
                txtGosterge.setText(new String(newValue+""));
            }
        });
    }

    private void registerHandlers(){
        this.btn_BirerArttir();
        this.btn_IkiserArttir();
        this.btn_IkiserAzalt();
        this.btn_BirerAzalt();
        this.btn_Sifirla();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
        LayoutInflater li = this.getLayoutInflater();
        View vi = li.inflate(R.layout.activity_relative_layout, null);
        setContentView(rl);
        registerHandlers();
    }
}
