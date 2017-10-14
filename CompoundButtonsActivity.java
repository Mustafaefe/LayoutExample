package efe.com.layoutexample;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Mustafa on 14.10.2017.
 */

public class CompoundButtonsActivity extends Activity {

    RadioButton rdoGs, rdoFb, rdoBjk;
    Switch swStadium, swCaptan;
    TextView txtStadyumAdi, txtKaptanAdi;
    LinearLayout pnlOuter;
    RelativeLayout pnlBoyanacakAlanUst, pnlBoyanacakAlanAlt;
    RadioGroup rdoGrp;

    private void init(){
        pnlOuter = (LinearLayout) this.findViewById(R.id.pnlOuter);

        rdoGrp = (RadioGroup) this.findViewById(R.id.rdoGrp);

        rdoGs = (RadioButton) this.findViewById(R.id.rdoGs);
        rdoFb = (RadioButton) this.findViewById(R.id.rdoFb);
        rdoBjk = (RadioButton) this.findViewById(R.id.rdoBjk);

        swStadium = (Switch) this.findViewById(R.id.swStadium);
        swCaptan = (Switch) this.findViewById(R.id.swCaptan);

        txtKaptanAdi = (TextView) this.findViewById(R.id.txtKaptan2);
        txtStadyumAdi = (TextView) this.findViewById(R.id.txtStadyum2);

        pnlBoyanacakAlanUst = (RelativeLayout) this.findViewById(R.id.boyanacakAlan1);
        pnlBoyanacakAlanAlt = (RelativeLayout) this.findViewById(R.id.boyanacakAlan2);
    }

    //event wrapper
    private void rdoGS_onCheckedChange(){
        rdoGs.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(buttonView.isChecked()){
                    pnlBoyanacakAlanUst.setBackgroundColor(Color.RED);
                    pnlBoyanacakAlanAlt.setBackgroundColor(Color.YELLOW);
                    swStadium.setChecked(false);
                    swCaptan.setChecked(false);
                    txtStadyumAdi.setText("");
                    txtKaptanAdi.setText("");
                }
            }
        });
    }
    //event wrapper
    private void rdoFb_onCheckedChange(){
        rdoFb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(buttonView.isChecked()){
                    pnlBoyanacakAlanUst.setBackgroundColor(Color.BLUE);
                    pnlBoyanacakAlanAlt.setBackgroundColor(Color.YELLOW);
                    swStadium.setChecked(false);
                    swCaptan.setChecked(false);
                    txtStadyumAdi.setText("");
                    txtKaptanAdi.setText("");
                }
            }
        });
    }
    //event wrapper
    private void rdoBjk_onCheckedChange(){
        rdoBjk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(buttonView.isChecked()){
                    pnlBoyanacakAlanUst.setBackgroundColor(Color.BLACK);
                    pnlBoyanacakAlanAlt.setBackgroundColor(Color.WHITE);
                    swStadium.setChecked(false);
                    swCaptan.setChecked(false);
                    txtStadyumAdi.setText("");
                    txtKaptanAdi.setText("");
                }
            }
        });
    }

    //event wrapper
    private void swStadium_onCheckedChange(){
        swStadium.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()){
                    int checkedButtonId = rdoGrp.getCheckedRadioButtonId();
                    if(checkedButtonId == rdoGs.getId()){
                        txtStadyumAdi.setText("TT Arena");
                    }
                    if(checkedButtonId == rdoFb.getId()){
                        txtStadyumAdi.setText("Şükrü Saraçoğlu");
                    }
                    if(checkedButtonId == rdoBjk.getId()){
                        txtStadyumAdi.setText("Vodafone Arena");
                    }
                }
            }
        });
    }

    //event wrapper
    private void swCaptan_onCheckedChange(){
        swCaptan.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()){
                    int checkedButtonId = rdoGrp.getCheckedRadioButtonId();
                    if(checkedButtonId == rdoGs.getId()){
                        txtKaptanAdi.setText("Muslera");
                    }
                    if(checkedButtonId == rdoFb.getId()){
                        txtKaptanAdi.setText("Volkan Demirel");
                    }
                    if(checkedButtonId == rdoBjk.getId()){
                        txtKaptanAdi.setText("Querasma");
                    }
                }
            }
        });
    }

    public void registerHandlers(){
        rdoBjk_onCheckedChange();
        rdoFb_onCheckedChange();
        rdoGS_onCheckedChange();
        swCaptan_onCheckedChange();
        swStadium_onCheckedChange();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.compound_buttons_example);
        init();
        registerHandlers();
    }
}
