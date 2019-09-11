package Chapter2StateMachines.kidOwnedStates;

public class kidsGlobalState{
        static final play instance = new play();
        private play () {
        
        }
 
 protected Object clone () throws CloneNotSupportedException{   //needed for every entity to prevent duplicates
        throw new CloneNotSupportedException("Cloning not allowed");
 }
 
 public static play Instance (){
        return instance;
 }
 

}

