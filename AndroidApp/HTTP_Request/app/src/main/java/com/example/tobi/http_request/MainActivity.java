package com.example.tobi.http_request;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;


public class MainActivity extends Activity {

    TextView content;
    EditText vorname, nachname, password, password2, nickname;
   // Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //content = (TextView)findViewById(R.id.content);
        vorname = (EditText)findViewById(R.id.editText);
        nachname = (EditText)findViewById(R.id.editText4);
        nickname = (EditText)findViewById(R.id.editText3);
        password = (EditText)findViewById(R.id.editText2);
        password2 = (EditText)findViewById(R.id.editText5);


       Button save = (Button)findViewById(R.id.button);

        save.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                //Message for loading
                Toast.makeText(getBaseContext(), "...Loading - connecting to server", Toast.LENGTH_LONG).show();

                try{
                    //URL - Eingegebene daten in Code umwandeln
                    String vnValue = vorname.getText().toString();
                    String nnValue = nachname.getText().toString();
                    String nickValue = nickname.getText().toString();
                    String pwValue = password.getText().toString();       //String passwordValue = URLEncoder.encode(password.getText().toString(), "UTF-8");
                    String pw2Value = password2.getText().toString();

                    //String s = 12 + ""; Integer auf String easy konvertieren
                    //HTTP client object fürs senden der daten
                    HttpClient Client = new DefaultHttpClient();

                    //URL string
                    String URL = "http://localhost:8080/PTNGServerProjekt/Registration?BenutzerID="+nickValue+"&pas="+pwValue+"&pass="+pw2Value+"&vorname="+vnValue+"&nachname="+nnValue;

                    //"+vnValue+"&nachname="+nnValue+"&benutzerid="+nickValue+"&password="+pwValue;
                    //BenutzerID = nickname
                    //pas
                    //pass (passwort2)
                    //vorname
                    //nachname

                    try{
                        String SetServerString="";

                        //Request erzeugen und auf response reagieren
                        HttpGet httpget = new HttpGet(URL);
                        ResponseHandler<String> responseHandler = new BasicResponseHandler();
                        SetServerString = Client.execute(httpget, responseHandler);

                        //Zeige antwort bei aktivität
                        content.setText(SetServerString);



                    }catch(Exception ex){
                        content.setText("Fail");
                    }
                }
                catch(Exception ex){
                    content.setText("Fail");
                }


            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
