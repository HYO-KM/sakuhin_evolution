/**
 * レビュアー：瀧下敦斗
 * 
 * @author 宮崎航汰
 */
public class Bug extends Creature {
    
    public void evolution() {
        System.out.println("虫に進化！");
    }

    /**
     * getBioValueメソッドは、虫の遺伝子値をランダムに生成し、表示する。
     */
    public void getBioValue() {
        this.bugBioValue = (int)(Math.random() * 100);
        this.maxValue = bugBioValue;
        System.out.println("Bugの遺伝子値" + ":" + this.bugBioValue);
    }

}
