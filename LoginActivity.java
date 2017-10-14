package efe.com.layoutexample;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.ToggleButton;

/**
 * Created by Mustafa on 14.10.2017.
 */

public class LoginActivity extends Activity {

    private EditText txtUsername;
    private EditText txtPass;
    String username;
    String password;
    LinearLayout pnl;

    private void init(){
        txtUsername = (EditText) this.findViewById(R.id.txtUserName);
        txtPass = (EditText) this.findViewById(R.id.txtPassword);

        username = txtUsername.getText().toString();
        password = txtPass.getText().toString();

        pnl = (LinearLayout) this.findViewById(R.id.pnl);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_login);
        init();

    }

    public void CompareEntryInfo(View view){
        if(username.equals("mustafa") && password.equals("efe123")){
            Toast.makeText(this, "Giriş Başarılı", Toast.LENGTH_LONG).show();
        }
        else
            Toast.makeText(this, "Giriş Başarısız", Toast.LENGTH_LONG).show();
    }
}
