package tn.esprit.rh.achat.services;

import java.util.List;
import tn.esprit.rh.achat.entities.Operateur;



public interface IOperateurService {

	List<Operateur> retrieveAllOperateurs();

	Operateur addOperateur(Operateur o);

	void deleteOperateur(Long id);

	Operateur updateOperateur(Operateur o);

	Operateur retrieveOperateur(Long id);

	public void deleteOperateurById(Long id);
	public Operateur getOperateurById(Long id);
	public void UpdateNomBy_Id(String nom,Long id);

}
