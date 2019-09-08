package mystory.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView txtnp= (TextView)findViewById(R.id.txtnp);

        Bundle bb=getIntent().getExtras();
        String name = bb.getString("name");
        String power = bb.getString("power");

        txtnp.setText("power "+power);
        txtnp.setText("name "+name);




    }


    public void bushow(View view) {
        EditText etstory = (EditText)findViewById(R.id.etstory);
        Bundle b = new Bundle();
        b.putString("story",etstory.getText().toString());
        String story= b.getString("story");
        TextView txtstory= (TextView)findViewById(R.id.txtstory);
        txtstory.setText("your story: "+story);

    }
}
