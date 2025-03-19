package oop.labor05.example;

import oop.labor05.example.Termek;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Raktar {
    private ArrayList<Termek> termekek=new ArrayList<>();

    public Raktar(String file) {
        try (Scanner scanner = new Scanner(new File(file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(" ");
                int azonosito = Integer.parseInt(items[0].trim());
                String elnevezes = items[1].trim();
                float beszerzesiAr = Float.parseFloat(items[2].trim());
                float arres = Float.parseFloat(items[3].trim());
                Termek termek = new Termek(azonosito,elnevezes,beszerzesiAr);
                termek.setArres(arres);
                termekek.add(termek);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
