package Demo

case class Student( var rollno:Int=1,var name:String="default",var mark:Int=100)
{
  def show()
  {
    println("hi")
  }

  def <(s:Student) : Boolean = mark<s.mark
}
