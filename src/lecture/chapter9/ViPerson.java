package lecture.chapter9;

public class ViPerson extends Person{

  private String starType;

  public ViPerson(String name, String familyName, int age, String starType){
    super(name, familyName, age);
    this.starType = starType;
  }

  public boolean equals(Object o){
    // Alias Check
    if(this == o){
      return true;
    }

    if(!super.equals(o)){
      return false;
    }

    // spezialized Attributes check
    ViPerson viPerson = (ViPerson) o;

    if(!this.starType.equals(viPerson.starType)){
      return false;
    }

    return true;
  }

}
