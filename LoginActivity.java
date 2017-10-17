package efe.com.layoutexample;

import android.app.Activity;
import android.app.IntentService;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.content.Intent;



/**
 * Created by Mustafa on 14.10.2017.
 */

public class LoginActivity extends Activity {

    private EditText txtUsername;
    private EditText txtPass;
    LinearLayout pnl;

    private void init(){
        txtUsername = (EditText) this.findViewById(R.id.txtUserName);
        txtPass = (EditText) this.findViewById(R.id.txtPassword);

        pnl = (LinearLayout) this.findViewById(R.id.pnl);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_login);
        init();

    }

    public void CompareEntryInfo(View view){

        String username = txtUsername.getText().toString();
        String password = txtPass.getText().toString();
        Intent intent = new Intent(this, TargetActivity.class);;

        if(username.equals("mustafa") && password.equals("efe123")){
            intent.putExtra("username",username);
            this.startActivity(intent);
        }
        if(username.equals("ali") && password.equals("efe123")){
            intent.putExtra("username",username);
            this.startActivity(intent);
        }
        if(username.equals("efe") && password.equals("efe123")){
            intent.putExtra("username",username);
            this.startActivity(intent);
        }
        else
            Toast.makeText(this, "Giriş Başarısız", Toast.LENGTH_LONG).show();
    }
}
