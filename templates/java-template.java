import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Fast I/O
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        // Descomentar si hay casos de prueba definidos por un número T
        /*
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            solve(br, out);
        }
        */
        
        // Si el problema es un solo caso o EOF, llamar directo:
        solve(br, out);

        out.flush();
        out.close();
    }

    public static void solve(BufferedReader br, PrintWriter out) throws IOException {
        // Tu código aquí
        // Ejemplo de lectura: String s = br.readLine();
        // Ejemplo de lectura int: int n = Integer.parseInt(br.readLine().trim());
    }
}