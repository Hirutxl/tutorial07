object Q3_Account extends App{

  val account1= new BankAccount("lahiru",01,10000.00)
  val account2= new BankAccount("sanjana",02,20000.00)

  account1.transfer(account2,5000.00)
  println("Balances After money transfer")
  println(account1)
  println(account2)


}

class BankAccount(id:String,n:Int,b:Double){

  var ID:String=id
  var accountnumber:Int =n
  var balance:Double =b

  def withdraw(n:Double)={
    this.balance=this.balance-n
  }

  def deposit(n:Double)={
    this.balance=this.balance+n
  }

  def transfer(acc:BankAccount,n:Double)={
    this.withdraw(n)
    acc.deposit(n)
  }

  override def toString = "["+ID+":"+accountnumber+":"+balance+"]"
}
