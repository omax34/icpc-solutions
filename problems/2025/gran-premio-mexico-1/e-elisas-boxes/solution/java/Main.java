import java.io.*;
import java.util.*;

public class Main {
    // Clase auxiliar para lectura rápida
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        
        // Método para leer una línea completa si fuera necesario
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        // Llamada a la lógica de solución
        solve(sc, out);

        out.flush();
        out.close();
    }

    public static void solve(FastReader sc, PrintWriter out) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean noExist = true;
        
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            if(a>=m){
                out.println(i+1);
                noExist = false;
                break;
            }
        }
        if(noExist) out.println("-1");
    }
}