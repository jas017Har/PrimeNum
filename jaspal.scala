
object Prime {
      private def isPrime(n: Int): Boolean= (2 to (n - 1)).forall(n % _ != 0)
      private def searchPrime(n:Int, until: Int, found: BigInt): BigInt = {
            if (found == until) return (n - 1)
            if (isPrime(n))     { searchPrime(n + 1, until, found + 1) }
            else                { searchPrime(n + 1, until, found) }
      }

      def nth(n: Int) = searchPrime(2, n, 0)
}

object jaspal extends App{
       assert(Prime.nth(1)== 2)

      assert(Prime.nth(1) == 2)
      assert(Prime.nth(2)== 3)
      assert(Prime.nth(3)== 5)
      assert(Prime.nth(11)== 31 )
      assert(Prime.nth(1000)== 7919)
}
