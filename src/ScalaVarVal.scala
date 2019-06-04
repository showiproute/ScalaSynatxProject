object ScalaVarVal {

  def main(args: Array[String]): Unit = {

    //变量的定义
    /*
    可以是var和val修饰
    var修饰的变量的值可以修改
    val修饰的变量的值不可以修改 相当于java中的final关键字

    var | val 变量名称 ： 类型 = 值

    Unit数据类型相当于Java中的void关键字 在Scala中标识形式是一对()
     */

    val name="list"
    var age=122

    println("name="+name, "age:"+age)

  }

}
