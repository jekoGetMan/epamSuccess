package Planet;

import java.util.List;
import java.util.ArrayList;

public class Planet {
    private String name;

    public String getName(){
        return name;
    }

    public Planet(String name){
        this.name = name;
    }

    private List<Ocean> linkListOcean = new ArrayList<>();
    private List<Island> linkListIsland = new ArrayList<>();
    private List<Continent> linkListContinent = new ArrayList<>();

    //access
    public List<Ocean> getLinkListOcean(){
        return linkListOcean;
    }

    public List<Island> getLinkIslandList(){
        return linkListIsland;
    }

    public List<Continent> getLinkListContinent(){
        return linkListContinent;
    }
    // add new objects
    public void addOcean(Ocean ocean){
        linkListOcean.add(ocean);
    }

    public void addIsland(Island island){
        linkListIsland.add(island);
    }

    public void addContinent(Continent continent){
        linkListContinent.add(continent);
    }
}
