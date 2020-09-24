package model;

/*
 * PROGRESSION - 6 
 * Go to JAVA Resouces - src/model and create a child class
 * called Pikachu inside the model package with the following arguments 
 * String characteristics 
 * String type 
 * String evolution 
 * String baseExp
 * 
 * Pikachu must extend the Pokemon class
 * Generate appropriate getters and setters 
 * Generate a six argument constructor with the following arguments
 * (pokemonName,pokemonNumber,characteristics,type,evolution,baseExp) and
 * pokemonName and pokemonNumber should refer to the parent constructor in the
 * Pokemon class.
 * 
 * pokemonName = Pikachu 
 * pokemonNumber = 25 
 * characteristics = Pikachu is an Electric-type Pokémon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the Pokémon franchise
 * mascot." 
 * type = "ELECTRIC" 
 * evolution = "RAICHU" 
 * baseExp = "112"
 */
public class Pikachu extends Pokemon
{
	String characteristics;
	String type;
	String evolution;
	String baseExp;
	/*String pokemonName;
	String pokemonNumber;
	
public String getPokemonName() {
		return pokemonName;
	}
	public void setPokemonName(String pokemonName) {
		this.pokemonName = pokemonName;
	}
	public String getPokemonNumber() {
		return pokemonNumber;
	}
	public void setPokemonNumber(String pokemonNumber) {
		this.pokemonNumber = pokemonNumber;
	}*/
	public Pikachu(String pokemonName, int pokemoNumber, String characteristics, String type, String evolution,
			String baseExp) {
		super(pokemonName, pokemoNumber);
		this.pokemonName="Pikachu ";
		this.pokemoNumber=25;
		this.characteristics = "Pikachu is an Electric-type PokÃ©mon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the PokÃ©mon franchise mascot.";
		this.type ="ELECTRIC";
		this.evolution ="RAICHU";
		this.baseExp = "112";
	}
	public String getCharacteristics() {
		return characteristics;
	}
	public void setCharacteristics(String characteristics) {
		this.characteristics = characteristics;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEvolution() {
		return evolution;
	}
	public void setEvolution(String evolution) {
		this.evolution = evolution;
	}
	public String getBaseExp() {
		return baseExp;
	}
	public void setBaseExp(String baseExp) {
		this.baseExp = baseExp;
	}
	

}