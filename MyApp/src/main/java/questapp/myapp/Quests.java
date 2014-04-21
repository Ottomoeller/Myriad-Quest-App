package questapp.myapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Quests extends ActionBarActivity {
    public final static String EXTRA_MESSAGE2 = "questapp.myapp.MESSAGE";

    public void quest1Details(View view){
        Intent intent1 = new Intent(this, BanditsInTheWoodsActivity.class);
      startActivity(intent1);
    }

    public void quest2Details(View view){
        Intent intent2 = new Intent(this, SpecialDeliveryActivity.class);
        startActivity(intent2);
    }

    public void quest3Details(View view){
        Intent intent3 = new Intent(this, FilthyMongrelActivity.class);
        startActivity(intent3);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE1);

        // Set the text view as the activity layout
        setContentView(R.layout.activity_display_quests);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.display_message, menu);
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
