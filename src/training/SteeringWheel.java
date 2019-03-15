package training;

public class SteeringWheel{
    private int d;
    private int r;
    private int x;

    public int getD(){
        return d;
    }

    public int getR(){
        return r;
    }

    public int getX(){
        return x;
    }

    public void setD(int d){
        this.d = d;
    }

    public void setR(int r){
        this.r = r;
    }

    public void setX(int x){
        this.x = x;
    }

    public SteeringWheel(int r, int x, int d){
        this.r = r;
        this.x = x;
        this.d = d;
    }

    @Override
    public String toString(){
        return "\nSteeringWheel: " + " r: " + r + "" + ", d: " + d + "" + ", x: " + x;
    }

    void changing(){
        this.x *= 2;
        this.d *= 2;
        this.r *= 2;
    }
}
