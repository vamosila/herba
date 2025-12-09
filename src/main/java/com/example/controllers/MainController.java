/*
* File: MainController.java
* Author: Vámosi László Ádám
* Copyright: 2025, Vámosi László Ádám
* Group: Szoft II-N
* Date: 2025-12-09
* GitHub: https://github.com/vamosilaszloadam/
* Licenc: MIT
*/

package com.example.controllers;

import java.util.ArrayList;

import com.example.models.Herb;
import com.example.models.Restapi;
import com.example.views.ShowHerbs;

public class MainController {
    public static void startProgram() {
        System.out.println("GET " + Restapi.url + "\n");
        ArrayList<Herb> herbList = new Restapi().getHerbs();
        ShowHerbs.startShow(herbList);
    }
}
