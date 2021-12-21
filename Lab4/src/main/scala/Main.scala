object Main {
  def main(args: Array[String])={
    println(Typeclasses.testReversableString("src"))
    println(Typeclasses.testSmashInt(3,15))
    println(Typeclasses.testSmashDouble(6.7,1.1))
    println(Typeclasses.testSmashString("src","csr"))
  }
}