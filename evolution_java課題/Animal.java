/**
 * レビュアー：瀧下敦斗
 * 
 * @author 宮崎航汰
 */
public class Animal extends Creature {
    
    public void evolution() {
        System.out.println("別の動物に進化！");
    }
    
    /**
     * getBioValueメソッドは、動物の遺伝子値をランダムに生成し、表示する。
     */
    public void getBioValue() {
        this.animalBioValue = (int)(Math.random() * 100);
        this.maxValue = animalBioValue;
        System.out.println("Animalの遺伝子値" + ":" + this.animalBioValue);
    }
}
