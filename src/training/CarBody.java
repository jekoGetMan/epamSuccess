package training;

public class CarBody{
    private int height;
    private int length;
    private int weight;

    public int getHeight(){
        return height;
    }

    public int getLength(){
        return length;
    }

    public int getWeight(){
        return weight;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public void setLength(int length){
        this.length = length;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public CarBody(int height, int length, int weight){
        this.height = height;
        this.length = length;
        this.weight = weight;
    }

    public String lol(){
        return "Car body: \n" +
                " Height: " + "" + height +
                " Length: " + "" + length +
                " Weight: " + "" + weight;
    }

    public void changing(){
        this.height *= 2;
        this.weight *= 2;
        this.length *= 2;
    }
}
