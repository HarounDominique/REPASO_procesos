public class ClaseHija {
    public static void main(String[] args) {
        if(args.length>0){
            System.out.println("Hay parámetros: "+args[0]);
            System.exit(0);
        }else{
            System.out.println("No hay parámetros.");
            System.exit(1);
        }
    }
}
