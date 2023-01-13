package FP;
////Производитель, Модель, Разрешение экрана, Процессор, Оперативная память, Видеокарта
//public class NoteBook {
//    String nameNotebook;
//    String Model;
//    String ScreenResolution;
//    String Processor;
//    String RAM;
//    String VideoCard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Model {
    public static void menu() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean run = true;
        while (run) {
            System.out.print("""
                    
                    Выберете вариант:
                    1 - Производитель
                    2 - Модель
                    3 - Разрешение экрана
                    4 - Процессор
                    5 - Оперативная память
                    6 - Видеокарта
                    0 - Выход
                    :\s""");

            int num = Integer.parseInt(reader.readLine());

            if (num == 1) {
                System.out.println("Доступные производители: " + FinalProject.laptopNames);
                System.out.println("Введите производителя: ");
                String name = reader.readLine().toLowerCase();
                findName(name);
            } else if (num == 2) {
                System.out.println("Доступные модели: " + FinalProject.laptopModels);
                System.out.println("Введите модель: ");
                String model = reader.readLine().toLowerCase();
                findModel(model);
            } else if (num == 3) {
                System.out.println("Доступные разрешения: " + FinalProject.laptopScrRes);
                System.out.println("Введите разрешение экрана: ");
                String screenResolution = reader.readLine().toLowerCase();
                findScreenResolution(screenResolution);
            } else if (num == 4) {
                System.out.println("Доступные модели процессоров: " + FinalProject.laptopCPU);
                System.out.println("Введите модель процессора: ");
                String processor = reader.readLine().toLowerCase();
                findProcessor(processor);
            } else if (num == 5) {
                System.out.println("Доступные объемы оперативной памяти: " + FinalProject.laptopRAM);
                System.out.println("Введите объем оперативной памяти: ");
                int ram = Integer.parseInt(reader.readLine());
                findRAM(ram);
            } else if (num == 6) {
                System.out.println("Доступные модели видеокарт: " + FinalProject.laptopVCard);
                System.out.println("Введите модель видеокарты: ");
                String vCard = reader.readLine().toLowerCase();
                findVideoCard(vCard);
            } else if (num == 0) {
                reader.close();
                run = false;
            }
        }
    }

    private static void findName(String nameLap) {
        for (NoteBook noteBook : FinalProject.setNoteBooks) {
            if (nameLap.equalsIgnoreCase(noteBook.getName())) {
                System.out.println(noteBook);
            }
        }
    }

    private static void findModel(String modelLap) {
        for (NoteBook noteBook : FinalProject.setNoteBooks) {
            if (noteBook.getModel().toLowerCase().contains(modelLap) || noteBook.getModel().equalsIgnoreCase(modelLap)) {
                System.out.println(noteBook);
            }
        }
    }

    private static void findScreenResolution(String ScreenRes) {
        for (NoteBook noteBook : FinalProject.setNoteBooks) {
            if (noteBook.getScreenResolution().contains(ScreenRes)) {
                System.out.println(noteBook);
            }
        }
    }

    private static void findProcessor(String procLap) {
        for (NoteBook noteBook : FinalProject.setNoteBooks) {
            if (noteBook.getProcessor().equalsIgnoreCase(procLap) || noteBook.getProcessor().toLowerCase().contains(procLap)) {
                System.out.println(noteBook);
            }
        }
    }

    private static void findRAM(int RAMLap) {
        for (NoteBook noteBook : FinalProject.setNoteBooks) {
            if (noteBook.getRAM() == RAMLap) {
                System.out.println(noteBook);
            }
        }
    }
    private static void findVideoCard(String VCLap) {
        for (NoteBook noteBook : FinalProject.setNoteBooks) {
            if (noteBook.getVideoCard().toLowerCase().contains(VCLap) || noteBook.getVideoCard().equalsIgnoreCase(VCLap)) {
                System.out.println(noteBook);
            }
        }
    }

    public static void addSpecsLap(){
        for (NoteBook laptop : FinalProject.setNoteBooks) {
            FinalProject.laptopNames.add(laptop.getName());
            FinalProject.laptopModels.add(laptop.getModel());
            FinalProject.laptopScrRes.add(laptop.getScreenResolution());
            FinalProject.laptopCPU.add(laptop.getProcessor());
            FinalProject.laptopRAM.add(laptop.getRAM());
            FinalProject.laptopVCard.add(laptop.getVideoCard());
        }
    }
}