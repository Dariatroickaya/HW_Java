package FP;

//Производитель, Модель, Разрешение экрана, Процессор, Оперативная память, Видеокарта
public class NoteBook {
    String nameLaptop;
    String ModelLaptop;
    String ScreenResolution;
    String Processor;
    int RAM;
    String VideoCard;

    public NoteBook(String nameNotebook, String Model, String ScreenResolution, String Processor, int RAM, String VideoCard){
        this.nameLaptop = nameNotebook;
        this.ModelLaptop = Model;
        this.ScreenResolution = ScreenResolution;
        this.Processor = Processor;
        this.RAM = RAM;
        this.VideoCard = VideoCard;
    }
    public String getName(){
        return this.nameLaptop;
    }
    public String getModel() {
        return this.ModelLaptop;
    }
    public String getScreenResolution() {
        return this.ScreenResolution;
    }
    public String getProcessor() {
        return this.Processor;
    }
    public int getRAM(){
        return this.RAM;
    }
    public String getVideoCard(){
        return this.VideoCard;
    }

    @Override
    public String toString(){
        return "Производитель: " + nameLaptop + "; " +
                "Модель: " + ModelLaptop + "; " +
                "Разрешение экрана: " + ScreenResolution + "; " +
                "Процессор: " + Processor + "; " +
                "Оперативная память: " + RAM + " ГБ; " +
                "Видеокарта: " + VideoCard;
    }
}