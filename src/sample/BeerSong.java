package sample;


public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0) {
            if (beerNum == 1) {
                word = "bottle";
            }
            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum = beerNum - 1;

            if (beerNum== 0){
                word = "bottles";
                System.out.println(beerNum + " "+ word + " of beer on the wall");
                System.out.println("No more bottles of beer on the wall.");
            }
        }

        System.out.println("\n \n This is me learning JAVA religiously for 7 Months staight. God bless me on this Journey");
        System.out.println("\n Challenges make me grow. I remember when this was challenging and now I look at it and laugh :) :) :)");
    }
}
