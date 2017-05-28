package id.bangunruang.bangunruang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KubusActivity extends AppCompatActivity {

    private EditText editTextsisi;
    private Button buttonhitungKubus;
    private TextView textViewhasilKubus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);

        editTextsisi = (EditText) findViewById(R.id.editTextsisi);
        buttonhitungKubus = (Button) findViewById(R.id.buttonhitungKubus);
        textViewhasilKubus = (TextView) findViewById(R.id.textViewhasilKubus);

        buttonhitungKubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sisi = editTextsisi.getText().toString().trim();

                double s = Double.parseDouble(sisi);
                double luas = s * 6;

                textViewhasilKubus.setText("Luas : " + luas);
            }
        });
    }
}
