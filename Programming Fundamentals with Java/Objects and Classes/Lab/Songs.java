package objectsAndClasses.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {

    static class Song{
        String typeList;
        String name;
        String time;

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        public String getTypeList() {
            return typeList;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getTime() {
            return time;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Song> song = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] songLine = scanner.nextLine().split("_");
            Song currentSong = new Song();

            currentSong.setTypeList(songLine[0]);
            currentSong.setName(songLine[1]);
            currentSong.setTime(songLine[2]);

            song.add(currentSong);
        }

        String inquiredType = scanner.nextLine();
        if (inquiredType.equals("all")) {
            for (int i = 0; i < song.size(); i++) {
                System.out.println(song.get(i).getName());
            }
        } else {
            for (int i = 0; i < song.size(); i++) {
                if (song.get(i).getTypeList().equals(inquiredType)) {
                    System.out.println(song.get(i).getName());
                }
            }
        }
    }

}
