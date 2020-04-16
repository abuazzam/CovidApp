package id.web.chung.covidapp;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.btnMoreInfo)
    ImageButton btnMoreInfo;
    @BindView(R.id.tvLihatProvinsi)
    TextView tvLihatProvinsi;
    @BindView(R.id.txtPositif)
    TextView txtPositif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        //txtPositif.setText("2K");
    }

    @OnClick(R.id.tvLihatProvinsi)
    void pageProvinsi(View view) {
        pindah(ProvinsiActivity.class);
    }

    @OnClick(R.id.btnMoreInfo)
    void pageInfo(View view) {
        pindah(InfoActivity.class);
    }

    private void pindah(Class aClass) {
        Intent intent = new Intent(getApplicationContext(), aClass);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }


}
