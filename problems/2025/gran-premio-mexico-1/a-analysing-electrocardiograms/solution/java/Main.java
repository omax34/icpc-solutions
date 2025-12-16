import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String s = br.readLine();
        int t = Integer.parseInt(br.readLine().trim());
        
        while (t-- > 0) {
            solve(br, out, s);
        }
        

        out.flush();
        out.close();
    }

    public static void solve(BufferedReader br, PrintWriter out, String s) throws IOException {
        
        String p = br.readLine();
        
        if(p.length() % s.length() == 0){
            boolean flag = true;
            
            for(int i=0; i<p.length(); i++){
                if(p.charAt(i) != s.charAt(i%s.length())){
                    flag = false;
                    break;
                }
            }
            
            if(flag) out.println("Yes");
            else out.println("No");
            
        }
        
        else {
            out.println("No");
        }
        
    }
}