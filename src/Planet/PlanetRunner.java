package Planet;

import java.util.List;


public class PlanetRunner {

    public static void main(String[] args){

    Island linkClassIsland = new Island("Barbados");
    Planet linkClassPlanet = new Planet("Earth");

    linkClassPlanet.addOcean(new Ocean("Atlanitc"));
    linkClassPlanet.addOcean(new Ocean("Indian"));

    linkClassPlanet.addIsland(new Island("lol"));

    linkClassPlanet.addContinent(new Continent("Eurasia"));
    linkClassPlanet.addContinent(new Continent("Afrika"));

    System.out.println("Planet: " + linkClassPlanet.getName());
    System.out.println("Continent name: " + countContinent(linkClassPlanet.getLinkListContinent()));
    System.out.println("Count continents: " + linkClassPlanet.getLinkListContinent().size());

    }

    public static String countContinent(List<Continent> linkListContinent){
         String result = null;
         for(Continent linkToListContinent: linkListContinent){
             result = linkToListContinent.getName();
         }
         return result;
    }
}
