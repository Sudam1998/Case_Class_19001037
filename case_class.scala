object MyApp extends App{
  val p1 = Point(7,0)
  val p2 = Point(0,4)
  val p3 = Point(4,5)
  val p4 = Point(6,7)

  println(p1+p2) // add point p1 and point p2

  val p5 = p4.move(2,4)
  println(p5)

  val dis = p4.distance(10,15)
  println(dis) // print distance between point p4 and (1,2)

  val p = p4.invert() //switch x and y coordinates of point p4
  println(p)

}

case class Point(a:Int,b:Int){
  def x:Int=a
  def y:Int=b

  def move(dx:Int,dy:Int)= Point(this.x+dx,this.y+dy)
  def +(that:Point)= Point(this.x+that.x,this.y+that.y)
  def distance(p:Int,q:Int)= (math.sqrt((this.x-p)*(this.x-p) + (this.y-q)*(this.y-q)))
  def invert()= Point(this.y,this.x)

}
