package job;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

// Создание класса Laptop
public class Laptop {
// Создание поля на основе другого класса
    private List<Brand> brands;
// Создание полей
    private String model;
    private float diagonal;
    private String screenResolution;
    private boolean dvdRom;
    private int hardDisk;
    private String operativeMemory;
    private String operatingSystem;
    private String color;
// Создание пустого конструктора для работы с методами
    public Laptop() {
    }
// Создание конструктора для создания экземпляров класса
    public Laptop(String model, float diagonal, String screenResolution, boolean dvdRom, int hardDisk,
            String operativeMemory, String operatingSystem, String color) {
        this.brands = new ArrayList<>();
        this.model = model;
        this.diagonal = diagonal;
        this.screenResolution = screenResolution;
        this.dvdRom = dvdRom;
        this.hardDisk = hardDisk;
        this.operativeMemory = operativeMemory;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }
// Создание методов get\set Для работы с private полями
    public String getModel() {return model;}
    public float getDiagonal() {return diagonal;}
    public String getScreenResolution() {return screenResolution;}
    public boolean isDvdRom() {return dvdRom;}
    public int getHardDisk() {return hardDisk;}
    public String getOperativeMemory() {return operativeMemory;}
    public String getOperatingSystem() {return operatingSystem;}
    public String getColor() {return color;}
// Создание метода для создания экземпляра другого класса,
// для того что бы работать с этими экземпляррами в данном классе
    public void addBrand(Brand brand) {
        brands.add(brand);
    }
// создание метода фильтрации ноутбуков по критериям
    public List<Laptop> filter(Set<Laptop> laptop) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Здрасвуйте, Укажите каие параметры для ноут бука вы бы хотели иметь." +
                "\nУкажите размер жёсткого диска в гб\nВналичии : 300,500,600,700,1000");
        String enterHardDisk = scan.nextLine();
        int intParseEnterHardDisk = Integer.parseInt(enterHardDisk);
        System.out.println("Укажите количество оперативной памяти в Гб\nВналичии : 4, 8, 16 ");
        String enterOperativeMemory = scan.nextLine();
        System.out.println("Укажите операционную систему\nВналичии : Linux, ios, Windows");
        String enterOperatingSystem = scan.nextLine();
        System.out.println("Укажите цвет ноутбука\nВналичии : black, white");
        String enterColor = scan.nextLine();

        List<Laptop> listLaptop = new ArrayList<>();
        for (Laptop tempLaptop : laptop) {
            if (intParseEnterHardDisk == tempLaptop.hardDisk) {
                if (enterOperativeMemory.equals(tempLaptop.operativeMemory)) {
                    if (enterOperatingSystem.equals(tempLaptop.operatingSystem)) {
                        if (enterColor.equals(tempLaptop.color)) {
                            listLaptop.add(tempLaptop);
                        }
                    }
                }
            }
        }
        return listLaptop;
    }

// создание метода фильтрации ноутбуков по выборочной критериям
    public Set<Laptop> newFilter(Set<Laptop> laptop) {
        Scanner scan = new Scanner(System.in);
        Set<Laptop> listLaptop = new HashSet<>(laptop);

        System.out.println("Здрасвуйте, Укажите номер или номера критериев фильрации ноутбуков," + 
        "\n1. Size hard disk\n2. Size operatyvi memory\n3. Operating system\n4. Color");
        String userRequest = scan.nextLine();
            
        for (int i = 0; i < userRequest.length(); i++) {
            if(1 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("Укажите размер жёсткого диска в гб\nВналичии : 300,500,600,700,1000");
                String enterHardDisk = scan.nextLine();
                int intParseEnterHardDisk = Integer.parseInt(enterHardDisk);
                for (Laptop tempLaptop : laptop) {
                    if (intParseEnterHardDisk != tempLaptop.hardDisk){ 
                        listLaptop.remove(tempLaptop);
                    }
                }          
            }
            
            if(2 == Character.getNumericValue(userRequest.charAt(i))){
                System.out.println("Укажите количество оперативной памяти в Гб\nВналичии : 4, 8, 16 ");
                String enterOperativeMemory = scan.nextLine();
                for (Laptop tempLaptop : laptop) {
                    if ((enterOperativeMemory.equals(tempLaptop.operativeMemory)) == false) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }   

            if(3 == Character.getNumericValue(userRequest.charAt(i))){
                System.out.println("Укажите операционную систему\nВналичии : Linux, ios, Windows");
                String enterOperatingSystem = scan.nextLine();
                for (Laptop tempLaptop : laptop) {
                    if ((enterOperatingSystem.equals(tempLaptop.operatingSystem) == false)) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }
        
            if(4 == Character.getNumericValue(userRequest.charAt(i))){
                System.out.println("Укажите цвет ноутбука\nВналичии : black, white");
                String enterColor = scan.nextLine();
                for (Laptop tempLaptop : laptop) {
                    if ((enterColor.equals(tempLaptop.color)) == false) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }
        }
        return listLaptop;
    }

// метод toString, выводит на экран данные объекта
    @Override
    public String toString() {
        return "\nLaptop  ->  " + model + "\nbrands = " + brands + ",\ndiagonal = " + diagonal + ",\nscreenResolution = "
                + screenResolution
                + ",\ndvdRom = " + dvdRom + ",\nhardDisk = " + hardDisk + ",\noperativeMemory = " + operativeMemory
                + ",\noperatingSystem = " + operatingSystem + ",\ncolor = " + color + "\n";
    }

}