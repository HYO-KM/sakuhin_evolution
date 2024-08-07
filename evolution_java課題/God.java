/**
 *レビュアー：瀧下敦斗
 * 
 * @author 宮崎航汰
 */
public class God extends Creature {
    
    public void evolution() {
        System.out.println("神に進化！");
    }

    /**
     * getBioValueメソッドは、神の遺伝子値をランダムに生成し、表示する。
     */
    public void getBioValue() {
        this.godBioValue = (int)(Math.random() * 100);
        this.maxValue = godBioValue;
        System.out.println("Godの遺伝子値" + ":" + this.godBioValue);
    }
}
