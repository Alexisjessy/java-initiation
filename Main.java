// import java.time.Year;

// class Main {
//     public static void main(String[] args) {
//         System.out.printl("\nHello World!"); // Display the string.
//     }
// }

/**
 * Fonction qui affiche en console si la personne est majeure
 * 
 * Paramètre d'entrée:  l'année de naissance de la personne
 * Pas de type de retour 
 */

//  public static void displayLegalStatus(int birthYear){
//     birthYear = 1995
//     int currentYear = Year.now().getValue

//     int age = currentYear - birthYear; age= 29, currentYear =2024, birthYear= 1995;
//     if(age > 17) {
//         System.out.println("Vous etes majeur");

//     } else {
//         System.out.println("vous etes mineur.");
//     }
//  }


//         /*Tableau de valeur */
//         //  int [] array = { 10, 20, 30, 40, 50 };
     
         
//         //  for (  i=0; i<array.length; i++ ) {
//         //      System.out.println( array[ i ] );
//         //  }
          
//         // }
//         int[] tab = new int[3];
//          tab[0]=5;
//         tab[1]=65;
//         tab[2]=42;
//         println("Le premier élément du tableau tab est "+tab[0]);
//         println("Le deuxième élément du tableau tab est "+tab[1]);
//        }
//  }

 /*  ***************Recherche Sequentielle ********** */ 


//  import java.util.Scanner;

//  public class Main {
//     public static void main(String[] args) {
//         int n = 0;
//         for (int i = 10; i > 0; --i) {
//             System.out.println(i);
//             n++;
//         }
//     }

//     public static int rechercheAvecFor(int[] tableau, int value) {
//         for (int i = 0; i < tableau.length; i++) {
//             if (tableau[i] == value) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static int rechercheAvecWhile(int[] tableau, int value) {
//         int i = 0;
//         while (i < tableau.length) {
//             if (tableau[i] == value) {
//                 return i;
//             }
//             i++;
//         }
//         return -1;
//     }
// }

                     /******  Exercice abonnes youtube  ******** */



    // public class Main {
    //     public static void main(String[] args) {
      
    //         int abonnesActuels = 2500;
    //         double tauxCroissanceMensuel = 0.05;
    //         int mois = 24;
    
    //         int moisCourant = 0;
    //         while (moisCourant < mois) {
    //             abonnesActuels += (int) (abonnesActuels * tauxCroissanceMensuel);
    //             moisCourant++;
    //         }
    
    //         System.out.println("Estimation des abonnés dans 24 mois : " + abonnesActuels);
    //     }
    
    //     public static void youtube(String[] args) {
    //          abonnesActuels = 2500;
    //         double tauxCroissance = 0.05; 
    
    //         for ( mois = 0; mois < 24; mois++) {
    //             abonnesActuels += (int) (abonnesActuels * tauxCroissance);
    //         }
    
    //         System.out.println("Nombre d'abonnés après 25mois : " + abonnesActuels);
    //     }
        
    
    // }

    // public class Main {
    //     // Variables de classe
    //     static int abonnesActuels = 2500;
    //     static double tauxCroissanceMensuel = 0.05;
    //     static int mois = 24;
    
    //     public static void main(String[] args) {
    //         int moisCourant = 0;
    //         while (moisCourant < mois) {
    //             abonnesActuels += (int) (abonnesActuels * tauxCroissanceMensuel);
    //             moisCourant++;
    //         }
    //         System.out.println("Estimation des abonnés dans 24 mois : " + abonnesActuels);
        
    
       
           
    //         abonnesActuels = 2500;
    //         moisCourant = 0;
    //         for (moisCourant = 0; moisCourant < 24; moisCourant++) {
    //             abonnesActuels += (int) (abonnesActuels * tauxCroissanceMensuel);
    //         }
    //         System.out.println("Nombre d'abonnés après 25 mois : " + abonnesActuels);
    //     }
    // }
    

    import java.util.Collections;
    import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Entrez un entier n : ");
