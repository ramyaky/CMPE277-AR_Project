package com.wikitude.samples.utils.urllauncher;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.jpardogo.listbuddies.lib.views.ListBuddiesLayout;
import com.wikitude.samples.adapters.CircularAdapter;
import com.wikitude.sdksamples.R;

import java.util.Arrays;

public class Catalog extends Activity {
//    int[] imageID = {R.drawable.car,R.drawable.minion};
//    final ViewGroup viewGroup = (ViewGroup) ((ViewGroup) this
//            .findViewById(android.R.id.content)).getChildAt(0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);

//        GridView gridView = (GridView) findViewById(R.id.grid);
//        gridView.setAdapter(new ImageAdapter(this,imageID));
//
//
//
//        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(Catalog.this, "" + position,
//                        Toast.LENGTH_SHORT).show();
//            }
//        });

        ListBuddiesLayout listBuddies = (ListBuddiesLayout) findViewById(R.id.listbuddies);
        CircularAdapter adapter = new CircularAdapter(getApplicationContext(), getResources().getDimensionPixelSize(R.dimen.image_size1), Arrays.asList(ImageUrls.imageUrls_left));
        CircularAdapter adapter2 = new CircularAdapter(getApplicationContext(), getResources().getDimensionPixelSize(R.dimen.image_size2), Arrays.asList(ImageUrls.imageUrls_right));
        listBuddies.setAdapters(adapter, adapter2);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_catalog, menu);
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
