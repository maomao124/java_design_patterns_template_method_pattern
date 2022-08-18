package mao;

/**
 * Project name(项目名称)：java设计模式_模板方法模式
 * Package(包名): mao
 * Class(类名): AbstractClass
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/18
 * Time(创建时间)： 19:52
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public abstract class AbstractClass
{
    /**
     * 模板方法。定义了算法的骨架，按某种顺序调用其包含的基本方法
     */
    public final void cookProcess()
    {
        //第一步：倒油
        this.pourOil();
        //第二步：热油
        this.heatOil();
        //第三步：倒蔬菜
        this.pourVegetable();
        //第四步：倒调味料
        this.pourSauce();
        //第五步：翻炒
        this.fry();
    }

    public void pourOil()
    {
        System.out.println("倒油");
    }

    public void heatOil()
    {
        System.out.println("热油");
    }

    /**
     * 倒蔬菜
     */
    public abstract void pourVegetable();

    /**
     * 倒调味料
     */
    public abstract void pourSauce();

    public void fry()
    {
        System.out.println("翻炒");
    }

}
