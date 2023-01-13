package FP;

import java.io.IOException;
import java.util.HashSet;
import java.util.TreeSet;

public class FinalProject {
    static HashSet<NoteBook> setNoteBooks = new HashSet<>();
    static HashSet<String> laptopNames = new HashSet<>();
    static HashSet<String> laptopModels = new HashSet<>();
    static HashSet<String> laptopScrRes = new HashSet<>();
    static HashSet<String> laptopCPU = new HashSet<>();
    static TreeSet<Integer> laptopRAM = new TreeSet<>();
    static HashSet<String> laptopVCard = new HashSet<>();

    public static void main(String[] args) throws IOException {
        NoteBook noteBook1 = new NoteBook("ASUS", "X515EA-BQ1461W", "1920x1080", "Intel Pentium Gold 7505", 8, "Intel UHD Graphics");
        NoteBook noteBook2 = new NoteBook("Lenovo", "IdeaPad 3 15ABA7", "1920x1080", "AMD Ryzen 5", 16, "AMD Radeon Graphics");
        NoteBook noteBook3 = new NoteBook("Apple", "MacBook Air 13 Late 2020", "2560x1600", "Apple M1", 8, "Apple graphics 7-core");
        NoteBook noteBook4 = new NoteBook("Lenovo", "IdeaPad 3 15ADA05", "1920x1080", "AMD Ryzen 3 3250U", 4, "AMD Radeon Graphics");
        NoteBook noteBook5 = new NoteBook("HP", "Victus 16-e1050ci", "1920x1080", "AMD Ryzen 5 6600H", 16, "NVIDIA GeForce RTX 3050 Ti");
        setNoteBooks.add(noteBook1);
        setNoteBooks.add(noteBook2);
        setNoteBooks.add(noteBook3);
        setNoteBooks.add(noteBook4);
        setNoteBooks.add(noteBook5);
        Model.addSpecsLap();
        Model.menu();
    }
}