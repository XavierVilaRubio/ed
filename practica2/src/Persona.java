public class Persona{
   public String nom;
   public String dni;

   public String getNom() {
      return nom;
   }

   public void setNom(String _nom) {
      this.nom = _nom;
   }

   public String getDni() {
      return dni;
   }

   public void setDni(String _dni) {
      this.dni = _dni;
   }

   public String toString() {
      return "Nom= " + nom + " DNI= " + dni;
   }

}
