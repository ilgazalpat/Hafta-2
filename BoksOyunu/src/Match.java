import java.util.Random;
public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match (Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
    void run () {

        boolean isFirstFighterStarting = new Random().nextBoolean();
        System.out.println("Dövüşe Başlayan: " + (isFirstFighterStarting ? f1.name : f2.name));

        if (isCheck()) {
            Fighter firstAttacker = isFirstFighterStarting ? f1 : f2;
            Fighter secondAttacker = isFirstFighterStarting ? f2 : f1;

            while (firstAttacker.health > 0 && secondAttacker.health > 0) {
                System.out.println("==== YENİ ROUND ====");
                secondAttacker.health = firstAttacker.hit(secondAttacker);
                if (isWin()) {
                    break;
                }
                firstAttacker.health = secondAttacker.hit(firstAttacker);
                if (isWin()) {
                    break;
                }
                System.out.println(firstAttacker.name + " Sağlık : " + firstAttacker.health);
                System.out.println(secondAttacker.name + " Sağlık : " + secondAttacker.health);
            }
        } else {
            System.out.println("Sporcuların sikletleri uymuyor.");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " Kazandı");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " Kazandı");
            return true;
        }
        return false;
    }
}