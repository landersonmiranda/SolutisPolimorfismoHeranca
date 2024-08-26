package HePExercicioQ4;
import HePExercicioQ1.Animal;
import HePExercicioQ1.Cachorro;
import HePExercicioQ1.Cavalo;
import HePExercicioQ1.Preguica;
public class Zoologico {
    private Animal[] jaulas;
    public Zoologico() {
        jaulas = new Animal[10];
        jaulas[0] = new Cavalo("Zeus", 5);
        jaulas[1] = new Cachorro("jake", 7);
        jaulas[2] = new Preguica("Bob", 3);
        jaulas[3] = new Cachorro("tobi", 4);
        jaulas[4] = new Cavalo("Romeu", 6);
        jaulas[5] = new Preguica("Fred", 2);
        jaulas[6] = new Cavalo("Lupan", 8);
        jaulas[7] = new Cavalo("Tornado", 5);
        jaulas[8] = new Preguica("Sid", 1);
        jaulas[9] = new Cachorro("Nino", 3);
    }


    public void pecorrerJaulas() {
        for (int i = 0; i < jaulas.length; i++) {
            Animal animal = jaulas[i];
            System.out.println("Jaula " + (i + 1) + ":");
            animal.emitirSom();
            if (animal instanceof Cachorro) {
                ((Cachorro) animal).correr();
            } else if (animal instanceof Cavalo) {
                ((Cavalo) animal).correr();
            } else if (animal instanceof Preguica) {
                ((Preguica) animal).subirEmArvore();
            }
            System.out.println();
        }
    }
}


