/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg0413_labo1;

import java.util.Scanner;

/**
 *
 * @author Sklaerenn
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Partie A - Exercice 1 : Demander à l'utilisateur d'entrer son nom, son prénom et son année de naissance. 
        Afficher un message de salutation contenant son nom, son prénom et son âge.
        
       
       Scanner sc = new Scanner(System.in);
       String nom, prenom;
       int date, age; 
       
        System.out.println("Entrez votre nom");
       nom = sc.nextLine();
        System.out.println("Etrez votre prénom");
        prenom = sc.nextLine();
        System.out.println("Entrez votre année de naissance");
       date = estEntierPositif(); 
       age = 2023 - date;
        
        System.out.printf("%s %s %s %s %s %s", "Bonjour", prenom, nom, "vous avez", age, "ans. \n");
        */
        
        /*
        Exercice 2 : Écrire un programme qui lit deux nombres réels et un opérateur (+, *, -, /). Si le choix est :
            • + : le programme affiche la somme des deux nombres
            • * : le programme affiche le produit des deux nombres
            • - : le programme affiche la différence entre les deux nombres
            • / : le programme affiche la division entre les deux nombres
            • Autre : le programme affiche « Mauvais opérateur »
       
        
        int nbr1, nbr2;
        char op; 
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entrez le premier nombre");
        nbr1 = estEntier();
        System.out.println("Entrez un second nombre");
        nbr2 = estEntier();
        System.out.println("Entrez l'opérateur");
        op = sc.next().charAt(0);
        
        switch(op){
            case '+':
                System.out.println(nbr1+nbr2);
                break;
            case '-':
                System.out.println(nbr1-nbr2);
                break;
            case '*':
                System.out.println(nbr1*nbr2);
                break;
            case '/':
                if(nbr2 != 0){
                    System.out.println(nbr1/nbr2);
                } else {
                    System.out.println("Erreur. On ne peut pas diviser par 0");
                }
                break;
            default :
                System.out.println("Mauvais opérateur");
        }
         */
        
        
        /*
            Exercice 3 : Écrire un programme qui, étant donné une variable n >= 0, calcule et affiche la 
            somme des n premiers nombres impairs (par exemple, pour n=4 : 1 + 3 + 5 + 7). 
            Le choix de la valeur de n vous revient.
       
        
        int i, j, n, sum; 
        n = 4;
        j = 1;
        sum = 0;
        
        for(i = 0; i < n ; i++){
            sum = sum + (j +=2);
        }
       
        System.out.println(sum);
        
        
        
        /*
        Exercice 4 : Écrire un programme qui demande à l’utilisateur de saisir un nombre entier n inférieur 
        ou égale à 9 et de lui afficher la table de multiplication de ce nombre.
        
        
        Scanner sc = new Scanner(System.in);
        int i, n, prod; 
  
        System.out.println("Entrez un nombre compris entre 0 et 9");
        n = estEntierPositif();
        
        while(n > 9){
            System.out.println("Entrez un nombre compris entre 0 et 9");
            n = estEntierPositif();
        } 
        
        for(i = 0; i <= 10; i++){
            prod = i * n;
            System.out.println(i + " * " + n + " = "+ prod);
        }
        */
        
        /*
        Exercice 5 : Écrire un programme qui créée un tableau d’entiers de taille 50 et de le remplir avec des valeurs aléatoires entre [1 et 30[. 
        Ensuite, déterminer :
        • Combien de fois le chiffre 8 existe dans le tableau.
        • Combien il y a de chiffres pairs.
        
        
        int tab[] = new int[50];
        int cpteHuit = 0;
        int cptePair= 0;
        
        for(int i = 0; i < tab.length; i++){
            tab[i] = (int) (1 + Math.random()* 31-1);
            System.out.println(tab[i]);
            
            if(tab[i] == 8){
                cpteHuit ++;
            }
            
            if(tab[i]%2 == 0){
                cptePair ++;
            }    
        }
        
        System.out.println("Il y a " + cpteHuit + " 8 dans le tableau");
        System.out.println("Il y a " + cptePair + " nombres pairs dans le tableau");
        
        */
        
        /*
        Exercice 6 : Écrire un programme qui créée un tableau de chaines de caractères ("POO", "Classe", 
        "Objet", "Constructeur", "Attribut", "Méthode"), demande à l’utilisateur un indice et affiche en 
        majuscule la chaine qui se trouve à cet indice.
        
        Dans ce même programme, demander à l’utilisateur une chaine :
        • Si cette chaine existe, afficher son indice sinon afficher le message suivant « Cette chaine n’existe pas dans le tableau ».

        
        Scanner sc = new Scanner(System.in);
        
        int ind, i, j; 
        String test;
        boolean rep = false;
        String tab[] = {"POO", "Classe", "Objet", "Constructeur", "Attribut", "Méthode"};
        i = 0;
        
        System.out.println("Entrez l'indice que vous voulez afficher");
        ind = estEntierPositif();
        
        while(ind > 5){
            System.out.println("Erreur, le nombre doit être compris entre 0 et 5 inclus");
            ind = estEntierPositif();
        }
        
        System.out.println(tab[ind].toUpperCase());
        
        System.out.println("Entrez une chaine de caractère");
        test = sc.next(); 
        
        while(i < tab.length && rep == false){
               if(tab[i].equalsIgnoreCase(test)){
                      rep = true;
                    } i++;   
                }

                if(rep == false){
                    System.out.println("Il n'y a pas d'étudiant-e avec ce nom et ce prénom dans la liste.");
                } else {
                    System.out.println(i-1);
                }
        
   */

        /*
        Exercice 7 : Écrire un programme qui crée les tableaux suivants :
            String[] noms = {"Al","Ben","Carla","Diana","Enzo"};
            double[] heures = {0.0,0.0,0.0,0.0,0.0};
            double[] taux_horaires = {12.50, 10.80, 14.25, 17.56, 23.20};
            double[] salaires = {0.0,0.0,0.0,0.0,0.0};
        Ensuite, le programme, dans une boucle :
            • affiche, un à la fois, le nom de chaque employé et demande d’entrer le nombre d’heures travaillées par cette personne. 
               Le résultat doit être placé dans la case correspondante du tableau heures.
            • calcule le salaire obtenu pour chaque personne et place le résultat dans la bonne case du tableau salaires.
            • pour chaque personne, le programme affiche les résultats selon le format :
                Nom : xx, Heures : xx, Salaire : xx $
        Dans le même programme, demander à l’utilisateur d’entrer un nom et de :
            • afficher son salaire s’il existe
            • afficher le message suivant «Nom introuvable » sinon
       
        
               Scanner sc = new Scanner(System.in);
                
                String[] noms = {"Al","Ben","Carla","Diana","Enzo"};
                double[] heures = {0.0,0.0,0.0,0.0,0.0};
                double[] taux_horaires = {12.50, 10.80, 14.25, 17.56, 23.20};
                double[] salaires = {0.0,0.0,0.0,0.0,0.0};
                
                String test;
                boolean spotted = false;
                int i;
                
               for(i = 0; i < noms.length; i++){
                      System.out.println(noms[i]);
                      System.out.println("Entrez le nombre d'heures de l'employé-e");
                      heures[i] = sc.nextDouble();
                      salaires[i] = heures[i]*taux_horaires[i];
                      
                      System.out.println("Nom : " + noms[i] + ", Heures : " + heures[i] + ", Salaire :" + salaires[i] + " $");
               }
               
               System.out.println("Entrez le nom de la personne que vous voulez rechercher");
               test = sc.next();
               
               i = 0;
               
               while(i < noms.length && spotted == false){
                        if(noms[i].equalsIgnoreCase(test)){
                               spotted = true;
                             } i++;   
                         }

                         if(spotted == false){
                             System.out.println("Nom introuvable");
                         } else {
                             System.out.println(salaires[i-1]);
                }
        
         */
        
        /*
        Exercice 8 
       */  
        
                Scanner sc = new Scanner(System.in);
                int n, rep;

                System.out.println("Entrez un entier positif");
                n = estEntierPositif();
                
                System.out.println("Choisissez la boucle à utiliser");
                System.out.println("1. For");
                System.out.println("2. While");
                System.out.println("3. Do While");
                
                rep = sc.nextInt();
                
                switch(rep){
                    case 1:
                        System.out.println(bouclePour(n));
                        break;
                    case 2:
                        System.out.println(boucleWhile(n));
                        break;
                    case 3:
                         System.out.println(boucleDo(n));
                        break;
                    default: 
                        System.out.println("Erreur dans la demande");
                        break;
                 }
               
        }
    
    
static int bouclePour(int n){
        int facto = 1;
        for( int i=1; i<=n;i++){
                facto = facto*i;
        } 
        return facto;
}

static int boucleWhile(int n){
    int facto = 1;
    int i = 1;
    
    while(i <= n){
            facto = facto*i;
             i++;
    } 
    
    return facto;
}

static int boucleDo(int n){
        int facto = 1;
        int i = 1;
        
        do{
              facto = facto * i;
              i++;
        } while(i <= n);
        
        return facto;
        
}
        
    
static int estEntierPositif(){    
    
               Scanner sc = new Scanner(System.in);
               int test;
               
               do{
                    while(!sc.hasNextInt()){
                        System.out.println("Erreur, entrez un entier positif");
                        sc.next();
                    } test = sc.nextInt();
               } while (test < 0);
               
               return test;
           }

static int estEntier(){    
    
               Scanner sc = new Scanner(System.in);
               int test;
               
               while(!sc.hasNextInt()){
                      System.out.println("Erreur, entrez un entier positif");
                        sc.next();
                    } return test = sc.nextInt();

                    
           }
        
        
        
    }
    

