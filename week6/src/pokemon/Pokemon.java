package pokemon;

public class Pokemon {

  private int number;
  private String name;
  private String[] skills;
  private  String pokemonType;

  public Pokemon(int number, String name, String  pokemonType){
    this.name = name;
    this.number = number;
    this.pokemonType = pokemonType;
    this.skills =  new String[4];

  }

  public void setSkills(String skill){
    this.skills[3] = skill;
  }

  public String getName(){
    return this.name;
    }

    public String getPokemonType(String pokemonType){
      return this.pokemonType;
    }

    public void setName(String name){
      this.name = name;
    }

    public void setNumber(int number){
      this.number = number;
    }

    public int getNumber(int number){
      return this.number;
    }

    public abstract  void learnSkills(String move){
      for (String skill: this.get)
    }

    @Override
    public String toString(){
      return "[number: " + this.number+ "name: " + this.name + "pokemontype" + this.pokemonType;
    }
  
}
