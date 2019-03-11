package test3;

public abstract class vehicule {
	
		
		protected String proprietaire, num_immat, marque, modele;
		protected double hauteur, longueur, masse;
		
		/**
	     * Constructeur de la classe "Vehicule".
	     * 
	     * @param proprietaire
	     *            Le propri�taire du v�hicule.
	     *  
	     * @param num_immat
	     *            Le num�ro d'immatriculation du v�hicule.
	     *            
	     * @param marque
	     *            La marque du v�hicule.
	     *            
	     * @param modele
	     *            Le mod�le du v�hicule.
	     *
	     * @param hauteur
	     *            La hauteur du v�hicule.
	     *            
	     * @param longueur
	     *            La longueur du v�hicule.
	     *            
	     * @param masse
	     *            La masse du v�hicule.
		 * @return 
	     */
		public void Vehicule(String proprietaire, String num_immat, String marque, String modele, double hauteur, double longueur, double masse) {
			this.proprietaire = proprietaire;
			this.num_immat = num_immat;
			this.marque = marque;
			this.modele = modele;	
			this.hauteur = hauteur;
			this.longueur = longueur;
			this.masse = masse;
		}
		
		/**
	     * R�cup�rer le num�ro d'immatriculation de v�hicule (camion ou voiture).
	     * 
	     * @return Le num�ro d'immatriculation du v�hicule.
	     */
		public String getNumImmat() {
			return this.num_immat;
		}
		
		/**
	     * R�cup�rer le propri�taire d'un v�hicule (camion ou voiture).
	     * 
	     * @return Le propri�taire du v�hicule.
	     */
		public String getProprietaire() {
			return this.proprietaire;
		}
		
		/**
	     * R�cup�rer le type de v�hicule (m�thode impl�ment�e dans les classes filles).
	     * 
	     * @return Le type de v�hicule.
	     */
		abstract String getType();
	}

