package liczba_pi;

import java.io.*;

public class LiczbaPi {

    public static void main(String[] args)
            throws IOException
    {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Program wyswietla liczbe pi z zadana dokladnoscia.");
        System.out.printf("Pi = "+" %6.5f.\n" ,Math.PI); //6 liczb z czego 5 po przecinku typ float
    }
}
