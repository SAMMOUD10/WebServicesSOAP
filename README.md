# WebServicesSOAP
<h3>-- TP (Démo) sur les web services</h3>
<p>
   Avant tout, Il est indispensable de présenter l'objectif de ce TP, alors à la suite du cours de la programmation distribué, dans ce tp on va aborder la notion 
   de Web services, notamment on va voir comment vous pouvez créer une web service aussi comment vous pouvez les tester, utiliser et les invoquer sur différents
   applications.
</p>
<p>
  <strong>Alors pour ce TP</strong>, nous avons essayé de montrer dans une petit application l'ensemble des étapes que vous devez suivre pour créer une web service
  avec une liste des méthodes que on veut les invoquer sur d'autres applications. nous avons aussi crée une autre applicationJava représente notre client qui va
  consomer le web service, j'ai pensé aussi de créer une autre application client  dotNet(.NET), mais j'ai pas un espace mémoire suffisant dans mon PC pour faire 
  installer le IDE.
  Nous utilisé aussi l'application SoapUI pour faire tester Le web service que nous avons crée déja.
</p>
 <p><strong>I.<b> L'application</b></strong> développé est constitué en trois parties principales: 
 <ol>
  <li>partie Metier</li>
  <li>partie Serveur</li>
  <li>partie Web services</li>
 </ol>
 </p>
 <h4>1/ partie Metier : C'est dont laquel on exprime et on traite les besoins fonctionnelles </h4>
 <span> - Voici quelques captures d'écrans de cette partie, comme vous voyez, nous avons créé une classe nommée Compte, cette dernière est constitué de trois
        attributs avec un constructeur par paramètre et bien sûr les getters et setters. Aussi quelques annotations de la bibliothèques Jaxb, ça pour serializer 
        les objets java en xml.
 </span> 
 <hr>
 <i>1.1/ Classe <b>Compte</b> :</i>
 <br/>
 <br/>
 
 ![classe compte](https://user-images.githubusercontent.com/102219821/162643040-7562efc5-d24a-4e02-996b-fcb96ebc79f1.png)
<h4>2/ partie Serveur : C'est dont laquel on créer un serveur pour but déployer notre application </h4>
<span>
      - Voici quelques captures d'écrans de cette partie, comme vous voyez, nous avons crée une classe nommée ServeurJaxWS qui va joué le rôle d'un serveur et
      qui va publier notre application. ce serveur est implémenté en utilisant la bibliothèque JaxWS.
</span> 
<hr>
<i>2.1/ Classe <b>ServeurJaxWS</b> :</i>
<br/>
<br/> 

![classe serveur](https://user-images.githubusercontent.com/102219821/162643255-56421aa5-1080-4db5-8590-bdf30d720ae2.png)
<h4>3/ partie Web services : C'est dont laquel on va exploiter un web service</h4>
<span>
      - Voici quelques captures d'écrans de cette partie, comme vous voyez, nous avons crée une classe nommée BanqueService contenant un ensemble de méthodes
      que on peut les utiliser par la suite dans d'autres applications crée avec des langages différents.
</span> 
<hr>
<i>2.1/ Classe <b>BanqueService</b> :</i>
<br/>
<br/> 

![web services](https://user-images.githubusercontent.com/102219821/162643400-10db3f74-8329-4bc7-86c4-9b4f2bacfd89.png)

 <p><strong>II.<b> L'application Client</b></strong> développé est constitué en deux parties principales: 
 <ol>
  <li>proxy</li>
  <li>Classe Client</li>
 </ol>
 </p>
 <h4>1/ proxy : Représente le web service</h4>
 <span> 
        Ce dossier vous pouvez le générer de manière automatique en utilisant seulement le fichier WSDL qui représente en fait une description du
        web service crée déja.<br/>
        - Voici quelques captures d'écrans de ce dossier.
 </span> 
 <hr>
 <i>1.1/ Dossier <b>proxy</b> :</i>
 <br/>
 <br/>
 
 ![proxy](https://user-images.githubusercontent.com/102219821/162643923-94a7bbfb-391c-4848-9a30-760647098b54.png)
 
 <h4>2/ Classe ClientWS :  C'est dont laquel on va exploiter et invoquer les méthodes défini dans le web service</h4>
 <span>
        - Voici quelques captures d'écrans de cette classe.
 </span> 
 <br/>
 <br/>
 
 ![classe client](https://user-images.githubusercontent.com/102219821/162644006-7b98f83e-e10c-437b-b307-1361fb07dd48.png)
 
 <p><strong>III.<b> L'application SoapUI</b></strong> permet de tester vos web services</p>
 <span>
        - Voici quelques captures d'écrans de cette application.
 </span> 
 <br/>
 <br/>
 
![soap1](https://user-images.githubusercontent.com/102219821/162644314-bc46da0d-1a02-4c5b-9b52-3d642afd50ef.png)

<br/>

![soap2](https://user-images.githubusercontent.com/102219821/162644321-d1c1dea3-a995-4ab7-85c8-127a445c12df.png)















