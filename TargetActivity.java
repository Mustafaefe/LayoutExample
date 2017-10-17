package efe.com.layoutexample;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Mustafa on 15.10.2017.
 */

public class TargetActivity extends Activity {


    public AlertDialog showDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, AlertDialog.THEME_DEVICE_DEFAULT_LIGHT);
        builder.setTitle("Uyarı Mesajı");
        builder.setMessage("Silmek istediğinizden emin misiniz");
        builder.setNegativeButton("silme", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(TargetActivity.this,"Silmekten Vazgeçildi", Toast.LENGTH_LONG).show();
            }
        });

        builder.setPositiveButton("Sil", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(TargetActivity.this, "Silindi", Toast.LENGTH_SHORT).show();
            }
        });

        return builder.create();
    }

    //event wrapper
    public void btnShowDialog_Click(){
        Button showDialog = (Button) this.findViewById(R.id.btnShowDialog);
        showDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TargetActivity.this.showDialog().show();
            }
        });
    }

    public void registerHandlers(){
        btnShowDialog_Click();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_target);
        registerHandlers();
        Intent intent = this.getIntent();
        String username = intent.getStringExtra("username");
        TextView txtUsername = (TextView) this.findViewById(R.id.txtUserName);
        txtUsername.setText(username);


    }
}
