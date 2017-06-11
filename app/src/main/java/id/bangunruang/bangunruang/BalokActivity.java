package id.bangunruang.bangunruang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BalokActivity extends AppCompatActivity {

    private EditText PanjangeditText,LebareditText,TinggieditText;
    private Button buttonHitungBalok;
    private TextView LuasBaloktextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);

        PanjangeditText = (EditText) findViewById(R.id.PanjangeditText);
        LebareditText = (EditText) findViewById(R.id.LebareditText);
        TinggieditText = (EditText) findViewById(R.id.GLukiseditText);
        buttonHitungBalok = (Button) findViewById(R.id.buttonHitungBalok);
        LuasBaloktextView = (TextView) findViewById(R.id.LuasBaloktextView);

        buttonHitungBalok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String panjang = PanjangeditText.getText().toString().trim();
                String lebar = LebareditText.getText().toString().trim();
                String tinggi = TinggieditText.getText().toString().trim();

                double p = Double.parseDouble(panjang);
                double l = Double.parseDouble(lebar);
                double t = Double.parseDouble(tinggi);
                double a = p*l;
                double b = p*t;
                double c = l*t;
                double luas = 2*(a + b + c);

                LuasBaloktextView.setText("Luas Selimut Balok = " + luas);
            }
        });
    }
}
