package HePExercicioQ2;

import HePExercicioQ1.Animal;
import HePExercicioQ1.Cachorro;
import HePExercicioQ1.Cavalo;
import HePExercicioQ1.Preguica;


public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Pedrita", 17);
        Animal cavalo = new Cavalo("Moises", 23);
        Animal preguica = new Preguica("Yasu", 34);

        Animal[] animais = {cachorro, cavalo, preguica};

        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}