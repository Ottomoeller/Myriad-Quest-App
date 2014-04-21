package questapp.myapp;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    public final static String EXTRA_MESSAGE1 = "questapp.myapp.MESSAGE";

    /** Called when the user clicks the Send button */
    public void loginAs(View view) {
        Intent intent = new Intent(this, DisplayQuestsActivity.class);
        EditText username = (EditText) findViewById(R.id.edit_username);
        EditText password = (EditText) findViewById(R.id.edit_password);

        if(username.getText().toString().equals("Lancelot") && password.getText().toString().equals("arthurDoesntKnow")){
            Toast.makeText(getApplicationContext(), "Redirecting...",
                    Toast.LENGTH_LONG).show();
            intent.putExtra(EXTRA_MESSAGE1, "Quest List");
            startActivity(intent);
        }  else {
            //Toast.makeText(getApplicationContext(), Toast.LENGTH_SHORT).show();
            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("wrong password or username");
            dlgAlert.setTitle("Error Message...");
            dlgAlert.create().show();
            password.setHintTextColor(Color.RED);
            username.setHintTextColor(Color.RED);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
