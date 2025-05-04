package akylai.logic1;

public class CigarParty {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (cigars < 40) {
            return false;
        }
        if (isWeekend) {
            return true;
        }
        return cigars <= 60;
    }
}