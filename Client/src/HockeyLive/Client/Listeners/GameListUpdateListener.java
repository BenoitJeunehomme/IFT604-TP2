package HockeyLive.Client.Listeners;

import HockeyLive.Common.Models.Game;

import java.util.List;

/**
 * Created by Micha�l on 10/16/2015.
 */
public interface GameListUpdateListener {
    void UpdateGameList(List<Game> games);
}
