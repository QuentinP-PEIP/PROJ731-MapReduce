import java.io.FileNotFoundException;

public class ClassTest {
	
	public static void main(String[] args) throws FileNotFoundException{
		
		Texte Txt1 = new Texte("big");
		String txt = Txt1.toStringTxt();
		//System.out.println(txt);
		/*String txt = "Sir Lewis Hamilton, n� le 7 janvier 1985 � Stevenage dans le Hertfordshire en Angleterre, est un pilote automobile britannique, septuple champion du monde de Formule 1 en 2008, 2014, 2015, 2017, 2018, 2019 et 2020. Avec ces sept titres, il est, � ce jour, le pilote le plus titr�, � �galit� avec Michael Schumacher. Il est �galement recordman du nombre de pole positions, de podiums, de courses termin�es dans les points, de points marqu�s en une saison, de points en carri�re, de tours en t�te ainsi que du nombre de victoires. Il est le seul pilote de l'actuel plateau � avoir obtenu des victoires et des pole positions dans toutes les saisons qu'il a disput�es, soit quinze ann�es cons�cutives en 2021\r\n"
				+ "\r\n"
				+ "N� et �lev� � Stevenage, Hamilton fait ses armes en karting puis rejoint le programme des jeunes pilotes de McLaren en 1998 � treize ans. Vainqueur du championnat de Formule 3 Euro Series en 2005 puis du championnat de GP2 Series 2006, il d�bute en Formule 1 en 2007, au sein de l'�curie de Ron Dennis. � sa premi�re saison, s'imposant d�s sa sixi�me course en F1 � Montr�al, battant plusieurs records de pr�cocit�, il termine deuxi�me du championnat � un point de Kimi R�ikk�nen. L'ann�e suivante, il remporte son premier titre de champion du monde gr�ce � un d�passement dans le dernier virage du dernier Grand Prix � Interlagos, pour devenir � l'�poque le plus jeune pilote titr� en F1.\r\n"
				+ "\r\n"
				+ "Apr�s quatre saisons de plus avec McLaren, pour qui il obtient vingt-et-une victoires, il rejoint Mercedes Grand Prix en 2013. L'�re des moteurs turbo-hybrides qui d�bute en 2014 marque le d�part d'une domination totale de l'�curie allemande et de son pilote, qui s'adjuge six titres mondiaux suppl�mentaires avec, pour commencer, un doubl� en 2014 et 2015 au cours d'une rivalit� intense avec son co�quipier Nico Rosberg, qui lui permet d'�galer son idole Ayrton Senna avec trois sacres. Apr�s la retraite de Rosberg, qui le bat en 2016, Sebastian Vettel sur Ferrari devient son principal adversaire, qu'il finit par dominer en prenant le large apr�s la mi-saison, en 2017 et en 2018. Lewis Hamilton conquiert deux nouveaux titres, en 2019 et 2020, deux saisons qu'il domine largement en remportant � chaque fois onze courses et en terminant la totalit� des �preuves dans les points, �galant les sept sacres de Michael Schumacher et battant son record de victoires. Le 8 mai 2021 sur le Circuit de Barcelone lors des qualifications du Grand Prix d'Espagne, il atteint le chiffre historique de cent pole positions. Il parvient � la m�me marque en nombre de victoires le 26 septembre suivant � Sotchi. En juillet 2021, il prolonge son contrat avec Mercedes jusqu'� la saison 2023.\r\n"
				+ "\r\n"
				+ "Hamilton est consid�r� comme le pilote qui a �largi l'audience de la Formule 1, en partie gr�ce � son activit� sociale, son engagement pour la d�fense de l'environnement, ses incursions dans la musique et la mode. En 2020, il devient une figure majeure du mouvement Black Lives Matter, engageant toute la Formule 1 dans la lutte contre le racisme et pour augmenter la diversit� dans le sport automobile. Membre de l'Ordre de l'Empire britannique depuis son titre mondial 2008, Lewis Hamilton est �lev� au grade de chevalier (KBE), anobli par la reine �lisabeth II le 31 d�cembre 20201.";
		*/
		Map map1 = new Map(txt);
		System.out.println(map1.analyse_text());
		
	}

}
