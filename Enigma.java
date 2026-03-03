public class Enigma{

    private String rotorInit[] = {"#GNUAHOVBIPWCJQXDKRYELSZFMT",
        "#EJOTYCHMRWAFKPUZDINSXBGLQV",
        "#BDFHJLNPRTVXZACEGIKMOQSUWY",
        "#NWDKHGXZVRIFJBLMAOPSCYUTQE",
        "#TGOWHLIFMCSZYRVXQABUPEJKND"};


    private Rotor rotors[];
        
    public Enigma(int id1, int id2, int id3, String start){

        rotors = new Rotor[3];
        rotors[0] = new Rotor(rotorInit[id1-1], start.charAt(0));
        rotors[1] = new Rotor(rotorInit[id2-1], start.charAt(1));
        rotors[2] = new Rotor(rotorInit[id3-1], start.charAt(2));
        
    }

    public String decrypt(String message){    
        String result = ""; 

        // find the index of the encrypted character in the outer rotor 

        // take the character of that index in the middle rotor 

        // find the index of that character in the outer rotor 

        // take that character at the index in the inner rotor 

        return result; 
    }

    public String encrypt(String message){
        String result = ""; 
        for(int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i); 

            // find the index of the input character in the inner rotor 
            int idxOuter = rotors[0].indexOf(ch); 
            
            // take the character at the same index in the outer rotor
            char charOuter = rotors[2].charAt(idxOuter); 

            // find the index of that character in the middle rotor 
            int idxMiddle = rotors[1].indexOf(charOuter); 

            // take that character at the same index in the outer rotor 
            char finalChar = rotors[2].charAt(idxMiddle); 

            result = result + finalChar; 

            rotate(); 
        }

        return result; 
    }

    
    private void rotate(){
        if(rotors[0].rotate()){
            if(rotors[1].rotate()){
                rotors[2].rotate();
            }
        }
    }
    
}
