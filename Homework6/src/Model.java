package FP;
////�������������, ������, ���������� ������, ���������, ����������� ������, ����������
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
                    
                    �������� �������:
                    1 - �������������
                    2 - ������
                    3 - ���������� ������
                    4 - ���������
                    5 - ����������� ������
                    6 - ����������
                    0 - �����
                    :\s""");

            int num = Integer.parseInt(reader.readLine());

            if (num == 1) {
                System.out.println("��������� �������������: " + FinalProject.laptopNames);
                System.out.println("������� �������������: ");
                String name = reader.readLine().toLowerCase();
                findName(name);
            } else if (num == 2) {
                System.out.println("��������� ������: " + FinalProject.laptopModels);
                System.out.println("������� ������: ");
                String model = reader.readLine().toLowerCase();
                findModel(model);
            } else if (num == 3) {
                System.out.println("��������� ����������: " + FinalProject.laptopScrRes);
                System.out.println("������� ���������� ������: ");
                String screenResolution = reader.readLine().toLowerCase();
                findScreenResolution(screenResolution);
            } else if (num == 4) {
                System.out.println("��������� ������ �����������: " + FinalProject.laptopCPU);
                System.out.println("������� ������ ����������: ");
                String processor = reader.readLine().toLowerCase();
                findProcessor(processor);
            } else if (num == 5) {
                System.out.println("��������� ������ ����������� ������: " + FinalProject.laptopRAM);
                System.out.println("������� ����� ����������� ������: ");
                int ram = Integer.parseInt(reader.readLine());
                findRAM(ram);
            } else if (num == 6) {
                System.out.println("��������� ������ ���������: " + FinalProject.laptopVCard);
                System.out.println("������� ������ ����������: ");
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