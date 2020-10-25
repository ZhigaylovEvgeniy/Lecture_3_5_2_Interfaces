public class Mi8 extends Helicopter{
    @Override
    public void fly() {
        System.out.println("Вертолёт Mi8 летит со скоростью 350 км/ч");
    }
    @Override
    public void Takeoff(){
        System.out.println("Вертолёт Mi8 взлетает вертикально, длина взлётно-посадочной полосы 50 метров");
    }
    @Override
    public void TypeOfAircraft(){
        System.out.println("Вертолёт Mi8 многоцелевой вертолёт(может быть грузовым или пассажирским), грузоподъёмность 6989 кг");
    }
}
