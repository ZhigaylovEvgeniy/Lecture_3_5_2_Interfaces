public abstract class Aircraft extends FlyingObject{
    public void fly(){
        System.out.println("Переопределите этот метод " +
                "как летать должен ваш объект");
    }
    public void Takeoff(){
        System.out.println("Переопределите этот метод " +
                "как взлетать должен ваш объект");
    }
    public void TypeOfAircraft(){
        System.out.println("Переопределите этот метод " +
                "Ваш объект грузовой или пассажирский, если грузовой: выведите грузоподъёмнось, если пассажирский: количество пассажирских мест");
    }
}
