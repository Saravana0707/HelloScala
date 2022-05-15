package Demo

object Demo {
def main(args:Array[String])
  {
    var s1=Student(2,"Saravana",95)
    var s2=Student()

    var num=List(1,2,3,4,5)

    var num1=List(1,2,3,4,5,true,"Saras")

    println(s1)
    s1.show()
    println(s1.<(s2))
    for(n<-num) println(n)

    for(n<-num1) println(n)

    num.foreach{i:Int => print(i +" ")}  //lambda expression

    println(num drop 2 take 3)

    println(num.drop(2).take(2))
    println(num.reverse)

    val s=List(Student(1,"Saravana",95),Student(2,"Kumar",90),Student(3,"Saras",85),Student(4,"Sara",80))

    val first=s.head
    val last2=s.tail
    val last=s.tail.tail
    val middle=s.tail.head

    val toppers=s.filter(s=>s.mark>=90)

    val part=s.partition(s=>s.mark>=90)

    val (part3,part4)=s.partition(s=>s.mark>=90)

    val part1=part._1
    val part2=part._2

    println(first)
    println(last2)
    println(last)
    println(middle)
    println(toppers)
    println(part)
    println(part1)
    println(part2)


    println(part3)
    println(part4)


  }
}