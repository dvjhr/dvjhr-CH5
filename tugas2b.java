public class tugas2b {
    
    public static void main(String[] args) {
        
        

    }

}

class Vehicle {

    int roda = 0;
    
    public void maju() {
        
        System.out.println("Maju");

    }
    
    public void mundur() {
        
        System.out.println("Mundur");

    }
    
    public void belok(String blk) {
        
        System.out.println("Kendaraan berbelok ke " + blk);

    }

}

class Car extends Vehicle {

    int roda = 4;
    int tangki = 1;
    
    public void maju() {
        
        System.out.println("Mobil bergerak maju");

    }
    
    public void mundur() {
        
        System.out.println("Mobil bergerak mundur");

    }
    
    public void belok(String blk) {
        
        System.out.println("Mobil berbelok ke  " + blk);

    }

}

class HondaJazz extends Car {

    int roda = 4;
    int tangki = 2;
    
    public void maju() {
        
        System.out.println("Mobil bergerak maju");

    }
    
    public void mundur() {
        
        System.out.println("Mobil bergerak mundur");

    }
    
    public void belok(String blk) {
        
        System.out.println("Mobil berbelok ke  " + blk);

    }
    
    public void menghilang(String hlg) {
        
        System.out.println("Mobil" + hlg + "menghilang");

    }

}