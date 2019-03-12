package app.primeiro.br.edu.fvs.tipagempessoas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtResult;
    Button btClassificacao;
    EditText txtPeso;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResult = findViewById(R.id.txtResult);
        btClassificacao = findViewById(R.id.btClassificacao);
        txtPeso = findViewById(R.id.txtPeso);

        btClassificacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pesoString = txtPeso.getText().toString();
                Integer pesoInt = Integer.parseInt(pesoString);

                if (pesoInt <= 50) {
                    txtResult.setText("Você está abaixo do peso seu fudido");
                }else if (pesoInt > 50 && pesoInt <= 100){
                    txtResult.setText("Peso ideal, não tão fudido");
                }else{
                    txtResult.setText("Obesidade, coma menos seu fudido");
                }
            }
        });
    }
}
