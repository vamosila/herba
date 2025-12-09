/*
* File: Herb.java
* Author: Vámosi László Ádám
* Copyright: 2025, Vámosi László Ádám
* Group: Szoft II-N
* Date: 2025-12-09
* GitHub: https://github.com/vamosilaszloadam/
* Licenc: MIT
*/

package com.example.models;

public class Herb {
    private int id;
    private String name;
    public Herb() {}
    public Herb(String name) {
        this.name = name;
    }
    public Herb(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
