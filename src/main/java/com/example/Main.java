/*
* File: Main.java
* Author: Vámosi László Ádám
* Copyright: 2025, Vámosi László Ádám
* Group: Szoft II-N
* Date: 2025-12-09
* GitHub: https://github.com/vamosilaszloadam/
* Licenc: MIT
*/

package com.example;

import org.fusesource.jansi.AnsiConsole;

import com.example.controllers.MainController;

public class Main {
    public static void main(String[] args) {
        AnsiConsole.systemInstall();
        System.out.println("\nREST API lekérdezés...\n");
        MainController.startProgram();
        AnsiConsole.systemUninstall();
    }
}