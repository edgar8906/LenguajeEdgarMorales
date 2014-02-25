public class AltaUsuario {

   
    public static void main(String[] args) throws Exception {
       Usuario u = new Usuario();
       u.setNombre("Juan");
       System.out.println("Este siempre debe salir ");
       u.setEdad(14);
       System.out.println("Es menor de edad ");
    }
    
}
