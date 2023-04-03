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
        //Exo 2
       // int nombredeplanetes = 8;
        //int numéroannée = 2006;
       // if (numéroannée < 2006) {
          //  nombredeplanetes = 9;
          //  System.out.println("En " +numéroannée + ",les planètes du systèmes solaire étaient au nombre de:" +nombredeplanetes );
      //  }
       // else nombredeplanetes = 8;
       // System.out.println("En " +numéroannée + ",les planètes du systèmes solaire étaient au nombre de:" +nombredeplanetes );
       // Exo 3
       // int nombredeplanetes = 8;
       // int numéroannée = 1650;
        //String phrase = "En %d, le nombre de planètes est de : %d. \n"; //formatage de chaines de caractères

        //if (numéroannée < 1600 || numéroannée > 2020) {
          //  System.out.println("Le programme ne peut pas fournir de résultat pour l'année " +numéroannée);
        //} else
          //  if (numéroannée < 1700){
            //    nombredeplanetes = 7;
              //  System.out.printf(phrase,numéroannée,nombredeplanetes);
           // } else if (numéroannée < 1800) {
             //   nombredeplanetes = 8;
               // System.out.println("En " +numéroannée+ " le nombre de planètes est de " +nombredeplanetes);
           // }
           // Exo 4
            int période = 16;
            int nombredeplanètes =6;
            switch (nombredeplanètes){
                case 7 :
                    System.out.println("On sait qu'au " +période+ "ème siècle, seules " +nombredeplanètes+ " planètes avaient été decouvertes");
                    break;
                case 8 :
                    période = 17;
                    System.out.println("On sait que le nombre de planètes est passé de 7 à 8 au " +période+ "ème siècle, mais il a également été reduit de 9 à 8 en 2006");
                    break;
                case 9 :
                    période = 18;
                    System.out.println("On sait que le nombre de planètes est passé de 8 à 9 au " +période+ "ème siècle et ce jusqu'en 2006, où ce nombre a été réduit à 8");
                    break;
                default:
                    System.out.println("Le programme ne peut pas fournir de résultat pour " +nombredeplanètes);


            }
        }
    }

