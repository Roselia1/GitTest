public class HelloUniverse {
    public static void main(String[] args) {
        //int nombredeplanetes = 8;
        //int numéroannée = 2003;
        //if (numéroannée < 2006){
         //   nombredeplanetes = 9;
         //   System.out.println("En " +numéroannée + ",les planètes du systèmes solaire étaient au nombre de:" +nombredeplanetes );
       // }

       // if ( numéroannée>= 2006 ){
          //  nombredeplanetes = 8;
           // System.out.println("En " +numéroannée + ",les planètes du systèmes solaire étaient au nombre de:" +nombredeplanetes );
       // }
        int nombredeplanetes = 8;
        int numéroannée = 2006;
        if (numéroannée < 2006) {
            nombredeplanetes = 9;
            System.out.println("En " +numéroannée + ",les planètes du systèmes solaire étaient au nombre de:" +nombredeplanetes );
        }
        else nombredeplanetes = 8;
        System.out.println("En " +numéroannée + ",les planètes du systèmes solaire étaient au nombre de:" +nombredeplanetes );
    }
}
