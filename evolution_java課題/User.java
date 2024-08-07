/**
 * Userクラスは、クリーチャーを生成し、進化させるメソッドがある。
 * 
 *  * レビュアー：瀧下敦斗
 * 
 * @author 宮崎航汰
 */
public class User extends Object {

    /**
     * performメソッドは、クリーチャーの生成、遺伝子値の取得、最大遺伝子値を持つクリーチャーの進化を行う。
     */
    public void perform(){

        Creature[] creatures = {
            new Fish(),
            new Bug(),
            new Animal(),
            new God()
        };

        Creature maxCreature = null;
        int maxValue = -1;

        for (Creature creature : creatures) {
            creature.getBioValue();
            int currentValue = creature.getMaxBioValue();
            if (currentValue > maxValue) {
                maxValue = currentValue;
                maxCreature = creature;
            }
        }

        System.out.println();
        System.out.println("おや、" + "user" + "の様子が...");

        if (maxCreature != null) {
            maxCreature.evolution();

        }
    }
}
