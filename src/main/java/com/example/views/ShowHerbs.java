/*
* File: ShowHerbs.java
* Author: Vámosi László Ádám
* Copyright: 2025, Vámosi László Ádám
* Group: Szoft II-N
* Date: 2025-12-09
* GitHub: https://github.com/vamosilaszloadam/
* Licenc: MIT
*/

package com.example.views;

import java.util.ArrayList;

import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.Ansi.Color;

import com.example.models.Herb;
import com.example.models.Restapi;

public class ShowHerbs {
    public static void startShow(ArrayList<Herb> herbList) {

        Ansi.Color color =
            Restapi.durationMs >= 150 ? Color.RED : 
            Restapi.durationMs >= 100 ? Color.YELLOW : 
                                        Color.GREEN;

        System.out.println("+----+-----------+");
        System.out.println("| id | name      |");
        System.out.println("+----+-----------+");
        for (Herb herb : herbList) {
            System.out.printf(
                "| %2d | %-9.9s |\n",
                herb.getId(),
                herb.getName()
            );
        }
        System.out.println("+----+-----------+");
        System.out.println();
        System.out.printf(
            "%d db növény lekérdezve %s alatt.\n",
            herbList.size(),
            Ansi.ansi().fg(color).a(String.format("%.4f ms", Restapi.durationMs)).reset()
        );
        System.out.println();
    }
}
