public class Rotor {
  
    private String rotorValues;
    private char startChar;
        
    public Rotor(String v, char c){
        this.rotorValues = new String(v);
        this.startChar = c;
        
        // rotate until the desired starting character is at the top (or index = 0)
        while(this.rotorValues.charAt(0) != c) {
            this.rotate(); 
        }    
    }
    
    public boolean rotate(){
        // finds last character in rotorValues 
        char last = rotorValues.charAt(rotorValues.length() - 1); 

        // moves this character to the front of rotorValues 
        rotorValues = last + rotorValues.substring(0, rotorValues.length() - 1); 

        // if back to starting orientation, return true 
        return rotorValues.charAt(0) == startChar; 
    }
    

    public int indexOf(char c){
        // calls in-built String method indexOf to find index of desired character
        return rotorValues.indexOf(c); 
    }

    public char charAt(int idx){
        // calls in-built String method charAt to find character at desired index 
        return rotorValues.charAt(idx); 
    }
}