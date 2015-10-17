package com.example.IFT604_tp2;

import HockeyLive.Common.Models.Game;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MatchListActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

//        HockeyLive.Common.HockeyLive.Common.Models.Game game = new HockeyLive.Common.HockeyLive.Common.Models.Game();
        Game game = new Game(0, "", "");
        ListView matchList = (ListView) findViewById(R.id.matchList);

        String[] listTest = {
                "Match 1",
                "Match 2",
                "Match 3",
                "Match 4",
                "Match 5",
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listTest);

        matchList.setAdapter(adapter);
    }
}
