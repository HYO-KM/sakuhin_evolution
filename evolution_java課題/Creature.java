/**
 * Cretureクラスは、全てのクリーチャーが継承する抽象クラス。
 * 
 * レビュアー：瀧下敦斗
 * 
 * @author 宮崎航汰
 */
public abstract class Creature extends Object {
    
    public int fishBioValue = 0;
    public int bugBioValue = 0;
    public int animalBioValue = 0;
    public int godBioValue = 0;

    public int maxValue = -1;

    /**
     * evolutionメソッドは、クリーチャーの進化を実行する。
     */
    public abstract void evolution();

    /**
     * getBioValueメソッドは、クリーチャーの遺伝子値を取得する。
     */
    public abstract void getBioValue();

    /**
     * getMaxBioValueメソッドは、クリーチャーの最大遺伝子値を返す。
     * @return
     */
    public int getMaxBioValue(){
        return maxValue;
    }

}
