import java.util.Vector;

public class TestClass {
    public static void main(String[] args) {

        Hobbies basketball = new Sport("Basketball", true);
        Hobbies baseball = new Sport("Baseball", true);
        Hobbies rugby = new Sport("Rugby", true);
        Hobbies swimming = new Sport("Swimming", false);
        Hobbies martialArts = new Sport("Martial Arts", false);
        Hobbies halo = new VideoGames("Halo", "Action");
        Hobbies mario = new VideoGames("Super Mario 3D Land", "Action");
        Hobbies sus = new VideoGames("Among Us", "Party");
        Hobbies kirby = new VideoGames("Kirby Star Allies", "Action");
        Hobbies dota = new VideoGames("Dota 2", "Real Time Strategy");

        Vector<Hobbies> hobbies = new Vector<>();

        hobbies.add(basketball);
        hobbies.add(baseball);
        hobbies.add(rugby);
        hobbies.add(swimming);
        hobbies.add(martialArts);
        hobbies.add(halo);
        hobbies.add(mario);
        hobbies.add(sus);
        hobbies.add(kirby);
        hobbies.add(dota);

        for (int i = 0; i < hobbies.size(); i++) {
            System.out.println(hobbies.elementAt(i));

        }

    }
}
