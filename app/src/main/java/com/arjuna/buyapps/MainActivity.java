package com.arjuna.buyapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etPensil, etBuku, etPulpen;
    TextView txtHasil;
    Button btnHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //memanggil id widget
        etPensil = (EditText)findViewById(R.id.etPensil);
        etPulpen = (EditText)findViewById(R.id.etPulpen);
        etBuku = (EditText)findViewById(R.id.etBuku);
        btnHasil = (Button) findViewById(R.id.btnHasil);
        txtHasil = (TextView) findViewById(R.id.txtHasil);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mengambil nilai dari widget edit text dan memasukan kedaam nilai String
                String nPensil = etPensil.getText().toString();
                String nPulpen = etPulpen.getText().toString();
                String nBuku = etBuku.getText().toString();

                //mengecek apa edit text kosong
                //kondisi panjang nya kosong
                if(nPensil.isEmpty()){
                    //memberikan warning berupa eror
                    etPensil.setError("Nilai Pensil Tidak Boleh Kosong");
                }else if (nPulpen.isEmpty()){
                    //Kondisi ketika lebarnya kosong
                    etPulpen.setError("Nilai Buku Tidak Boleh Kosong");
                }else if (nBuku.isEmpty()){
                    etBuku.setError("Nilai Buku Tidak Boleh Kosong ");

                }else {

                    //mengubah nilai dari String ke Interger
                    int aBuku = Integer.parseInt(nBuku);
                    int aPensil = Integer.parseInt(nPensil);
                    int aPulpen = Integer.parseInt(nPulpen);


                    //kondisi ketika panjang dan lebar nya tidak kosong
                    int hasilBuku = (aBuku * 750 );
                    int hasilPensil = (aBuku * 2500 );
                    int hasilPulpen = (aBuku * 3000 );

                    int total = hasilBuku + hasilPensil + hasilPulpen;

                    //menampilkan hasil hitung ke widget textview
                    txtHasil.setText("Total Harga adalah : " + " " + total);
                }
            }
        });
    }
}
