import java.util.concurrent.CancellationException;

class Animal  {

    public void versoanimale () {
        System.out.println("Gli animali fanno tanti versi");
    } 

}

 class Cane extends Animal {
    public void versoanimale () {
        System.out.println("Il cane fa bau");
    }
}

 class Gatto extends Animal {
    public void versoanimale () {
        System.out.println("Il Gatto fa miao");
    }
}

class Main {
    public static void main(String[] args) {
        Animal MioAnimale = new Animal();
        Animal MioGatto = new Gatto();
        Animal MioCane = new Cane();
        MioAnimale.versoanimale();
        MioGatto.versoanimale();
        MioCane.versoanimale();
    }
}