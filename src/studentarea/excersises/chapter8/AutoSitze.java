package studentarea.excersises.chapter8;

public class AutoSitze {
    private boolean lederSitze;
    private String farbe;

    public AutoSitze(boolean lederSitze, String farbe) throws FalscheParameter{
      if(lederSitze && !(farbe == "white" || farbe == "black")) {
          throw new FalscheParameter(farbe);
      }

     this.lederSitze = lederSitze;
     this.farbe = farbe;

    }

    public String getFarbe(){
        return farbe;
    }

    public boolean isLederSitze(){
        return lederSitze;
    }


}
