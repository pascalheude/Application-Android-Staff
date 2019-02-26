package com.assistanceinformatiquetoulouse.roulezrose.staff;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;

/**
 * An activity representing a single Item detail screen. This
 * activity is only used narrow width devices. On tablet-size devices,
 * item contenu are presented side-by-side with a list of items
 * in a {@link ItemListActivity}.
 */
// Class ItemDetailActivity
public class ItemDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.detail_toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fabRandonnee);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own detail action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // Show the Up button in the action bar.
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null)
        {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        else
        {
        }
        // savedInstanceState is non-null when there is fragment state
        // saved from previous configurations of this activity
        // (e.g. when rotating the screen from portrait to landscape).
        // In this case, the fragment will automatically be re-added
        // to its container so we don't need to manually add it.
        // For more information, see the Fragments API guide at:
        //
        // http://developer.android.com/guide/components/fragments.html
        //
        if (savedInstanceState == null)
        {
            // Create the detail fragment and add it to the activity
            // using a fragment transaction.
            Bundle arguments = new Bundle();
            arguments.putInt(getString(R.string.randonnee), getIntent().getIntExtra(getString(R.string.randonnee), 0));
            arguments.putString(getString(R.string.nom), getIntent().getStringExtra(getString(R.string.nom)));
            arguments.putInt(getString(R.string.id), getIntent().getIntExtra(getString(R.string.id), 0));
            arguments.putString(getString(R.string.presence), getIntent().getStringExtra(getString(R.string.presence)));
            arguments.putInt(getString(R.string.poste), getIntent().getIntExtra(getString(R.string.poste), 0));
            arguments.putInt(getString(R.string.conducteur), getIntent().getIntExtra(getString(R.string.conducteur), 0));
            arguments.putInt(getString(R.string.jaune), getIntent().getIntExtra(getString(R.string.jaune), 0));
            arguments.putInt(getString(R.string.eclaireur), getIntent().getIntExtra(getString(R.string.eclaireur), 0));
            arguments.putInt(getString(R.string.meneur), getIntent().getIntExtra(getString(R.string.meneur), 0));
            arguments.putInt(getString(R.string.lanterne), getIntent().getIntExtra(getString(R.string.lanterne), 0));
            arguments.putInt(getString(R.string.present), getIntent().getIntExtra(getString(R.string.present), 0));
            arguments.putInt(getString(R.string.binome), getIntent().getIntExtra(getString(R.string.binome), 0));
            ItemDetailFragment fragment = new ItemDetailFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.item_detail_container, fragment)
                    .commit();
        }
        else
        {
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home)
        {
            // This ID represents the Home or Up button. In the case of this
            // activity, the Up button is shown. For
            // more contenu, see the Navigation pattern on Android Design:
            //
            // http://developer.android.com/design/patterns/navigation.html#up-vs-back
            //
            navigateUpTo(new Intent(this, ItemListActivity.class));
            return(true);
        }
        else
        {
        }
        return(super.onOptionsItemSelected(item));
    }

    @Override
    public void finish() {
        setResult(RESULT_OK);
        super.finish();
    }
}