package org.example.pokedex;

public class AppPokemon {

    public static void main(String[] args) {

        //Abstracion:

        Rayo pikchu = new Rayo(100);
        Fuego charizard = new Fuego(89);
        Agua gyarados = new Agua(12);

        pikchu.atacar();
        pikchu.imprimirNivel();
        System.out.println();

        charizard.atacar();
        charizard.imprimirNivel();
        System.out.println();

        gyarados.atacar();
        gyarados.imprimirNivel();
        System.out.println();

        Agua oshawot = new Agua(100);
        oshawot.surf();
        System.out.println();

        //Polimorfismo:

        Pokemon[] pokedex = {new Agua(89), new Rayo(55), new Fuego(89)};
        for(Pokemon pok : pokedex){

            if(pok instanceof AtaquesAgua){

                ((AtaquesAgua) pok).hidrobombra();

            }

        }
    }
}
