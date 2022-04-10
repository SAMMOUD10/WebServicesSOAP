package WS;

import Metier.Compte;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
    Un POJO : Plain Old Java Object
*/
@WebService(serviceName = "BanqueWS")
public class BanqueService {

    /* ensemble des méthodes ##############################*/

    // cette méthode permet de convertir un somme de montant EuroToDH
    @WebMethod(operationName = "ConversionEuroToDH")
    public double conversion(@WebParam(name = "montant") double mt){
        return mt * 10.6;
    }
    // cette méthode permet de retourner un compte
    @WebMethod
    public Compte getCompte(@WebParam(name = "code") Long code){
        return new Compte(code,Math.random()*90000, new Date());
    }
    // cette méthode permet d'ajouter quelques comptes dans la liste et la retourner à la fin
    @WebMethod
    public List<Compte> listComptes(){
        List<Compte> Comptes = new ArrayList<>();
        Comptes.add(new Compte(1L,Math.random()*90000, new Date()));
        Comptes.add(new Compte(2L,Math.random()*90000, new Date()));
        Comptes.add(new Compte(3L,Math.random()*90000, new Date()));
        return Comptes;
    }
}
