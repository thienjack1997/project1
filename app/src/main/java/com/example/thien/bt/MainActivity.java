package com.example.thien.bt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnFalse,btnTrue,btnPrev,btnNext;
    TextView txtCauHoi,txtNoiDung;
    Integer i=0,dem=0,diem=0;
    Cauhoi[] ch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFalse =(Button)findViewById(R.id.btnFalse);
        btnTrue =(Button) findViewById(R.id.btnTrue);
        btnPrev = (Button)findViewById(R.id.btnPrev);
        btnNext = (Button)findViewById(R.id.btnNext);
        txtCauHoi = (TextView) findViewById(R.id.txtCauhoi);
        txtNoiDung = (TextView) findViewById(R.id.txtNoiDung);

        ch= new Cauhoi[4];
        String a = "Mặt trời lặn bên trái";
        ch[0] = new Cauhoi("Mặt trời lặn bên trái",true);
        ch[1] = new Cauhoi("Mặt trái của yêu là hận đúng hay sai?",true);
        ch[2] = new Cauhoi("LOL là Legend Of League đúng không?",false);
        ch[3] = new Cauhoi("symbiote là venom đúng hay sai",false);

        btnFalse.setOnClickListener(this);
        btnNext.setOnClickListener(this);
        btnPrev.setOnClickListener(this);
        btnTrue.setOnClickListener(this);


        i=0;
        txtNoiDung.setText(ch[i].cauhoi);


    }

    @Override

    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.btnFalse:
                if(ch[i].cautraloi!=false)
                {
                    Toast toast=Toast.makeText(MainActivity.this,"Sai rồi =)))",   Toast.LENGTH_SHORT);
                    toast.show();

                }
                else
                {
                    Toast toast=Toast.makeText(MainActivity.this, "Đúng rồi =((. Hên thế",   Toast.LENGTH_SHORT);
                    toast.show();
                    if(diem<=i)
                    {
                        diem++;
                    }

                }
                break;

            case R.id.btnTrue:
                if(ch[i].cautraloi!=true)
                {
                    Toast toast=Toast.makeText(MainActivity.this, "Sai rồi =)))",   Toast.LENGTH_SHORT);
                    toast.show();

                }
                else
                {
                    Toast toast=Toast.makeText(MainActivity.this, "Đúng rồi =((. Hên thế",   Toast.LENGTH_SHORT);
                    toast.show();
                    if(diem<=i)
                    {
                        diem++;
                    }
                }
                break;

            case R.id.btnNext:
                if(i!=3 && diem > i)
                    i++;
                txtNoiDung.setText(ch[i].cauhoi);
                btnFalse.setOnClickListener(this);
                btnNext.setOnClickListener(this);
                btnPrev.setOnClickListener(this);
                btnTrue.setOnClickListener(this);
                break;

            case R.id.btnPrev:
                if(i!=0)
                    i--;
                txtNoiDung.setText(ch[i].cauhoi);
                btnFalse.setOnClickListener(this);
                btnNext.setOnClickListener(this);
                btnPrev.setOnClickListener(this);
                btnTrue.setOnClickListener(this);
                break;

        }

    }
}
