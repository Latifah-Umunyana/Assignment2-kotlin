fun main(){
username("Latifa")
    remainder(10,7)
    summation(2,3,1,4)
    interestingFact("I like travelling, Swimming and Hanging out with my friends.")
}
//question 1
fun username(name:String){
println("Hello $name")
}
//question 2
fun remainder(num1: Int, num2: Int){
    var remainder= num1%num2
    println("The remainder is:$remainder")
}
fun summation(num1: Int, num2: Int, num3: Int, num4: Int){
    var sum = num1+num2+num3+num4
    println("the summation is:$sum")
}
//question 4
fun interestingFact(myself:String){
    println(myself)
}