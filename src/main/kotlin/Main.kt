fun main() {
    num(listOf("Rose","Pauline","Grace","Cathy","Mercy","Rebacca","Idaya","Mjera"))
    peoplesHeight(mutableListOf(22.0,45.2,40.0,15.0,30.0,50.0))
    Object()
    themCar()
}
//1. Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
fun num(names:List<String>):List<String> {
    val evens = mutableListOf<String>()
    for (name in names) {
        if (names.indexOf(name) % 2 == 0) {
            evens.add(name)
            println(evens)
        }
    }
    return names
}
//2. Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
class Averagemeasure(var avg:Double, var add:Double){
    fun peoplesHeight(talls: List<Double>):List<Double>{
        var avg = talls.average()
        var add = talls.sum()
        var all= listOf(avg,add)
        return all
    }}
//3. Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
open class PersonObject(var name:String, var age:Int, var height:Double, var weight:Double){
    open fun objects(){
        var person1=PersonObject("Rose", 21, 5.6, 58.00)
        var person2=PersonObject("Grace", 19,8.0,60.9)
        var person3=PersonObject("Becky", 20,6.0,63.3)
        var li= listOf(person1,person2,person3)
        var sot=li.sortedByDescending { a-> a.age  }
        println(sot)
    }
}
//4. Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
class Others(name:String, age:Int,height:Double, weight:Double):PersonObject(name, age, height,weight){
    override fun objects() {
        var person4=PersonObject("Cathy", 30, 5.0, 69.0)
        var person5=PersonObject("Lilian", 40,4.0, 63.5)
        var combine= listOf(person5,person4)
        for(n in combine)
            if(n in combine){
                combine.add(sot)
            }
    }
}
//5. Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
class Car(var registration:String, var mileage:Int){
    fun themCar(lists:Int):Int {
        var car1 = Car("KBB 435H", 2200)
        var car2 = Car("KDJ 866F", 3500)
        var car3 = Car("KCC 676C", 8000)
        var addy = listOf(car1, car2, car3)
        var avgs = (addy.sumOf { x -> x.mileage } / 3)
        return avgs
    }
}