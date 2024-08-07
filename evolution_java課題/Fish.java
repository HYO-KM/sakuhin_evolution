/**
 *レビュアー：瀧下敦斗
 * 
 * @author 宮崎航汰
 */

public class Fish extends Creature {
    
    public void evolution() {
        System.out.println("魚に進化！");
    }

    /**
     * getBioValueメソッドは、魚の遺伝子値をランダムに生成し、表示する。
     */
    public void getBioValue() {
        this.fishBioValue = (int)(Math.random() * 100);
        this.maxValue = fishBioValue;
        System.out.println("Fishの遺伝子値" + ":" + this.fishBioValue);
    }
}