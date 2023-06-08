package studentarea.excersises.chapter9;

import java.util.Comparator;

public class CompareWithName implements Comparator<Kunde> {
    @Override
    public int compare(Kunde k1, Kunde k2) {
        if(!k1.getName().equalsIgnoreCase(k2.getName())){
           return k1.getName().toUpperCase().compareTo(k2.getName());
        }
        if(!k1.getVorName().equalsIgnoreCase(k2.getVorName())){
            return k1.getVorName().toUpperCase().compareTo(k2.getVorName());
        }
        return 0;
    }
}
