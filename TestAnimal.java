class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}

class Perro extends Animal {
    public void correr() {
        System.out.println("El perro está corriendo.");
    }
}

public class TestAnimal {
    public static void main(String[] args) {
        Animal miAnimal = new Perro();
        // miAnimal.correr(); // Error de compilación: The method correr() is undefined for the type Animal
    }
}
