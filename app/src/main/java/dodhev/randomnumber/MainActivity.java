package dodhev.randomnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText min;
    EditText max;
    TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int generarNumero() {

        int nMin = 0;
        int nMax = 0;

        min = (EditText) findViewById(R.id.min);
        max = (EditText) findViewById(R.id.max);

        String sNum1 = min.getText().toString();
        String sNum2 = max.getText().toString();

        nMin = Integer.parseInt(sNum1);
        nMax = Integer.parseInt(sNum2);

        int aux = nMin;

        if (nMin > nMax){

            nMin = nMax;
            nMax = aux;
        }

        Random r = new Random();

        int random = r.nextInt(nMax - nMin) + nMin;

        return random;
    }

    public void mostrarNumero(View v){


        resultado = (TextView) findViewById(R.id.resultado);
        resultado.setText(generarNumero()+"");

    }



}
