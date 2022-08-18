package mao;

/**
 * Project name(项目名称)：java设计模式_模板方法模式
 * Package(包名): mao
 * Class(类名): ConcreteClass_BaoCai
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/18
 * Time(创建时间)： 19:55
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class ConcreteClass_BaoCai extends AbstractClass
{

    @Override
    public void pourVegetable()
    {
        System.out.println("下包菜");
    }

    @Override
    public void pourSauce()
    {
        System.out.println("倒辣椒");
    }
}
