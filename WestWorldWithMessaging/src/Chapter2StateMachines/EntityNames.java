/**
 *
 * @author Petr
 */
package Chapter2StateMachines;

public enum EntityNames {

    ent_Miner_Bob(0),
    ent_Elsa(1),
    ent_kid(2);
    final public int id;

    EntityNames(int id) {
        this.id = id;
    }

    public static String GetNameOfEntity(EntityNames e) {
        return e.toString();
    }
    
    @Override
    public String toString() {
        return EntityNames.GetNameOfEntity(this.id);
    }
    
    static public String GetNameOfEntity(int n) {
        switch (n) {
            case 0:
                return "Miner Bob";
            case 1:
                return "Elsa";
            case 2:
                return "David";
            default:
                return "UNKNOWN!";
        }
    }
}
