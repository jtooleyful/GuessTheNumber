/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.guessthenumber.dao;

import com.sg.guessthenumber.entity.Game;
import java.util.List;

/**
 *
 * @author Jtooleyful
 */
public interface GameDao {
    Game addGame();
    Game getGame(int gameId);
    List<Game> getAllGames();
    Game updateStatus(int gameId);
    
}
