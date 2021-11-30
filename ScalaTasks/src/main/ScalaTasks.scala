//-----------------------Задание №1-----------------------
scala> res0
-- Error:
  1 |res0
|^
|Recursive value res0 needs type

//-----------------------Задание №2-----------------------
scala> "crazy"*3
val res0: String = crazycrazycrazy
//-----------------------Задание №3-----------------------
scala> 10 max 2
val res1: Int = 10
//-----------------------Задание №4-----------------------
scala> BigInt(2).pow(1024)
val res2: BigInt = 179769313486231590772930519078902473361797697894230657273430081157732675805500963132708477322407536021120113879871393357658789768814416622492847430639474124377767893424865485276302219601246094119453082952085005768838150682342462881473913110540827237163350510684586298239947245938479716304835356329624224137216
//-----------------------Задание №5-----------------------
scala> import scala.util.Random

scala> import scala.math.BigInt

scala> val result =  BigInt.probablePrime(100,new Random())
val result: BigInt = 984144695813036479501664655457
//-----------------------Задание №6-----------------------
scala> val result1 =  BigInt.probablePrime(100,new Random()).toString(36)
val result1: String = 2jv16x2dwjyvd0tdt7g1
//-----------------------Задание №7-----------------------
  scala> "Hello"(0)
val res3: Char = H

scala> "Hello".take(1)
val res4: String = H

scala> "Hello".reverse(0)
val res5: Char = o

scala> "Hello".takeRight(1)
val res6: String = o

//-----------------------Задание №8-----------------------

//-----------------------Задание №9-----------------------
scala> BigInt(10).signum
val res7: Int = 1
//-----------------------Задание №10-----------------------
scala> val t = {}
t: Unit = ()
//-----------------------Задание №11-----------------------
scala> import scala.language.postfixOps

scala> for(i <- 0 to 10 reverse)print(i)
109876543210
//-----------------------Задание №12-----------------------
def countdown(n:Int){
  0  to n reverse foreach print
}
//-----------------------Задание №13-----------------------
scala> var t:Long = 1
t: Long = 1

scala> for(i <- "Hello")={
  |      t = t * i.toLong
  |  }

scala> t
res0: Long = 9415087488
//-----------------------Задание №14-----------------------
def product(s:String):Long={
  var t:Long = 1
  for(i <- s){
    t *= i.toLong
  }
  t
}
//-----------------------Задание №15-----------------------


//-----------------------Задание №16-----------------------
def product(s:String):Long={
  if(s.length == 1) return s.charAt(0).toLong
  else s.take(1).charAt(0).toLong * product(s.drop(1))
}
//-----------------------Задание №17-----------------------
def mi(x:Double,n:Int):Double={
  if(n == 0) 1
  else if(n>0) x * mi(x,n-1)
  else 1/mi(x,-n)
}
//-----------------------Задание №18-----------------------
def distinctDigits(n: Int): Boolean = {//определяет есть ли повторяющиеся цифры
  val s = n.toString
  s.length == s.distinct.length
}

def f(m:Int,n:Int):Unit={
  var sum=0
  for (num<-m to n) { //начиная от m и заканчивая n прогоняем каждый элемент
    if (distinctDigits(num)==true){//если цифры не повторяются, то добавляем в sum
      sum=sum+num;
    }
  }
  print(sum)
}
//-----------------------Задание №19-----------------------
def f(list: List[List[Int]]): Unit = {
  print(list.flatten)
}
f(List(List(1,1),List(2),List(5,8)))
//-----------------------Задание №20-----------------------
def maxdivisors (n:Int): Int ={//максимальный простой делитель
  var max = 0
  for (i<- 1 to n) {
    if (isPrime(i) == true) {
      if (max<i){
        max=i
      }
    }
  }
  return(max)
}
def digSum(n1:Int):Int={//сумма чисел
  var n=n1
  var sum = 0
  while(n > 0){
    sum=sum+n%10
    n = n/10
  }
  return sum
}

def f(num:Int): Int={
  var sum=0
  var maxdel=0;
  maxdel=maxdivisors(num)
  sum=digSum(maxdel)
  return(sum)
}
//-----------------------Задание №21-----------------------
def f(list:List[String],k:Int):Unit={
  print(list.map(x=>x*k))
}
//-----------------------Задание №22-----------------------


//-----------------------Задание №23-----------------------


//-----------------------Задание №24-----------------------
def f(n1:Int,m1:Int):Unit= {
  var listm = List(1)
  var listn = List(1)
  var i = 2
  var n = n1
  var m = m1
  while (n > 1) {
    if (n % i == 0) {
      n = n / i
      listn = i +: listn
    }
    else {
      i = i + 1
    }
  }
  i=2
  while (m > 1) {
    if (m % i == 0) {
      m = m / i
      listm = i +: listm
    }
    else {
      i = i + 1
    }
  }
  var list=(listn++listm) diff (listn  intersect listm )
  i=0
  var mul=1
  while(i<list.length) {
    mul=mul*(list(i))
    i=i+1
  }
  print("Наименьшее общее кратное натуральных чисел m и n:" + mul)
}
//-----------------------Задание №25-----------------------
def f25(k:Int,m:List[Any]):List[Any]={
  var x=List[Any]()
  for(i<-0 until m.length){
    if((i+1)%k!=0){
      x=m(i)::x
    }
  }
  x.reverse
}
//-----------------------Задание №26-----------------------
def factor(n:Int):Int={
  if(n<2){
    1
  }
  else{
    n*factor(n-1)
  }
}
def f26(n:Int,k:Int):Int={
  factor(n)/factor(n-k)
}
//-----------------------Задание №27-----------------------
def f27(k:Int,m:List[Any]):List[Any]={
  var x = List[Any]()
  var i=k
  if(i>0) {
    for (i <- 1 until m.length) {
      x = m(i) :: x
    }
    x = x.reverse
    val b = m(0)
    x = x :+ b
    i -= 1
  }
  else{
    for (i<-0 until m.length-1){
      x=m(i)::x
    }
    x = x.reverse
    val a = m(m.length-1)
    x = a::x
    i+=1
  }
  if(i!=0){
    return f27(i,x)
  }
  x
}
//-----------------------Задание №28-----------------------
def sumdel(n:Int):Int={
  var x=1
  for(v<-2 until n){
    if(n%v==0) x+=v
  }
  x
}
def f(n:Int):Int={
  for (v<-0 to n-1){
    if(n-v==sumdel(n-v))
      return n-v
  }
  0
}
//-----------------------Задание №29-----------------------
def f29(m:List[Any]):Unit={
  var x1=List[Any]()
  var x2=List[Any]()
  for(i<-0 until m.length){
    if(i%2==0){
      x1=m(i)::x1
    }
    else {
      x2=m(i)::x2
    }
  }
  println(x1.reverse)
  println(x2.reverse)
}
//-----------------------Задание №30-----------------------
def f30(n:Int):Int={
  var count=1
  var sum=0
  for(i<-n to 1 by -1){
    var a=i
    while (a>0){
      sum+=a%10
      a/=10
    }
    if(sum>1){
      val b=sum
      while (sum<i){
        sum*=b
        count+=1
      }
    }
    if(sum==i && count !=1)
      return sum
    sum=0
  }
  0
}
//-----------------------Задание №31-----------------------
val list: List[Tuple2[Int,String]]= List((1,"first"),(2,"second"))
var numbers: List[Int]=List()
var strings:List[String]=List()
list.foreach{ item=>
  numbers=numbers:+item._1
  strings=strings:+item._2
}
numbers
strings

