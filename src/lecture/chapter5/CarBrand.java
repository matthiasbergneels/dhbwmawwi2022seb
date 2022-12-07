package lecture.chapter5;

public enum CarBrand {
    TESLA("$$"),
    FIAT("$"),
    MERCEDES("$$$"),
    BMW("$$$");

    private String priceClass;

    CarBrand(String priceClass){
        this.priceClass = priceClass;
    }

    private String validePriceClass(String priceClass){
        if(priceClass.length() <= 0 && priceClass.length() > 4){
            return "undefined";
        }

        for(char currentSign : priceClass.toCharArray()){
            if(currentSign != '$'){
                return "undefined";
            }
        }

        return priceClass;
    }

    public String getPriceClass(){
        return priceClass;
    }

    @Override
    public String toString() {
        return switch(this){
            case TESLA -> "Tesla";
            case FIAT -> "Fiat";
            case MERCEDES -> "Mercedes";
            case BMW -> "BMW";
        };
    }
}
