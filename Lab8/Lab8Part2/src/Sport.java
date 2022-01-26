public class Sport extends Hobbies{
    public boolean useBall;
    public Sport(){

    }

    public Sport(String name, boolean useBall){
        super(name);
        this.useBall = useBall;
    }

    @Override
    public String toString() {
        return "Sport{" +
                "name= " + name + " " +
                "Does it use a ball? " + useBall +
                '}';
    }
}
