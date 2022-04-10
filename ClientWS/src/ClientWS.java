import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stubWS = new BanqueWS().getBanqueServicePort();
        System.out.println(stubWS.conversionEuroToDH(800));
        Compte compte = stubWS.getCompte(2L);
        //System.out.println(compte.getCode());
        //System.out.println(compte.getSolde());
        List<Compte> cptes = stubWS.listComptes();
        cptes.forEach(c->{
            System.out.println("---------------------");
            System.out.println(c.getCode());
            System.out.println(c.getSolde());
        });
    }
}
