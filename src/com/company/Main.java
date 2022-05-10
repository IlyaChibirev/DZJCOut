package com.company;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        File src = new File("D://Games", "src");
        if (src.mkdir()) {
            System.out.println("Создана директория " + src.getName());
            new File("D://Games/src", "test").mkdir();
            new File("D://Games/src", "main").mkdir();
            try {
                new File("D://Games/src/main", "Main.java").createNewFile();
                new File("D://Games/src/main", "Utils.java").createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        File res = new File("D://Games", "res");
        if (res.mkdir()) {
            System.out.println("Создана директория " + res.getName());
            new File("D://Games/res", "drawables").mkdir();
            new File("D://Games/res", "vectors").mkdir();
            new File("D://Games/res", "icons").mkdir();
        }

        File savegames = new File("D://Games", "savegames");
        if (savegames.mkdir()) {
            System.out.println("Создана директория " + savegames.getName());
        }

        File temp = new File("D://Games", "temp");
        if (temp.mkdir()) {
            System.out.println("Создана директория " + temp.getName());
            try {
                new File("D://Games/temp", "temp.txt").createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileWriter writer = new FileWriter("D://Games/temp/temp.txt");
        writer.write("Успешно созданы директории: " +
                src.getName() +
                ", " + savegames.getName() +
                ", " + temp.getName() +
                ", " + res.getName() +
                ".");
        writer.flush();
        writer.close();
    }
}
