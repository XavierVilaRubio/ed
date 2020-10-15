public class Persona{
   public String nom;
   public String dni;

   public void setNom(String nom) {
      this.nom = nom;
   }

   public void setDNI(String dni) {
      this.dni = dni;
   }

   public String getNom() {
      return nom;
   }

   public String getDni() {
      return dni;
   }

   @Override
   public String toString() {
      return "Nom= " + nom + " DNI= " + dni;
   }

}
