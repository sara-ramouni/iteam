package mystory.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}


    public void buNext(View view) {
        EditText etName=(EditText) findViewById(R.id.etName);
        EditText etPower=(EditText)findViewById(R.id.etpower);


        Intent myitent=new Intent(this,Main2Activity.class);
        Bundle b= new Bundle();
        b.putString("name",etName.getText().toString());
        b.putString("power",etPower.getText().toString());
        myitent.putExtras(b);
       // myitent.putExtra("name",etName.getText().toString());
        //myitent.putExtra("power",etPower.getText().toString());
        startActivity(myitent);

    }
}
