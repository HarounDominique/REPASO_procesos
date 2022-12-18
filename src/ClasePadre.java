import java.io.*;

public class ClasePadre {
    public static void main(String[] args) throws IOException {
        File d = new File("D:\\IdeaProjects\\REPASO_procesos\\out\\production\\REPASO_procesos");
        ProcessBuilder pb = new ProcessBuilder("java", "ClaseHija", "hola");
        pb.directory(d);
        Process p = pb.start();

        //obteniendo flujo de salida del proceso hijo
        InputStream is = p.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String linea;

        while((linea = br.readLine()) != null){
            System.out.println(linea);
        }

        br.close();
        isr.close();
        is.close();
    }
}
