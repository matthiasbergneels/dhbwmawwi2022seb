package lecture.excursion.pattern;

public class SingeltonExample {

  private static SingeltonExample theOnlyInstance;

  private String dbURL;

  private SingeltonExample(String dbURL){
    this.dbURL = dbURL;
  }

  public static SingeltonExample getSingletonExampleInstance(String dbURL){
    if(theOnlyInstance == null){
      theOnlyInstance = new SingeltonExample(dbURL);
    }
    return theOnlyInstance;
  }

}
