package br2;

public class EmployeHoraire  extends Employee {
	private int  nombreHeure;
	private double tauxHoraire;
	
	
	
	

	public EmployeHoraire(String firstname, String lastname, double salaire, String strDate, int  nombreHeure,double tauxHoraire  ) {
		super(firstname, lastname, salaire, strDate);
		
	}
	

	@Override
	public String toString() {
		 return "L'Employes D'Horaire:"+"\n\t First Name :" + getFirstname() + "\n\t Last Name:" + getLastname() + "\n\t Datebirth:"
					+ strDate + "\n\t Salaire:" + (nombreHeure*tauxHoraire);

	}
	

}