import java.io.FileNotFoundException;

public class ClassTest {
	
	public static void main(String[] args) throws FileNotFoundException{
		
		Texte Txt1 = new Texte("big");
		String txt = Txt1.toStringTxt();
		//System.out.println(txt);
		/*String txt = "Sir Lewis Hamilton, né le 7 janvier 1985 à Stevenage dans le Hertfordshire en Angleterre, est un pilote automobile britannique, septuple champion du monde de Formule 1 en 2008, 2014, 2015, 2017, 2018, 2019 et 2020. Avec ces sept titres, il est, à ce jour, le pilote le plus titré, à égalité avec Michael Schumacher. Il est également recordman du nombre de pole positions, de podiums, de courses terminées dans les points, de points marqués en une saison, de points en carrière, de tours en tête ainsi que du nombre de victoires. Il est le seul pilote de l'actuel plateau à avoir obtenu des victoires et des pole positions dans toutes les saisons qu'il a disputées, soit quinze années consécutives en 2021\r\n"
				+ "\r\n"
				+ "Né et élevé à Stevenage, Hamilton fait ses armes en karting puis rejoint le programme des jeunes pilotes de McLaren en 1998 à treize ans. Vainqueur du championnat de Formule 3 Euro Series en 2005 puis du championnat de GP2 Series 2006, il débute en Formule 1 en 2007, au sein de l'écurie de Ron Dennis. À sa première saison, s'imposant dès sa sixième course en F1 à Montréal, battant plusieurs records de précocité, il termine deuxième du championnat à un point de Kimi Räikkönen. L'année suivante, il remporte son premier titre de champion du monde grâce à un dépassement dans le dernier virage du dernier Grand Prix à Interlagos, pour devenir à l'époque le plus jeune pilote titré en F1.\r\n"
				+ "\r\n"
				+ "Après quatre saisons de plus avec McLaren, pour qui il obtient vingt-et-une victoires, il rejoint Mercedes Grand Prix en 2013. L'ère des moteurs turbo-hybrides qui débute en 2014 marque le départ d'une domination totale de l'écurie allemande et de son pilote, qui s'adjuge six titres mondiaux supplémentaires avec, pour commencer, un doublé en 2014 et 2015 au cours d'une rivalité intense avec son coéquipier Nico Rosberg, qui lui permet d'égaler son idole Ayrton Senna avec trois sacres. Après la retraite de Rosberg, qui le bat en 2016, Sebastian Vettel sur Ferrari devient son principal adversaire, qu'il finit par dominer en prenant le large après la mi-saison, en 2017 et en 2018. Lewis Hamilton conquiert deux nouveaux titres, en 2019 et 2020, deux saisons qu'il domine largement en remportant à chaque fois onze courses et en terminant la totalité des épreuves dans les points, égalant les sept sacres de Michael Schumacher et battant son record de victoires. Le 8 mai 2021 sur le Circuit de Barcelone lors des qualifications du Grand Prix d'Espagne, il atteint le chiffre historique de cent pole positions. Il parvient à la même marque en nombre de victoires le 26 septembre suivant à Sotchi. En juillet 2021, il prolonge son contrat avec Mercedes jusqu'à la saison 2023.\r\n"
				+ "\r\n"
				+ "Hamilton est considéré comme le pilote qui a élargi l'audience de la Formule 1, en partie grâce à son activité sociale, son engagement pour la défense de l'environnement, ses incursions dans la musique et la mode. En 2020, il devient une figure majeure du mouvement Black Lives Matter, engageant toute la Formule 1 dans la lutte contre le racisme et pour augmenter la diversité dans le sport automobile. Membre de l'Ordre de l'Empire britannique depuis son titre mondial 2008, Lewis Hamilton est élevé au grade de chevalier (KBE), anobli par la reine Élisabeth II le 31 décembre 20201.";
		*/
		Map map1 = new Map(txt);
		System.out.println(map1.analyse_text());
		
	}

}
