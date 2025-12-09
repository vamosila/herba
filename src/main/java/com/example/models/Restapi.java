/*
* File: Restapi.java
* Author: Vámosi László Ádám
* Copyright: 2025, Vámosi László Ádám
* Group: Szoft II-N
* Date: 2025-12-09
* GitHub: https://github.com/vamosilaszloadam/
* Licenc: MIT
*/

package com.example.models;

import java.util.ArrayList;

import hu.szit.resclient.ResClient;
import hu.szit.resclient.ResConvert;

public class Restapi {
    
    public static String url = "http://localhost:8000/api/herbs";
    public static double durationMs = 0.0;

    public ArrayList<Herb> getHerbs() {
        ResClient client = new ResClient();

        long startTime = System.nanoTime();
        String json = client.get(url);
        long endTime = System.nanoTime();

        durationMs = (endTime - startTime) / 1_000_000.0;

        Result result = ResConvert.toObject(json, Result.class);

        if(result.success) {
            return result.data;
        }
        return new ArrayList<Herb>();
    }
}
