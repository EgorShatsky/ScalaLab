package exercise1

import exercise1.PatternMatching.Food

/* This task has no tests. It is an exercise for you to write different class structures.
 * 
 a) Создать класс Animal, который имеет следующие поля:
 *      - name: String (название)
 *      - species: String (вид)
 *      - food: String

 *    Синтаксис: class MyClass(val publicField: Int, privateField: String) {
 *              // остальные поля и методы
 *            }

 * b) Создайте объект-компаньон для класса Animal и добавьте следующие сущности как поля:
 *      - cat, mammal, meat
 *      - parrot, bird, vegetables
 *      - goldfish, fish, plants
 * 
 *    Синтаксис: object MyClass {
 *              // статические поля и методы
 *            }
 * 
 * c) Добавьте следующие метод в Animals:
 *      def eats(food: String): Boolean
 *    
 *     который проверяет ест ли животное определенную пищу
 * 
 * d) Переопределите ваш класс Animal как трейт и создайте объекты класса-образца для Mammals, Birds и Fishs.
 *    Вам все еще нужно поле `species`?
 * 
 * e) Добавьте следующие функции в объект-компаньон Animal:
 *      def knownAnimal(name: String): Boolean  // true если это имя одного из трех животных из (b)
 *      def apply(name: String): Option[Animal] // возвращает одно из трех животных в соответствии с именем (Some) или ничего (None), см. ниже
 * 
 * f) Создайте трейт Food со следующими классами-образцами:
 *      - Meat
 *      - Vegetables
 *      - Plants
 *   и добавьте это в определение Animal. Так же добавьте объект-компаньон с методом apply():
 *      def apply(food: String): Option[Food]
 */

//class Animal(val name:String,val species:String,val food:Food) {
  //def eats(food: String) {
         //food == this.food
  //}
//}

object Animal{
  val cat = new Mammal("cat", new Meat())
  val parrot = new Bird("parrot", new Vegetables())
  val goldfish = new Fish("goldfish", new Plants())

  def knownAnimal(name: String) = {
    name == cat.name || name == parrot.name || name == goldfish.name
  }

  def apply(name: String):Option[Animal]= name match{
    case "cat"=>Some(cat)
    case "parrot"=>Some(parrot)
    case "goldfish"=>Some(goldfish)
    case _=>None()
  }

}

trait Animal { // объявление трейта
  val name:String
  val food:Food
}

class Mammal(val name: String, val food: Meat) extends Animal

class Bird(val name: String, val food: Vegetables) extends Animal

class Fish(val name: String, val food: Plants) extends Animal

trait Food //объявление трейта

class Meat extends Food //наследование от трейта

class Vegetables extends Food //наследование от трейта

class Plants extends Food //наследование от трейта

object Food{
  def apply(name: String): Option[Food] = name match {
    case "meat" => Some(new Meat())
    case "vegetable" => Some(new Vegetables())
    case "plants" => Some(new Plants())
    case _ => None()
  }
}


sealed trait Option[A] {
 
  def isEmpty: Boolean
}
case class Some[A](a: A) extends Option[A] {
  val isEmpty = false
}
case class None[A]()     extends Option[A] {
  val isEmpty = true
}
