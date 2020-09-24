package model;

//PROGRESSION - 1 
//Go to JAVA Resouces - src/model and create a parent class called Pokemon inside the model package - with the following arguments
//String pokemonName
//Int pokemonNumber
//
//Generate appropriate getters and setters.
//Generate a two-argument constructor in the Pokemon class

public class Pokemon
{
	String pokemonName;
	int pokemoNumber;
	public Pokemon(String pokemonName, int pokemoNumber) {
		this.pokemonName = pokemonName;
		this.pokemoNumber = pokemoNumber;
	}
	public String getPokemonName() {
		return pokemonName;
	}
	public void setPokemonName(String pokemonName) {
		this.pokemonName = pokemonName;
	}
	public int getPokemoNumber() {
		return pokemoNumber;
	}
	public void setPokemoNumber(int pokemoNumber) {
		this.pokemoNumber = pokemoNumber;
	}
	
	
}