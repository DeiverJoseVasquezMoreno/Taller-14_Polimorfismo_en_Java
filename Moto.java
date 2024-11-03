public class Moto extends Vehiculo {
    @Override
    public void mover() {
        super.mover(); // Uso innecesario de sobrescritura sin modificar el comportamiento
    }
}