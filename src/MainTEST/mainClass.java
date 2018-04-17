package MainTEST;

import java.sql.*;
import java.util.*;

public class mainClass {
	
	private static Scanner sc;
	
	public static void main(String[] args) {
		 try {
			 	// j'indique l'emplacement de mon driver et indique qu'il est ready
	            Class.forName("com.mysql.jdbc.Driver");
	            System.out.println("Driver test O.K.");

	            
	            String url = "jdbc:mysql://localhost:3306/ddragons";
	            String user = "Testeur";
	            String passwd = "test123";

	            Connection newCo = DriverManager.getConnection(url, user, passwd);
	            System.out.println("Connexion effective !");
	            
	          //creation new enemies
	            sc = new Scanner(System.in); // new scanner
	            System.out.println("Création d'un nouvel ennemie");
	            System.out.println("What is her f*****g name ?!");
	            String nameEnemie = sc.nextLine();
	            
	            System.out.println("What is her class ?");
	            String classEnemie = sc.nextLine();
	            
	            System.out.println("Add image url");
	            String imageEnemie = sc.nextLine();            
	            
	            System.out.println("Set is life");
	            int lifeEnemie=sc.nextInt();
	            sc.nextLine();
	            
	            System.out.println("Set Attack level");
	            int attackEnemie = sc.nextInt();
	            sc.nextLine();
	            
	            /////////Création d'un nouveau Statement prêt a acceuillire les valeurs spécifier////////
	            PreparedStatement newEnemies = newCo.prepareStatement("insert into enemies(name, classe, attackLevel, life, image) value (?,?,?,?,?)");
	            newEnemies.setString(1, nameEnemie);
	            newEnemies.setString(2, classEnemie);
	            newEnemies.setString(5, imageEnemie);
	            newEnemies.setInt(3, attackEnemie);
	            newEnemies.setInt(4, lifeEnemie);
	            newEnemies.executeUpdate();
	            System.out.println("Bravo vous avez créer votre premier ennemies ! \n Maintenant il va tous faire pour tuer plein de gens bravo ...");
	     
	            ///////////////////
	            
		 } catch (Exception e) {

	            e.printStackTrace();

	        }

	}

}
// get(i)