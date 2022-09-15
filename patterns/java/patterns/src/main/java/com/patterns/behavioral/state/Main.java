package com.patterns.behavioral.state;

import com.patterns.behavioral.state.ui.Player;
import com.patterns.behavioral.state.ui.UI;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