//         int n = scanner.nextInt();
//         scanner.close();

//         int somme = 0;
//         for (int i = 0; i <= n; i++) {
//             somme += i;
//         }

//         System.out.println("La somme des entiers de 0 à " + n + " est : " + somme);
//     }
// }



                              /****Fizzbuzz ****/


//             public class Main {
//             public static void main(String[] args) {
//                     int n = 100;

//                 for( int i= 1; i <= n ; i++);
                
//                 if (n%3==0){

//                 System.out.println("Fizz");
                
//         } else if(n%5==0) {
//             System.out.println("Buzz");
//         } else {
//             System.out.println(n);
//         }
        
    
//     }

    
// }

// Public class Main {
//     public static void main(String[]args){ 
        

// }
// public class Main {
//     public static void main(String[] args) {
//         int n = 100;

//         for (int i = 1; i <= n; i++) {
//             if (i % 3 == 0 && i % 5 == 0) {
//                 System.out.println("FizzBuzz");
//             } else if (i % 3 == 0) {
//                 System.out.println("Fizz");
//             } else if (i % 5 == 0) {
//                 System.out.println("Buzz");
//             } else {
//                 System.out.println(i);
//             }
//         }
//     }
// }

/* ****** Manipulation de tableau      ****** */

// public class Main {
//        public static void main(String[]args){ 
//         double [] array = {12.2, 11.3, 4.4, 2.0};
//         for(int i=0; i<array.length; i++){  
   
//         System.out.println(array[i]);
//        }
//     }
// }

/* ****Somme entre deux index***  */


//  public class Main {
//      public static void main(String[]args){ 
//         int [] array = {4,6,2,2};
//         int i = 1;
//         int j = 3;
//         int somme = 0;
   
//         for (int a = 0; a<array.length; a++)
//         somme += array[a];
     
//     //  int result = main(array);
//      System.out.println("La somme entre index obtenue " + i + "et " + j + "est:"+ somme );
//     }
//  }

 /** Manipulation de tableau d'entiers  */


// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

    
//         System.out.print("Combien de nombres souhaitez-vous saisir ? ");
//         int n = scanner.nextInt();

//     //    Création du tableau
//         int[] nombres = new int[n];

       
//         for (int i = 0; i < n; i++) {
//             System.out.print("Entrez le nombre " + (i + 1) + ": ");
//             nombres[i] = scanner.nextInt();
//         }

//        // Boucle for each pour ajouter chaque nombre à la variable somme
//         int somme = 0;
//         for (int nombre : nombres) {
//             somme += nombre;
//         }
//         //  Calcul de la moyenne
//         double moyenne = (double) somme / n;

//       //recher che de la valeur min et max
//         int min = nombres[0];
//         int max = nombres[0];
//         for (int i = 1; i < n; i++) {
//             if (nombres[i] < min) {
//                 min = nombres[i];
//             }
//             if (nombres[i] > max) {
//                 max = nombres[i];
//             }
//         }

//         System.out.println("Moyenne : " + moyenne);
//         System.out.println("Valeur minimale : " + min);
//         System.out.println("Valeur maximale : " + max);
//     }
// }

/** Recherche d'indice dans un tableau  */



// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         int[] nombres = new int[2];

//         System.out.print("Veuillez saisir le premier nombre : ");
//         nombres[0] = scanner.nextInt();

//         System.out.print("Veuillez saisir le deuxième nombre : ");
//         nombres[1] = scanner.nextInt();
       
//         System.out.println("Nombre 1 : " + nombres[0]);
//         System.out.println("Nombre 2 : " + nombres[1]);
//         System.out.println("Min element is " + Math.min(nombres[0], nombres[1]));
//         System.out.println("Max element is " + Math.max(nombres[0], nombres[1]));

        
//     }
// }
