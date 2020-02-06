public class CrackThis1{

    public String getPass(){
        String pxx = "";
        String p = "lufituaeb_si_htlaeh_tub_ecin_si_yenom";
        for(int x = p.length()-1; x >=0; x--){
            //System.out.println(x);
            pxx = pxx + p.charAt(x);
        }
        
        return pxx;
    }

    public static void main(String[] args){
        CrackThis ct = new CrackThis();
        String password = ct.getPass();
        System.out.println(password);
        String k = args[0];
        if(password.equals(k)){
            System.out.println("Correct!");
        } else {
            System.out.println("Sorry.  You will never get it from guessing");
        }
    }
}
