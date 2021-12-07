package org.vashonsd;

public class Main {

    /**
     * For now, use the main() method to print out the name of a show.
     * Create several Performers by giving them names and descriptions.
     * If you want a performer to have had one or more hit songs, use the performer's
     * .addHit() method along with the name of the hit.
     * Then print out the performers.
     */
    public static void main(String[] args) {
        Performer joshy = new Performer("Joshy Robertson", "A man known for his incredible pop-style country music");
        Performer carry = new Performer("Carry Smith", "Complicated music words no one understands have fueled her career");
        Performer wek = new Performer("Wek", "Wek");

        joshy.addHit("The Day I Left");
        carry.addHit("I Am Loquaciously Sad");

        System.out.println(joshy);
        System.out.println(carry);
        System.out.println(wek);
    }
}
