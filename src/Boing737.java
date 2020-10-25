public class Boing737 extends Aircraft{
    @Override
    public void fly(){
        System.out.println("Самалёт Boing737 летит со скоростью 900 км/ч");

    }
    @Override
    public void Takeoff(){
        System.out.println("Самалёт Boing737 взлетает горизонтально, длина взлётно-посадочной полосы 3 км");
    }
    @Override
    public void TypeOfAircraft(){
        System.out.println("Самалёт Boing737 является пассажирским, количество пассажирских мест 350");
    }

}
