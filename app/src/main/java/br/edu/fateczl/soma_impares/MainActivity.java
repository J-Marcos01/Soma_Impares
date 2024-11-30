package br.edu.fateczl.soma_impares;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import controller.SomaController;

public class MainActivity extends AppCompatActivity {

    private EditText etNum1;
    private EditText etNum2;
    private TextView tvRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        etNum1=findViewById(R.id.eTNum_1);
        etNum1.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);
        etNum2=findViewById(R.id.eTNum_2);
        etNum2.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);
        Button btnMaior=findViewById(R.id.btnMaior);
        Button btnSoma=findViewById(R.id.btnSoma);
        tvRes=findViewById(R.id.tvRes);
        tvRes.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);


        btnSoma.setOnClickListener(op -> soma() );
        btnMaior.setOnClickListener(op -> maior());
    }

    private void soma(){
        SomaController somaCont=new SomaController();

        int n1=Integer.parseInt(etNum1.getText().toString());
        int n2=Integer.parseInt(etNum2.getText().toString());

        int res=somaCont.soma(n1,n2);

        String result=getString(R.string.Res_Soma)+ " ="+res;

        tvRes.setText(result);

    }

    private void maior(){
        SomaController somaCont=new SomaController();

        int n1=Integer.parseInt(etNum1.getText().toString());
        int n2=Integer.parseInt(etNum2.getText().toString());

        int res=somaCont.maior(n1,n2);

        String result=getString(R.string.Res_Maior)+ " ="+res;

        tvRes.setText(result);

    }




}