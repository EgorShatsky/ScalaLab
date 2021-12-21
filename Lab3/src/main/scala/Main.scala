object Main extends App {
  println(Strings.testUppercase("heyyyyyyyyyyyyyyyyyyyyy"))
  println(Strings.testInterpolations("Egor", 20))
  println(Strings.testComputation(11, 4))
  println(Strings.testTakeTwo("Hello, man and women"))
  println()

  println(Adts.testGetNth(List(1, 2, 3), 1))
  println(Adts.testDouble(Some(2)))
  println(Adts.testIsEven(2))
  println(Adts.testSafeDivide(4, 0))
  println(Adts.testGoodOldJava(_.charAt(100), ""))
  println()

  println(Maps.testGroupUsers(Seq(Maps.User("Egor", 54), Maps.User("Nikita", 35), Maps.User("Maksim", 20))))
  println(Maps.testNumberFrodos(Map("first" -> Maps.User("Donald", 11), "second" -> Maps.User("Bob", 21))))
  println(Maps.testUnderaged(Map("first" -> Maps.User("Mark", 22), "second" -> Maps.User("Karl", 38))))
  println()

  println(Sequence.testLastElement(Seq(1, 2, 3)))
  println(Sequence.testZip(Seq(1, 2), Seq(2, 3)))
  println(Sequence.testForAll(Seq(1, 2, 3, 4))(_ % 2 == 0))
  println(Sequence.testPalindrom(Seq(1, 2, 1)))
  println(Sequence.testFlatMap(Seq(1, 2, 3))(item => Seq(item, item * item)))
}